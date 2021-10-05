package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

import antlr.training.TrainingParser.SwitchStatementContext;
import antlr.training.TrainingParser.SwitchCaseContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.ReleaseContext;
import core.infrastructure.services.replacers.adding_replacer.helpers.ParseTreeHelper;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class SwitchScopeIndexCalculator extends ScopeIndexCalculator<SwitchStatementContext, SwitchCaseContext> {
    public SwitchScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, SwitchCaseContext.class);
    }

    @Override
    protected List<ParseTree> getItems(SwitchStatementContext writerContext) {
        List<ParseTree> children = writerContext.children == null
                ? new ArrayList<>()
                : writerContext.children;

        List<SwitchCaseContext> items = ParseTreeHelper.filterByParserRuleContext(children, SwitchCaseContext.class);

        return new ArrayList<>(items);
    }

    @Override
    protected SwitchStatementContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (SwitchStatementContext) readerContext.getParserRuleContext()
                .getParent()
                .getParent();
    }

    @Override
    protected int getOpenScopeIndex(SwitchStatementContext writerContext) {
        return writerContext.openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(SwitchStatementContext writerContext) {
        return writerContext.closeFigureBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(SwitchCaseContext context) {
        return context.placeholderLiteral();
    }
}
