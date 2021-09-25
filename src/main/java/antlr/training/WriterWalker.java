package antlr.training;

import core.infrastructure.antlr.contexts.*;
import core.infrastructure.helpers.ReplacementHelper;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class WriterWalker extends BaseWalker<ReleaseContextsStorage, ReleaseContext> {
    private PlaceholdersContextsStorage templateContextsStorage;
    private int currentDepthLevel = 0;
    private boolean checkMatchesMode = true;


    public WriterWalker(PlaceholdersContextsStorage templateContexts) {
        this.templateContextsStorage = templateContexts;
        contextsStorage = new ReleaseContextsStorage();

        templateContexts.initPlaceholderRuleIdsMap();
    }

    @Override
    protected Context createNewContext(ParserRuleContext ctx) throws Exception {
        Context newContext;
        ArrayList<Integer> currentRulesIds = currentContext.getAllContextsRulesIds();
        currentRulesIds.add(ctx.getRuleIndex());

        if(isFullMatches(currentRulesIds)) {
            PlaceholderContext placeholderContext = getFirstMatchTemplateContext(currentRulesIds);
            newContext = new ReleaseContext(placeholderContext);
            contextsStorage.add((ReleaseContext) newContext);
        } else {
            newContext = new Context();
        }

        newContext.setParent(currentContext);
        currentContext.addChild(newContext);
        newContext.setParserRuleContext(ctx);

        return newContext;
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

    protected PlaceholderContext getFirstMatchTemplateContext(ArrayList<Integer> currentRulesIds) throws Exception {
        HashMap<String, ArrayList<Integer>> templateRuleIdsMap = templateContextsStorage.getPlaceholderRuleIdsMap();

        templateLoop: for(HashMap.Entry<String, ArrayList<Integer>> pair: templateRuleIdsMap.entrySet()) {
            String placeholderName = pair.getKey();
            ArrayList<Integer> templateRulesIds = pair.getValue();
            clearPlaceholderRuleId(templateRulesIds);

            if (templateRulesIds.size() != currentRulesIds.size()) {
                continue;
            }

            for(int i = 0; i < currentRulesIds.size(); i++) {
                int ruleId = currentRulesIds.get(i);
                int templateRuleId = templateRulesIds.get(i);
                if (templateRuleId != ruleId) {
                    continue templateLoop;
                }
            }

            return templateContextsStorage.getContextByName(placeholderName);
        }

        throw new Exception("Нет соответствующего шаблона");

    }

    protected boolean isFullMatches(ArrayList<Integer> currentRulesIds) {
        boolean status;
        try {
            getFirstMatchTemplateContext(currentRulesIds);
            status = true;
        } catch (Exception e) {
            status = false;
        }

        return status;
    }

    protected void clearPlaceholderRuleId(ArrayList<Integer> list){
        list.removeIf(value -> value == TrainingParser.RULE_placeholderLiteral);

    }

    public Context getCurrentContext() {
        return currentContext;
    }
}
