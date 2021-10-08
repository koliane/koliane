package core.infrastructure.services.replacers.dart_replacer.insert_index_calculators;

import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.ReleaseContext;


abstract public class InsertIndexCalculator {
    protected PlaceholderContext readerContext;
    protected ReleaseContext writerContext;

    public InsertIndexCalculator(PlaceholderContext readerContext, ReleaseContext writerContext) {
        this.readerContext = readerContext;
        this.writerContext = writerContext;
    }

    abstract public InsertInfo getIndexToInsert() throws Exception;
}
