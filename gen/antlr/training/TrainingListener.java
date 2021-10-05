// Generated from D:/projects/java/koliane/src/main/java/antlr/training\Training.g4 by ANTLR 4.9.1
package antlr.training;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrainingParser}.
 */
public interface TrainingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrainingParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(TrainingParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(TrainingParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TrainingParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TrainingParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredIdentifier(TrainingParser.DeclaredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredIdentifier(TrainingParser.DeclaredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 */
	void enterFinalConstVarOrType(TrainingParser.FinalConstVarOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 */
	void exitFinalConstVarOrType(TrainingParser.FinalConstVarOrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#varOrType}.
	 * @param ctx the parse tree
	 */
	void enterVarOrType(TrainingParser.VarOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#varOrType}.
	 * @param ctx the parse tree
	 */
	void exitVarOrType(TrainingParser.VarOrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializedVariableDeclaration(TrainingParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializedVariableDeclaration(TrainingParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#initializedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInitializedIdentifier(TrainingParser.InitializedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#initializedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInitializedIdentifier(TrainingParser.InitializedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterInitializedIdentifierList(TrainingParser.InitializedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitInitializedIdentifierList(TrainingParser.InitializedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(TrainingParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(TrainingParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#formalParameterPart}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterPart(TrainingParser.FormalParameterPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#formalParameterPart}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterPart(TrainingParser.FormalParameterPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(TrainingParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(TrainingParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(TrainingParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(TrainingParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TrainingParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TrainingParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(TrainingParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(TrainingParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#normalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterNormalFormalParameters(TrainingParser.NormalFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#normalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitNormalFormalParameters(TrainingParser.NormalFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#optionalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptionalFormalParameters(TrainingParser.OptionalFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#optionalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptionalFormalParameters(TrainingParser.OptionalFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#optionalPositionalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptionalPositionalFormalParameters(TrainingParser.OptionalPositionalFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#optionalPositionalFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptionalPositionalFormalParameters(TrainingParser.OptionalPositionalFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#namedFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterNamedFormalParameters(TrainingParser.NamedFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#namedFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitNamedFormalParameters(TrainingParser.NamedFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#normalFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterNormalFormalParameter(TrainingParser.NormalFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#normalFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitNormalFormalParameter(TrainingParser.NormalFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#functionFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionFormalParameter(TrainingParser.FunctionFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#functionFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionFormalParameter(TrainingParser.FunctionFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#simpleFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFormalParameter(TrainingParser.SimpleFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#simpleFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFormalParameter(TrainingParser.SimpleFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#fieldFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFieldFormalParameter(TrainingParser.FieldFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#fieldFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFieldFormalParameter(TrainingParser.FieldFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#defaultFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterDefaultFormalParameter(TrainingParser.DefaultFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#defaultFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitDefaultFormalParameter(TrainingParser.DefaultFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#defaultNamedParameter}.
	 * @param ctx the parse tree
	 */
	void enterDefaultNamedParameter(TrainingParser.DefaultNamedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#defaultNamedParameter}.
	 * @param ctx the parse tree
	 */
	void exitDefaultNamedParameter(TrainingParser.DefaultNamedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(TrainingParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(TrainingParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#mixins}.
	 * @param ctx the parse tree
	 */
	void enterMixins(TrainingParser.MixinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#mixins}.
	 * @param ctx the parse tree
	 */
	void exitMixins(TrainingParser.MixinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDefinition(TrainingParser.ClassMemberDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDefinition(TrainingParser.ClassMemberDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(TrainingParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(TrainingParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TrainingParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TrainingParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#staticFinalDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStaticFinalDeclarationList(TrainingParser.StaticFinalDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#staticFinalDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStaticFinalDeclarationList(TrainingParser.StaticFinalDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#staticFinalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticFinalDeclaration(TrainingParser.StaticFinalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#staticFinalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticFinalDeclaration(TrainingParser.StaticFinalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#operatorSignature}.
	 * @param ctx the parse tree
	 */
	void enterOperatorSignature(TrainingParser.OperatorSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#operatorSignature}.
	 * @param ctx the parse tree
	 */
	void exitOperatorSignature(TrainingParser.OperatorSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterOperator_(TrainingParser.Operator_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitOperator_(TrainingParser.Operator_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(TrainingParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(TrainingParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#getterSignature}.
	 * @param ctx the parse tree
	 */
	void enterGetterSignature(TrainingParser.GetterSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#getterSignature}.
	 * @param ctx the parse tree
	 */
	void exitGetterSignature(TrainingParser.GetterSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#setterSignature}.
	 * @param ctx the parse tree
	 */
	void enterSetterSignature(TrainingParser.SetterSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#setterSignature}.
	 * @param ctx the parse tree
	 */
	void exitSetterSignature(TrainingParser.SetterSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#constructorSignature}.
	 * @param ctx the parse tree
	 */
	void enterConstructorSignature(TrainingParser.ConstructorSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#constructorSignature}.
	 * @param ctx the parse tree
	 */
	void exitConstructorSignature(TrainingParser.ConstructorSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(TrainingParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(TrainingParser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#initializers}.
	 * @param ctx the parse tree
	 */
	void enterInitializers(TrainingParser.InitializersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#initializers}.
	 * @param ctx the parse tree
	 */
	void exitInitializers(TrainingParser.InitializersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#initializerListEntry}.
	 * @param ctx the parse tree
	 */
	void enterInitializerListEntry(TrainingParser.InitializerListEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#initializerListEntry}.
	 * @param ctx the parse tree
	 */
	void exitInitializerListEntry(TrainingParser.InitializerListEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#fieldInitializer}.
	 * @param ctx the parse tree
	 */
	void enterFieldInitializer(TrainingParser.FieldInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#fieldInitializer}.
	 * @param ctx the parse tree
	 */
	void exitFieldInitializer(TrainingParser.FieldInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#factoryConstructorSignature}.
	 * @param ctx the parse tree
	 */
	void enterFactoryConstructorSignature(TrainingParser.FactoryConstructorSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#factoryConstructorSignature}.
	 * @param ctx the parse tree
	 */
	void exitFactoryConstructorSignature(TrainingParser.FactoryConstructorSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#redirectingFactoryConstructorSignature}.
	 * @param ctx the parse tree
	 */
	void enterRedirectingFactoryConstructorSignature(TrainingParser.RedirectingFactoryConstructorSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#redirectingFactoryConstructorSignature}.
	 * @param ctx the parse tree
	 */
	void exitRedirectingFactoryConstructorSignature(TrainingParser.RedirectingFactoryConstructorSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#constantConstructorSignature}.
	 * @param ctx the parse tree
	 */
	void enterConstantConstructorSignature(TrainingParser.ConstantConstructorSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#constantConstructorSignature}.
	 * @param ctx the parse tree
	 */
	void exitConstantConstructorSignature(TrainingParser.ConstantConstructorSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(TrainingParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(TrainingParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void enterInterfaces(TrainingParser.InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void exitInterfaces(TrainingParser.InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#mixinApplicationClass}.
	 * @param ctx the parse tree
	 */
	void enterMixinApplicationClass(TrainingParser.MixinApplicationClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#mixinApplicationClass}.
	 * @param ctx the parse tree
	 */
	void exitMixinApplicationClass(TrainingParser.MixinApplicationClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#mixinApplication}.
	 * @param ctx the parse tree
	 */
	void enterMixinApplication(TrainingParser.MixinApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#mixinApplication}.
	 * @param ctx the parse tree
	 */
	void exitMixinApplication(TrainingParser.MixinApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(TrainingParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(TrainingParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(TrainingParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(TrainingParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TrainingParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TrainingParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(TrainingParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(TrainingParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(TrainingParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(TrainingParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TrainingParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TrainingParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#expressionWithoutCascade}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithoutCascade(TrainingParser.ExpressionWithoutCascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#expressionWithoutCascade}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithoutCascade(TrainingParser.ExpressionWithoutCascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(TrainingParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(TrainingParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TrainingParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TrainingParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TrainingParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TrainingParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(TrainingParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(TrainingParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(TrainingParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(TrainingParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(TrainingParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(TrainingParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(TrainingParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(TrainingParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#stringInterpolation}.
	 * @param ctx the parse tree
	 */
	void enterStringInterpolation(TrainingParser.StringInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#stringInterpolation}.
	 * @param ctx the parse tree
	 */
	void exitStringInterpolation(TrainingParser.StringInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#symbolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSymbolLiteral(TrainingParser.SymbolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#symbolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSymbolLiteral(TrainingParser.SymbolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(TrainingParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(TrainingParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(TrainingParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(TrainingParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#mapLiteralEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteralEntry(TrainingParser.MapLiteralEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#mapLiteralEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteralEntry(TrainingParser.MapLiteralEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(TrainingParser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(TrainingParser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#throwExpressionWithoutCascade}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpressionWithoutCascade(TrainingParser.ThrowExpressionWithoutCascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#throwExpressionWithoutCascade}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpressionWithoutCascade(TrainingParser.ThrowExpressionWithoutCascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(TrainingParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(TrainingParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(TrainingParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(TrainingParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#nayaExpression}.
	 * @param ctx the parse tree
	 */
	void enterNayaExpression(TrainingParser.NayaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#nayaExpression}.
	 * @param ctx the parse tree
	 */
	void exitNayaExpression(TrainingParser.NayaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#constObjectExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstObjectExpression(TrainingParser.ConstObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#constObjectExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstObjectExpression(TrainingParser.ConstObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TrainingParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TrainingParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TrainingParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TrainingParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(TrainingParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(TrainingParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#cascadeSection}.
	 * @param ctx the parse tree
	 */
	void enterCascadeSection(TrainingParser.CascadeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#cascadeSection}.
	 * @param ctx the parse tree
	 */
	void exitCascadeSection(TrainingParser.CascadeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#cascadeSelector}.
	 * @param ctx the parse tree
	 */
	void enterCascadeSelector(TrainingParser.CascadeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#cascadeSelector}.
	 * @param ctx the parse tree
	 */
	void exitCascadeSelector(TrainingParser.CascadeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#argumentPart}.
	 * @param ctx the parse tree
	 */
	void enterArgumentPart(TrainingParser.ArgumentPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#argumentPart}.
	 * @param ctx the parse tree
	 */
	void exitArgumentPart(TrainingParser.ArgumentPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TrainingParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TrainingParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#compoundAssignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompoundAssignmentOperator(TrainingParser.CompoundAssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#compoundAssignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompoundAssignmentOperator(TrainingParser.CompoundAssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TrainingParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TrainingParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#ifNullExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfNullExpression(TrainingParser.IfNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#ifNullExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfNullExpression(TrainingParser.IfNullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(TrainingParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(TrainingParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(TrainingParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(TrainingParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TrainingParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TrainingParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(TrainingParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(TrainingParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TrainingParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TrainingParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(TrainingParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(TrainingParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#bitwiseOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpression(TrainingParser.BitwiseOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#bitwiseOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpression(TrainingParser.BitwiseOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#bitwiseXorExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpression(TrainingParser.BitwiseXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#bitwiseXorExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpression(TrainingParser.BitwiseXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#bitwiseAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpression(TrainingParser.BitwiseAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#bitwiseAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpression(TrainingParser.BitwiseAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOperator(TrainingParser.BitwiseOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOperator(TrainingParser.BitwiseOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(TrainingParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(TrainingParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(TrainingParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(TrainingParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TrainingParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TrainingParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(TrainingParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(TrainingParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TrainingParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TrainingParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(TrainingParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(TrainingParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TrainingParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TrainingParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(TrainingParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(TrainingParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#minusOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusOperator(TrainingParser.MinusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#minusOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusOperator(TrainingParser.MinusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#negationOperator}.
	 * @param ctx the parse tree
	 */
	void enterNegationOperator(TrainingParser.NegationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#negationOperator}.
	 * @param ctx the parse tree
	 */
	void exitNegationOperator(TrainingParser.NegationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#tildeOperator}.
	 * @param ctx the parse tree
	 */
	void enterTildeOperator(TrainingParser.TildeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#tildeOperator}.
	 * @param ctx the parse tree
	 */
	void exitTildeOperator(TrainingParser.TildeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#awaitExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(TrainingParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#awaitExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(TrainingParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(TrainingParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(TrainingParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(TrainingParser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(TrainingParser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(TrainingParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(TrainingParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#incrementOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOperator(TrainingParser.IncrementOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#incrementOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOperator(TrainingParser.IncrementOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(TrainingParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(TrainingParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#unconditionalAssignableSelector}.
	 * @param ctx the parse tree
	 */
	void enterUnconditionalAssignableSelector(TrainingParser.UnconditionalAssignableSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#unconditionalAssignableSelector}.
	 * @param ctx the parse tree
	 */
	void exitUnconditionalAssignableSelector(TrainingParser.UnconditionalAssignableSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#assignableSelector}.
	 * @param ctx the parse tree
	 */
	void enterAssignableSelector(TrainingParser.AssignableSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#assignableSelector}.
	 * @param ctx the parse tree
	 */
	void exitAssignableSelector(TrainingParser.AssignableSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TrainingParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TrainingParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#qualified}.
	 * @param ctx the parse tree
	 */
	void enterQualified(TrainingParser.QualifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#qualified}.
	 * @param ctx the parse tree
	 */
	void exitQualified(TrainingParser.QualifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(TrainingParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(TrainingParser.TypeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(TrainingParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(TrainingParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(TrainingParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(TrainingParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(TrainingParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(TrainingParser.AsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(TrainingParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(TrainingParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TrainingParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TrainingParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#nonLabledStatment}.
	 * @param ctx the parse tree
	 */
	void enterNonLabledStatment(TrainingParser.NonLabledStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#nonLabledStatment}.
	 * @param ctx the parse tree
	 */
	void exitNonLabledStatment(TrainingParser.NonLabledStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TrainingParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TrainingParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(TrainingParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(TrainingParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#localFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalFunctionDeclaration(TrainingParser.LocalFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#localFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalFunctionDeclaration(TrainingParser.LocalFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TrainingParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TrainingParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TrainingParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TrainingParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void enterForLoopParts(TrainingParser.ForLoopPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void exitForLoopParts(TrainingParser.ForLoopPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#forInitializerStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitializerStatement(TrainingParser.ForInitializerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#forInitializerStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitializerStatement(TrainingParser.ForInitializerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TrainingParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TrainingParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(TrainingParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(TrainingParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(TrainingParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(TrainingParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(TrainingParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(TrainingParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(TrainingParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(TrainingParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#rethrowStatment}.
	 * @param ctx the parse tree
	 */
	void enterRethrowStatment(TrainingParser.RethrowStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#rethrowStatment}.
	 * @param ctx the parse tree
	 */
	void exitRethrowStatment(TrainingParser.RethrowStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(TrainingParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(TrainingParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#onPart}.
	 * @param ctx the parse tree
	 */
	void enterOnPart(TrainingParser.OnPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#onPart}.
	 * @param ctx the parse tree
	 */
	void exitOnPart(TrainingParser.OnPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#catchPart}.
	 * @param ctx the parse tree
	 */
	void enterCatchPart(TrainingParser.CatchPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#catchPart}.
	 * @param ctx the parse tree
	 */
	void exitCatchPart(TrainingParser.CatchPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#finallyPart}.
	 * @param ctx the parse tree
	 */
	void enterFinallyPart(TrainingParser.FinallyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#finallyPart}.
	 * @param ctx the parse tree
	 */
	void exitFinallyPart(TrainingParser.FinallyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TrainingParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TrainingParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(TrainingParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(TrainingParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(TrainingParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(TrainingParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(TrainingParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(TrainingParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(TrainingParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(TrainingParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#yieldEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldEachStatement(TrainingParser.YieldEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#yieldEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldEachStatement(TrainingParser.YieldEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(TrainingParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(TrainingParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(TrainingParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(TrainingParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#topLevelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDefinition(TrainingParser.TopLevelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#topLevelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDefinition(TrainingParser.TopLevelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#getOrSet}.
	 * @param ctx the parse tree
	 */
	void enterGetOrSet(TrainingParser.GetOrSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#getOrSet}.
	 * @param ctx the parse tree
	 */
	void exitGetOrSet(TrainingParser.GetOrSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#libraryDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDefinition(TrainingParser.LibraryDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#libraryDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDefinition(TrainingParser.LibraryDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#scriptTag}.
	 * @param ctx the parse tree
	 */
	void enterScriptTag(TrainingParser.ScriptTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#scriptTag}.
	 * @param ctx the parse tree
	 */
	void exitScriptTag(TrainingParser.ScriptTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#libraryName}.
	 * @param ctx the parse tree
	 */
	void enterLibraryName(TrainingParser.LibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#libraryName}.
	 * @param ctx the parse tree
	 */
	void exitLibraryName(TrainingParser.LibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#importOrExport}.
	 * @param ctx the parse tree
	 */
	void enterImportOrExport(TrainingParser.ImportOrExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#importOrExport}.
	 * @param ctx the parse tree
	 */
	void exitImportOrExport(TrainingParser.ImportOrExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#dottedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterDottedIdentifierList(TrainingParser.DottedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#dottedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitDottedIdentifierList(TrainingParser.DottedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#libraryimport}.
	 * @param ctx the parse tree
	 */
	void enterLibraryimport(TrainingParser.LibraryimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#libraryimport}.
	 * @param ctx the parse tree
	 */
	void exitLibraryimport(TrainingParser.LibraryimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#importSpecification}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecification(TrainingParser.ImportSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#importSpecification}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecification(TrainingParser.ImportSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(TrainingParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(TrainingParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(TrainingParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(TrainingParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#libraryExport}.
	 * @param ctx the parse tree
	 */
	void enterLibraryExport(TrainingParser.LibraryExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#libraryExport}.
	 * @param ctx the parse tree
	 */
	void exitLibraryExport(TrainingParser.LibraryExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#partDirective}.
	 * @param ctx the parse tree
	 */
	void enterPartDirective(TrainingParser.PartDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#partDirective}.
	 * @param ctx the parse tree
	 */
	void exitPartDirective(TrainingParser.PartDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#partHeader}.
	 * @param ctx the parse tree
	 */
	void enterPartHeader(TrainingParser.PartHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#partHeader}.
	 * @param ctx the parse tree
	 */
	void exitPartHeader(TrainingParser.PartHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#partDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPartDeclaration(TrainingParser.PartDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#partDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPartDeclaration(TrainingParser.PartDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(TrainingParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(TrainingParser.UriContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#configurableUri}.
	 * @param ctx the parse tree
	 */
	void enterConfigurableUri(TrainingParser.ConfigurableUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#configurableUri}.
	 * @param ctx the parse tree
	 */
	void exitConfigurableUri(TrainingParser.ConfigurableUriContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#configurationUri}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationUri(TrainingParser.ConfigurationUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#configurationUri}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationUri(TrainingParser.ConfigurationUriContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#uriTest}.
	 * @param ctx the parse tree
	 */
	void enterUriTest(TrainingParser.UriTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#uriTest}.
	 * @param ctx the parse tree
	 */
	void exitUriTest(TrainingParser.UriTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(TrainingParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(TrainingParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TrainingParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TrainingParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(TrainingParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(TrainingParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(TrainingParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(TrainingParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(TrainingParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(TrainingParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#typeAliasBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasBody(TrainingParser.TypeAliasBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#typeAliasBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasBody(TrainingParser.TypeAliasBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#functionTypeAlias}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeAlias(TrainingParser.FunctionTypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#functionTypeAlias}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeAlias(TrainingParser.FunctionTypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#functionPrefix}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrefix(TrainingParser.FunctionPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#functionPrefix}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrefix(TrainingParser.FunctionPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#placeholderLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholderLiteral(TrainingParser.PlaceholderLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#placeholderLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholderLiteral(TrainingParser.PlaceholderLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#stringWithPlaceholderLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringWithPlaceholderLiteral(TrainingParser.StringWithPlaceholderLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#stringWithPlaceholderLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringWithPlaceholderLiteral(TrainingParser.StringWithPlaceholderLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#openFigureBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenFigureBracket(TrainingParser.OpenFigureBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#openFigureBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenFigureBracket(TrainingParser.OpenFigureBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#closeFigureBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseFigureBracket(TrainingParser.CloseFigureBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#closeFigureBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseFigureBracket(TrainingParser.CloseFigureBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#openSquareBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenSquareBracket(TrainingParser.OpenSquareBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#openSquareBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenSquareBracket(TrainingParser.OpenSquareBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#closeSquareBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseSquareBracket(TrainingParser.CloseSquareBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#closeSquareBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseSquareBracket(TrainingParser.CloseSquareBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(TrainingParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(TrainingParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrainingParser#importScope}.
	 * @param ctx the parse tree
	 */
	void enterImportScope(TrainingParser.ImportScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrainingParser#importScope}.
	 * @param ctx the parse tree
	 */
	void exitImportScope(TrainingParser.ImportScopeContext ctx);
}