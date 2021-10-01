package core.infrastructure.file.changers.insert_index_calculators;

import antlr.training.TrainingParser.LibraryDefinitionContext;
import antlr.training.TrainingParser.TopLevelDefinitionContext;
import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.antlr.contexts.ReleaseContext;

public class LibraryScopeIndexCalculator extends ScopeIndexCalculator<LibraryDefinitionContext, TopLevelDefinitionContext> {
    public LibraryScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, TopLevelDefinitionContext.class);
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
