package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.BlockContext;
import antlr.training.TrainingParser.StatementContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.ReleaseContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class BlockScopeIndexCalculator extends ScopeIndexCalculator<BlockContext, StatementContext> {
    public BlockScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, StatementContext.class);
    }

    @Override
    protected List<ParseTree> getItems(BlockContext writerContext) {
        return writerContext.statements().children;
    }

    @Override
    protected BlockContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (BlockContext) readerContext.getParserRuleContext()
                .getParent()
                .getParent()
                .getParent()
                .getParent()
                .getParent();
    }

    @Override
    protected int getOpenScopeIndex(BlockContext writerContext) {
        return writerContext.openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(BlockContext writerContext) {
        return writerContext.closeFigureBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(StatementContext context) {
        if( context.nonLabledStatment() == null
            || context.nonLabledStatment().block() == null
            || context.nonLabledStatment().block().placeholderLiteral() == null
        ) {
            return null;
        }

        return context.nonLabledStatment().block().placeholderLiteral();
    }
}
