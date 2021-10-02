package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.ListLiteralContext;
import antlr.training.TrainingParser.ExpressionContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.ReleaseContext;
import core.infrastructure.services.replacers.adding_replacer.helpers.ParseTreeHelper;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ArrayScopeIndexCalculator extends ScopeIndexCalculator<ListLiteralContext, ExpressionContext> {
    public ArrayScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, ExpressionContext.class);
    }

    @Override
    protected List<ParseTree> getItems(ListLiteralContext writerContext) {
        List<ParseTree> children;
        if(writerContext.expressionList() == null || writerContext.expressionList().children == null) {
            return new ArrayList<>();
        }

        children = writerContext.expressionList().children;

        List<ExpressionContext> items = ParseTreeHelper.filterByParserRuleContext(children, ExpressionContext.class);

        return new ArrayList<>(items);
    }

    @Override
    protected ListLiteralContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (ListLiteralContext) readerContext.getParserRuleContext()
                .getParent()
                .getParent()
                .getParent();
    }

    @Override
    protected int getOpenScopeIndex(ListLiteralContext writerContext) {
        return writerContext.openSquareBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(ListLiteralContext writerContext) {
        return writerContext.closeSquareBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(ExpressionContext context) {
        return context.placeholderLiteral();
    }
}
