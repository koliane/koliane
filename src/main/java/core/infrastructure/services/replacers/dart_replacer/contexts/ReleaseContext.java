package core.infrastructure.services.replacers.dart_replacer.contexts;

import java.util.ArrayList;
import java.util.Comparator;

public class ReleaseContext extends Context {
//    private PlaceholderContext placeholderContext;
    private ArrayList<PlaceholderContext> placeholdersContexts;

    public ReleaseContext(ArrayList<PlaceholderContext> placeholdersContexts) {
//        this.placeholderContext = placeholderContext;
        placeholdersContexts.sort(new Comparator<PlaceholderContext>() {
            public int compare(PlaceholderContext context1, PlaceholderContext context2) {
                return context1.getParserRuleContext().getStart().getStartIndex()
                        - context2.getParserRuleContext().getStart().getStartIndex();
            }
        });
        this.placeholdersContexts = placeholdersContexts;
//        System.out.println("SORT");
//        this.placeholdersContexts.forEach(context ->
//                System.out.println(context.getName() + "=" + context.getParserRuleContext().getStart().getStartIndex()));
    }

//    public PlaceholderContext getPlaceholderContext() {
//        return placeholderContext;
//    }
    public ArrayList<PlaceholderContext> getPlaceholdersContexts() {
        return placeholdersContexts;
    }
}
