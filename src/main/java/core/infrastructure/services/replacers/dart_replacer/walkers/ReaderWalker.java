package core.infrastructure.services.replacers.dart_replacer.walkers;

import antlr.training.TrainingParser;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import core.infrastructure.services.replacers.dart_replacer.contexts.Context;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholdersContextsStorage;
import org.antlr.v4.runtime.ParserRuleContext;

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
            String placeholderName = (new CodePlaceholderHelper()).getClearedPlaceholder(ctx.getText());
            newContext = new PlaceholderContext(placeholderName);
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
