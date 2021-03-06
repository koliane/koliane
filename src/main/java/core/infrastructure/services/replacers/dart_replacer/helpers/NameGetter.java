package core.infrastructure.services.replacers.dart_replacer.helpers;

import antlr.training.TrainingParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Collections;
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

        if(primaryContext instanceof MapLiteralContext) {
            return fromMapLiteral((MapLiteralContext) primaryContext);
        }

        if(primaryContext instanceof ListLiteralContext) {
            return fromListLiteral((ListLiteralContext) primaryContext);
        }

        if(primaryContext instanceof TypeListContext) {
            return fromTypeList((TypeListContext) primaryContext);
        }

        if(primaryContext instanceof EnumTypeContext) {
            return fromEnumType((EnumTypeContext) primaryContext);
        }

        if(primaryContext instanceof BlockContext) {
            return fromBlock((BlockContext) primaryContext);
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

    /** @link mapLiteral */
    private String fromMapLiteral(MapLiteralContext context) throws Exception {
        return fromCollectionLiteral(context);
    }

    /** @link listLiteral */
    private String fromListLiteral(ListLiteralContext context) throws Exception {
        return fromCollectionLiteral(context);
    }

    /** @link typeList */
    private String fromTypeList(TypeListContext context) throws Exception {
//        return fromCollectionLiteral(context);
        ParserRuleContext parent = context.getParent();
        if(parent instanceof InterfacesContext) {
            ClassDefinitionContext classDefinitionContext = (ClassDefinitionContext) parent.getParent();
            IdentifierGetter<ClassDefinitionContext> identifierGetter = new IdentifierGetter<>((ClassDefinitionContext) classDefinitionContext);
            String classIdentifier = identifierGetter.get().get(0);

            return classIdentifier + "interfaces";
        }

        throw new Exception("Не найдено имя для typeList: " + context.getClass());
    }

    /** @link enumType */
    private String fromEnumType(EnumTypeContext context) throws Exception {
        return context.className().getText();
    }

    private String fromCollectionLiteral(ParserRuleContext context) throws Exception {
        List<Class> types = new ArrayList<>();
        Collections.addAll(types,
                InitializedVariableDeclarationContext.class,
                NamedArgumentContext.class
        );
        RuleContext ancestor = ParseTreeHelper.findAncestor(context, types);
        IdentifierGetter<ParserRuleContext> identifierGetter = new IdentifierGetter<>((ParserRuleContext) ancestor);

        return identifierGetter.get().get(0);
    }

    /** @link block */
    private String fromBlock(BlockContext context) throws Exception {
        ParserRuleContext possibleValuableContext = context.getParent().getParent().getParent();

        if(possibleValuableContext instanceof IfStatementContext) {
            IfStatementContext preparedPossibleValuableContext = (IfStatementContext) possibleValuableContext;
            ParserRuleContext possibleValuableStatement = context.getParent().getParent();
            List<ParseTree> children = possibleValuableContext.children;
            int n = children.size();
            for(int i=0; i < n; i++) {
                ParseTree child = children.get(i);
                if(child == possibleValuableStatement) {
                    if(children.get(i-1).getText().equals("else")) {
                        return "else" + preparedPossibleValuableContext.expression().getText();
                    }
                }
            }

            return preparedPossibleValuableContext.expression().getText();
        }

        if(
                possibleValuableContext instanceof ForStatementContext
                || possibleValuableContext instanceof WhileStatementContext
                || possibleValuableContext instanceof DoStatementContext
        ) {
            IdentifierGetter<ParserRuleContext> identifierGetter = new IdentifierGetter<>(possibleValuableContext);

            return identifierGetter.get().get(0);
        }

        possibleValuableContext = context.getParent();
        if(possibleValuableContext instanceof TryStatementContext) {
            IdentifierGetter<ParserRuleContext> identifierGetter = new IdentifierGetter<>(possibleValuableContext);

            return identifierGetter.get().get(0);
        }


        throw new Exception("Не найдено имя для " + context.getClass());
    }
}
