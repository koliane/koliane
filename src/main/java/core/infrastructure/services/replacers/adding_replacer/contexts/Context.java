package core.infrastructure.services.replacers.adding_replacer.contexts;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Collections;

public class Context {
    protected ParserRuleContext parserRuleContext;
    protected Context parent;
    protected ArrayList<Context> children;
    protected ArrayList<Context> beforeContexts;
    protected ArrayList<Context> afterContexts;

    protected int ruleId;
    protected ArrayList<Integer> allRuleIds;


    public Context() {
        beforeContexts = new ArrayList<Context>();
        afterContexts = new ArrayList<Context>();
//        nestingContexts = new ArrayList<Context>();
        children = new ArrayList<Context>();
    }

    public void setParserRuleContext(ParserRuleContext parserRuleContext) {
        this.parserRuleContext = parserRuleContext;
        this.ruleId = parserRuleContext.getRuleIndex();
        this.allRuleIds = getAllContextsRulesIds();
    }

    public void setParent(Context parent) {
        this.parent = parent;
    }

    public void setBeforeContexts(ArrayList<Context> beforeContexts) {
        this.beforeContexts = beforeContexts;
    }

    public void setAfterContexts(ArrayList<Context> afterContexts) {
        this.afterContexts = afterContexts;
    }

    public ParserRuleContext getParserRuleContext() {
        return parserRuleContext;
    }

    public Context getParent() {
        return parent;
    }

    public ArrayList<Context> getChildren() {
        return children;
    }

    public void addChild(Context child) {
        children.add(child);
    }


    public ArrayList<Context> getAllContexts() {
        ArrayList<Context> contexts = new ArrayList<>();
        contexts.add(this);

        if(parent == null) {
            return contexts;
        }

        contexts.addAll(parent.getAllContexts());


        return contexts;
    }

    public ArrayList<Integer> getAllContextsRulesIds() {
        ArrayList<Context> contexts = getAllContexts();
        Collections.reverse(contexts);

        ArrayList<Integer> rulesIds = new ArrayList<>();

        for (Context context: contexts) {
            ParserRuleContext ruleContext = context.getParserRuleContext();
            if(ruleContext == null) {
                continue;
            }

            rulesIds.add(ruleContext.getRuleIndex());
        }

        return rulesIds;
    }

}
