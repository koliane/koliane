package core.infrastructure.services.replacers.adding_replacer.walkers;

import antlr.training.TrainingBaseListener;
import antlr.training.TrainingParser;
import core.infrastructure.services.replacers.adding_replacer.contexts.Context;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import java.util.*;

public abstract class BaseWalker<S, C> extends TrainingBaseListener {
    static protected final Integer[] contextRules = {
            TrainingParser.RULE_libraryDefinition,

            TrainingParser.RULE_classDefinition,
            TrainingParser.RULE_functionBody,
            TrainingParser.RULE_switchStatement,
            TrainingParser.RULE_mapLiteral,
            TrainingParser.RULE_listLiteral,
            TrainingParser.RULE_block,
            TrainingParser.RULE_placeholderLiteral,
    };

    static protected final Integer[] checkNameRules = {
            TrainingParser.RULE_classDefinition,
            TrainingParser.RULE_functionBody,
            TrainingParser.RULE_switchStatement,
            TrainingParser.RULE_mapLiteral,
            TrainingParser.RULE_listLiteral,
            TrainingParser.RULE_block,
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
//            System.out.println("Exit "+ctx.getRuleIndex());
            currentContext = currentContext.getParent();
        }
    }

    protected boolean isContextRule(ParserRuleContext ctx) {
        int ruleIndex = ctx.getRuleIndex();

        if(!getAvailableContextRules().contains(ruleIndex)) {
            return false;
        }

        if(ctx instanceof TrainingParser.BlockContext) {
            Set<Class> availableBlockContexts = new HashSet<>();
            Collections.addAll(availableBlockContexts,
                TrainingParser.IfStatementContext.class
            );
            ParserRuleContext ancestor = ctx.getParent().getParent().getParent();

//            if(ancestor instanceof TrainingParser.IfStatementContext) {
//                System.out.println("IfStatementContext");
//            }

            if(!availableBlockContexts.contains(ancestor.getClass())) {
                return false;
            }

        }

        if(ruleIndex == TrainingParser.RULE_placeholderLiteral) {

            if(ctx.getParent().getRuleIndex() == TrainingParser.RULE_className) {
                return false;
            }
        }
//        System.out.println(ruleIndex);

        return true;
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
