package core.infrastructure.services.replacers.dart_replacer.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.EnumTypeContext;
import antlr.training.TrainingParser.EnumEntryContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.ReleaseContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class EnumScopeIndexCalculator extends ScopeIndexCalculator<EnumTypeContext, EnumEntryContext> {
    public EnumScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, EnumEntryContext.class);
    }

    @Override
    protected List<ParseTree> getItems(EnumTypeContext writerContext) {
        return writerContext.children;
    }

    @Override
    protected EnumTypeContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (EnumTypeContext) readerContext.getParserRuleContext().getParent().getParent();
    }

    @Override
    protected int getOpenScopeIndex(EnumTypeContext writerContext) {
        return writerContext.openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(EnumTypeContext writerContext) {
        return writerContext.closeFigureBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(EnumEntryContext context) {
        return context.placeholderLiteral();
    }
}
