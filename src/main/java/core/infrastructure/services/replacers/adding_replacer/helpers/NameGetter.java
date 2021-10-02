package core.infrastructure.services.replacers.adding_replacer.helpers;

import antlr.training.TrainingParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

//public class NameGetter<T extends ParserRuleContext> {
public class NameGetter {
    ParserRuleContext primaryContext;

    public NameGetter(ParserRuleContext primaryContext) {
        this.primaryContext = primaryContext;
    }

    public String get() throws Exception {
        if(primaryContext instanceof ClassDefinitionContext) {
            return fromClassDefinition((ClassDefinitionContext) primaryContext);
        }

        if(primaryContext instanceof FunctionBodyContext) {
            return fromFunctionBody((FunctionBodyContext) primaryContext);
        }

        if(primaryContext instanceof SwitchStatementContext) {
            return fromSwitchStatement((SwitchStatementContext) primaryContext);
        }

        throw new Exception("Нет подходящего обработчика для контекста " + primaryContext.getClass());
    }

    /** @link classDefinition */
    protected String fromClassDefinition(ClassDefinitionContext context) {
        return context.className().getText();
    }

    /** @link identifier */
    private String fromFunctionBody(FunctionBodyContext context) throws Exception {
        ParserRuleContext parent = context.getParent();
        List<ParseTree> children = parent.children;

        int bodyIndex = -1;
        int n = children.size();
        for(int i=0; i< n; i++) {
            ParseTree item = children.get(i);
            if(item == context) {
                bodyIndex = i;
                break;
            }
        }

        /*
        Правила, которые могут быть с functionBody
        methodSignature functionBody
        //formalParameterPart functionBody
        functionSignature functionBody
        returnType? 'get' identifier functionBody
        returnType? 'set' identifier formalParameterList functionBody

         */

        for(int i = bodyIndex - 1; i >= 0; i--) {
            ParseTree item = children.get(i);
            IdentifierGetter<ParserRuleContext> identifierGetter = new IdentifierGetter<>((ParserRuleContext) item);
            if(item instanceof MethodSignatureContext) {
                return identifierGetter.get().get(0);
            }

            if(item instanceof FunctionSignatureContext) {
                return identifierGetter.get().get(0);
            }

            if(item instanceof IdentifierContext) {
                return identifierGetter.get().get(0);
            }
        }

        throw new Exception("Не обработанный случай");
    }

    /** @link switchStatement */
    private String fromSwitchStatement(SwitchStatementContext context) throws Exception {
        IdentifierGetter<ParserRuleContext> identifierGetter = new IdentifierGetter<>((ParserRuleContext) context);

        return identifierGetter.get().get(0);
    }
}