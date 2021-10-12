package core.infrastructure.services.replacers.dart_replacer.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.TypeListContext;
import antlr.training.TrainingParser.DtypeContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.ReleaseContext;
import core.infrastructure.services.replacers.dart_replacer.helpers.ParseTreeHelper;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class TypeListScopeIndexCalculator extends ScopeIndexCalculator<TypeListContext, DtypeContext> {
    public TypeListScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, DtypeContext.class);
    }

    @Override
    protected List<ParseTree> getItems(TypeListContext writerContext) {
        List<ParseTree> children;
        if(writerContext.children == null) {
            return new ArrayList<>();
        }

        children = writerContext.children;
        List<DtypeContext> items = ParseTreeHelper.filterByParserRuleContext(children, DtypeContext.class);

        return new ArrayList<>(items);
    }

    @Override
    protected TypeListContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (TypeListContext) readerContext.getParserRuleContext()
                .getParent()
                .getParent();
    }

    @Override
    protected int getOpenScopeIndex(TypeListContext writerContext) {
        return writerContext.getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(TypeListContext writerContext) {
        return writerContext.getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(DtypeContext context) {
        return context.placeholderLiteral();
    }
}
