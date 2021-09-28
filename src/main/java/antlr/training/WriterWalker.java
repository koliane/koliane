package antlr.training;

import core.infrastructure.antlr.contexts.*;
import core.infrastructure.helpers.ReplacementHelper;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;
import java.util.stream.Collectors;

public class WriterWalker extends BaseWalker<ReleaseContextsStorage, ReleaseContext> {
    private PlaceholdersContextsStorage templateContextsStorage;
    private int currentDepthLevel = 0;
    private boolean checkMatchesMode = true;


    public WriterWalker(PlaceholdersContextsStorage templateContexts) {
        this.templateContextsStorage = templateContexts;
        contextsStorage = new ReleaseContextsStorage();

        templateContexts.initPlaceholderRuleIdsMap();

//        System.out.println(templateContexts.getContexts().get(0).getAllContextsRulesIds());
    }

    @Override
    protected Context createNewContext(ParserRuleContext ctx) throws Exception {
        Context newContext;
//        ArrayList<Integer> currentRulesIds = currentContext.getAllContextsRulesIds();
//        currentRulesIds.add(ctx.getRuleIndex());

        ArrayList<PlaceholderContext> placeholdersContexts = getMatchPlaceholdersContexts(ctx);
        boolean hasFullMatch = !placeholdersContexts.isEmpty();

//        PlaceholderContext placeholderContext;
//        boolean isFullMatch;
//        try {
//
////            placeholderContext = getFirstMatchTemplateContext(ctx);
//            isFullMatch = true;
//        }catch (Exception e){
////            e.printStackTrace();
//            placeholderContext = null;
//            isFullMatch = false;
//        }

//        if(isFullMatches(currentRulesIds)) {
//            PlaceholderContext placeholderContext = getFirstMatchTemplateContext(currentRulesIds);
//        if(isFullMatch){
        if(hasFullMatch){
            newContext = new ReleaseContext(placeholdersContexts);
//            newContext = new ReleaseContext(placeholderContext);
            contextsStorage.add((ReleaseContext) newContext);
        } else {
            newContext = new Context();
        }

        fillNewContext(newContext, ctx);

//        newContext.setParent(currentContext);
//        currentContext.addChild(newContext);
//        newContext.setParserRuleContext(ctx);

        return newContext;
    }

    protected void fillNewContext(Context newContext, ParserRuleContext ctx) {
        newContext.setParent(currentContext);
        currentContext.addChild(newContext);
        newContext.setParserRuleContext(ctx);
    }

