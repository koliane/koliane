package core.infrastructure.services.replacers.dart_replacer.insert_index_calculators;

import antlr.training.TrainingParser.MapLiteralContext;
import antlr.training.TrainingParser.MapLiteralEntryContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.ReleaseContext;
import core.infrastructure.services.replacers.dart_replacer.helpers.ParseTreeHelper;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class MapScopeIndexCalculator extends ScopeIndexCalculator<MapLiteralContext, MapLiteralEntryContext> {
    public MapScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, MapLiteralEntryContext.class);
    }

    @Override
    protected List<ParseTree> getItems(MapLiteralContext writerContext) {
        List<ParseTree> children;
        if(writerContext.children == null) {
            return new ArrayList<>();
        }

        children = writerContext.children;
        List<MapLiteralEntryContext> items = ParseTreeHelper.filterByParserRuleContext(children, MapLiteralEntryContext.class);

        return new ArrayList<>(items);
    }

    @Override
    protected MapLiteralContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (MapLiteralContext) readerContext.getParserRuleContext()
                .getParent()
                .getParent();
    }

    @Override
    protected int getOpenScopeIndex(MapLiteralContext writerContext) {
        return writerContext.openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(MapLiteralContext writerContext) {
        return writerContext.closeFigureBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(MapLiteralEntryContext context) {
        return context.placeholderLiteral();
    }
}
