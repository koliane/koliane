package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.BlockContext;
import antlr.training.TrainingParser.StatementContext;
import antlr.training.TrainingParser.FunctionBodyContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.ReleaseContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class FunctionBodyScopeIndexCalculator extends ScopeIndexCalculator<FunctionBodyContext, StatementContext> {
    public FunctionBodyScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, StatementContext.class);
    }

    @Override
    protected List<ParseTree> getItems(FunctionBodyContext writerContext) {
        return writerContext.block().statements().children;
    }

    @Override
    protected FunctionBodyContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (FunctionBodyContext) readerContext.getParserRuleContext()
                .getParent()
                .getParent()
                .getParent()
                .getParent()
                .getParent()
                .getParent();
    }

    @Override
    protected int getOpenScopeIndex(FunctionBodyContext writerContext) {
        return writerContext.block().openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(FunctionBodyContext writerContext) {
        return writerContext.block().closeFigureBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(StatementContext context) {
        return context.getChild(0).getChild(0).getChild(0);
    }
}