    @Override
    protected ArrayList<Integer> initAvailableContextRules() {
        ArrayList<Integer> contextRules = new ArrayList<>(Arrays.asList(BaseWalker.contextRules));

        contextRules.removeIf(nextInt -> nextInt == TrainingParser.RULE_placeholderLiteral);

        return contextRules;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(!isContextRule(ctx)) {
            return;
        }

        try {
            currentContext = createNewContext(ctx);
//            if(currentContext instanceof ReleaseContext) {
//                System.out.println(ctx.getStart().getCharPositionInLine());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        currentDepthLevel++;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);

        if(!isContextRule(ctx)) {
            return;
        }

        if(currentDepthLevel > 0) {
            currentDepthLevel--;
        }


//        System.out.println("RuleIndex = "+ctx.getRuleIndex());
    }

//    protected PlaceholderContext getFirstMatchTemplateContext(ParserRuleContext ctx) throws Exception {
    protected ArrayList<PlaceholderContext> getMatchPlaceholdersContexts(ParserRuleContext ctx) throws Exception {
        ArrayList<PlaceholderContext> arResult = new ArrayList<>();
        ArrayList<Context> currentContexts = currentContext.getAllContexts();
        Collections.reverse(currentContexts);
        currentContexts.remove(0);

        Context newContext = new Context();
        fillNewContext(newContext, ctx);
        currentContexts.add(newContext);

        ArrayList<Integer> currentRulesIds = new ArrayList<>();
        for(Context context: currentContexts){
//            if(context.getParent() == null) {
//                continue;
//            }

            currentRulesIds.add(context.getParserRuleContext().getRuleIndex());
        }


        HashMap<String, ArrayList<Integer>> templateRuleIdsMap = templateContextsStorage.getPlaceholderRuleIdsMap();
//        clearPlaceholderRuleId(templateRuleIdsMap);

//        System.out.println(currentRulesIds);

        templateLoop: for(HashMap.Entry<String, ArrayList<Integer>> pair: templateRuleIdsMap.entrySet()) {
            String placeholderName = pair.getKey();
            ArrayList<Integer> templateRulesIds = pair.getValue();


//            ArrayList<Context> templateContexts = templateContextsStorage.getContextByName(placeholderName).getAllContexts();
            PlaceholderContext placeholderContext = templateContextsStorage.getContextByName(placeholderName);
            ArrayList<Context> templatesContexts = placeholderContext.getAllContexts();
            templatesContexts.remove(0);
//            ParserRuleContext templateParserRuleContext = templateContext.getParserRuleContext();

            clearPlaceholderRuleId(templateRulesIds);

            if (templateRulesIds.size() != currentRulesIds.size()) {
                continue;
            }

//            System.out.println(templateRulesIds);
//            System.out.println(templateParserRuleContext.getRuleIndex());
//            System.out.println(ctx.getRuleIndex());

            for(int i = 0; i < currentRulesIds.size(); i++) {
                int ruleId = currentRulesIds.get(i);
                int templateRuleId = templateRulesIds.get(i);

                if (templateRuleId != ruleId) {
                    continue templateLoop;
                }

                ParserRuleContext readerParserRuleContext = templatesContexts.get(i).getParserRuleContext();
                ParserRuleContext writerParserRuleContext = currentContexts.get(i).getParserRuleContext();
                if(!isEqualParserRuleContexts(readerParserRuleContext, writerParserRuleContext)) {
                    continue templateLoop;
                }
            }

            arResult.add(placeholderContext);
//            System.out.println(currentRulesIds);
//            return templateContextsStorage.getContextByName(placeholderName);
        }

//        throw new Exception("Нет соответствующего шаблона");

        return arResult;

    }

//    protected boolean isFullMatches(ArrayList<Integer> currentRulesIds) {
//        boolean status;
//        try {
//            getFirstMatchTemplateContext(currentRulesIds);
//            status = true;
//        } catch (Exception e) {
//            status = false;
//        }
//
//        return status;
//    }

    protected void clearPlaceholderRuleId(ArrayList<Integer> list){
        list.removeIf(value -> value == TrainingParser.RULE_placeholderLiteral);

    }

    public Context getCurrentContext() {
        return currentContext;
    }

    public boolean isEqualParserRuleContexts(ParserRuleContext readerCtx, ParserRuleContext writerCtx) {
        int ruleId = readerCtx.getRuleIndex();
//        System.out.println(ruleId);
//        System.out.println(writerCtx.getRuleIndex());
        if(ruleId == TrainingParser.RULE_classDefinition) {
            TrainingParser.ClassDefinitionContext realReaderCtx = (TrainingParser.ClassDefinitionContext) readerCtx;
            TrainingParser.ClassDefinitionContext realWriterCtx = (TrainingParser.ClassDefinitionContext) writerCtx;
            String readerClassName = realReaderCtx.className().getText();
            String writerClassName = realWriterCtx.className().getText();

            if(ReplacementHelper.isPlaceholder(readerClassName)) {
                return true;
            }

            if(!readerClassName.equals(writerClassName)) {
                if(!ReplacementHelper.hasPlaceholder(readerClassName)) {
                    return false;
                }

                String beforePlaceholderText = ReplacementHelper.getBeforePlaceholderText(readerClassName);
                String afterPlaceholderText = ReplacementHelper.getAfterPlaceholderText(readerClassName);

                if(
                    beforePlaceholderText.length() > 0 && !writerClassName.startsWith(beforePlaceholderText)
                    || afterPlaceholderText.length() > 0 && !writerClassName.endsWith(afterPlaceholderText)
                ) {
                    return false;
                }
            }
        }

        return true;
    }

}
