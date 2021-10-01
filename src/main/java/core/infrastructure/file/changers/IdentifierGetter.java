package core.infrastructure.file.changers;

import antlr.training.TrainingParser.*;
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
        if(primaryContext instanceof TopLevelDefinitionContext) {
            return fromTopLevelDefinition((TopLevelDefinitionContext) primaryContext);
        }

        if(primaryContext instanceof ClassMemberDefinitionContext) {
            return fromClassMemberDefinition((ClassMemberDefinitionContext) primaryContext);
        }

        if(primaryContext instanceof PlaceholderLiteralContext) {
            return fromPlaceholderLiteral((PlaceholderLiteralContext) primaryContext);
        }


        throw new Exception("Идентификатор не найден");
    }

    /** @link topLevelDefinition */
    protected List<String> fromTopLevelDefinition(TopLevelDefinitionContext context) {
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
                ClassDefinitionContext.class,
                EnumTypeContext.class,
                TypeAliasContext.class,
                FunctionSignatureContext.class,
                GetterSignatureContext.class,
                SetterSignatureContext.class,
                IdentifierContext.class,
                StaticFinalDeclarationListContext.class,
                VariableDeclarationContext.class,
                PlaceholderLiteralContext.class
        );

        List<ParseTree> children = context.children;
        for(ParseTree child: children) {
            if (!availableContexts.contains(child.getClass())) {
                continue;
            }

            if (child instanceof ClassDefinitionContext) {
                return fromClassDefinition((ClassDefinitionContext) child);
            }

            if (child instanceof EnumTypeContext) {
                return fromEnumType((EnumTypeContext) child);
            }

            if (child instanceof TypeAliasContext) {
                return fromTypeAlias((TypeAliasContext) child);
            }

            if (child instanceof FunctionSignatureContext) {
                return fromFunctionSignature((FunctionSignatureContext) child);
            }

            if (child instanceof GetterSignatureContext) {
                return fromGetterSignature((GetterSignatureContext) child);
            }

            if (child instanceof SetterSignatureContext) {
                return fromSetterSignature((SetterSignatureContext) child);
            }

            if (child instanceof IdentifierContext) {
                return fromIdentifier((IdentifierContext) child);
            }

            if (child instanceof StaticFinalDeclarationListContext) {
                return fromStaticFinalDeclarationList((StaticFinalDeclarationListContext) child);
            }

            if (child instanceof VariableDeclarationContext) {
                return fromVariableDeclaration((VariableDeclarationContext) child);
            }


            if(child instanceof PlaceholderLiteralContext) {
                return fromPlaceholderLiteral((PlaceholderLiteralContext) child);
            }


        }

        return new ArrayList<>();
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


    /** @link variableDeclaration */
    protected List<String> fromVariableDeclaration(VariableDeclarationContext context) {
        List<ParseTree> children = context.children;
        ArrayList<String> results = new ArrayList<>();
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
            DeclaredIdentifierContext.class,
            IdentifierContext.class
        );


        for(ParseTree child: children) {
            if (!availableContexts.contains(child.getClass())) {
                continue;
            }

            if (child instanceof DeclaredIdentifierContext) {
                results.addAll(fromDeclaredIdentifier((DeclaredIdentifierContext) child));
                continue;
            }

            if (child instanceof IdentifierContext) {
                results.addAll(fromIdentifier((IdentifierContext) child));
                continue;
            }
        }

        return results;
    }

    /** @link declaredIdentifier */
    protected List<String> fromDeclaredIdentifier(DeclaredIdentifierContext context) {
        return fromIdentifier(context.identifier());
    }

    /** @link typeAlias */
    protected List<String> fromTypeAlias(TypeAliasContext context) {
        return fromIdentifier(context.typeAliasBody().functionTypeAlias().functionPrefix().identifier());
    }

    /** @link classDefinition */
    protected List<String> fromClassDefinition(ClassDefinitionContext context) {
        if(context.mixinApplicationClass() != null) {
            return fromMixinApplicationClass(context.mixinApplicationClass());
        }

        return fromClassName(context.className());
    }

    /** @link enumType */
    protected List<String> fromEnumType(EnumTypeContext context) {
        return fromClassName(context.className());
    }

    /** @link importScope */
    protected List<String> fromImportScope(ImportScopeContext context) {
        return toArray(context.getText());
    }

//    /** @link importOrExport */
//    protected List<String> fromImportOrExport(ImportOrExportContext context) {
////        return toArray(context.getText());
//        List<ParseTree> children = context.children;
//        if(context.libraryExport() != null) {
//
//        }
//
//
//    }



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

    /** @link className */
    protected List<String> fromClassName(ClassNameContext context) {
        return toArray(context.getText());
    }

    /** @link mixinApplicationClass */
    protected List<String> fromMixinApplicationClass(MixinApplicationClassContext context) {
        return fromClassName(context.className());
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
