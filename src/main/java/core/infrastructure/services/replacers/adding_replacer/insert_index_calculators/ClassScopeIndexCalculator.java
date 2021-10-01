package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

import antlr.training.TrainingParser;
import antlr.training.TrainingParser.ClassDefinitionContext;
import antlr.training.TrainingParser.ClassMemberDefinitionContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.adding_replacer.contexts.ReleaseContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ClassScopeIndexCalculator extends ScopeIndexCalculator<ClassDefinitionContext, ClassMemberDefinitionContext> {
    public ClassScopeIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        super(readerContext, writerContext, ClassMemberDefinitionContext.class);
    }

    @Override
    protected List<ParseTree> getItems(ClassDefinitionContext writerContext) {
        return writerContext.children;
    }

    @Override
    protected ClassDefinitionContext getReaderParserRuleContext(PlaceholderContext readerContext) {
        return (ClassDefinitionContext) readerContext.getParserRuleContext().getParent().getParent();
    }

    @Override
    protected int getOpenScopeIndex(ClassDefinitionContext writerContext) {
        return writerContext.openFigureBracket().getStop().getStopIndex() + 1;
    }

    @Override
    protected int getCloseScopeIndex(ClassDefinitionContext writerContext) {
        return writerContext.closeFigureBracket().getStart().getStartIndex();
    }

    @Override
    protected ParseTree getPlaceholderLiteralContext(ClassMemberDefinitionContext context) {
        return context.children.get(0);
    }
}
