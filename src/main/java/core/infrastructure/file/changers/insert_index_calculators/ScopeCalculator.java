package core.infrastructure.file.changers.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.PlaceholderLiteralContext;
import antlr.training.TrainingParser.ClassDefinitionContext;
import antlr.training.TrainingParser.ClassMemberDefinitionContext;
import core.infrastructure.antlr.Placeholder;
import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.antlr.contexts.ReleaseContext;
import core.infrastructure.file.changers.IdentifierGetter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public abstract class ScopeCalculator<T extends ParserRuleContext, I extends ParserRuleContext> extends InsertIndexCalculator {
    public ScopeCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext);
    }

    @Override
    public InsertInfo getIndexToInsert() throws Exception {
        Placeholder placeholder = readerContext.getPlaceholder();
        ParserRuleContext readerParserRuleContext = readerContext.getParserRuleContext().getParent().getParent();
        ParserRuleContext writerParserRuleContext = writerContext.getParserRuleContext();

        T readerClassDefinitionContext = (T) readerParserRuleContext;
        T writerClassDefinitionContext = (T) writerParserRuleContext;

        List<I> readerMemberDefinitionContexts = getMemberDefinitionContexts(readerClassDefinitionContext);
        List<I> writerMemberDefinitionContexts = getMemberDefinitionContexts(writerClassDefinitionContext);

        Map<String, I> readerContextByIdentifier = getContextByIdentifierMap(readerMemberDefinitionContexts);
        Map<String, I> writerContextByIdentifier = getContextByIdentifierMap(writerMemberDefinitionContexts);

        List<String>[] splittedBeforeAfterPlaceholderIdentifiers = splitByBeforeAfterPlaceholderIdentifiers(readerContextByIdentifier);
        List<String> beforePlaceholderIdentifiers = splittedBeforeAfterPlaceholderIdentifiers[0];
        List<String> afterPlaceholderIdentifiers = splittedBeforeAfterPlaceholderIdentifiers[1];

        List<String> reversedBeforePlaceholderIdentifiers = new ArrayList<>(beforePlaceholderIdentifiers);
        Collections.reverse(reversedBeforePlaceholderIdentifiers);

        List<String> writerIdentifiers = new ArrayList<>(writerContextByIdentifier.keySet());
        List<String> reversedWriterIdentifiers = new ArrayList<>(writerIdentifiers);
        Collections.reverse(reversedWriterIdentifiers);

        System.out.println(beforePlaceholderIdentifiers);
        System.out.println(afterPlaceholderIdentifiers);

        InsertInfo insertInfo = new InsertInfo();

        if(!placeholder.isTopAttaching() && !placeholder.isBottomAttaching()) {
            return getWithoutAttachingPlaceholderIndex(
                    writerClassDefinitionContext,
                    writerContextByIdentifier,
                    beforePlaceholderIdentifiers,
                    afterPlaceholderIdentifiers
            );
        }



        if(placeholder.isTopAttaching()) {
            insertInfo.setTopAttaching();

            if(beforePlaceholderIdentifiers.isEmpty()) {
//                int insertIndex = writerClassDefinitionContext.openFigureBracket().getStop().getStopIndex() + 1;
                int insertIndex = getOpenScopeIndex(writerClassDefinitionContext);

                insertInfo.setIndexToInsert(insertIndex);
                return insertInfo;
            }

            for(String writerIdentifier: reversedWriterIdentifiers) {
                for(String beforePlaceholderIdentifier: reversedBeforePlaceholderIdentifiers) {
                    if(writerIdentifier.equals(beforePlaceholderIdentifier)) {
                        int insertIndex = writerContextByIdentifier.get(writerIdentifier).getStop().getStopIndex() + 1;
                        insertInfo.setIndexToInsert(insertIndex);
                        return insertInfo;
                    }
                }
            }

//            int insertIndex = writerClassDefinitionContext.openFigureBracket().getStop().getStopIndex() + 1;
            int insertIndex = getOpenScopeIndex(writerClassDefinitionContext);
            insertInfo.setIndexToInsert(insertIndex);
            return insertInfo;

        } else if(placeholder.isBottomAttaching()) {
            insertInfo.setBottomAttaching();

            if(afterPlaceholderIdentifiers.isEmpty()) {
//                int insertIndex = writerClassDefinitionContext.closeFigureBracket().getStart().getStartIndex();
                int insertIndex = getCloseScopeIndex(writerClassDefinitionContext);
                insertInfo.setIndexToInsert(insertIndex);
                return insertInfo;
            }

            for(String writerIdentifier: writerIdentifiers) {
                for(String afterPlaceholderIdentifier: afterPlaceholderIdentifiers) {
                    if(writerIdentifier.equals(afterPlaceholderIdentifier)) {
                        int insertIndex = writerContextByIdentifier.get(writerIdentifier).getStart().getStartIndex();
                        insertInfo.setIndexToInsert(insertIndex);
                        return insertInfo;
                    }
                }
            }

//            int insertIndex = writerClassDefinitionContext.closeFigureBracket().getStart().getStartIndex();
            int insertIndex = getCloseScopeIndex(writerClassDefinitionContext);
            insertInfo.setIndexToInsert(insertIndex);
            return insertInfo;
        }




        return insertInfo;
    }

    public InsertInfo getWithoutAttachingPlaceholderIndex(
            T writerClassDefinitionContext,
            Map<String, I> writerContextByIdentifier,
            List<String> beforePlaceholderIdentifiers,
            List<String> afterPlaceholderIdentifiers
//            List<String> writerIdentifiers
    ) {
        InsertInfo insertInfo = new InsertInfo();
        List<String> writerIdentifiers = new ArrayList<>(writerContextByIdentifier.keySet());
        List<String> reversedBeforePlaceholderIdentifiers = new ArrayList<>(beforePlaceholderIdentifiers);
        Collections.reverse(reversedBeforePlaceholderIdentifiers);
        int directionIdentifiersSize = Math.min(beforePlaceholderIdentifiers.size(), afterPlaceholderIdentifiers.size());
        String nearestSymbol = "";
        distanceFromPlaceholder:
        for(int i=0; i < directionIdentifiersSize; i++) {
            String beforeString = reversedBeforePlaceholderIdentifiers.get(i);
            String afterString = afterPlaceholderIdentifiers.get(i);
            for(String writerIdentifier: writerIdentifiers) {
                if(writerIdentifier.equals(beforeString)) {
                    nearestSymbol = beforeString;
                    insertInfo.setTopAttaching();
                    break distanceFromPlaceholder;
                }
                if(writerIdentifier.equals(afterString)) {
                    nearestSymbol = afterString;
                    insertInfo.setBottomAttaching();
                    break distanceFromPlaceholder;
                }
            }
        }

        if(nearestSymbol.isEmpty()) {
            if(beforePlaceholderIdentifiers.size() == afterPlaceholderIdentifiers.size()) {
                insertInfo.setTopAttaching();
//                int insertIndex = writerClassDefinitionContext.openFigureBracket().getStop().getStopIndex() + 1;
                int insertIndex = getOpenScopeIndex(writerClassDefinitionContext);
                insertInfo.setIndexToInsert(insertIndex);

                return insertInfo;
            }

            int remainingSize = Math.abs(beforePlaceholderIdentifiers.size() - afterPlaceholderIdentifiers.size());
            if(beforePlaceholderIdentifiers.size() > afterPlaceholderIdentifiers.size()) {
                List<String> remainingList = beforePlaceholderIdentifiers.subList(0, remainingSize);
                List<String> reversedRemainingList = new ArrayList<>(remainingList);
                Collections.reverse(reversedRemainingList);

                remainingList:
                for(String remainingSymbol: reversedRemainingList) {
                    for(String writerIdentifier: writerIdentifiers) {
                        if (writerIdentifier.equals(remainingSymbol)) {
                            nearestSymbol = remainingSymbol;
                            insertInfo.setTopAttaching();
                            break remainingList;
                        }
                    }
                }
            } else {
                List<String> remainingList = afterPlaceholderIdentifiers.subList(directionIdentifiersSize, afterPlaceholderIdentifiers.size());

                remainingList:
                for(String remainingSymbol: remainingList) {
                    for(String writerIdentifier: writerIdentifiers) {
                        if (writerIdentifier.equals(remainingSymbol)) {
                            nearestSymbol = remainingSymbol;
                            insertInfo.setBottomAttaching();
                            break remainingList;
                        }
                    }
                }
            }
        }

        if(nearestSymbol.isEmpty()) {
            insertInfo.setTopAttaching();
//            int insertIndex = writerClassDefinitionContext.openFigureBracket().getStop().getStopIndex() + 1;
            int insertIndex = getOpenScopeIndex(writerClassDefinitionContext);
            insertInfo.setIndexToInsert(insertIndex);

            return insertInfo;
        }

        ParserRuleContext writerRuleContext = writerContextByIdentifier.get(nearestSymbol);
        int insertIndex = insertInfo.isTopAttaching()
                ? writerRuleContext.getStop().getStopIndex() + 1
                : writerRuleContext.getStart().getStartIndex();
        insertInfo.setIndexToInsert(insertIndex);

        return insertInfo;
    }


    private List<I> getMemberDefinitionContexts(T classDefinitionContext) {
        List<I> memberDefinitionContexts = new ArrayList<>();
        classDefinitionContext.children.forEach(ruleContext -> {
            if(ruleContext instanceof ClassMemberDefinitionContext) {
                memberDefinitionContexts.add((I) ruleContext);
            }
        });

        return memberDefinitionContexts;
    }

    private Map<String, I> getContextByIdentifierMap(List<I> memberDefinitionContextsList) throws Exception {
        Map<String, I> contextByIdentifierMap = new LinkedHashMap<>();

        for (I memberContext: memberDefinitionContextsList) {
            IdentifierGetter<I> identifierGetter = new IdentifierGetter<>(memberContext);
            List<String> identifiers = identifierGetter.get();
            identifiers.forEach(identifier -> contextByIdentifierMap.put(identifier, memberContext));
        }

        return contextByIdentifierMap;
    }

    private List<String>[] splitByBeforeAfterPlaceholderIdentifiers(Map<String, I> memberDefinitionContexts) {
        List<String> beforePlaceholderIdentifiers = new ArrayList<>();
        List<String> afterPlaceholderIdentifiers = new ArrayList<>();
        boolean isBefore = true;
        for(Map.Entry<String, I> pair: memberDefinitionContexts.entrySet()) {
            String identifier = pair.getKey();
            I context = pair.getValue();

            if(context.children.get(0) instanceof PlaceholderLiteralContext) {
                isBefore = false;
                continue;
            }

            if(isBefore) {
                beforePlaceholderIdentifiers.add(identifier);
            } else {
                afterPlaceholderIdentifiers.add(identifier);
            }
        }

        List<String>[] result = new List[2];
        result[0] = beforePlaceholderIdentifiers;
        result[1] = afterPlaceholderIdentifiers;

        return result;
    }

    abstract protected int getOpenScopeIndex(T writerContext);
    abstract protected int getCloseScopeIndex(T writerContext);
}
