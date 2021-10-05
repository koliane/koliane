package core.infrastructure.services.replacers.adding_replacer.walkers;

import antlr.training.TrainingParser;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import core.infrastructure.services.replacers.adding_replacer.contexts.*;
import core.infrastructure.services.replacers.adding_replacer.helpers.NameGetter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.sql.Array;
import java.util.*;

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
        ArrayList<PlaceholderContext> placeholdersContexts = getMatchPlaceholdersContexts(ctx);
        boolean hasFullMatch = !placeholdersContexts.isEmpty();

        if(hasFullMatch){
            newContext = new ReleaseContext(placeholdersContexts);
            contextsStorage.add((ReleaseContext) newContext);
        } else {
            newContext = new Context();
        }

        fillNewContext(newContext, ctx);

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
    }

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
            currentRulesIds.add(context.getParserRuleContext().getRuleIndex());
        }


        HashMap<String, ArrayList<Integer>> templateRuleIdsMap = templateContextsStorage.getPlaceholderRuleIdsMap();
//        clearPlaceholderRuleId(templateRuleIdsMap);

        templateLoop: for(HashMap.Entry<String, ArrayList<Integer>> pair: templateRuleIdsMap.entrySet()) {
            String placeholderName = pair.getKey();
            ArrayList<Integer> templateRulesIds = pair.getValue();


            PlaceholderContext placeholderContext = templateContextsStorage.getContextByName(placeholderName);
            ArrayList<Context> templatesContexts = placeholderContext.getAllContexts();
            Collections.reverse(templatesContexts);
            templatesContexts.remove(0);

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

                ParserRuleContext readerParserRuleContext = templatesContexts.get(i).getParserRuleContext();
                ParserRuleContext writerParserRuleContext = currentContexts.get(i).getParserRuleContext();

                if(!isEqualParserRuleContexts(readerParserRuleContext, writerParserRuleContext)) {
                    continue templateLoop;
                }
            }

            arResult.add(placeholderContext);
        }

        return arResult;

    }

    protected void clearPlaceholderRuleId(ArrayList<Integer> list){
        list.removeIf(value -> value == TrainingParser.RULE_placeholderLiteral);

    }

    public Context getCurrentContext() {
        return currentContext;
    }

    /**
     * Проверяем, одинаковы ли имена у классов/функций...
     * @param readerCtx
     * @param writerCtx
     * @return
     */
    public boolean isEqualParserRuleContexts(ParserRuleContext readerCtx, ParserRuleContext writerCtx) throws Exception {
        int ruleId = readerCtx.getRuleIndex();
        List<Integer> rulesIdsForCheck = new ArrayList<>(Arrays.asList(BaseWalker.checkNameRules));


        if(!rulesIdsForCheck.contains(ruleId)) {
            return true;
        }

        NameGetter readerNameGetter = new NameGetter(readerCtx);
        NameGetter writerNameGetter = new NameGetter(writerCtx);

        String readerName = readerNameGetter.get();
        String writerName = writerNameGetter.get();

        if((new CodePlaceholderHelper()).isPlaceholder(readerName)) {
            return true;
        }

        if(!readerName.equals(writerName)) {
            if(!(new CodePlaceholderHelper()).hasPlaceholder(readerName)) {
                return false;
            }

            String beforePlaceholderText = (new CodePlaceholderHelper()).getBeforePlaceholderText(readerName);
            String afterPlaceholderText = (new CodePlaceholderHelper()).getAfterPlaceholderText(readerName);

            if(
                beforePlaceholderText.length() > 0 && !writerName.startsWith(beforePlaceholderText)
                || afterPlaceholderText.length() > 0 && !writerName.endsWith(afterPlaceholderText)
            ) {
                return false;
            }
        }

        return true;
    }

}
