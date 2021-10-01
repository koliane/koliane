package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

import antlr.training.TrainingParser.LibraryDefinitionContext;
import antlr.training.TrainingParser.TopLevelDefinitionContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.ReleaseContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class LibraryScopeIndexCalculator extends ScopeIndexCalculator<LibraryDefinitionContext, TopLevelDefinitionContext> {
    public LibraryScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, TopLevelDefinitionContext.class);
    }

    @Override
    protected List<ParseTree> getItems(LibraryDefinitionContext writerContext) {
        return writerContext.children;
    }

    @Override
    protected LibraryDefinitionContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (LibraryDefinitionContext) readerContext.getParserRuleContext().getParent().getParent();
    }

    @Override
    protected int getOpenScopeIndex(LibraryDefinitionContext writerContext) {
        return 0;
    }

    @Override
    protected int getCloseScopeIndex(LibraryDefinitionContext writerContext) {
        return writerContext.getStop().getStopIndex() + 1;
    }
}
