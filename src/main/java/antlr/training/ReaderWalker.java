package antlr.training;

import core.infrastructure.antlr.contexts.Context;
import core.infrastructure.antlr.contexts.ContextsStorage;
import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.antlr.contexts.PlaceholdersContextsStorage;
import core.infrastructure.file.changers.ParseTreeHelper;
import core.infrastructure.helpers.ReplacementHelper;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

//import TrainingParser.IdentifierContext;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReaderWalker extends BaseWalker<PlaceholdersContextsStorage, PlaceholderContext> {
    public ReaderWalker() {
        contextsStorage = new PlaceholdersContextsStorage();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(isContextRule(ctx)) {
            currentContext = createNewContext(ctx);
        }
    }

    @Override
    protected Context createNewContext(ParserRuleContext ctx) {
        int ruleIndex = ctx.getRuleIndex();
        Context newContext;

        if(ruleIndex == TrainingParser.RULE_placeholderLiteral) {
            String placeholderName = ReplacementHelper.getClearedPlaceholder(ctx.getText());
            newContext = new PlaceholderContext(placeholderName);
            //TODO тут вероятно нужно реализовать копирование
            contextsStorage.add((PlaceholderContext) newContext);
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
        return new ArrayList<>(Arrays.asList(BaseWalker.contextRules));
    }

    public PlaceholdersContextsStorage getContextsStorage() {
        return (PlaceholdersContextsStorage) contextsStorage;
    }

}
