package core.infrastructure.file.changers;

import antlr.training.TrainingParser.*;
//import antlr.training.TrainingParser.ClassMemberDefinitionContext;
//import antlr.training.TrainingParser.DeclarationContext;
//import antlr.training.TrainingParser.MethodSignatureContext;
//import antlr.training.TrainingParser.PlaceholderLiteralContext;
//import antlr.training.TrainingParser.IdentifierContext;
//import antlr.training.TrainingParser.QualifiedContext;
//import antlr.training.TrainingParser.ConstantConstructorSignatureContext;
//import antlr.training.TrainingParser.ConstructorSignatureContext;
//import antlr.training.TrainingParser.GetterSignatureContext;
//import antlr.training.TrainingParser.SetterSignatureContext;
//import antlr.training.TrainingParser.OperatorSignatureContext;

import core.infrastructure.helpers.ReplacementHelper;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.Collectors;

public class IdentifierGetter<T extends ParserRuleContext> {
    T primaryContext;

    public IdentifierGetter(T primaryContext) {
        this.primaryContext = primaryContext;
    }

    public List<String> get() throws Exception {
        if(primaryContext instanceof ClassMemberDefinitionContext) {
            return fromClassMemberDefinition((ClassMemberDefinitionContext) primaryContext);
        }

        if(primaryContext instanceof PlaceholderLiteralContext) {
            return fromPlaceholderLiteral((PlaceholderLiteralContext) primaryContext);
        }


        throw new Exception("Идентификатор не найден");
    }

    /** @link classMemberDefinition */
    protected List<String> fromClassMemberDefinition(ClassMemberDefinitionContext context) {
        ArrayList<ParseTree> children = (ArrayList<ParseTree>) context.children;
        ParseTree firstParseRule = children.get(0);

        if(firstParseRule instanceof DeclarationContext) {
            return fromDeclaration((DeclarationContext) firstParseRule);
        }

        if(firstParseRule instanceof MethodSignatureContext) {
            return fromMethodSignature((MethodSignatureContext) firstParseRule);
        }

        if(firstParseRule instanceof PlaceholderLiteralContext) {
            return fromPlaceholderLiteral((PlaceholderLiteralContext) firstParseRule);
        }

        return new ArrayList<>();
    }

    /** @link declaration */
    protected List<String> fromDeclaration(DeclarationContext context) {
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
            ConstantConstructorSignatureContext.class,
            ConstructorSignatureContext.class,
            GetterSignatureContext.class,
            SetterSignatureContext.class,
            OperatorSignatureContext.class,
            FunctionSignatureContext.class,
            StaticFinalDeclarationListContext.class,
            InitializedIdentifierListContext.class
        );

        List<ParseTree> children = context.children;
        for(ParseTree child: children) {
            if(!availableContexts.contains(child.getClass())) {
                continue;
            }

            if(child instanceof ConstantConstructorSignatureContext) {
                return fromConstantConstructorSignature((ConstantConstructorSignatureContext) child);
            }

            if(child instanceof ConstructorSignatureContext) {
                return fromConstructorSignature((ConstructorSignatureContext) child);
            }

            if(child instanceof GetterSignatureContext) {
                return fromGetterSignature((GetterSignatureContext) child);
            }

            if(child instanceof SetterSignatureContext) {
                return fromSetterSignature((SetterSignatureContext) child);
            }

            if(child instanceof OperatorSignatureContext) {
                return fromOperatorSignature((OperatorSignatureContext) child);
            }

            if(child instanceof FunctionSignatureContext) {
                return fromFunctionSignature((FunctionSignatureContext) child);
            }

            if(child instanceof StaticFinalDeclarationListContext) {
                return fromStaticFinalDeclarationList((StaticFinalDeclarationListContext) child);
            }

            if(child instanceof InitializedIdentifierListContext) {
                return fromInitializedIdentifierList((InitializedIdentifierListContext) child);
            }
        }

