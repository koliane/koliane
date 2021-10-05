package core.infrastructure.services.replacers.adding_replacer.helpers;

import antlr.training.TrainingParser.*;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class IdentifierGetter<T extends ParserRuleContext> {
    private static final String FOR_STATEMENT_PREFIX = "for";
    private static final String WHILE_STATEMENT_PREFIX = "while";
    private static final String DO_STATEMENT_PREFIX = "do";
    private static final String SWITCH_STATEMENT_PREFIX = "switch";
    private static final String IF_STATEMENT_PREFIX = "if";
    private static final String TRY_STATEMENT_PREFIX = "try";
    private static final String EXPRESSION_STATEMENT_PREFIX = "expression";
    private static final String ASSERT_STATEMENT_PREFIX = "assert";

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

        if(primaryContext instanceof StatementContext) {
            return fromStatement((StatementContext) primaryContext);
        }

        if(primaryContext instanceof PlaceholderLiteralContext) {
            return fromPlaceholderLiteral((PlaceholderLiteralContext) primaryContext);
        }


        if(primaryContext instanceof MethodSignatureContext) {
            return fromMethodSignature((MethodSignatureContext) primaryContext);
        }

        if(primaryContext instanceof FunctionSignatureContext) {
            return fromFunctionSignature((FunctionSignatureContext) primaryContext);
        }

        if(primaryContext instanceof SwitchStatementContext) {
            return fromSwitchStatement((SwitchStatementContext) primaryContext);
        }

        if(primaryContext instanceof SwitchCaseContext) {
            return fromSwitchCase((SwitchCaseContext) primaryContext);
        }

        if(primaryContext instanceof InitializedVariableDeclarationContext) {
            return fromInitializedVariableDeclaration((InitializedVariableDeclarationContext) primaryContext);
        }

        if(primaryContext instanceof MapLiteralEntryContext) {
            return fromMapLiteralEntry((MapLiteralEntryContext) primaryContext);
        }

        if(primaryContext instanceof ExpressionContext) {
            return fromExpression((ExpressionContext) primaryContext);
        }

        if(primaryContext instanceof IfStatementContext) {
            return fromIfStatement((IfStatementContext) primaryContext);
        }

        if(primaryContext instanceof ForStatementContext) {
            return fromForStatement((ForStatementContext) primaryContext);
        }

        if(primaryContext instanceof WhileStatementContext) {
            return fromWhileStatement((WhileStatementContext) primaryContext);
        }

        if(primaryContext instanceof DoStatementContext) {
            return fromDoStatement((DoStatementContext) primaryContext);
        }

        if(primaryContext instanceof TryStatementContext) {
            return fromTryStatement((TryStatementContext) primaryContext);
        }

        if(primaryContext instanceof NamedArgumentContext) {
            return fromNamedArgument((NamedArgumentContext) primaryContext);
        }


        throw new Exception("Идентификатор не найден для класса "+primaryContext.getClass());
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

    /** @link statement */
    protected List<String> fromStatement(StatementContext context) {
        return fromNonLabledStatment(context.nonLabledStatment());
    }

    /** @link block */
    protected List<String> fromBlock(BlockContext context) {
        if(context.placeholderLiteral() != null) {
            return fromPlaceholderLiteral(context.placeholderLiteral());
        }

        return new ArrayList<>();
    }

    //TODO
    /** @link nonLabledStatment */
    protected List<String> fromNonLabledStatment(NonLabledStatmentContext context) {
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
                BlockContext.class,
                LocalVariableDeclarationContext.class,
                ForStatementContext.class,
                WhileStatementContext.class,
                DoStatementContext.class,
                SwitchStatementContext.class,
                IfStatementContext.class,
                RethrowStatmentContext.class,
                TryStatementContext.class,
                BreakStatementContext.class,
                ContinueStatementContext.class,
                ReturnStatementContext.class,
                YieldStatementContext.class,
                YieldEachStatementContext.class,
                ExpressionStatementContext.class,
                AssertStatementContext.class,
                LocalFunctionDeclarationContext.class
        );

        List<ParseTree> children = context.children;
        for(ParseTree child: children) {
            if (!availableContexts.contains(child.getClass())) {
                continue;
            }

            if (child instanceof BlockContext) {
                return fromBlock((BlockContext) child);
            }

            if (child instanceof LocalVariableDeclarationContext) {
                return fromLocalVariableDeclaration((LocalVariableDeclarationContext) child);
            }

            if (child instanceof ForStatementContext) {
                return fromForStatement((ForStatementContext) child);
            }

            if (child instanceof WhileStatementContext) {
                return fromWhileStatement((WhileStatementContext) child);
            }

            if (child instanceof DoStatementContext) {
                return fromDoStatement((DoStatementContext) child);
            }

            if (child instanceof SwitchStatementContext) {
                return fromSwitchStatement((SwitchStatementContext) child);
            }

            if (child instanceof IfStatementContext) {
                return fromIfStatement((IfStatementContext) child);
            }

            if (child instanceof RethrowStatmentContext) {
                return fromRethrowStatement((RethrowStatmentContext) child);
            }

            if (child instanceof TryStatementContext) {
                return fromTryStatement((TryStatementContext) child);
            }

            if (child instanceof BreakStatementContext) {
                return fromBreakStatement((BreakStatementContext) child);
            }

            if (child instanceof ContinueStatementContext) {
                return fromContinueStatement((ContinueStatementContext) child);
            }

            if (child instanceof ReturnStatementContext) {
                return fromReturnStatement((ReturnStatementContext) child);
            }

            if (child instanceof YieldStatementContext) {
                return fromYieldStatement((YieldStatementContext) child);
            }

            if (child instanceof YieldEachStatementContext) {
                return fromYieldEachStatement((YieldEachStatementContext) child);
            }

            if (child instanceof ExpressionStatementContext) {
                return fromExpressionStatement((ExpressionStatementContext) child);
            }

            if (child instanceof AssertStatementContext) {
                return fromAssertStatement((AssertStatementContext) child);
            }

            if (child instanceof LocalFunctionDeclarationContext) {
                return fromLocalFunctionDeclaration((LocalFunctionDeclarationContext) child);
            }
        }

        return new ArrayList<>();
    }


    /** @link forStatement */
    protected List<String> fromForStatement(ForStatementContext context) {
        return toArray( FOR_STATEMENT_PREFIX + context.forLoopParts().getText());
    }

    /** @link whileStatement */
    protected List<String> fromWhileStatement(WhileStatementContext context) {
        return toArray(WHILE_STATEMENT_PREFIX + context.expression().getText());
    }

    /** @link doStatement */
    protected List<String> fromDoStatement(DoStatementContext context) {
        return toArray(DO_STATEMENT_PREFIX + context.expression().getText());
    }

    /** @link switchStatement */
    protected List<String> fromSwitchStatement(SwitchStatementContext context) {
        return toArray(SWITCH_STATEMENT_PREFIX + context.expression().getText());
    }

    /** @link switchCase */
    protected List<String> fromSwitchCase(SwitchCaseContext context) {
        if(context.placeholderLiteral() != null) {
            return fromPlaceholderLiteral(context.placeholderLiteral());
        }

        List<LabelContext> labels = ParseTreeHelper.filterByParserRuleContext(context.children, LabelContext.class);


        return toArray(labels + context.expression().getText());
    }

    /** @link ifStatement */
    protected List<String> fromIfStatement(IfStatementContext context) {
        return toArray(IF_STATEMENT_PREFIX + context.expression().getText());
    }

    /** @link rethrowStatment */
    protected List<String> fromRethrowStatement(RethrowStatmentContext context) {
        return toArray(context.getText());
    }

    /** @link tryStatement */
    protected List<String> fromTryStatement(TryStatementContext context) {
        List<ParseTree> children = context.children;
        ArrayList<String> results = new ArrayList<>();
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
                OnPartContext.class,
                FinallyPartContext.class
        );

        for(ParseTree child: children) {
            if (!availableContexts.contains(child.getClass())) {
                continue;
            }

            if (child instanceof OnPartContext) {
                results.addAll(fromOnPart((OnPartContext) child));
                continue;
            }

            if (child instanceof FinallyPartContext) {
                results.addAll(fromFinallyPart((FinallyPartContext) child));
                continue;
            }
        }



        return toArray(TRY_STATEMENT_PREFIX + results.toString());
    }

    /** @link finallyPart */
    protected List<String> fromFinallyPart(FinallyPartContext context) {
        List<String> results = new ArrayList<>();
        results.add("finally");

        return results;
    }

    /** @link onPart */
    protected List<String> fromOnPart(OnPartContext context) {
        List<String> results = new ArrayList<>();

        if(context.dtype() != null) {
            results.addAll(fromDtype(context.dtype()));
        }

        if(context.catchPart() != null) {
            results.addAll(fromCatchPart(context.catchPart()));
        }

        return results;
    }

    /** @link catchPart */
    protected List<String> fromCatchPart(CatchPartContext context) {
        List<ParseTree> children = context.children;
        List<String> results = new ArrayList<>();
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
            IdentifierContext.class
        );

        for(ParseTree child: children) {
            if (!availableContexts.contains(child.getClass())) {
                continue;
            }

            results.addAll(fromIdentifier((IdentifierContext) child));
        }

        return results;
    }

    /** @link breakStatement */
    protected List<String> fromBreakStatement(BreakStatementContext context) {
        return toArray(context.getText());
    }

    /** @link namedArgument */
    protected List<String> fromNamedArgument(NamedArgumentContext context) {
        return fromLabel(context.label());
    }

    /** @link label */
    protected List<String> fromLabel(LabelContext context) {
        return fromIdentifier(context.identifier());
    }

    /** @link continueStatement */
    protected List<String> fromContinueStatement(ContinueStatementContext context) {
        return toArray(context.getText());
    }

    /** @link returnStatement */
    protected List<String> fromReturnStatement(ReturnStatementContext context) {
        return toArray(context.getText());
    }

    /** @link yieldStatement */
    protected List<String> fromYieldStatement(YieldStatementContext context) {
        return toArray(context.getText());
    }

    /** @link yieldEachStatement */
    protected List<String> fromYieldEachStatement(YieldEachStatementContext context) {
        return toArray(context.getText());
    }

    /** @link expressionStatement */
    protected List<String> fromExpressionStatement(ExpressionStatementContext context) {
        return toArray(EXPRESSION_STATEMENT_PREFIX + context.getText());
    }

    /** @link assertStatement */
    protected List<String> fromAssertStatement(AssertStatementContext context) {
        return toArray(ASSERT_STATEMENT_PREFIX + context.getText());
    }

    /** @link localFunctionDeclaration */
    protected List<String> fromLocalFunctionDeclaration(LocalFunctionDeclarationContext context) {
        return fromFunctionSignature(context.functionSignature());
    }

    /** @link mapLiteralEntry */
    protected List<String> fromMapLiteralEntry(MapLiteralEntryContext context) {
        if(context.placeholderLiteral() != null) {
            return fromPlaceholderLiteral(context.placeholderLiteral());
        }
        return toArray(context.expression(0).getText());
    }

    /** @link expression */
    protected List<String> fromExpression(ExpressionContext context) {
        return toArray(context.getText());
    }

    /** @link localVariableDeclaration */
    protected List<String> fromLocalVariableDeclaration(LocalVariableDeclarationContext context) {
        return fromInitializedVariableDeclaration(context.initializedVariableDeclaration());
    }


    /** @link initializedVariableDeclaration */
    protected List<String> fromInitializedVariableDeclaration(InitializedVariableDeclarationContext context) {
        List<ParseTree> children = context.children;
        ArrayList<String> results = new ArrayList<>();
        Set<Class> availableContexts = new HashSet<>();
        Collections.addAll(availableContexts,
                DeclaredIdentifierContext.class,
                InitializedIdentifierContext.class
        );

        for(ParseTree child: children) {
            if (!availableContexts.contains(child.getClass())) {
                continue;
            }

            if (child instanceof DeclaredIdentifierContext) {
                results.addAll(fromDeclaredIdentifier((DeclaredIdentifierContext) child));
                continue;
            }

            if (child instanceof InitializedIdentifierContext) {
                results.addAll(fromInitializedIdentifier((InitializedIdentifierContext) child));
                continue;
            }
        }

        return results;
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
        List<String> results = new ArrayList<>();
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
        String clearedPlaceholder = (new CodePlaceholderHelper()).getClearedPlaceholder(context.getText());
//        return toArray(ReplacementHelper.getClearedPlaceholder(context.getText()));
        return toArray(clearedPlaceholder);
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

    /** @link dtype */
    protected List<String> fromDtype(DtypeContext context) {
        return toArray(context.getText());
    }

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
