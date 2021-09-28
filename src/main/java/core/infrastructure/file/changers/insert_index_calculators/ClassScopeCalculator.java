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

public class ClassScopeCalculator extends InsertIndexCalculator {
    public ClassScopeCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext);
    }

    @Override
    public int getIndexToInsert() throws Exception {
        Placeholder placeholder = readerContext.getPlaceholder();
        ParserRuleContext readerParserRuleContext = readerContext.getParserRuleContext().getParent().getParent();
        ParserRuleContext writerParserRuleContext = writerContext.getParserRuleContext();

        ClassDefinitionContext readerClassDefinitionContext = (ClassDefinitionContext) readerParserRuleContext;
        ClassDefinitionContext writerClassDefinitionContext = (ClassDefinitionContext) writerParserRuleContext;

        List<ClassMemberDefinitionContext> readerMemberDefinitionContexts = getMemberDefinitionContexts(readerClassDefinitionContext);
        List<ClassMemberDefinitionContext> writerMemberDefinitionContexts = getMemberDefinitionContexts(writerClassDefinitionContext);

        Map<String, ClassMemberDefinitionContext> readerContextByIdentifier = getContextByIdentifierMap(readerMemberDefinitionContexts);
        Map<String, ClassMemberDefinitionContext> writerContextByIdentifier = getContextByIdentifierMap(writerMemberDefinitionContexts);

        List<String>[] splittedBeforeAfterPlaceholderIdentifiers = splitByBeforeAfterPlaceholderIdentifiers(readerContextByIdentifier);
        List<String> beforePlaceholderIdentifiers = splittedBeforeAfterPlaceholderIdentifiers[0];
        List<String> afterPlaceholderIdentifiers = splittedBeforeAfterPlaceholderIdentifiers[1];

        List<String> reversedBeforePlaceholderIdentifiers = new ArrayList<>(beforePlaceholderIdentifiers);
        Collections.reverse(reversedBeforePlaceholderIdentifiers);

        List<String> reversedWriterIdentifiers = new ArrayList<>(writerContextByIdentifier.keySet());
        Collections.reverse(reversedWriterIdentifiers);

        System.out.println(beforePlaceholderIdentifiers);
        System.out.println(afterPlaceholderIdentifiers);

        if(placeholder.isTopAttaching()) {
            if(beforePlaceholderIdentifiers.isEmpty()) {
                return writerClassDefinitionContext.openFigureBracket().getStop().getStopIndex() + 1;
            }

            System.out.println(reversedBeforePlaceholderIdentifiers);
            System.out.println(reversedWriterIdentifiers);

            for(String writerIdentifier: reversedWriterIdentifiers) {
                for(String beforePlaceholderIdentifier: reversedBeforePlaceholderIdentifiers) {
                    if(writerIdentifier.equals(beforePlaceholderIdentifier)) {
                        return writerContextByIdentifier.get(writerIdentifier).getStop().getStopIndex() + 1;
                    }
                }
            }

            return writerClassDefinitionContext.openFigureBracket().getStop().getStopIndex() + 1;

        } else if(placeholder.isBottomAttaching()) {
            //TODO
            if(afterPlaceholderIdentifiers.isEmpty()) {
                return writerClassDefinitionContext.closeFigureBracket().getStart().getStartIndex();
            }
        }




        return 0;
    }


    private List<ClassMemberDefinitionContext> getMemberDefinitionContexts(ClassDefinitionContext classDefinitionContext) {
        List<ClassMemberDefinitionContext> memberDefinitionContexts = new ArrayList<>();
        classDefinitionContext.children.forEach(ruleContext -> {
            if(ruleContext instanceof ClassMemberDefinitionContext) {
                memberDefinitionContexts.add((ClassMemberDefinitionContext) ruleContext);
            }
        });

        return memberDefinitionContexts;
    }

    private Map<String, ClassMemberDefinitionContext> getContextByIdentifierMap(List<ClassMemberDefinitionContext> memberDefinitionContextsList) throws Exception {
        Map<String, ClassMemberDefinitionContext> contextByIdentifierMap = new LinkedHashMap<>();

        for (ClassMemberDefinitionContext memberContext: memberDefinitionContextsList) {
            IdentifierGetter<ClassMemberDefinitionContext> identifierGetter = new IdentifierGetter<>(memberContext);
            List<String> identifiers = identifierGetter.get();
            identifiers.forEach(identifier -> contextByIdentifierMap.put(identifier, memberContext));
        }

        return contextByIdentifierMap;
    }

    private List<String>[] splitByBeforeAfterPlaceholderIdentifiers(Map<String, ClassMemberDefinitionContext> memberDefinitionContexts) {
        List<String> beforePlaceholderIdentifiers = new ArrayList<>();
        List<String> afterPlaceholderIdentifiers = new ArrayList<>();
        boolean isBefore = true;
        for(Map.Entry<String, ClassMemberDefinitionContext> pair: memberDefinitionContexts.entrySet()) {
            String identifier = pair.getKey();
            ClassMemberDefinitionContext context = pair.getValue();

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
}