        return new ArrayList<>();
    }

    /** @link methodSignature */
    protected List<String> fromMethodSignature(MethodSignatureContext context) {
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
                ConstructorSignatureContext.class,
                FactoryConstructorSignatureContext.class,
                FunctionSignatureContext.class,
                GetterSignatureContext.class,
                SetterSignatureContext.class,
                OperatorSignatureContext.class
        );

        List<ParseTree> children = context.children;
        for(ParseTree child: children) {
            if(!availableContexts.contains(child.getClass())) {
                continue;
            }

            if(child instanceof ConstructorSignatureContext) {
                return fromConstructorSignature((ConstructorSignatureContext) child);
            }

            if(child instanceof FactoryConstructorSignatureContext) {
                return fromFactoryConstructorSignature((FactoryConstructorSignatureContext) child);
            }

            if(child instanceof FunctionSignatureContext) {
                return fromFunctionSignature((FunctionSignatureContext) child);
            }

            if(child instanceof GetterSignatureContext) {
                return fromGetterSignature((GetterSignatureContext) child);
            }

            if(child instanceof SetterSignatureContext) {
                return fromSetterSignature((SetterSignatureContext) child);
            }

            if(child instanceof OperatorSignatureContext) {
                return fromOperatorSignature((OperatorSignatureContext) child);
            }
        }

        return new ArrayList<>();
    }

    /** @link constantConstructorSignature */
    protected List<String> fromConstantConstructorSignature(ConstantConstructorSignatureContext context) {
        return fromQualified(context.qualified());
    }

    /** @link constructorSignature */
    protected List<String> fromConstructorSignature(ConstructorSignatureContext context) {
        List<ParseTree> children = context.children;

        String text = children.size() <= 2
                ? children.get(0).getText()
                : children.get(0).getText() + children.get(1).getText() + children.get(2).getText()
            ;

        return toArray(text);
    }

    /** @link factoryConstructorSignature */
    protected List<String> fromFactoryConstructorSignature(FactoryConstructorSignatureContext context) {
        List<ParseTree> children = context.children;
        ArrayList<String> results = new ArrayList<>();
        List<IdentifierContext> resultContexts = ParseTreeHelper.filterByParserRuleContext(children, IdentifierContext.class);

        for(IdentifierContext resultContext: resultContexts) {
            results.add(fromIdentifier(resultContext).get(0));
        }

        return results;
    }

    /** @link getterSignature */
    protected List<String> fromGetterSignature(GetterSignatureContext context) {
        List<ParseTree> children = (ArrayList<ParseTree>) context.children;

        IdentifierContext identifierContext = ParseTreeHelper.findContext(children, IdentifierContext.class);

        return fromIdentifier(identifierContext);
    }

    /** @link setterSignature */
    protected List<String> fromSetterSignature(SetterSignatureContext context) {
        List<ParseTree> children = (ArrayList<ParseTree>) context.children;

        IdentifierContext identifierContext = ParseTreeHelper.findContext(children, IdentifierContext.class);

        return fromIdentifier(identifierContext);
    }

    /** @link operatorSignature */
    protected List<String> fromOperatorSignature(OperatorSignatureContext context) {
        return toArray(context.operator_().getText());
    }

    /** @link functionSignature */
    protected List<String> fromFunctionSignature(FunctionSignatureContext context) {
        return fromIdentifier(ParseTreeHelper.findIdentifier(context.children));
    }

    /** @link staticFinalDeclarationList */
    protected List<String> fromStaticFinalDeclarationList(StaticFinalDeclarationListContext context) {
        List<ParseTree> children = context.children;
        ArrayList<String> results = new ArrayList<>();
        List<StaticFinalDeclarationContext> resultContexts = ParseTreeHelper.filterByParserRuleContext(children, StaticFinalDeclarationContext.class);

        for(StaticFinalDeclarationContext resultContext: resultContexts) {
            results.add(fromStaticFinalDeclaration(resultContext).get(0));
        }

        return results;
    }

    /** @link staticFinalDeclaration */
    protected List<String> fromStaticFinalDeclaration(StaticFinalDeclarationContext context) {
        return fromIdentifier(context.identifier());
    }

    /** @link initializedIdentifierList */
    protected List<String> fromInitializedIdentifierList(InitializedIdentifierListContext context) {
        List<ParseTree> children = context.children;
        ArrayList<String> results = new ArrayList<>();
        List<InitializedIdentifierContext> resultContexts = ParseTreeHelper.filterByParserRuleContext(children, InitializedIdentifierContext.class);

        for(InitializedIdentifierContext resultContext: resultContexts) {
            results.add(fromInitializedIdentifier(resultContext).get(0));
        }

        return results;
    }

    /** @link initializedIdentifier */
    protected List<String> fromInitializedIdentifier(InitializedIdentifierContext context) {
        return fromIdentifier(context.identifier());
    }

    /** @link placeholderLiteral */
    protected List<String> fromPlaceholderLiteral(PlaceholderLiteralContext context) {
        return toArray(ReplacementHelper.getClearedPlaceholder(context.getText()));
    }

    /** @link identifier */
    protected List<String> fromIdentifier(IdentifierContext context) {
        List<String> result = new ArrayList<>();
        result.add(context.getText());

        return result;
    }

//    protected String firstFromIdentifier(IdentifierContext context) {
//        return fromIdentifier(context).get(0);
//    }

    /** @link qualified */
    protected List<String> fromQualified(QualifiedContext context) {
        List<String> result = new ArrayList<>();
        result.add(context.getText());

        return result;
    }

    protected List<String> toArray(String text) {
        List<String> result = new ArrayList<>();
        result.add(text);

        return result;
    }

}
