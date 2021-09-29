package core.infrastructure.file.changers.insert_index_calculators;

import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.antlr.contexts.ReleaseContext;


abstract public class InsertIndexCalculator {
    protected PlaceholderContext readerContext;
    protected ReleaseContext writerContext;

    public InsertIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        this.readerContext = readerContext;
        this.writerContext = writerContext;
    }

    abstract public InsertInfo getIndexToInsert() throws Exception;
}
