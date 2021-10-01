package core.infrastructure.file.changers.insert_index_calculators;

import antlr.training.TrainingParser.ClassDefinitionContext;
import antlr.training.TrainingParser.ClassMemberDefinitionContext;
import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.antlr.contexts.ReleaseContext;

public class ClassScopeIndexCalculator extends ScopeIndexCalculator<ClassDefinitionContext, ClassMemberDefinitionContext> {
    public ClassScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, ClassMemberDefinitionContext.class);
    }

    @Override
    protected int getOpenScopeIndex(ClassDefinitionContext writerContext) {
        return writerContext.openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(ClassDefinitionContext writerContext) {
        return writerContext.closeFigureBracket().getStart().getStartIndex();
    }
}
