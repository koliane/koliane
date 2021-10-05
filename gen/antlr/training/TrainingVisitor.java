// Generated from D:/projects/java/koliane/src/main/java/antlr/training\Training.g4 by ANTLR 4.9.1
package antlr.training;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrainingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrainingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrainingParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TrainingParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(TrainingParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredIdentifier(TrainingParser.DeclaredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalConstVarOrType(TrainingParser.FinalConstVarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#varOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrType(TrainingParser.VarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedVariableDeclaration(TrainingParser.InitializedVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#initializedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedIdentifier(TrainingParser.InitializedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedIdentifierList(TrainingParser.InitializedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(TrainingParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#formalParameterPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterPart(TrainingParser.FormalParameterPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(TrainingParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(TrainingParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TrainingParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(TrainingParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#normalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFormalParameters(TrainingParser.NormalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#optionalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalFormalParameters(TrainingParser.OptionalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#optionalPositionalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalPositionalFormalParameters(TrainingParser.OptionalPositionalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#namedFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFormalParameters(TrainingParser.NamedFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#normalFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFormalParameter(TrainingParser.NormalFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#functionFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFormalParameter(TrainingParser.FunctionFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#simpleFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFormalParameter(TrainingParser.SimpleFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#fieldFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldFormalParameter(TrainingParser.FieldFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#defaultFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultFormalParameter(TrainingParser.DefaultFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#defaultNamedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultNamedParameter(TrainingParser.DefaultNamedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(TrainingParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#mixins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixins(TrainingParser.MixinsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDefinition(TrainingParser.ClassMemberDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(TrainingParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TrainingParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#staticFinalDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticFinalDeclarationList(TrainingParser.StaticFinalDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#staticFinalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticFinalDeclaration(TrainingParser.StaticFinalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#operatorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorSignature(TrainingParser.OperatorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_(TrainingParser.Operator_Context ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(TrainingParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#getterSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterSignature(TrainingParser.GetterSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#setterSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetterSignature(TrainingParser.SetterSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#constructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorSignature(TrainingParser.ConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#redirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection(TrainingParser.RedirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#initializers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializers(TrainingParser.InitializersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#initializerListEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerListEntry(TrainingParser.InitializerListEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#fieldInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldInitializer(TrainingParser.FieldInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#factoryConstructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryConstructorSignature(TrainingParser.FactoryConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#redirectingFactoryConstructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirectingFactoryConstructorSignature(TrainingParser.RedirectingFactoryConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#constantConstructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantConstructorSignature(TrainingParser.ConstantConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(TrainingParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaces(TrainingParser.InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#mixinApplicationClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinApplicationClass(TrainingParser.MixinApplicationClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#mixinApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinApplication(TrainingParser.MixinApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(TrainingParser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(TrainingParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TrainingParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(TrainingParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(TrainingParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TrainingParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#expressionWithoutCascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithoutCascade(TrainingParser.ExpressionWithoutCascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(TrainingParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TrainingParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TrainingParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(TrainingParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(TrainingParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(TrainingParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(TrainingParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#stringInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInterpolation(TrainingParser.StringInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#symbolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolLiteral(TrainingParser.SymbolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(TrainingParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(TrainingParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#mapLiteralEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteralEntry(TrainingParser.MapLiteralEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(TrainingParser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#throwExpressionWithoutCascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpressionWithoutCascade(TrainingParser.ThrowExpressionWithoutCascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(TrainingParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(TrainingParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#nayaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNayaExpression(TrainingParser.NayaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#constObjectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstObjectExpression(TrainingParser.ConstObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TrainingParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(TrainingParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(TrainingParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#cascadeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeSection(TrainingParser.CascadeSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#cascadeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeSelector(TrainingParser.CascadeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#argumentPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentPart(TrainingParser.ArgumentPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(TrainingParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#compoundAssignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundAssignmentOperator(TrainingParser.CompoundAssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(TrainingParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#ifNullExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNullExpression(TrainingParser.IfNullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(TrainingParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(TrainingParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TrainingParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(TrainingParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TrainingParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(TrainingParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#bitwiseOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(TrainingParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#bitwiseXorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpression(TrainingParser.BitwiseXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#bitwiseAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(TrainingParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperator(TrainingParser.BitwiseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(TrainingParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(TrainingParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TrainingParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(TrainingParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TrainingParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(TrainingParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TrainingParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(TrainingParser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#minusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOperator(TrainingParser.MinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#negationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationOperator(TrainingParser.NegationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#tildeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeOperator(TrainingParser.TildeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#awaitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpression(TrainingParser.AwaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(TrainingParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#postfixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixOperator(TrainingParser.PostfixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(TrainingParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#incrementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOperator(TrainingParser.IncrementOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(TrainingParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#unconditionalAssignableSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconditionalAssignableSelector(TrainingParser.UnconditionalAssignableSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#assignableSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableSelector(TrainingParser.AssignableSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TrainingParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#qualified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified(TrainingParser.QualifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(TrainingParser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(TrainingParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(TrainingParser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(TrainingParser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(TrainingParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TrainingParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#nonLabledStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonLabledStatment(TrainingParser.NonLabledStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TrainingParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(TrainingParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#localFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalFunctionDeclaration(TrainingParser.LocalFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TrainingParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TrainingParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#forLoopParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopParts(TrainingParser.ForLoopPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#forInitializerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitializerStatement(TrainingParser.ForInitializerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TrainingParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(TrainingParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(TrainingParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(TrainingParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(TrainingParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#rethrowStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRethrowStatment(TrainingParser.RethrowStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(TrainingParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#onPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPart(TrainingParser.OnPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#catchPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchPart(TrainingParser.CatchPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#finallyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyPart(TrainingParser.FinallyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TrainingParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(TrainingParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(TrainingParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(TrainingParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#yieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(TrainingParser.YieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#yieldEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldEachStatement(TrainingParser.YieldEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(TrainingParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(TrainingParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#topLevelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDefinition(TrainingParser.TopLevelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#getOrSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetOrSet(TrainingParser.GetOrSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#libraryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDefinition(TrainingParser.LibraryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#scriptTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptTag(TrainingParser.ScriptTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#libraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryName(TrainingParser.LibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#importOrExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportOrExport(TrainingParser.ImportOrExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#dottedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedIdentifierList(TrainingParser.DottedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#libraryimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryimport(TrainingParser.LibraryimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#importSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecification(TrainingParser.ImportSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(TrainingParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(TrainingParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#libraryExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryExport(TrainingParser.LibraryExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#partDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartDirective(TrainingParser.PartDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#partHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartHeader(TrainingParser.PartHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#partDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartDeclaration(TrainingParser.PartDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(TrainingParser.UriContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#configurableUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurableUri(TrainingParser.ConfigurableUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#configurationUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationUri(TrainingParser.ConfigurationUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#uriTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUriTest(TrainingParser.UriTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(TrainingParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TrainingParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(TrainingParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(TrainingParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(TrainingParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#typeAliasBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasBody(TrainingParser.TypeAliasBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#functionTypeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeAlias(TrainingParser.FunctionTypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#functionPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrefix(TrainingParser.FunctionPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#placeholderLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholderLiteral(TrainingParser.PlaceholderLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#stringWithPlaceholderLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringWithPlaceholderLiteral(TrainingParser.StringWithPlaceholderLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#openFigureBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenFigureBracket(TrainingParser.OpenFigureBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#closeFigureBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseFigureBracket(TrainingParser.CloseFigureBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#openSquareBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenSquareBracket(TrainingParser.OpenSquareBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#closeSquareBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseSquareBracket(TrainingParser.CloseSquareBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(TrainingParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrainingParser#importScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportScope(TrainingParser.ImportScopeContext ctx);
}