package antlr.training;

import core.infrastructure.antlr.contexts.Context;
import core.infrastructure.antlr.contexts.ContextsStorage;
import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.helpers.ReplacementHelper;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseWalker<S, C> extends TrainingBaseListener{
    static protected final Integer[] contextRules = {
            TrainingParser.RULE_libraryDefinition,

            TrainingParser.RULE_classDefinition,
//            TrainingParser.RULE_classMemberDefinition,
//            TrainingParser.RULE_methodSignature,
//            TrainingParser.RULE_functionExpression,
//            TrainingParser.RULE_localFunctionDeclaration,
            TrainingParser.RULE_functionBody,
            TrainingParser.RULE_placeholderLiteral,
    };

    protected Context rootContext = new Context();
    protected Context currentContext = rootContext;
    protected S contextsStorage;
    protected ArrayList<Integer> availableContextRules;

    protected BaseWalker() {
        availableContextRules = initAvailableContextRules();
    }

    abstract protected Context createNewContext(ParserRuleContext ctx) throws Exception;

    abstract protected ArrayList<Integer> initAvailableContextRules();

    abstract public void enterEveryRule(ParserRuleContext ctx);

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if(isContextRule(ctx)) {
            currentContext = currentContext.getParent();
        }
    }

    protected boolean isContextRule(ParserRuleContext ctx) {
        int ruleIndex = ctx.getRuleIndex();

        if(!getAvailableContextRules().contains(ruleIndex)) {
            return false;
        }
        if(ruleIndex == TrainingParser.RULE_placeholderLiteral) {

//            int[] availableParentRules = {TrainingParser.RULE_classDefinition, TrainingParser.RULE_className};
//            if({TrainingParser.RULE_classDefinition}.co) {
//            if(ctx.getParent().getRuleIndex() == TrainingParser.RULE_classDefinition) {


            if(ctx.getParent().getRuleIndex() == TrainingParser.RULE_className) {
                return false;
            }
        }

        return true;
//        return getAvailableContextRules().contains(ruleIndex);
    }

    protected String getFullText(ParserRuleContext ctx) {
        return ctx.getStart().getInputStream().
                getText(Interval.of(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex()));
    }

    public S getContextsStorage() {
        return contextsStorage;
    }

    protected ArrayList<Integer> getAvailableContextRules() {
        return availableContextRules;
    }
}
