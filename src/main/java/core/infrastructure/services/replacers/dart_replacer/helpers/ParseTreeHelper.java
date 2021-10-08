package core.infrastructure.services.replacers.dart_replacer.helpers;

import antlr.training.TrainingParser.IdentifierContext;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ParseTreeHelper {

    public static <T extends ParseTree> List<T> filterByParserRuleContext  (List<ParseTree> contexts, Class<T> classType) {
        List<T> result = new ArrayList<>();

        for(ParseTree context: contexts) {
            if(context.getClass().isAssignableFrom(classType)) {
                result.add((T)context);
            }
        }

        return result;
    }


    public static <T extends ParseTree> T findContext(List<ParseTree> contexts, Class<T> classType) {
        return findContext(contexts, classType, 1);
    }

    public static <T extends ParseTree> T findContext(List<ParseTree> contexts, Class<T> classType, int num) {
        int counter = 0;
        T resultContext = null;

        for (ParseTree context: contexts) {
            if(context.getClass().isAssignableFrom(classType) ) {
                counter++;

                if(counter == num) {
                    resultContext = (T) context;
                }
            }
        }

        return resultContext;
    }


    public static IdentifierContext findIdentifier(List<ParseTree> contexts) {
        return findContext(contexts, IdentifierContext.class);
    }

    public static RuleContext findAncestor(RuleContext context, List<Class> types) throws Exception {
        if(context.parent == null) {
            throw new Exception("Предок с типами " +types+ " не найден");
        }

        for(Class type: types){
            if(context.parent.getClass() == type) {
                return context.parent;
            }
        }

        return findAncestor(context.parent, types);
    }
}
