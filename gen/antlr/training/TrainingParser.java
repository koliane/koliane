// Generated from D:/projects/java/koliane/src/main/java/antlr/training\Training.g4 by ANTLR 4.9.1
package antlr.training;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrainingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		WHITESPACE=114, NUMBER=115, HEX_NUMBER=116, SingleLineString=117, MultiLineString=118, 
		NEWLINE=119, IDENTIFIER=120, SINGLE_LINE_COMMENT=121, MULTI_LINE_COMMENT=122, 
		PlaceholderString=123, StringWithPlaceholder=124, OPEN_FIGURE_BRACKET=125, 
		CLOSE_FIGURE_BRACKET=126, OPEN_SQUARE_BRACKET=127, CLOSE_SQUARE_BRACKET=128;
	public static final int
		RULE_compilationUnit = 0, RULE_variableDeclaration = 1, RULE_declaredIdentifier = 2, 
		RULE_finalConstVarOrType = 3, RULE_varOrType = 4, RULE_initializedVariableDeclaration = 5, 
		RULE_initializedIdentifier = 6, RULE_initializedIdentifierList = 7, RULE_functionSignature = 8, 
		RULE_formalParameterPart = 9, RULE_returnType = 10, RULE_functionBody = 11, 
		RULE_block = 12, RULE_formalParameterList = 13, RULE_normalFormalParameters = 14, 
		RULE_optionalFormalParameters = 15, RULE_optionalPositionalFormalParameters = 16, 
		RULE_namedFormalParameters = 17, RULE_normalFormalParameter = 18, RULE_functionFormalParameter = 19, 
		RULE_simpleFormalParameter = 20, RULE_fieldFormalParameter = 21, RULE_defaultFormalParameter = 22, 
		RULE_defaultNamedParameter = 23, RULE_classDefinition = 24, RULE_mixins = 25, 
		RULE_classMemberDefinition = 26, RULE_methodSignature = 27, RULE_declaration = 28, 
		RULE_staticFinalDeclarationList = 29, RULE_staticFinalDeclaration = 30, 
		RULE_operatorSignature = 31, RULE_operator_ = 32, RULE_binaryOperator = 33, 
		RULE_getterSignature = 34, RULE_setterSignature = 35, RULE_constructorSignature = 36, 
		RULE_redirection = 37, RULE_initializers = 38, RULE_initializerListEntry = 39, 
		RULE_fieldInitializer = 40, RULE_factoryConstructorSignature = 41, RULE_redirectingFactoryConstructorSignature = 42, 
		RULE_constantConstructorSignature = 43, RULE_superclass = 44, RULE_interfaces = 45, 
		RULE_mixinApplicationClass = 46, RULE_mixinApplication = 47, RULE_enumType = 48, 
		RULE_enumEntry = 49, RULE_typeParameter = 50, RULE_typeParameters = 51, 
		RULE_metadata = 52, RULE_expression = 53, RULE_expressionWithoutCascade = 54, 
		RULE_expressionList = 55, RULE_primary = 56, RULE_literal = 57, RULE_nullLiteral = 58, 
		RULE_numericLiteral = 59, RULE_booleanLiteral = 60, RULE_stringLiteral = 61, 
		RULE_stringInterpolation = 62, RULE_symbolLiteral = 63, RULE_listLiteral = 64, 
		RULE_mapLiteral = 65, RULE_mapLiteralEntry = 66, RULE_throwExpression = 67, 
		RULE_throwExpressionWithoutCascade = 68, RULE_functionExpression = 69, 
		RULE_thisExpression = 70, RULE_nayaExpression = 71, RULE_constObjectExpression = 72, 
		RULE_arguments = 73, RULE_argumentList = 74, RULE_namedArgument = 75, 
		RULE_cascadeSection = 76, RULE_cascadeSelector = 77, RULE_argumentPart = 78, 
		RULE_assignmentOperator = 79, RULE_compoundAssignmentOperator = 80, RULE_conditionalExpression = 81, 
		RULE_ifNullExpression = 82, RULE_logicalOrExpression = 83, RULE_logicalAndExpression = 84, 
		RULE_equalityExpression = 85, RULE_equalityOperator = 86, RULE_relationalExpression = 87, 
		RULE_relationalOperator = 88, RULE_bitwiseOrExpression = 89, RULE_bitwiseXorExpression = 90, 
		RULE_bitwiseAndExpression = 91, RULE_bitwiseOperator = 92, RULE_shiftExpression = 93, 
		RULE_shiftOperator = 94, RULE_additiveExpression = 95, RULE_additiveOperator = 96, 
		RULE_multiplicativeExpression = 97, RULE_multiplicativeOperator = 98, 
		RULE_unaryExpression = 99, RULE_prefixOperator = 100, RULE_minusOperator = 101, 
		RULE_negationOperator = 102, RULE_tildeOperator = 103, RULE_awaitExpression = 104, 
		RULE_postfixExpression = 105, RULE_postfixOperator = 106, RULE_selector = 107, 
		RULE_incrementOperator = 108, RULE_assignableExpression = 109, RULE_unconditionalAssignableSelector = 110, 
		RULE_assignableSelector = 111, RULE_identifier = 112, RULE_qualified = 113, 
		RULE_typeTest = 114, RULE_isOperator = 115, RULE_typeCast = 116, RULE_asOperator = 117, 
		RULE_statements = 118, RULE_statement = 119, RULE_nonLabledStatment = 120, 
		RULE_expressionStatement = 121, RULE_localVariableDeclaration = 122, RULE_localFunctionDeclaration = 123, 
		RULE_ifStatement = 124, RULE_forStatement = 125, RULE_forLoopParts = 126, 
		RULE_forInitializerStatement = 127, RULE_whileStatement = 128, RULE_doStatement = 129, 
		RULE_switchStatement = 130, RULE_switchCase = 131, RULE_defaultCase = 132, 
		RULE_rethrowStatment = 133, RULE_tryStatement = 134, RULE_onPart = 135, 
		RULE_catchPart = 136, RULE_finallyPart = 137, RULE_returnStatement = 138, 
		RULE_label = 139, RULE_breakStatement = 140, RULE_continueStatement = 141, 
		RULE_yieldStatement = 142, RULE_yieldEachStatement = 143, RULE_assertStatement = 144, 
		RULE_assertion = 145, RULE_topLevelDefinition = 146, RULE_getOrSet = 147, 
		RULE_libraryDefinition = 148, RULE_scriptTag = 149, RULE_libraryName = 150, 
		RULE_importOrExport = 151, RULE_dottedIdentifierList = 152, RULE_libraryimport = 153, 
		RULE_importSpecification = 154, RULE_combinator = 155, RULE_identifierList = 156, 
		RULE_libraryExport = 157, RULE_partDirective = 158, RULE_partHeader = 159, 
		RULE_partDeclaration = 160, RULE_uri = 161, RULE_configurableUri = 162, 
		RULE_configurationUri = 163, RULE_uriTest = 164, RULE_dtype = 165, RULE_typeName = 166, 
		RULE_typeArguments = 167, RULE_typeList = 168, RULE_typeAlias = 169, RULE_typeAliasBody = 170, 
		RULE_functionTypeAlias = 171, RULE_functionPrefix = 172, RULE_placeholderLiteral = 173, 
		RULE_stringWithPlaceholderLiteral = 174, RULE_openFigureBracket = 175, 
		RULE_closeFigureBracket = 176, RULE_openSquareBracket = 177, RULE_closeSquareBracket = 178, 
		RULE_className = 179, RULE_importScope = 180;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "variableDeclaration", "declaredIdentifier", "finalConstVarOrType", 
			"varOrType", "initializedVariableDeclaration", "initializedIdentifier", 
			"initializedIdentifierList", "functionSignature", "formalParameterPart", 
			"returnType", "functionBody", "block", "formalParameterList", "normalFormalParameters", 
			"optionalFormalParameters", "optionalPositionalFormalParameters", "namedFormalParameters", 
			"normalFormalParameter", "functionFormalParameter", "simpleFormalParameter", 
			"fieldFormalParameter", "defaultFormalParameter", "defaultNamedParameter", 
			"classDefinition", "mixins", "classMemberDefinition", "methodSignature", 
			"declaration", "staticFinalDeclarationList", "staticFinalDeclaration", 
			"operatorSignature", "operator_", "binaryOperator", "getterSignature", 
			"setterSignature", "constructorSignature", "redirection", "initializers", 
			"initializerListEntry", "fieldInitializer", "factoryConstructorSignature", 
			"redirectingFactoryConstructorSignature", "constantConstructorSignature", 
			"superclass", "interfaces", "mixinApplicationClass", "mixinApplication", 
			"enumType", "enumEntry", "typeParameter", "typeParameters", "metadata", 
			"expression", "expressionWithoutCascade", "expressionList", "primary", 
			"literal", "nullLiteral", "numericLiteral", "booleanLiteral", "stringLiteral", 
			"stringInterpolation", "symbolLiteral", "listLiteral", "mapLiteral", 
			"mapLiteralEntry", "throwExpression", "throwExpressionWithoutCascade", 
			"functionExpression", "thisExpression", "nayaExpression", "constObjectExpression", 
			"arguments", "argumentList", "namedArgument", "cascadeSection", "cascadeSelector", 
			"argumentPart", "assignmentOperator", "compoundAssignmentOperator", "conditionalExpression", 
			"ifNullExpression", "logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"equalityOperator", "relationalExpression", "relationalOperator", "bitwiseOrExpression", 
			"bitwiseXorExpression", "bitwiseAndExpression", "bitwiseOperator", "shiftExpression", 
			"shiftOperator", "additiveExpression", "additiveOperator", "multiplicativeExpression", 
			"multiplicativeOperator", "unaryExpression", "prefixOperator", "minusOperator", 
			"negationOperator", "tildeOperator", "awaitExpression", "postfixExpression", 
			"postfixOperator", "selector", "incrementOperator", "assignableExpression", 
			"unconditionalAssignableSelector", "assignableSelector", "identifier", 
			"qualified", "typeTest", "isOperator", "typeCast", "asOperator", "statements", 
			"statement", "nonLabledStatment", "expressionStatement", "localVariableDeclaration", 
			"localFunctionDeclaration", "ifStatement", "forStatement", "forLoopParts", 
			"forInitializerStatement", "whileStatement", "doStatement", "switchStatement", 
			"switchCase", "defaultCase", "rethrowStatment", "tryStatement", "onPart", 
			"catchPart", "finallyPart", "returnStatement", "label", "breakStatement", 
			"continueStatement", "yieldStatement", "yieldEachStatement", "assertStatement", 
			"assertion", "topLevelDefinition", "getOrSet", "libraryDefinition", "scriptTag", 
			"libraryName", "importOrExport", "dottedIdentifierList", "libraryimport", 
			"importSpecification", "combinator", "identifierList", "libraryExport", 
			"partDirective", "partHeader", "partDeclaration", "uri", "configurableUri", 
			"configurationUri", "uriTest", "dtype", "typeName", "typeArguments", 
			"typeList", "typeAlias", "typeAliasBody", "functionTypeAlias", "functionPrefix", 
			"placeholderLiteral", "stringWithPlaceholderLiteral", "openFigureBracket", 
			"closeFigureBracket", "openSquareBracket", "closeSquareBracket", "className", 
			"importScope"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'final'", "'const'", "'var'", "'='", "'void'", "'async'", 
			"'=>'", "';'", "'async*'", "'sync*'", "'('", "')'", "'covariant'", "'this'", 
			"'.'", "':'", "'abstract'", "'class'", "'with'", "'static'", "'external'", 
			"'operator'", "'~'", "'[]'", "'[]='", "'=='", "'get'", "'set'", "'super'", 
			"'factory'", "'extends'", "'implements'", "'enum'", "'<'", "'>'", "'@'", 
			"'null'", "'true'", "'false'", "'$'", "'${'", "'#'", "'throw'", "'new'", 
			"'..'", "'*='", "'/='", "'~/='", "'%='", "'+='", "'<<='", "'>>='", "'>>>='", 
			"'&='", "'^='", "'|='", "'??='", "'?'", "'??'", "'||'", "'&&'", "'!='", 
			"'>='", "'<='", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'~/'", "'!'", "'await'", "'++'", "'--'", 
			"'?.'", "'is'", "'as'", "'if'", "'else'", "'for'", "'in'", "'while'", 
			"'do'", "'switch'", "'case'", "'default'", "'rethrow'", "'try'", "'on'", 
			"'catch'", "'finally'", "'return'", "'break'", "'continue'", "'yield'", 
			"'yield*'", "'assert'", "'#!'", "'library'", "'import'", "'show'", "'hide'", 
			"'export'", "'part'", "'of'", "'typedef'", null, null, null, null, null, 
			null, null, null, null, null, null, "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WHITESPACE", "NUMBER", "HEX_NUMBER", 
			"SingleLineString", "MultiLineString", "NEWLINE", "IDENTIFIER", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "PlaceholderString", "StringWithPlaceholder", "OPEN_FIGURE_BRACKET", 
			"CLOSE_FIGURE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Training.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrainingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public LibraryDefinitionContext libraryDefinition() {
			return getRuleContext(LibraryDefinitionContext.class,0);
		}
		public PartDeclarationContext partDeclaration() {
			return getRuleContext(PartDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				libraryDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				partDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public DeclaredIdentifierContext declaredIdentifier() {
			return getRuleContext(DeclaredIdentifierContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			declaredIdentifier();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(367);
				match(T__0);
				setState(368);
				identifier();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaredIdentifierContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public FinalConstVarOrTypeContext finalConstVarOrType() {
			return getRuleContext(FinalConstVarOrTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclaredIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaredIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDeclaredIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDeclaredIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDeclaredIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaredIdentifierContext declaredIdentifier() throws RecognitionException {
		DeclaredIdentifierContext _localctx = new DeclaredIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaredIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			metadata();
			setState(375);
			finalConstVarOrType();
			setState(376);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalConstVarOrTypeContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public VarOrTypeContext varOrType() {
			return getRuleContext(VarOrTypeContext.class,0);
		}
		public FinalConstVarOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalConstVarOrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFinalConstVarOrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFinalConstVarOrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFinalConstVarOrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalConstVarOrTypeContext finalConstVarOrType() throws RecognitionException {
		FinalConstVarOrTypeContext _localctx = new FinalConstVarOrTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finalConstVarOrType);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(T__1);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(379);
					dtype();
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__2);
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(383);
					dtype();
					}
					break;
				}
				}
				break;
			case T__3:
			case T__5:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				varOrType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarOrTypeContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public VarOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterVarOrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitVarOrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitVarOrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrTypeContext varOrType() throws RecognitionException {
		VarOrTypeContext _localctx = new VarOrTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varOrType);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(T__3);
				}
				break;
			case T__5:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				dtype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializedVariableDeclarationContext extends ParserRuleContext {
		public DeclaredIdentifierContext declaredIdentifier() {
			return getRuleContext(DeclaredIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InitializedIdentifierContext> initializedIdentifier() {
			return getRuleContexts(InitializedIdentifierContext.class);
		}
		public InitializedIdentifierContext initializedIdentifier(int i) {
			return getRuleContext(InitializedIdentifierContext.class,i);
		}
		public InitializedVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializedVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterInitializedVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitInitializedVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitInitializedVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializedVariableDeclarationContext initializedVariableDeclaration() throws RecognitionException {
		InitializedVariableDeclarationContext _localctx = new InitializedVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initializedVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			declaredIdentifier();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(394);
				match(T__4);
				setState(395);
				expression();
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(398);
				match(T__0);
				setState(399);
				initializedIdentifier();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializedIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterInitializedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitInitializedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitInitializedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializedIdentifierContext initializedIdentifier() throws RecognitionException {
		InitializedIdentifierContext _localctx = new InitializedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initializedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			identifier();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(406);
				match(T__4);
				setState(407);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializedIdentifierListContext extends ParserRuleContext {
		public List<InitializedIdentifierContext> initializedIdentifier() {
			return getRuleContexts(InitializedIdentifierContext.class);
		}
		public InitializedIdentifierContext initializedIdentifier(int i) {
			return getRuleContext(InitializedIdentifierContext.class,i);
		}
		public InitializedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterInitializedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitInitializedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitInitializedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializedIdentifierListContext initializedIdentifierList() throws RecognitionException {
		InitializedIdentifierListContext _localctx = new InitializedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initializedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			initializedIdentifier();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(411);
				match(T__0);
				setState(412);
				initializedIdentifier();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterPartContext formalParameterPart() {
			return getRuleContext(FormalParameterPartContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			metadata();
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(419);
				returnType();
				}
				break;
			}
			setState(422);
			identifier();
			setState(423);
			formalParameterPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterPartContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFormalParameterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFormalParameterPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFormalParameterPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterPartContext formalParameterPart() throws RecognitionException {
		FormalParameterPartContext _localctx = new FormalParameterPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameterPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(425);
				typeParameters();
				}
			}

			setState(428);
			formalParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnType);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				dtype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionBody);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(434);
					match(T__6);
					}
				}

				setState(437);
				match(T__7);
				setState(438);
				expression();
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(439);
					match(T__8);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(442);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(445);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public OpenFigureBracketContext openFigureBracket() {
			return getRuleContext(OpenFigureBracketContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CloseFigureBracketContext closeFigureBracket() {
			return getRuleContext(CloseFigureBracketContext.class,0);
		}
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_FIGURE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				openFigureBracket();
				setState(449);
				statements();
				setState(450);
				closeFigureBracket();
				}
				break;
			case PlaceholderString:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				placeholderLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public NormalFormalParametersContext normalFormalParameters() {
			return getRuleContext(NormalFormalParametersContext.class,0);
		}
		public OptionalFormalParametersContext optionalFormalParameters() {
			return getRuleContext(OptionalFormalParametersContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameterList);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(T__11);
				setState(456);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(T__11);
				setState(458);
				normalFormalParameters();
				setState(459);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(T__11);
				setState(462);
				normalFormalParameters();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(463);
					match(T__0);
					setState(464);
					optionalFormalParameters();
					}
				}

				setState(467);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(T__11);
				setState(470);
				optionalFormalParameters();
				setState(471);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormalParametersContext extends ParserRuleContext {
		public List<NormalFormalParameterContext> normalFormalParameter() {
			return getRuleContexts(NormalFormalParameterContext.class);
		}
		public NormalFormalParameterContext normalFormalParameter(int i) {
			return getRuleContext(NormalFormalParameterContext.class,i);
		}
		public NormalFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNormalFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNormalFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNormalFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormalParametersContext normalFormalParameters() throws RecognitionException {
		NormalFormalParametersContext _localctx = new NormalFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_normalFormalParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			normalFormalParameter();
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					match(T__0);
					setState(477);
					normalFormalParameter();
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalFormalParametersContext extends ParserRuleContext {
		public OptionalPositionalFormalParametersContext optionalPositionalFormalParameters() {
			return getRuleContext(OptionalPositionalFormalParametersContext.class,0);
		}
		public NamedFormalParametersContext namedFormalParameters() {
			return getRuleContext(NamedFormalParametersContext.class,0);
		}
		public OptionalFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOptionalFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOptionalFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOptionalFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalFormalParametersContext optionalFormalParameters() throws RecognitionException {
		OptionalFormalParametersContext _localctx = new OptionalFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optionalFormalParameters);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				optionalPositionalFormalParameters();
				}
				break;
			case OPEN_FIGURE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				namedFormalParameters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalPositionalFormalParametersContext extends ParserRuleContext {
		public OpenSquareBracketContext openSquareBracket() {
			return getRuleContext(OpenSquareBracketContext.class,0);
		}
		public List<DefaultFormalParameterContext> defaultFormalParameter() {
			return getRuleContexts(DefaultFormalParameterContext.class);
		}
		public DefaultFormalParameterContext defaultFormalParameter(int i) {
			return getRuleContext(DefaultFormalParameterContext.class,i);
		}
		public CloseSquareBracketContext closeSquareBracket() {
			return getRuleContext(CloseSquareBracketContext.class,0);
		}
		public OptionalPositionalFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalPositionalFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOptionalPositionalFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOptionalPositionalFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOptionalPositionalFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalPositionalFormalParametersContext optionalPositionalFormalParameters() throws RecognitionException {
		OptionalPositionalFormalParametersContext _localctx = new OptionalPositionalFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optionalPositionalFormalParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			openSquareBracket();
			setState(488);
			defaultFormalParameter();
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					match(T__0);
					setState(490);
					defaultFormalParameter();
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(496);
				match(T__0);
				}
			}

			setState(499);
			closeSquareBracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFormalParametersContext extends ParserRuleContext {
		public OpenFigureBracketContext openFigureBracket() {
			return getRuleContext(OpenFigureBracketContext.class,0);
		}
		public List<DefaultNamedParameterContext> defaultNamedParameter() {
			return getRuleContexts(DefaultNamedParameterContext.class);
		}
		public DefaultNamedParameterContext defaultNamedParameter(int i) {
			return getRuleContext(DefaultNamedParameterContext.class,i);
		}
		public CloseFigureBracketContext closeFigureBracket() {
			return getRuleContext(CloseFigureBracketContext.class,0);
		}
		public NamedFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNamedFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNamedFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNamedFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFormalParametersContext namedFormalParameters() throws RecognitionException {
		NamedFormalParametersContext _localctx = new NamedFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_namedFormalParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			openFigureBracket();
			setState(502);
			defaultNamedParameter();
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					match(T__0);
					setState(504);
					defaultNamedParameter();
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(510);
				match(T__0);
				}
			}

			setState(513);
			closeFigureBracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormalParameterContext extends ParserRuleContext {
		public FunctionFormalParameterContext functionFormalParameter() {
			return getRuleContext(FunctionFormalParameterContext.class,0);
		}
		public FieldFormalParameterContext fieldFormalParameter() {
			return getRuleContext(FieldFormalParameterContext.class,0);
		}
		public SimpleFormalParameterContext simpleFormalParameter() {
			return getRuleContext(SimpleFormalParameterContext.class,0);
		}
		public NormalFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNormalFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNormalFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNormalFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormalParameterContext normalFormalParameter() throws RecognitionException {
		NormalFormalParameterContext _localctx = new NormalFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_normalFormalParameter);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				functionFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				fieldFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				simpleFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionFormalParameterContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterPartContext formalParameterPart() {
			return getRuleContext(FormalParameterPartContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFunctionFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFunctionFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFunctionFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionFormalParameterContext functionFormalParameter() throws RecognitionException {
		FunctionFormalParameterContext _localctx = new FunctionFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			metadata();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(521);
				match(T__13);
				}
			}

			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(524);
				returnType();
				}
				break;
			}
			setState(527);
			identifier();
			setState(528);
			formalParameterPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleFormalParameterContext extends ParserRuleContext {
		public DeclaredIdentifierContext declaredIdentifier() {
			return getRuleContext(DeclaredIdentifierContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSimpleFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSimpleFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSimpleFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFormalParameterContext simpleFormalParameter() throws RecognitionException {
		SimpleFormalParameterContext _localctx = new SimpleFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleFormalParameter);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				declaredIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				metadata();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(532);
					match(T__13);
					}
				}

				setState(535);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldFormalParameterContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FinalConstVarOrTypeContext finalConstVarOrType() {
			return getRuleContext(FinalConstVarOrTypeContext.class,0);
		}
		public FormalParameterPartContext formalParameterPart() {
			return getRuleContext(FormalParameterPartContext.class,0);
		}
		public FieldFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFieldFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFieldFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFieldFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldFormalParameterContext fieldFormalParameter() throws RecognitionException {
		FieldFormalParameterContext _localctx = new FieldFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			metadata();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5))) != 0) || _la==IDENTIFIER) {
				{
				setState(540);
				finalConstVarOrType();
				}
			}

			setState(543);
			match(T__14);
			setState(544);
			match(T__15);
			setState(545);
			identifier();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__34) {
				{
				setState(546);
				formalParameterPart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultFormalParameterContext extends ParserRuleContext {
		public NormalFormalParameterContext normalFormalParameter() {
			return getRuleContext(NormalFormalParameterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDefaultFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDefaultFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDefaultFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultFormalParameterContext defaultFormalParameter() throws RecognitionException {
		DefaultFormalParameterContext _localctx = new DefaultFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			normalFormalParameter();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(550);
				match(T__4);
				setState(551);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultNamedParameterContext extends ParserRuleContext {
		public NormalFormalParameterContext normalFormalParameter() {
			return getRuleContext(NormalFormalParameterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultNamedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNamedParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDefaultNamedParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDefaultNamedParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDefaultNamedParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultNamedParameterContext defaultNamedParameter() throws RecognitionException {
		DefaultNamedParameterContext _localctx = new DefaultNamedParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defaultNamedParameter);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				normalFormalParameter();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(555);
					match(T__4);
					setState(556);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				normalFormalParameter();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(560);
					match(T__16);
					setState(561);
					expression();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public List<MetadataContext> metadata() {
			return getRuleContexts(MetadataContext.class);
		}
		public MetadataContext metadata(int i) {
			return getRuleContext(MetadataContext.class,i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public OpenFigureBracketContext openFigureBracket() {
			return getRuleContext(OpenFigureBracketContext.class,0);
		}
		public CloseFigureBracketContext closeFigureBracket() {
			return getRuleContext(CloseFigureBracketContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public MixinsContext mixins() {
			return getRuleContext(MixinsContext.class,0);
		}
		public InterfacesContext interfaces() {
			return getRuleContext(InterfacesContext.class,0);
		}
		public List<ClassMemberDefinitionContext> classMemberDefinition() {
			return getRuleContexts(ClassMemberDefinitionContext.class);
		}
		public ClassMemberDefinitionContext classMemberDefinition(int i) {
			return getRuleContext(ClassMemberDefinitionContext.class,i);
		}
		public MixinApplicationClassContext mixinApplicationClass() {
			return getRuleContext(MixinApplicationClassContext.class,0);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classDefinition);
		int _la;
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				metadata();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(567);
					match(T__17);
					}
				}

				setState(570);
				match(T__18);
				setState(571);
				className();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(572);
					typeParameters();
					}
				}

				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(575);
					superclass();
					}
				}

				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(578);
					mixins();
					}
				}

				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(581);
					interfaces();
					}
				}

				setState(584);
				openFigureBracket();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__13) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__36))) != 0) || _la==IDENTIFIER || _la==PlaceholderString) {
					{
					{
					setState(585);
					metadata();
					setState(586);
					classMemberDefinition();
					}
					}
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(593);
				closeFigureBracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				metadata();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(596);
					match(T__17);
					}
				}

				setState(599);
				match(T__18);
				setState(600);
				mixinApplicationClass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public MixinsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMixins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMixins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMixins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinsContext mixins() throws RecognitionException {
		MixinsContext _localctx = new MixinsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mixins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__19);
			setState(605);
			typeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDefinitionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public ClassMemberDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterClassMemberDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitClassMemberDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitClassMemberDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDefinitionContext classMemberDefinition() throws RecognitionException {
		ClassMemberDefinitionContext _localctx = new ClassMemberDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classMemberDefinition);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				declaration();
				setState(608);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				methodSignature();
				setState(611);
				functionBody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				placeholderLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public ConstructorSignatureContext constructorSignature() {
			return getRuleContext(ConstructorSignatureContext.class,0);
		}
		public InitializersContext initializers() {
			return getRuleContext(InitializersContext.class,0);
		}
		public FactoryConstructorSignatureContext factoryConstructorSignature() {
			return getRuleContext(FactoryConstructorSignatureContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public GetterSignatureContext getterSignature() {
			return getRuleContext(GetterSignatureContext.class,0);
		}
		public SetterSignatureContext setterSignature() {
			return getRuleContext(SetterSignatureContext.class,0);
		}
		public OperatorSignatureContext operatorSignature() {
			return getRuleContext(OperatorSignatureContext.class,0);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMethodSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMethodSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodSignature);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				constructorSignature();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(617);
					initializers();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				factoryConstructorSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(621);
					match(T__20);
					}
				}

				setState(624);
				functionSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(625);
					match(T__20);
					}
				}

				setState(628);
				getterSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(629);
					match(T__20);
					}
				}

				setState(632);
				setterSignature();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(633);
				operatorSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstantConstructorSignatureContext constantConstructorSignature() {
			return getRuleContext(ConstantConstructorSignatureContext.class,0);
		}
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public InitializersContext initializers() {
			return getRuleContext(InitializersContext.class,0);
		}
		public ConstructorSignatureContext constructorSignature() {
			return getRuleContext(ConstructorSignatureContext.class,0);
		}
		public GetterSignatureContext getterSignature() {
			return getRuleContext(GetterSignatureContext.class,0);
		}
		public SetterSignatureContext setterSignature() {
			return getRuleContext(SetterSignatureContext.class,0);
		}
		public OperatorSignatureContext operatorSignature() {
			return getRuleContext(OperatorSignatureContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public StaticFinalDeclarationListContext staticFinalDeclarationList() {
			return getRuleContext(StaticFinalDeclarationListContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public InitializedIdentifierListContext initializedIdentifierList() {
			return getRuleContext(InitializedIdentifierListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaration);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				constantConstructorSignature();
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(637);
					redirection();
					}
					break;
				case 2:
					{
					setState(638);
					initializers();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				constructorSignature();
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(642);
					redirection();
					}
					break;
				case 2:
					{
					setState(643);
					initializers();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				match(T__21);
				setState(647);
				constantConstructorSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				match(T__21);
				setState(649);
				constructorSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(650);
					match(T__21);
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__20) {
						{
						setState(651);
						match(T__20);
						}
					}

					}
				}

				setState(656);
				getterSignature();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(657);
					match(T__21);
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__20) {
						{
						setState(658);
						match(T__20);
						}
					}

					}
				}

				setState(663);
				setterSignature();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(664);
					match(T__21);
					}
				}

				setState(667);
				operatorSignature();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(668);
					match(T__21);
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__20) {
						{
						setState(669);
						match(T__20);
						}
					}

					}
				}

				setState(674);
				functionSignature();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(675);
				match(T__20);
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(677);
					dtype();
					}
					break;
				}
				setState(680);
				staticFinalDeclarationList();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(681);
				match(T__1);
				setState(683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(682);
					dtype();
					}
					break;
				}
				setState(685);
				initializedIdentifierList();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__20) {
					{
					setState(686);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__20) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(691);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(689);
					match(T__3);
					}
					break;
				case T__5:
				case IDENTIFIER:
					{
					setState(690);
					dtype();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(693);
				initializedIdentifierList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticFinalDeclarationListContext extends ParserRuleContext {
		public List<StaticFinalDeclarationContext> staticFinalDeclaration() {
			return getRuleContexts(StaticFinalDeclarationContext.class);
		}
		public StaticFinalDeclarationContext staticFinalDeclaration(int i) {
			return getRuleContext(StaticFinalDeclarationContext.class,i);
		}
		public StaticFinalDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticFinalDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStaticFinalDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStaticFinalDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStaticFinalDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticFinalDeclarationListContext staticFinalDeclarationList() throws RecognitionException {
		StaticFinalDeclarationListContext _localctx = new StaticFinalDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_staticFinalDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			staticFinalDeclaration();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(697);
				match(T__0);
				setState(698);
				staticFinalDeclaration();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticFinalDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StaticFinalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticFinalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStaticFinalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStaticFinalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStaticFinalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticFinalDeclarationContext staticFinalDeclaration() throws RecognitionException {
		StaticFinalDeclarationContext _localctx = new StaticFinalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_staticFinalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			identifier();
			setState(705);
			match(T__4);
			setState(706);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorSignatureContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperatorSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOperatorSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOperatorSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOperatorSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorSignatureContext operatorSignature() throws RecognitionException {
		OperatorSignatureContext _localctx = new OperatorSignatureContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operatorSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==IDENTIFIER) {
				{
				setState(708);
				returnType();
				}
			}

			setState(711);
			match(T__22);
			setState(712);
			operator_();
			setState(713);
			formalParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_Context extends ParserRuleContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOperator_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOperator_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_operator_);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				match(T__23);
				}
				break;
			case T__26:
			case T__34:
			case T__35:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				binaryOperator();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(718);
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public ShiftOperatorContext shiftOperator() {
			return getRuleContext(ShiftOperatorContext.class,0);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public BitwiseOperatorContext bitwiseOperator() {
			return getRuleContext(BitwiseOperatorContext.class,0);
		}
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_binaryOperator);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__73:
			case T__74:
			case T__75:
			case T__76:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				multiplicativeOperator();
				}
				break;
			case T__71:
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				additiveOperator();
				}
				break;
			case T__68:
			case T__69:
			case T__70:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				shiftOperator();
				}
				break;
			case T__34:
			case T__35:
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 4);
				{
				setState(724);
				relationalOperator();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(725);
				match(T__26);
				}
				break;
			case T__65:
			case T__66:
			case T__67:
				enterOuterAlt(_localctx, 6);
				{
				setState(726);
				bitwiseOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSignatureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public GetterSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterGetterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitGetterSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitGetterSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterSignatureContext getterSignature() throws RecognitionException {
		GetterSignatureContext _localctx = new GetterSignatureContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_getterSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==IDENTIFIER) {
				{
				setState(729);
				returnType();
				}
			}

			setState(732);
			match(T__27);
			setState(733);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterSignatureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public SetterSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSetterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSetterSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSetterSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterSignatureContext setterSignature() throws RecognitionException {
		SetterSignatureContext _localctx = new SetterSignatureContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setterSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==IDENTIFIER) {
				{
				setState(735);
				returnType();
				}
			}

			setState(738);
			match(T__28);
			setState(739);
			identifier();
			setState(740);
			formalParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorSignatureContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterConstructorSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitConstructorSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitConstructorSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorSignatureContext constructorSignature() throws RecognitionException {
		ConstructorSignatureContext _localctx = new ConstructorSignatureContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constructorSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			identifier();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(743);
				match(T__15);
				setState(744);
				identifier();
				}
			}

			setState(747);
			formalParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedirectionContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterRedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitRedirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitRedirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_redirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(T__16);
			setState(750);
			match(T__14);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(751);
				match(T__15);
				setState(752);
				identifier();
				}
			}

			setState(755);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializersContext extends ParserRuleContext {
		public List<InitializerListEntryContext> initializerListEntry() {
			return getRuleContexts(InitializerListEntryContext.class);
		}
		public InitializerListEntryContext initializerListEntry(int i) {
			return getRuleContext(InitializerListEntryContext.class,i);
		}
		public InitializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterInitializers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitInitializers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitInitializers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializersContext initializers() throws RecognitionException {
		InitializersContext _localctx = new InitializersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_initializers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(T__16);
			setState(758);
			initializerListEntry();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(759);
				match(T__0);
				setState(760);
				initializerListEntry();
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListEntryContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldInitializerContext fieldInitializer() {
			return getRuleContext(FieldInitializerContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public InitializerListEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerListEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterInitializerListEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitInitializerListEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitInitializerListEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListEntryContext initializerListEntry() throws RecognitionException {
		InitializerListEntryContext _localctx = new InitializerListEntryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initializerListEntry);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(T__29);
				setState(767);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(T__29);
				setState(769);
				match(T__15);
				setState(770);
				identifier();
				setState(771);
				arguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				fieldInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				assertion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldInitializerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public List<CascadeSectionContext> cascadeSection() {
			return getRuleContexts(CascadeSectionContext.class);
		}
		public CascadeSectionContext cascadeSection(int i) {
			return getRuleContext(CascadeSectionContext.class,i);
		}
		public FieldInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFieldInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFieldInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFieldInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInitializerContext fieldInitializer() throws RecognitionException {
		FieldInitializerContext _localctx = new FieldInitializerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(777);
				match(T__14);
				setState(778);
				match(T__15);
				}
			}

			setState(781);
			identifier();
			setState(782);
			match(T__4);
			setState(783);
			conditionalExpression();
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(784);
				cascadeSection();
				}
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactoryConstructorSignatureContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FactoryConstructorSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factoryConstructorSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFactoryConstructorSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFactoryConstructorSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFactoryConstructorSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactoryConstructorSignatureContext factoryConstructorSignature() throws RecognitionException {
		FactoryConstructorSignatureContext _localctx = new FactoryConstructorSignatureContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factoryConstructorSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(T__30);
			setState(791);
			identifier();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(792);
				match(T__15);
				setState(793);
				identifier();
				}
			}

			setState(796);
			formalParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedirectingFactoryConstructorSignatureContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public RedirectingFactoryConstructorSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirectingFactoryConstructorSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterRedirectingFactoryConstructorSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitRedirectingFactoryConstructorSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitRedirectingFactoryConstructorSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedirectingFactoryConstructorSignatureContext redirectingFactoryConstructorSignature() throws RecognitionException {
		RedirectingFactoryConstructorSignatureContext _localctx = new RedirectingFactoryConstructorSignatureContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_redirectingFactoryConstructorSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(798);
				match(T__2);
				}
			}

			setState(801);
			match(T__30);
			setState(802);
			identifier();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(803);
				match(T__15);
				setState(804);
				identifier();
				}
			}

			setState(807);
			formalParameterList();
			setState(808);
			match(T__4);
			setState(809);
			dtype();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(810);
				match(T__15);
				setState(811);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantConstructorSignatureContext extends ParserRuleContext {
		public QualifiedContext qualified() {
			return getRuleContext(QualifiedContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstantConstructorSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantConstructorSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterConstantConstructorSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitConstantConstructorSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitConstantConstructorSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantConstructorSignatureContext constantConstructorSignature() throws RecognitionException {
		ConstantConstructorSignatureContext _localctx = new ConstantConstructorSignatureContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantConstructorSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(T__2);
			setState(815);
			qualified();
			setState(816);
			formalParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(T__31);
			setState(819);
			dtype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfacesContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacesContext interfaces() throws RecognitionException {
		InterfacesContext _localctx = new InterfacesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(T__32);
			setState(822);
			typeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinApplicationClassContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public MixinApplicationContext mixinApplication() {
			return getRuleContext(MixinApplicationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MixinApplicationClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinApplicationClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMixinApplicationClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMixinApplicationClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMixinApplicationClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinApplicationClassContext mixinApplicationClass() throws RecognitionException {
		MixinApplicationClassContext _localctx = new MixinApplicationClassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mixinApplicationClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			className();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(825);
				typeParameters();
				}
			}

			setState(828);
			match(T__4);
			setState(829);
			mixinApplication();
			setState(830);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinApplicationContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public MixinsContext mixins() {
			return getRuleContext(MixinsContext.class,0);
		}
		public InterfacesContext interfaces() {
			return getRuleContext(InterfacesContext.class,0);
		}
		public MixinApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMixinApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMixinApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMixinApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinApplicationContext mixinApplication() throws RecognitionException {
		MixinApplicationContext _localctx = new MixinApplicationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mixinApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			dtype();
			setState(833);
			mixins();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(834);
				interfaces();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumTypeContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public OpenFigureBracketContext openFigureBracket() {
			return getRuleContext(OpenFigureBracketContext.class,0);
		}
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public CloseFigureBracketContext closeFigureBracket() {
			return getRuleContext(CloseFigureBracketContext.class,0);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			metadata();
			setState(838);
			match(T__33);
			setState(839);
			className();
			setState(840);
			openFigureBracket();
			setState(841);
			enumEntry();
			setState(846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(842);
					match(T__0);
					setState(843);
					enumEntry();
					}
					} 
				}
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(849);
				match(T__0);
				}
			}

			setState(852);
			closeFigureBracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumEntryContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitEnumEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitEnumEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			metadata();
			setState(855);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			metadata();
			setState(858);
			identifier();
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(859);
				match(T__31);
				setState(860);
				dtype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(T__34);
			setState(864);
			typeParameter();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(865);
				match(T__0);
				setState(866);
				typeParameter();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataContext extends ParserRuleContext {
		public List<QualifiedContext> qualified() {
			return getRuleContexts(QualifiedContext.class);
		}
		public QualifiedContext qualified(int i) {
			return getRuleContext(QualifiedContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_metadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(874);
					match(T__36);
					setState(875);
					qualified();
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__15) {
						{
						setState(876);
						match(T__15);
						setState(877);
						identifier();
						}
					}

					setState(881);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11) {
						{
						setState(880);
						arguments();
						}
					}

					}
					} 
				}
				setState(887);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public List<CascadeSectionContext> cascadeSection() {
			return getRuleContexts(CascadeSectionContext.class);
		}
		public CascadeSectionContext cascadeSection(int i) {
			return getRuleContext(CascadeSectionContext.class,i);
		}
		public ThrowExpressionContext throwExpression() {
			return getRuleContext(ThrowExpressionContext.class,0);
		}
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expression);
		try {
			int _alt;
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				assignableExpression();
				setState(889);
				assignmentOperator();
				setState(890);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				conditionalExpression();
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(893);
						cascadeSection();
						}
						} 
					}
					setState(898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				throwExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(900);
				placeholderLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionWithoutCascadeContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionWithoutCascadeContext expressionWithoutCascade() {
			return getRuleContext(ExpressionWithoutCascadeContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ThrowExpressionWithoutCascadeContext throwExpressionWithoutCascade() {
			return getRuleContext(ThrowExpressionWithoutCascadeContext.class,0);
		}
		public ExpressionWithoutCascadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithoutCascade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterExpressionWithoutCascade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitExpressionWithoutCascade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitExpressionWithoutCascade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithoutCascadeContext expressionWithoutCascade() throws RecognitionException {
		ExpressionWithoutCascadeContext _localctx = new ExpressionWithoutCascadeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionWithoutCascade);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				assignableExpression();
				setState(904);
				assignmentOperator();
				setState(905);
				expressionWithoutCascade();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				throwExpressionWithoutCascade();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			expression();
			setState(916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(912);
					match(T__0);
					setState(913);
					expression();
					}
					} 
				}
				setState(918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public UnconditionalAssignableSelectorContext unconditionalAssignableSelector() {
			return getRuleContext(UnconditionalAssignableSelectorContext.class,0);
		}
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NayaExpressionContext nayaExpression() {
			return getRuleContext(NayaExpressionContext.class,0);
		}
		public ConstObjectExpressionContext constObjectExpression() {
			return getRuleContext(ConstObjectExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primary);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				thisExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(T__29);
				setState(921);
				unconditionalAssignableSelector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				functionExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(923);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(924);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(925);
				nayaExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(926);
				constObjectExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(927);
				match(T__11);
				setState(928);
				expression();
				setState(929);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SymbolLiteralContext symbolLiteral() {
			return getRuleContext(SymbolLiteralContext.class,0);
		}
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
		}
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal);
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				nullLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				booleanLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				numericLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(936);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(937);
				symbolLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(938);
				mapLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(939);
				listLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(T__37);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TrainingParser.NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(TrainingParser.HEX_NUMBER, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==HEX_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> MultiLineString() { return getTokens(TrainingParser.MultiLineString); }
		public TerminalNode MultiLineString(int i) {
			return getToken(TrainingParser.MultiLineString, i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(TrainingParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(TrainingParser.SingleLineString, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(949); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(948);
					_la = _input.LA(1);
					if ( !(_la==SingleLineString || _la==MultiLineString) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(951); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringInterpolationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(TrainingParser.CLOSE_FIGURE_BRACKET, 0); }
		public StringInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringInterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStringInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStringInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStringInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringInterpolationContext stringInterpolation() throws RecognitionException {
		StringInterpolationContext _localctx = new StringInterpolationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_stringInterpolation);
		try {
			setState(959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				match(T__40);
				setState(954);
				identifier();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				match(T__41);
				setState(956);
				expression();
				setState(957);
				match(CLOSE_FIGURE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolLiteralContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SymbolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSymbolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSymbolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSymbolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolLiteralContext symbolLiteral() throws RecognitionException {
		SymbolLiteralContext _localctx = new SymbolLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_symbolLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(T__42);
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__34:
			case T__35:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
				{
				setState(962);
				operator_();
				}
				break;
			case IDENTIFIER:
				{
				{
				setState(963);
				identifier();
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(964);
						match(T__0);
						setState(965);
						identifier();
						}
						} 
					}
					setState(970);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListLiteralContext extends ParserRuleContext {
		public OpenSquareBracketContext openSquareBracket() {
			return getRuleContext(OpenSquareBracketContext.class,0);
		}
		public CloseSquareBracketContext closeSquareBracket() {
			return getRuleContext(CloseSquareBracketContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(973);
				match(T__2);
				}
			}

			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(976);
				typeArguments();
				}
			}

			setState(979);
			openSquareBracket();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
				{
				setState(980);
				expressionList();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(981);
					match(T__0);
					}
				}

				}
			}

			setState(986);
			closeSquareBracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapLiteralContext extends ParserRuleContext {
		public OpenFigureBracketContext openFigureBracket() {
			return getRuleContext(OpenFigureBracketContext.class,0);
		}
		public CloseFigureBracketContext closeFigureBracket() {
			return getRuleContext(CloseFigureBracketContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<MapLiteralEntryContext> mapLiteralEntry() {
			return getRuleContexts(MapLiteralEntryContext.class);
		}
		public MapLiteralEntryContext mapLiteralEntry(int i) {
			return getRuleContext(MapLiteralEntryContext.class,i);
		}
		public MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_mapLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(988);
				match(T__2);
				}
			}

			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(991);
				typeArguments();
				}
			}

			setState(994);
			openFigureBracket();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
				{
				setState(995);
				mapLiteralEntry();
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(996);
						match(T__0);
						setState(997);
						mapLiteralEntry();
						}
						} 
					}
					setState(1002);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1003);
					match(T__0);
					}
				}

				}
			}

			setState(1008);
			closeFigureBracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapLiteralEntryContext extends ParserRuleContext {
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MapLiteralEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteralEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMapLiteralEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMapLiteralEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMapLiteralEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralEntryContext mapLiteralEntry() throws RecognitionException {
		MapLiteralEntryContext _localctx = new MapLiteralEntryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mapLiteralEntry);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				placeholderLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				expression();
				setState(1012);
				match(T__16);
				setState(1013);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(T__43);
			setState(1018);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowExpressionWithoutCascadeContext extends ParserRuleContext {
		public ExpressionWithoutCascadeContext expressionWithoutCascade() {
			return getRuleContext(ExpressionWithoutCascadeContext.class,0);
		}
		public ThrowExpressionWithoutCascadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpressionWithoutCascade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterThrowExpressionWithoutCascade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitThrowExpressionWithoutCascade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitThrowExpressionWithoutCascade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionWithoutCascadeContext throwExpressionWithoutCascade() throws RecognitionException {
		ThrowExpressionWithoutCascadeContext _localctx = new ThrowExpressionWithoutCascadeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_throwExpressionWithoutCascade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(T__43);
			setState(1021);
			expressionWithoutCascade();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExpressionContext extends ParserRuleContext {
		public FormalParameterPartContext formalParameterPart() {
			return getRuleContext(FormalParameterPartContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			formalParameterPart();
			setState(1024);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisExpressionContext extends ParserRuleContext {
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NayaExpressionContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NayaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nayaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNayaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNayaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNayaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NayaExpressionContext nayaExpression() throws RecognitionException {
		NayaExpressionContext _localctx = new NayaExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_nayaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(T__44);
			setState(1029);
			dtype();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(1030);
				match(T__15);
				setState(1031);
				identifier();
				}
			}

			setState(1034);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstObjectExpressionContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constObjectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterConstObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitConstObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitConstObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstObjectExpressionContext constObjectExpression() throws RecognitionException {
		ConstObjectExpressionContext _localctx = new ConstObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constObjectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(T__2);
			setState(1037);
			dtype();
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(1038);
				match(T__15);
				setState(1039);
				identifier();
				}
			}

			setState(1042);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(T__11);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
				{
				setState(1045);
				argumentList();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1046);
					match(T__0);
					}
				}

				}
			}

			setState(1051);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_argumentList);
		try {
			int _alt;
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				namedArgument();
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1054);
						match(T__0);
						setState(1055);
						namedArgument();
						}
						} 
					}
					setState(1060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				expressionList();
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1062);
						match(T__0);
						setState(1063);
						namedArgument();
						}
						} 
					}
					setState(1068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			label();
			setState(1072);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CascadeSectionContext extends ParserRuleContext {
		public CascadeSelectorContext cascadeSelector() {
			return getRuleContext(CascadeSelectorContext.class,0);
		}
		public List<AssignableSelectorContext> assignableSelector() {
			return getRuleContexts(AssignableSelectorContext.class);
		}
		public AssignableSelectorContext assignableSelector(int i) {
			return getRuleContext(AssignableSelectorContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionWithoutCascadeContext expressionWithoutCascade() {
			return getRuleContext(ExpressionWithoutCascadeContext.class,0);
		}
		public List<ArgumentPartContext> argumentPart() {
			return getRuleContexts(ArgumentPartContext.class);
		}
		public ArgumentPartContext argumentPart(int i) {
			return getRuleContext(ArgumentPartContext.class,i);
		}
		public CascadeSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCascadeSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCascadeSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCascadeSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CascadeSectionContext cascadeSection() throws RecognitionException {
		CascadeSectionContext _localctx = new CascadeSectionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_cascadeSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(T__45);
			{
			setState(1075);
			cascadeSelector();
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1076);
					argumentPart();
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1082);
					assignableSelector();
					setState(1086);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1083);
							argumentPart();
							}
							} 
						}
						setState(1088);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
					}
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1094);
				assignmentOperator();
				setState(1095);
				expressionWithoutCascade();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CascadeSelectorContext extends ParserRuleContext {
		public OpenSquareBracketContext openSquareBracket() {
			return getRuleContext(OpenSquareBracketContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloseSquareBracketContext closeSquareBracket() {
			return getRuleContext(CloseSquareBracketContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CascadeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCascadeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCascadeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCascadeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CascadeSelectorContext cascadeSelector() throws RecognitionException {
		CascadeSelectorContext _localctx = new CascadeSelectorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cascadeSelector);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				openSquareBracket();
				setState(1100);
				expression();
				setState(1101);
				closeSquareBracket();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentPartContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterArgumentPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitArgumentPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitArgumentPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentPartContext argumentPart() throws RecognitionException {
		ArgumentPartContext _localctx = new ArgumentPartContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_argumentPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(1106);
				typeArguments();
				}
			}

			setState(1109);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public CompoundAssignmentOperatorContext compoundAssignmentOperator() {
			return getRuleContext(CompoundAssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assignmentOperator);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				match(T__4);
				}
				break;
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				compoundAssignmentOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundAssignmentOperatorContext extends ParserRuleContext {
		public CompoundAssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundAssignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCompoundAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCompoundAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCompoundAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundAssignmentOperatorContext compoundAssignmentOperator() throws RecognitionException {
		CompoundAssignmentOperatorContext _localctx = new CompoundAssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_compoundAssignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public IfNullExpressionContext ifNullExpression() {
			return getRuleContext(IfNullExpressionContext.class,0);
		}
		public List<ExpressionWithoutCascadeContext> expressionWithoutCascade() {
			return getRuleContexts(ExpressionWithoutCascadeContext.class);
		}
		public ExpressionWithoutCascadeContext expressionWithoutCascade(int i) {
			return getRuleContext(ExpressionWithoutCascadeContext.class,i);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			ifNullExpression();
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1118);
				match(T__58);
				setState(1119);
				expressionWithoutCascade();
				setState(1120);
				match(T__16);
				setState(1121);
				expressionWithoutCascade();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfNullExpressionContext extends ParserRuleContext {
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public IfNullExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNullExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterIfNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitIfNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitIfNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNullExpressionContext ifNullExpression() throws RecognitionException {
		IfNullExpressionContext _localctx = new IfNullExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ifNullExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			logicalOrExpression();
			setState(1130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1126);
					match(T__59);
					setState(1127);
					logicalOrExpression();
					}
					} 
				}
				setState(1132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			logicalAndExpression();
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1134);
					match(T__60);
					setState(1135);
					logicalAndExpression();
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			equalityExpression();
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1142);
					match(T__61);
					setState(1143);
					equalityExpression();
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_equalityExpression);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				relationalExpression();
				setState(1153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1150);
					equalityOperator();
					setState(1151);
					relationalExpression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				match(T__29);
				setState(1156);
				equalityOperator();
				setState(1157);
				relationalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperatorContext extends ParserRuleContext {
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__62) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<BitwiseOrExpressionContext> bitwiseOrExpression() {
			return getRuleContexts(BitwiseOrExpressionContext.class);
		}
		public BitwiseOrExpressionContext bitwiseOrExpression(int i) {
			return getRuleContext(BitwiseOrExpressionContext.class,i);
		}
		public TypeTestContext typeTest() {
			return getRuleContext(TypeTestContext.class,0);
		}
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_relationalExpression);
		try {
			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163);
				bitwiseOrExpression();
				setState(1169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1164);
					typeTest();
					}
					break;
				case 2:
					{
					setState(1165);
					typeCast();
					}
					break;
				case 3:
					{
					setState(1166);
					relationalOperator();
					setState(1167);
					bitwiseOrExpression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				match(T__29);
				setState(1172);
				relationalOperator();
				setState(1173);
				bitwiseOrExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (T__34 - 35)) | (1L << (T__35 - 35)) | (1L << (T__63 - 35)) | (1L << (T__64 - 35)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseOrExpressionContext extends ParserRuleContext {
		public List<BitwiseXorExpressionContext> bitwiseXorExpression() {
			return getRuleContexts(BitwiseXorExpressionContext.class);
		}
		public BitwiseXorExpressionContext bitwiseXorExpression(int i) {
			return getRuleContext(BitwiseXorExpressionContext.class,i);
		}
		public List<BitwiseOrExpressionContext> bitwiseOrExpression() {
			return getRuleContexts(BitwiseOrExpressionContext.class);
		}
		public BitwiseOrExpressionContext bitwiseOrExpression(int i) {
			return getRuleContext(BitwiseOrExpressionContext.class,i);
		}
		public BitwiseOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBitwiseOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBitwiseOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOrExpressionContext bitwiseOrExpression() throws RecognitionException {
		BitwiseOrExpressionContext _localctx = new BitwiseOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_bitwiseOrExpression);
		try {
			int _alt;
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				bitwiseXorExpression();
				setState(1184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1180);
						match(T__65);
						setState(1181);
						bitwiseXorExpression();
						}
						} 
					}
					setState(1186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				match(T__29);
				setState(1190); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1188);
						match(T__65);
						setState(1189);
						bitwiseOrExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1192); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseXorExpressionContext extends ParserRuleContext {
		public List<BitwiseAndExpressionContext> bitwiseAndExpression() {
			return getRuleContexts(BitwiseAndExpressionContext.class);
		}
		public BitwiseAndExpressionContext bitwiseAndExpression(int i) {
			return getRuleContext(BitwiseAndExpressionContext.class,i);
		}
		public BitwiseXorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseXorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBitwiseXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBitwiseXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBitwiseXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseXorExpressionContext bitwiseXorExpression() throws RecognitionException {
		BitwiseXorExpressionContext _localctx = new BitwiseXorExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_bitwiseXorExpression);
		try {
			int _alt;
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				bitwiseAndExpression();
				setState(1201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1197);
						match(T__66);
						setState(1198);
						bitwiseAndExpression();
						}
						} 
					}
					setState(1203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				match(T__29);
				setState(1207); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1205);
						match(T__66);
						setState(1206);
						bitwiseAndExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1209); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseAndExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public BitwiseAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseAndExpressionContext bitwiseAndExpression() throws RecognitionException {
		BitwiseAndExpressionContext _localctx = new BitwiseAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_bitwiseAndExpression);
		try {
			int _alt;
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				shiftExpression();
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1214);
						match(T__67);
						setState(1215);
						shiftExpression();
						}
						} 
					}
					setState(1220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				match(T__29);
				setState(1224); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1222);
						match(T__67);
						setState(1223);
						shiftExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1226); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseOperatorContext extends ParserRuleContext {
		public BitwiseOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBitwiseOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBitwiseOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBitwiseOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOperatorContext bitwiseOperator() throws RecognitionException {
		BitwiseOperatorContext _localctx = new BitwiseOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_bitwiseOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_shiftExpression);
		try {
			int _alt;
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				additiveExpression();
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1233);
						shiftOperator();
						setState(1234);
						additiveExpression();
						}
						} 
					}
					setState(1240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(T__29);
				setState(1245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1242);
						shiftOperator();
						setState(1243);
						additiveExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOperatorContext extends ParserRuleContext {
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_additiveExpression);
		try {
			int _alt;
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				multiplicativeExpression();
				setState(1259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1254);
						additiveOperator();
						setState(1255);
						multiplicativeExpression();
						}
						} 
					}
					setState(1261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(T__29);
				setState(1266); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1263);
						additiveOperator();
						setState(1264);
						multiplicativeExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1268); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__72) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_multiplicativeExpression);
		try {
			int _alt;
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				unaryExpression();
				setState(1280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1275);
						multiplicativeOperator();
						setState(1276);
						unaryExpression();
						}
						} 
					}
					setState(1282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				match(T__29);
				setState(1287); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1284);
						multiplicativeOperator();
						setState(1285);
						unaryExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1289); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AwaitExpressionContext awaitExpression() {
			return getRuleContext(AwaitExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public MinusOperatorContext minusOperator() {
			return getRuleContext(MinusOperatorContext.class,0);
		}
		public TildeOperatorContext tildeOperator() {
			return getRuleContext(TildeOperatorContext.class,0);
		}
		public IncrementOperatorContext incrementOperator() {
			return getRuleContext(IncrementOperatorContext.class,0);
		}
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_unaryExpression);
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				prefixOperator();
				setState(1296);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				awaitExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1299);
				postfixExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__72:
					{
					setState(1300);
					minusOperator();
					}
					break;
				case T__23:
					{
					setState(1301);
					tildeOperator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1304);
				match(T__29);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1306);
				incrementOperator();
				setState(1307);
				assignableExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorContext extends ParserRuleContext {
		public MinusOperatorContext minusOperator() {
			return getRuleContext(MinusOperatorContext.class,0);
		}
		public NegationOperatorContext negationOperator() {
			return getRuleContext(NegationOperatorContext.class,0);
		}
		public TildeOperatorContext tildeOperator() {
			return getRuleContext(TildeOperatorContext.class,0);
		}
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPrefixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPrefixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_prefixOperator);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__72:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				minusOperator();
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				negationOperator();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				tildeOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusOperatorContext extends ParserRuleContext {
		public MinusOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterMinusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitMinusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitMinusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusOperatorContext minusOperator() throws RecognitionException {
		MinusOperatorContext _localctx = new MinusOperatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_minusOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(T__72);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationOperatorContext extends ParserRuleContext {
		public NegationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNegationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNegationOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNegationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationOperatorContext negationOperator() throws RecognitionException {
		NegationOperatorContext _localctx = new NegationOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_negationOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(T__77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TildeOperatorContext extends ParserRuleContext {
		public TildeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tildeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTildeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTildeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTildeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TildeOperatorContext tildeOperator() throws RecognitionException {
		TildeOperatorContext _localctx = new TildeOperatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_tildeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AwaitExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AwaitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitExpressionContext awaitExpression() throws RecognitionException {
		AwaitExpressionContext _localctx = new AwaitExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_awaitExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(T__78);
			setState(1323);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public PostfixOperatorContext postfixOperator() {
			return getRuleContext(PostfixOperatorContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_postfixExpression);
		try {
			int _alt;
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				assignableExpression();
				setState(1326);
				postfixOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				primary();
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1329);
						selector();
						}
						} 
					}
					setState(1334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorContext extends ParserRuleContext {
		public IncrementOperatorContext incrementOperator() {
			return getRuleContext(IncrementOperatorContext.class,0);
		}
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPostfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPostfixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPostfixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_postfixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			incrementOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public AssignableSelectorContext assignableSelector() {
			return getRuleContext(AssignableSelectorContext.class,0);
		}
		public ArgumentPartContext argumentPart() {
			return getRuleContext(ArgumentPartContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_selector);
		try {
			setState(1341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__81:
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				assignableSelector();
				}
				break;
			case T__11:
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				argumentPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementOperatorContext extends ParserRuleContext {
		public IncrementOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterIncrementOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitIncrementOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitIncrementOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementOperatorContext incrementOperator() throws RecognitionException {
		IncrementOperatorContext _localctx = new IncrementOperatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_incrementOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			_la = _input.LA(1);
			if ( !(_la==T__79 || _la==T__80) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AssignableSelectorContext assignableSelector() {
			return getRuleContext(AssignableSelectorContext.class,0);
		}
		public List<ArgumentPartContext> argumentPart() {
			return getRuleContexts(ArgumentPartContext.class);
		}
		public ArgumentPartContext argumentPart(int i) {
			return getRuleContext(ArgumentPartContext.class,i);
		}
		public UnconditionalAssignableSelectorContext unconditionalAssignableSelector() {
			return getRuleContext(UnconditionalAssignableSelectorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAssignableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAssignableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAssignableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableExpressionContext assignableExpression() throws RecognitionException {
		AssignableExpressionContext _localctx = new AssignableExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_assignableExpression);
		int _la;
		try {
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				primary();
				setState(1353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11 || _la==T__34) {
						{
						{
						setState(1346);
						argumentPart();
						}
						}
						setState(1351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1352);
					assignableSelector();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				match(T__29);
				setState(1356);
				unconditionalAssignableSelector();
				setState(1357);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnconditionalAssignableSelectorContext extends ParserRuleContext {
		public OpenSquareBracketContext openSquareBracket() {
			return getRuleContext(OpenSquareBracketContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloseSquareBracketContext closeSquareBracket() {
			return getRuleContext(CloseSquareBracketContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnconditionalAssignableSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconditionalAssignableSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterUnconditionalAssignableSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitUnconditionalAssignableSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitUnconditionalAssignableSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnconditionalAssignableSelectorContext unconditionalAssignableSelector() throws RecognitionException {
		UnconditionalAssignableSelectorContext _localctx = new UnconditionalAssignableSelectorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_unconditionalAssignableSelector);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				openSquareBracket();
				setState(1362);
				expression();
				setState(1363);
				closeSquareBracket();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				match(T__15);
				setState(1366);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableSelectorContext extends ParserRuleContext {
		public UnconditionalAssignableSelectorContext unconditionalAssignableSelector() {
			return getRuleContext(UnconditionalAssignableSelectorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignableSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAssignableSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAssignableSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAssignableSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableSelectorContext assignableSelector() throws RecognitionException {
		AssignableSelectorContext _localctx = new AssignableSelectorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_assignableSelector);
		try {
			setState(1372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				unconditionalAssignableSelector();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				match(T__81);
				setState(1371);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TrainingParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterQualified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitQualified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitQualified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedContext qualified() throws RecognitionException {
		QualifiedContext _localctx = new QualifiedContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_qualified);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			identifier();
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1377);
				match(T__15);
				setState(1378);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTestContext extends ParserRuleContext {
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TypeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTestContext typeTest() throws RecognitionException {
		TypeTestContext _localctx = new TypeTestContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_typeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			isOperator();
			setState(1382);
			dtype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsOperatorContext extends ParserRuleContext {
		public IsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterIsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitIsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(T__82);
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(1385);
				match(T__77);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastContext extends ParserRuleContext {
		public AsOperatorContext asOperator() {
			return getRuleContext(AsOperatorContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			asOperator();
			setState(1389);
			dtype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsOperatorContext extends ParserRuleContext {
		public AsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsOperatorContext asOperator() throws RecognitionException {
		AsOperatorContext _localctx = new AsOperatorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_asOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(T__83);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1393);
					statement();
					}
					} 
				}
				setState(1398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public NonLabledStatmentContext nonLabledStatment() {
			return getRuleContext(NonLabledStatmentContext.class,0);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1399);
					label();
					}
					} 
				}
				setState(1404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1405);
			nonLabledStatment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonLabledStatmentContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public RethrowStatmentContext rethrowStatment() {
			return getRuleContext(RethrowStatmentContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public YieldEachStatementContext yieldEachStatement() {
			return getRuleContext(YieldEachStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public LocalFunctionDeclarationContext localFunctionDeclaration() {
			return getRuleContext(LocalFunctionDeclarationContext.class,0);
		}
		public NonLabledStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonLabledStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterNonLabledStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitNonLabledStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitNonLabledStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonLabledStatmentContext nonLabledStatment() throws RecognitionException {
		NonLabledStatmentContext _localctx = new NonLabledStatmentContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_nonLabledStatment);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				localVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1410);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1411);
				doStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1412);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1413);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1414);
				rethrowStatment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1415);
				tryStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1416);
				breakStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1417);
				continueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1418);
				returnStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1419);
				yieldStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1420);
				yieldEachStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1421);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1422);
				assertStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1423);
				localFunctionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
				{
				setState(1426);
				expression();
				}
			}

			setState(1429);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public InitializedVariableDeclarationContext initializedVariableDeclaration() {
			return getRuleContext(InitializedVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			initializedVariableDeclaration();
			setState(1432);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalFunctionDeclarationContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public LocalFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLocalFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLocalFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLocalFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalFunctionDeclarationContext localFunctionDeclaration() throws RecognitionException {
		LocalFunctionDeclarationContext _localctx = new LocalFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_localFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			functionSignature();
			setState(1435);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(T__84);
			setState(1438);
			match(T__11);
			setState(1439);
			expression();
			setState(1440);
			match(T__12);
			setState(1441);
			statement();
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1442);
				match(T__85);
				setState(1443);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForLoopPartsContext forLoopParts() {
			return getRuleContext(ForLoopPartsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__78) {
				{
				setState(1446);
				match(T__78);
				}
			}

			setState(1449);
			match(T__86);
			setState(1450);
			match(T__11);
			setState(1451);
			forLoopParts();
			setState(1452);
			match(T__12);
			setState(1453);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopPartsContext extends ParserRuleContext {
		public ForInitializerStatementContext forInitializerStatement() {
			return getRuleContext(ForInitializerStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public DeclaredIdentifierContext declaredIdentifier() {
			return getRuleContext(DeclaredIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ForLoopPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopParts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterForLoopParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitForLoopParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitForLoopParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopPartsContext forLoopParts() throws RecognitionException {
		ForLoopPartsContext _localctx = new ForLoopPartsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_forLoopParts);
		int _la;
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				forInitializerStatement();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
					{
					setState(1456);
					expression();
					}
				}

				setState(1459);
				match(T__8);
				setState(1461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
					{
					setState(1460);
					expressionList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				declaredIdentifier();
				setState(1464);
				match(T__87);
				setState(1465);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				identifier();
				setState(1468);
				match(T__87);
				setState(1469);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitializerStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitializerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitializerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterForInitializerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitForInitializerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitForInitializerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializerStatementContext forInitializerStatement() throws RecognitionException {
		ForInitializerStatementContext _localctx = new ForInitializerStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_forInitializerStatement);
		int _la;
		try {
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
					{
					setState(1474);
					expression();
					}
				}

				setState(1477);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(T__88);
			setState(1481);
			match(T__11);
			setState(1482);
			expression();
			setState(1483);
			match(T__12);
			setState(1484);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(T__89);
			setState(1487);
			statement();
			setState(1488);
			match(T__88);
			setState(1489);
			match(T__11);
			setState(1490);
			expression();
			setState(1491);
			match(T__12);
			setState(1492);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OpenFigureBracketContext openFigureBracket() {
			return getRuleContext(OpenFigureBracketContext.class,0);
		}
		public CloseFigureBracketContext closeFigureBracket() {
			return getRuleContext(CloseFigureBracketContext.class,0);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_switchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(T__90);
			setState(1495);
			match(T__11);
			setState(1496);
			expression();
			setState(1497);
			match(T__12);
			setState(1498);
			openFigureBracket();
			setState(1502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1499);
					switchCase();
					}
					} 
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__92 || _la==IDENTIFIER) {
				{
				setState(1505);
				defaultCase();
				}
			}

			setState(1508);
			closeFigureBracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_switchCase);
		int _la;
		try {
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlaceholderString:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				placeholderLiteral();
				}
				break;
			case T__91:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(1511);
					label();
					}
					}
					setState(1516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1517);
				match(T__91);
				setState(1518);
				expression();
				setState(1519);
				match(T__16);
				setState(1520);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultCaseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1524);
				label();
				}
				}
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1530);
			match(T__92);
			setState(1531);
			match(T__16);
			setState(1532);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RethrowStatmentContext extends ParserRuleContext {
		public RethrowStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rethrowStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterRethrowStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitRethrowStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitRethrowStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RethrowStatmentContext rethrowStatment() throws RecognitionException {
		RethrowStatmentContext _localctx = new RethrowStatmentContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_rethrowStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(T__93);
			setState(1535);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyPartContext finallyPart() {
			return getRuleContext(FinallyPartContext.class,0);
		}
		public List<OnPartContext> onPart() {
			return getRuleContexts(OnPartContext.class);
		}
		public OnPartContext onPart(int i) {
			return getRuleContext(OnPartContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(T__94);
			setState(1538);
			block();
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__95:
			case T__96:
				{
				setState(1540); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1539);
					onPart();
					}
					}
					setState(1542); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__95 || _la==T__96 );
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__97) {
					{
					setState(1544);
					finallyPart();
					}
				}

				}
				break;
			case T__97:
				{
				setState(1547);
				finallyPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnPartContext extends ParserRuleContext {
		public CatchPartContext catchPart() {
			return getRuleContext(CatchPartContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public OnPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOnPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOnPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOnPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPartContext onPart() throws RecognitionException {
		OnPartContext _localctx = new OnPartContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_onPart);
		int _la;
		try {
			setState(1560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__96:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				catchPart();
				setState(1551);
				block();
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				match(T__95);
				setState(1554);
				dtype();
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__96) {
					{
					setState(1555);
					catchPart();
					}
				}

				setState(1558);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchPartContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CatchPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCatchPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCatchPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCatchPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchPartContext catchPart() throws RecognitionException {
		CatchPartContext _localctx = new CatchPartContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_catchPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(T__96);
			setState(1563);
			match(T__11);
			setState(1564);
			identifier();
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1565);
				match(T__0);
				setState(1566);
				identifier();
				}
			}

			setState(1569);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyPartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFinallyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFinallyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFinallyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyPartContext finallyPart() throws RecognitionException {
		FinallyPartContext _localctx = new FinallyPartContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_finallyPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(T__97);
			setState(1572);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(T__98);
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__23) | (1L << T__29) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (NUMBER - 73)) | (1L << (HEX_NUMBER - 73)) | (1L << (SingleLineString - 73)) | (1L << (MultiLineString - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (PlaceholderString - 73)) | (1L << (OPEN_FIGURE_BRACKET - 73)) | (1L << (OPEN_SQUARE_BRACKET - 73)))) != 0)) {
				{
				setState(1575);
				expression();
				}
			}

			setState(1578);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			identifier();
			setState(1581);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(T__99);
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1584);
				identifier();
				}
			}

			setState(1587);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(T__100);
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1590);
				identifier();
				}
			}

			setState(1593);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_yieldStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			match(T__101);
			setState(1596);
			expression();
			setState(1597);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldEachStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterYieldEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitYieldEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitYieldEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldEachStatementContext yieldEachStatement() throws RecognitionException {
		YieldEachStatementContext _localctx = new YieldEachStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_yieldEachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(T__102);
			setState(1600);
			expression();
			setState(1601);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_assertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			assertion();
			setState(1604);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(T__103);
			setState(1607);
			match(T__11);
			setState(1608);
			expression();
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1609);
				match(T__0);
				setState(1610);
				expression();
				}
				break;
			}
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1613);
				match(T__0);
				}
			}

			setState(1616);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelDefinitionContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public GetterSignatureContext getterSignature() {
			return getRuleContext(GetterSignatureContext.class,0);
		}
		public SetterSignatureContext setterSignature() {
			return getRuleContext(SetterSignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public StaticFinalDeclarationListContext staticFinalDeclarationList() {
			return getRuleContext(StaticFinalDeclarationListContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public TopLevelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTopLevelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTopLevelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTopLevelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDefinitionContext topLevelDefinition() throws RecognitionException {
		TopLevelDefinitionContext _localctx = new TopLevelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_topLevelDefinition);
		int _la;
		try {
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1618);
				classDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
				enumType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1620);
				typeAlias();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(1621);
					match(T__21);
					}
				}

				setState(1624);
				functionSignature();
				setState(1625);
				match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(1627);
					match(T__21);
					}
				}

				setState(1630);
				getterSignature();
				setState(1631);
				match(T__8);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(1633);
					match(T__21);
					}
				}

				setState(1636);
				setterSignature();
				setState(1637);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1639);
				functionSignature();
				setState(1640);
				functionBody();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==IDENTIFIER) {
					{
					setState(1642);
					returnType();
					}
				}

				setState(1645);
				match(T__27);
				setState(1646);
				identifier();
				setState(1647);
				functionBody();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==IDENTIFIER) {
					{
					setState(1649);
					returnType();
					}
				}

				setState(1652);
				match(T__28);
				setState(1653);
				identifier();
				setState(1654);
				formalParameterList();
				setState(1655);
				functionBody();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1657);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1658);
					dtype();
					}
					break;
				}
				setState(1661);
				staticFinalDeclarationList();
				setState(1662);
				match(T__8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1664);
				variableDeclaration();
				setState(1665);
				match(T__8);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1667);
				placeholderLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetOrSetContext extends ParserRuleContext {
		public GetOrSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getOrSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterGetOrSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitGetOrSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitGetOrSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetOrSetContext getOrSet() throws RecognitionException {
		GetOrSetContext _localctx = new GetOrSetContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_getOrSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public ImportScopeContext importScope() {
			return getRuleContext(ImportScopeContext.class,0);
		}
		public List<TopLevelDefinitionContext> topLevelDefinition() {
			return getRuleContexts(TopLevelDefinitionContext.class);
		}
		public TopLevelDefinitionContext topLevelDefinition(int i) {
			return getRuleContext(TopLevelDefinitionContext.class,i);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLibraryDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLibraryDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLibraryDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_libraryDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			importScope();
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__33) | (1L << T__36))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (T__112 - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (PlaceholderString - 113)))) != 0)) {
				{
				{
				setState(1673);
				topLevelDefinition();
				}
				}
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptTagContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(TrainingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TrainingParser.NEWLINE, i);
		}
		public ScriptTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterScriptTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitScriptTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitScriptTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptTagContext scriptTag() throws RecognitionException {
		ScriptTagContext _localctx = new ScriptTagContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_scriptTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(T__104);
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__1 - 1)) | (1L << (T__2 - 1)) | (1L << (T__3 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__12 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__20 - 1)) | (1L << (T__21 - 1)) | (1L << (T__22 - 1)) | (1L << (T__23 - 1)) | (1L << (T__24 - 1)) | (1L << (T__25 - 1)) | (1L << (T__26 - 1)) | (1L << (T__27 - 1)) | (1L << (T__28 - 1)) | (1L << (T__29 - 1)) | (1L << (T__30 - 1)) | (1L << (T__31 - 1)) | (1L << (T__32 - 1)) | (1L << (T__33 - 1)) | (1L << (T__34 - 1)) | (1L << (T__35 - 1)) | (1L << (T__36 - 1)) | (1L << (T__37 - 1)) | (1L << (T__38 - 1)) | (1L << (T__39 - 1)) | (1L << (T__40 - 1)) | (1L << (T__41 - 1)) | (1L << (T__42 - 1)) | (1L << (T__43 - 1)) | (1L << (T__44 - 1)) | (1L << (T__45 - 1)) | (1L << (T__46 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__49 - 1)) | (1L << (T__50 - 1)) | (1L << (T__51 - 1)) | (1L << (T__52 - 1)) | (1L << (T__53 - 1)) | (1L << (T__54 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__58 - 1)) | (1L << (T__59 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__62 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__73 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)) | (1L << (T__82 - 65)) | (1L << (T__83 - 65)) | (1L << (T__84 - 65)) | (1L << (T__85 - 65)) | (1L << (T__86 - 65)) | (1L << (T__87 - 65)) | (1L << (T__88 - 65)) | (1L << (T__89 - 65)) | (1L << (T__90 - 65)) | (1L << (T__91 - 65)) | (1L << (T__92 - 65)) | (1L << (T__93 - 65)) | (1L << (T__94 - 65)) | (1L << (T__95 - 65)) | (1L << (T__96 - 65)) | (1L << (T__97 - 65)) | (1L << (T__98 - 65)) | (1L << (T__99 - 65)) | (1L << (T__100 - 65)) | (1L << (T__101 - 65)) | (1L << (T__102 - 65)) | (1L << (T__103 - 65)) | (1L << (T__104 - 65)) | (1L << (T__105 - 65)) | (1L << (T__106 - 65)) | (1L << (T__107 - 65)) | (1L << (T__108 - 65)) | (1L << (T__109 - 65)) | (1L << (T__110 - 65)) | (1L << (T__111 - 65)) | (1L << (T__112 - 65)) | (1L << (WHITESPACE - 65)) | (1L << (NUMBER - 65)) | (1L << (HEX_NUMBER - 65)) | (1L << (SingleLineString - 65)) | (1L << (MultiLineString - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (SINGLE_LINE_COMMENT - 65)) | (1L << (MULTI_LINE_COMMENT - 65)) | (1L << (PlaceholderString - 65)) | (1L << (StringWithPlaceholder - 65)) | (1L << (OPEN_FIGURE_BRACKET - 65)) | (1L << (CLOSE_FIGURE_BRACKET - 65)) | (1L << (OPEN_SQUARE_BRACKET - 65)) | (1L << (CLOSE_SQUARE_BRACKET - 65)))) != 0)) {
				{
				{
				setState(1680);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1686);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryNameContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public DottedIdentifierListContext dottedIdentifierList() {
			return getRuleContext(DottedIdentifierListContext.class,0);
		}
		public LibraryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLibraryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLibraryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLibraryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryNameContext libraryName() throws RecognitionException {
		LibraryNameContext _localctx = new LibraryNameContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_libraryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			metadata();
			setState(1689);
			match(T__105);
			setState(1690);
			dottedIdentifierList();
			setState(1691);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportOrExportContext extends ParserRuleContext {
		public LibraryimportContext libraryimport() {
			return getRuleContext(LibraryimportContext.class,0);
		}
		public LibraryExportContext libraryExport() {
			return getRuleContext(LibraryExportContext.class,0);
		}
		public ImportOrExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importOrExport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterImportOrExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitImportOrExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitImportOrExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportOrExportContext importOrExport() throws RecognitionException {
		ImportOrExportContext _localctx = new ImportOrExportContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_importOrExport);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				libraryimport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				libraryExport();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DottedIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DottedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDottedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDottedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDottedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedIdentifierListContext dottedIdentifierList() throws RecognitionException {
		DottedIdentifierListContext _localctx = new DottedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_dottedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			identifier();
			setState(1702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1698);
				match(T__0);
				setState(1699);
				identifier();
				}
				}
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryimportContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ImportSpecificationContext importSpecification() {
			return getRuleContext(ImportSpecificationContext.class,0);
		}
		public LibraryimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryimport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLibraryimport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLibraryimport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLibraryimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryimportContext libraryimport() throws RecognitionException {
		LibraryimportContext _localctx = new LibraryimportContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_libraryimport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			metadata();
			setState(1706);
			importSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecificationContext extends ParserRuleContext {
		public ConfigurableUriContext configurableUri() {
			return getRuleContext(ConfigurableUriContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public ImportSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterImportSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitImportSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitImportSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecificationContext importSpecification() throws RecognitionException {
		ImportSpecificationContext _localctx = new ImportSpecificationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_importSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			match(T__106);
			setState(1709);
			configurableUri();
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(1710);
				match(T__83);
				setState(1711);
				identifier();
				}
			}

			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__107 || _la==T__108) {
				{
				{
				setState(1714);
				combinator();
				}
				}
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1720);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CombinatorContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_combinator);
		try {
			setState(1726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__107:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				match(T__107);
				setState(1723);
				identifierList();
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
				match(T__108);
				setState(1725);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			identifier();
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1729);
				match(T__0);
				setState(1730);
				identifier();
				}
				}
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryExportContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ConfigurableUriContext configurableUri() {
			return getRuleContext(ConfigurableUriContext.class,0);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public LibraryExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryExport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterLibraryExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitLibraryExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitLibraryExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryExportContext libraryExport() throws RecognitionException {
		LibraryExportContext _localctx = new LibraryExportContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_libraryExport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			metadata();
			setState(1737);
			match(T__109);
			setState(1738);
			configurableUri();
			setState(1742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__107 || _la==T__108) {
				{
				{
				setState(1739);
				combinator();
				}
				}
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1745);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartDirectiveContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public PartDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPartDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPartDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPartDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartDirectiveContext partDirective() throws RecognitionException {
		PartDirectiveContext _localctx = new PartDirectiveContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_partDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			metadata();
			setState(1748);
			match(T__110);
			setState(1749);
			uri();
			setState(1750);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartHeaderContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PartHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPartHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPartHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPartHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartHeaderContext partHeader() throws RecognitionException {
		PartHeaderContext _localctx = new PartHeaderContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_partHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			metadata();
			setState(1753);
			match(T__110);
			setState(1754);
			match(T__111);
			setState(1755);
			identifier();
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1756);
				match(T__15);
				setState(1757);
				identifier();
				}
				}
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1763);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartDeclarationContext extends ParserRuleContext {
		public PartHeaderContext partHeader() {
			return getRuleContext(PartHeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrainingParser.EOF, 0); }
		public List<TopLevelDefinitionContext> topLevelDefinition() {
			return getRuleContexts(TopLevelDefinitionContext.class);
		}
		public TopLevelDefinitionContext topLevelDefinition(int i) {
			return getRuleContext(TopLevelDefinitionContext.class,i);
		}
		public PartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartDeclarationContext partDeclaration() throws RecognitionException {
		PartDeclarationContext _localctx = new PartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_partDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			partHeader();
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__33) | (1L << T__36))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (T__112 - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (PlaceholderString - 113)))) != 0)) {
				{
				{
				setState(1766);
				topLevelDefinition();
				}
				}
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1772);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UriContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public UriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriContext uri() throws RecognitionException {
		UriContext _localctx = new UriContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_uri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurableUriContext extends ParserRuleContext {
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public List<ConfigurationUriContext> configurationUri() {
			return getRuleContexts(ConfigurationUriContext.class);
		}
		public ConfigurationUriContext configurationUri(int i) {
			return getRuleContext(ConfigurationUriContext.class,i);
		}
		public ConfigurableUriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurableUri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterConfigurableUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitConfigurableUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitConfigurableUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigurableUriContext configurableUri() throws RecognitionException {
		ConfigurableUriContext _localctx = new ConfigurableUriContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_configurableUri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			uri();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__84) {
				{
				{
				setState(1777);
				configurationUri();
				}
				}
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurationUriContext extends ParserRuleContext {
		public UriTestContext uriTest() {
			return getRuleContext(UriTestContext.class,0);
		}
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public ConfigurationUriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationUri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterConfigurationUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitConfigurationUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitConfigurationUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigurationUriContext configurationUri() throws RecognitionException {
		ConfigurationUriContext _localctx = new ConfigurationUriContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_configurationUri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(T__84);
			setState(1784);
			match(T__11);
			setState(1785);
			uriTest();
			setState(1786);
			match(T__12);
			setState(1787);
			uri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UriTestContext extends ParserRuleContext {
		public DottedIdentifierListContext dottedIdentifierList() {
			return getRuleContext(DottedIdentifierListContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public UriTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uriTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterUriTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitUriTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitUriTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriTestContext uriTest() throws RecognitionException {
		UriTestContext _localctx = new UriTestContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_uriTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			dottedIdentifierList();
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1790);
				match(T__26);
				setState(1791);
				stringLiteral();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			typeName();
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1795);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedContext qualified() {
			return getRuleContext(QualifiedContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_typeName);
		try {
			setState(1800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				qualified();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(T__34);
			setState(1803);
			typeList();
			setState(1804);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<DtypeContext> dtype() {
			return getRuleContexts(DtypeContext.class);
		}
		public DtypeContext dtype(int i) {
			return getRuleContext(DtypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			dtype();
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1807);
				match(T__0);
				setState(1808);
				dtype();
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAliasContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public TypeAliasBodyContext typeAliasBody() {
			return getRuleContext(TypeAliasBodyContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_typeAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			metadata();
			setState(1815);
			match(T__112);
			setState(1816);
			typeAliasBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAliasBodyContext extends ParserRuleContext {
		public FunctionTypeAliasContext functionTypeAlias() {
			return getRuleContext(FunctionTypeAliasContext.class,0);
		}
		public TypeAliasBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAliasBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterTypeAliasBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitTypeAliasBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitTypeAliasBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasBodyContext typeAliasBody() throws RecognitionException {
		TypeAliasBodyContext _localctx = new TypeAliasBodyContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_typeAliasBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			functionTypeAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeAliasContext extends ParserRuleContext {
		public FunctionPrefixContext functionPrefix() {
			return getRuleContext(FunctionPrefixContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FunctionTypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFunctionTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFunctionTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFunctionTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeAliasContext functionTypeAlias() throws RecognitionException {
		FunctionTypeAliasContext _localctx = new FunctionTypeAliasContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_functionTypeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			functionPrefix();
			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(1821);
				typeParameters();
				}
			}

			setState(1824);
			formalParameterList();
			setState(1825);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionPrefixContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterFunctionPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitFunctionPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitFunctionPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPrefixContext functionPrefix() throws RecognitionException {
		FunctionPrefixContext _localctx = new FunctionPrefixContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_functionPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1827);
				returnType();
				}
				break;
			}
			setState(1830);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceholderLiteralContext extends ParserRuleContext {
		public TerminalNode PlaceholderString() { return getToken(TrainingParser.PlaceholderString, 0); }
		public PlaceholderLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholderLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterPlaceholderLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitPlaceholderLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitPlaceholderLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceholderLiteralContext placeholderLiteral() throws RecognitionException {
		PlaceholderLiteralContext _localctx = new PlaceholderLiteralContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_placeholderLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(PlaceholderString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringWithPlaceholderLiteralContext extends ParserRuleContext {
		public TerminalNode StringWithPlaceholder() { return getToken(TrainingParser.StringWithPlaceholder, 0); }
		public StringWithPlaceholderLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringWithPlaceholderLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterStringWithPlaceholderLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitStringWithPlaceholderLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitStringWithPlaceholderLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringWithPlaceholderLiteralContext stringWithPlaceholderLiteral() throws RecognitionException {
		StringWithPlaceholderLiteralContext _localctx = new StringWithPlaceholderLiteralContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_stringWithPlaceholderLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(StringWithPlaceholder);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenFigureBracketContext extends ParserRuleContext {
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(TrainingParser.OPEN_FIGURE_BRACKET, 0); }
		public OpenFigureBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openFigureBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOpenFigureBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOpenFigureBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOpenFigureBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenFigureBracketContext openFigureBracket() throws RecognitionException {
		OpenFigureBracketContext _localctx = new OpenFigureBracketContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_openFigureBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(OPEN_FIGURE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseFigureBracketContext extends ParserRuleContext {
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(TrainingParser.CLOSE_FIGURE_BRACKET, 0); }
		public CloseFigureBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeFigureBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCloseFigureBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCloseFigureBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCloseFigureBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseFigureBracketContext closeFigureBracket() throws RecognitionException {
		CloseFigureBracketContext _localctx = new CloseFigureBracketContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_closeFigureBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			match(CLOSE_FIGURE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenSquareBracketContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(TrainingParser.OPEN_SQUARE_BRACKET, 0); }
		public OpenSquareBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openSquareBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterOpenSquareBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitOpenSquareBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitOpenSquareBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenSquareBracketContext openSquareBracket() throws RecognitionException {
		OpenSquareBracketContext _localctx = new OpenSquareBracketContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_openSquareBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(OPEN_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseSquareBracketContext extends ParserRuleContext {
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(TrainingParser.CLOSE_SQUARE_BRACKET, 0); }
		public CloseSquareBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeSquareBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterCloseSquareBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitCloseSquareBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitCloseSquareBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseSquareBracketContext closeSquareBracket() throws RecognitionException {
		CloseSquareBracketContext _localctx = new CloseSquareBracketContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_closeSquareBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PlaceholderLiteralContext placeholderLiteral() {
			return getRuleContext(PlaceholderLiteralContext.class,0);
		}
		public StringWithPlaceholderLiteralContext stringWithPlaceholderLiteral() {
			return getRuleContext(StringWithPlaceholderLiteralContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_className);
		try {
			setState(1847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				identifier();
				}
				break;
			case PlaceholderString:
				enterOuterAlt(_localctx, 2);
				{
				setState(1845);
				placeholderLiteral();
				}
				break;
			case StringWithPlaceholder:
				enterOuterAlt(_localctx, 3);
				{
				setState(1846);
				stringWithPlaceholderLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportScopeContext extends ParserRuleContext {
		public ScriptTagContext scriptTag() {
			return getRuleContext(ScriptTagContext.class,0);
		}
		public LibraryNameContext libraryName() {
			return getRuleContext(LibraryNameContext.class,0);
		}
		public List<ImportOrExportContext> importOrExport() {
			return getRuleContexts(ImportOrExportContext.class);
		}
		public ImportOrExportContext importOrExport(int i) {
			return getRuleContext(ImportOrExportContext.class,i);
		}
		public List<PartDirectiveContext> partDirective() {
			return getRuleContexts(PartDirectiveContext.class);
		}
		public PartDirectiveContext partDirective(int i) {
			return getRuleContext(PartDirectiveContext.class,i);
		}
		public ImportScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).enterImportScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrainingListener ) ((TrainingListener)listener).exitImportScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrainingVisitor ) return ((TrainingVisitor<? extends T>)visitor).visitImportScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportScopeContext importScope() throws RecognitionException {
		ImportScopeContext _localctx = new ImportScopeContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_importScope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__104) {
				{
				setState(1849);
				scriptTag();
				}
			}

			setState(1853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1852);
				libraryName();
				}
				break;
			}
			setState(1858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1855);
					importOrExport();
					}
					} 
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			}
			setState(1864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1861);
					partDirective();
					}
					} 
				}
				setState(1866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u074e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\3\2\3\2\5\2\u016f\n\2\3\3\3\3\3\3\7\3\u0174\n\3\f\3\16\3\u0177\13\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\5\5\u017f\n\5\3\5\3\5\5\5\u0183\n\5\3\5\5\5\u0186"+
		"\n\5\3\6\3\6\5\6\u018a\n\6\3\7\3\7\3\7\5\7\u018f\n\7\3\7\3\7\7\7\u0193"+
		"\n\7\f\7\16\7\u0196\13\7\3\b\3\b\3\b\5\b\u019b\n\b\3\t\3\t\3\t\7\t\u01a0"+
		"\n\t\f\t\16\t\u01a3\13\t\3\n\3\n\5\n\u01a7\n\n\3\n\3\n\3\n\3\13\5\13\u01ad"+
		"\n\13\3\13\3\13\3\f\3\f\5\f\u01b3\n\f\3\r\5\r\u01b6\n\r\3\r\3\r\3\r\5"+
		"\r\u01bb\n\r\3\r\5\r\u01be\n\r\3\r\5\r\u01c1\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u01c8\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01d4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01dc\n\17\3\20\3"+
		"\20\3\20\7\20\u01e1\n\20\f\20\16\20\u01e4\13\20\3\21\3\21\5\21\u01e8\n"+
		"\21\3\22\3\22\3\22\3\22\7\22\u01ee\n\22\f\22\16\22\u01f1\13\22\3\22\5"+
		"\22\u01f4\n\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u01fc\n\23\f\23\16\23"+
		"\u01ff\13\23\3\23\5\23\u0202\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u0209"+
		"\n\24\3\25\3\25\5\25\u020d\n\25\3\25\5\25\u0210\n\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u0218\n\26\3\26\3\26\5\26\u021c\n\26\3\27\3\27\5\27"+
		"\u0220\n\27\3\27\3\27\3\27\3\27\5\27\u0226\n\27\3\30\3\30\3\30\5\30\u022b"+
		"\n\30\3\31\3\31\3\31\5\31\u0230\n\31\3\31\3\31\3\31\5\31\u0235\n\31\5"+
		"\31\u0237\n\31\3\32\3\32\5\32\u023b\n\32\3\32\3\32\3\32\5\32\u0240\n\32"+
		"\3\32\5\32\u0243\n\32\3\32\5\32\u0246\n\32\3\32\5\32\u0249\n\32\3\32\3"+
		"\32\3\32\3\32\7\32\u024f\n\32\f\32\16\32\u0252\13\32\3\32\3\32\3\32\3"+
		"\32\5\32\u0258\n\32\3\32\3\32\3\32\5\32\u025d\n\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0269\n\34\3\35\3\35\5\35\u026d\n"+
		"\35\3\35\3\35\5\35\u0271\n\35\3\35\3\35\5\35\u0275\n\35\3\35\3\35\5\35"+
		"\u0279\n\35\3\35\3\35\5\35\u027d\n\35\3\36\3\36\3\36\5\36\u0282\n\36\3"+
		"\36\3\36\3\36\5\36\u0287\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u028f"+
		"\n\36\5\36\u0291\n\36\3\36\3\36\3\36\5\36\u0296\n\36\5\36\u0298\n\36\3"+
		"\36\3\36\5\36\u029c\n\36\3\36\3\36\3\36\5\36\u02a1\n\36\5\36\u02a3\n\36"+
		"\3\36\3\36\3\36\3\36\5\36\u02a9\n\36\3\36\3\36\3\36\5\36\u02ae\n\36\3"+
		"\36\3\36\5\36\u02b2\n\36\3\36\3\36\5\36\u02b6\n\36\3\36\5\36\u02b9\n\36"+
		"\3\37\3\37\3\37\7\37\u02be\n\37\f\37\16\37\u02c1\13\37\3 \3 \3 \3 \3!"+
		"\5!\u02c8\n!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u02d2\n\"\3#\3#\3#\3#\3#"+
		"\3#\5#\u02da\n#\3$\5$\u02dd\n$\3$\3$\3$\3%\5%\u02e3\n%\3%\3%\3%\3%\3&"+
		"\3&\3&\5&\u02ec\n&\3&\3&\3\'\3\'\3\'\3\'\5\'\u02f4\n\'\3\'\3\'\3(\3(\3"+
		"(\3(\7(\u02fc\n(\f(\16(\u02ff\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u030a"+
		"\n)\3*\3*\5*\u030e\n*\3*\3*\3*\3*\7*\u0314\n*\f*\16*\u0317\13*\3+\3+\3"+
		"+\3+\5+\u031d\n+\3+\3+\3,\5,\u0322\n,\3,\3,\3,\3,\5,\u0328\n,\3,\3,\3"+
		",\3,\3,\5,\u032f\n,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\5\60\u033d"+
		"\n\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u0346\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\7\62\u034f\n\62\f\62\16\62\u0352\13\62\3\62\5\62"+
		"\u0355\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0360\n"+
		"\64\3\65\3\65\3\65\3\65\7\65\u0366\n\65\f\65\16\65\u0369\13\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\5\66\u0371\n\66\3\66\5\66\u0374\n\66\7\66\u0376"+
		"\n\66\f\66\16\66\u0379\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0381"+
		"\n\67\f\67\16\67\u0384\13\67\3\67\3\67\5\67\u0388\n\67\38\38\38\38\38"+
		"\38\58\u0390\n8\39\39\39\79\u0395\n9\f9\169\u0398\139\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\5:\u03a6\n:\3;\3;\3;\3;\3;\3;\3;\5;\u03af\n;\3<\3"+
		"<\3=\3=\3>\3>\3?\6?\u03b8\n?\r?\16?\u03b9\3@\3@\3@\3@\3@\3@\5@\u03c2\n"+
		"@\3A\3A\3A\3A\3A\7A\u03c9\nA\fA\16A\u03cc\13A\5A\u03ce\nA\3B\5B\u03d1"+
		"\nB\3B\5B\u03d4\nB\3B\3B\3B\5B\u03d9\nB\5B\u03db\nB\3B\3B\3C\5C\u03e0"+
		"\nC\3C\5C\u03e3\nC\3C\3C\3C\3C\7C\u03e9\nC\fC\16C\u03ec\13C\3C\5C\u03ef"+
		"\nC\5C\u03f1\nC\3C\3C\3D\3D\3D\3D\3D\5D\u03fa\nD\3E\3E\3E\3F\3F\3F\3G"+
		"\3G\3G\3H\3H\3I\3I\3I\3I\5I\u040b\nI\3I\3I\3J\3J\3J\3J\5J\u0413\nJ\3J"+
		"\3J\3K\3K\3K\5K\u041a\nK\5K\u041c\nK\3K\3K\3L\3L\3L\7L\u0423\nL\fL\16"+
		"L\u0426\13L\3L\3L\3L\7L\u042b\nL\fL\16L\u042e\13L\5L\u0430\nL\3M\3M\3"+
		"M\3N\3N\3N\7N\u0438\nN\fN\16N\u043b\13N\3N\3N\7N\u043f\nN\fN\16N\u0442"+
		"\13N\7N\u0444\nN\fN\16N\u0447\13N\3N\3N\3N\5N\u044c\nN\3O\3O\3O\3O\3O"+
		"\5O\u0453\nO\3P\5P\u0456\nP\3P\3P\3Q\3Q\5Q\u045c\nQ\3R\3R\3S\3S\3S\3S"+
		"\3S\3S\5S\u0466\nS\3T\3T\3T\7T\u046b\nT\fT\16T\u046e\13T\3U\3U\3U\7U\u0473"+
		"\nU\fU\16U\u0476\13U\3V\3V\3V\7V\u047b\nV\fV\16V\u047e\13V\3W\3W\3W\3"+
		"W\5W\u0484\nW\3W\3W\3W\3W\5W\u048a\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0494"+
		"\nY\3Y\3Y\3Y\3Y\5Y\u049a\nY\3Z\3Z\3[\3[\3[\7[\u04a1\n[\f[\16[\u04a4\13"+
		"[\3[\3[\3[\6[\u04a9\n[\r[\16[\u04aa\5[\u04ad\n[\3\\\3\\\3\\\7\\\u04b2"+
		"\n\\\f\\\16\\\u04b5\13\\\3\\\3\\\3\\\6\\\u04ba\n\\\r\\\16\\\u04bb\5\\"+
		"\u04be\n\\\3]\3]\3]\7]\u04c3\n]\f]\16]\u04c6\13]\3]\3]\3]\6]\u04cb\n]"+
		"\r]\16]\u04cc\5]\u04cf\n]\3^\3^\3_\3_\3_\3_\7_\u04d7\n_\f_\16_\u04da\13"+
		"_\3_\3_\3_\3_\6_\u04e0\n_\r_\16_\u04e1\5_\u04e4\n_\3`\3`\3a\3a\3a\3a\7"+
		"a\u04ec\na\fa\16a\u04ef\13a\3a\3a\3a\3a\6a\u04f5\na\ra\16a\u04f6\5a\u04f9"+
		"\na\3b\3b\3c\3c\3c\3c\7c\u0501\nc\fc\16c\u0504\13c\3c\3c\3c\3c\6c\u050a"+
		"\nc\rc\16c\u050b\5c\u050e\nc\3d\3d\3e\3e\3e\3e\3e\3e\3e\5e\u0519\ne\3"+
		"e\3e\3e\3e\3e\5e\u0520\ne\3f\3f\3f\5f\u0525\nf\3g\3g\3h\3h\3i\3i\3j\3"+
		"j\3j\3k\3k\3k\3k\3k\7k\u0535\nk\fk\16k\u0538\13k\5k\u053a\nk\3l\3l\3m"+
		"\3m\5m\u0540\nm\3n\3n\3o\3o\7o\u0546\no\fo\16o\u0549\13o\3o\5o\u054c\n"+
		"o\3o\3o\3o\3o\5o\u0552\no\3p\3p\3p\3p\3p\3p\5p\u055a\np\3q\3q\3q\5q\u055f"+
		"\nq\3r\3r\3s\3s\3s\5s\u0566\ns\3t\3t\3t\3u\3u\5u\u056d\nu\3v\3v\3v\3w"+
		"\3w\3x\7x\u0575\nx\fx\16x\u0578\13x\3y\7y\u057b\ny\fy\16y\u057e\13y\3"+
		"y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u0593\nz\3"+
		"{\5{\u0596\n{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\5~\u05a7\n"+
		"~\3\177\5\177\u05aa\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\5\u0080\u05b4\n\u0080\3\u0080\3\u0080\5\u0080\u05b8\n\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u05c2\n\u0080\3\u0081\3\u0081\5\u0081\u05c6\n\u0081\3\u0081\5\u0081\u05c9"+
		"\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u05df\n\u0084\f\u0084\16\u0084\u05e2"+
		"\13\u0084\3\u0084\5\u0084\u05e5\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\7\u0085\u05eb\n\u0085\f\u0085\16\u0085\u05ee\13\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u05f5\n\u0085\3\u0086\7\u0086\u05f8\n"+
		"\u0086\f\u0086\16\u0086\u05fb\13\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\6\u0088\u0607\n\u0088"+
		"\r\u0088\16\u0088\u0608\3\u0088\5\u0088\u060c\n\u0088\3\u0088\5\u0088"+
		"\u060f\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u0617\n\u0089\3\u0089\3\u0089\5\u0089\u061b\n\u0089\3\u008a\3\u008a\3"+
		"\u008a\3\u008a\3\u008a\5\u008a\u0622\n\u008a\3\u008a\3\u008a\3\u008b\3"+
		"\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u062b\n\u008c\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u0634\n\u008e\3\u008e\3"+
		"\u008e\3\u008f\3\u008f\5\u008f\u063a\n\u008f\3\u008f\3\u008f\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u064e\n\u0093"+
		"\3\u0093\5\u0093\u0651\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0659\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u065f\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0665\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u066e\n"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0675\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u067e\n"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0687\n\u0094\3\u0095\3\u0095\3\u0096\3\u0096\7\u0096\u068d\n\u0096\f"+
		"\u0096\16\u0096\u0690\13\u0096\3\u0097\3\u0097\7\u0097\u0694\n\u0097\f"+
		"\u0097\16\u0097\u0697\13\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u06a2\n\u0099\3\u009a\3\u009a"+
		"\3\u009a\7\u009a\u06a7\n\u009a\f\u009a\16\u009a\u06aa\13\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06b3\n\u009c"+
		"\3\u009c\7\u009c\u06b6\n\u009c\f\u009c\16\u009c\u06b9\13\u009c\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u06c1\n\u009d\3\u009e"+
		"\3\u009e\3\u009e\7\u009e\u06c6\n\u009e\f\u009e\16\u009e\u06c9\13\u009e"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u06cf\n\u009f\f\u009f\16\u009f"+
		"\u06d2\13\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u06e1\n\u00a1"+
		"\f\u00a1\16\u00a1\u06e4\13\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\7\u00a2"+
		"\u06ea\n\u00a2\f\u00a2\16\u00a2\u06ed\13\u00a2\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\7\u00a4\u06f5\n\u00a4\f\u00a4\16\u00a4\u06f8"+
		"\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u0703\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u0707\n\u00a7\3"+
		"\u00a8\3\u00a8\5\u00a8\u070b\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00aa\3\u00aa\3\u00aa\7\u00aa\u0714\n\u00aa\f\u00aa\16\u00aa\u0717\13"+
		"\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\5\u00ad\u0721\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\5\u00ae\u0727\n"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u073a\n\u00b5\3\u00b6\5\u00b6\u073d\n\u00b6\3\u00b6\5\u00b6\u0740"+
		"\n\u00b6\3\u00b6\7\u00b6\u0743\n\u00b6\f\u00b6\16\u00b6\u0746\13\u00b6"+
		"\3\u00b6\7\u00b6\u0749\n\u00b6\f\u00b6\16\u00b6\u074c\13\u00b6\3\u00b6"+
		"\2\2\u00b7\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\2\22\4\2\t\t\f\r\3\2\4\5\4\2\20\20\27\27\3\2"+
		"uv\3\2)*\3\2wx\3\2\61<\4\2\35\35AA\4\2%&BC\3\2DF\3\2GI\3\2JK\3\2LO\3\2"+
		"RS\3\2\36\37\3\2yy\2\u07bf\2\u016e\3\2\2\2\4\u0170\3\2\2\2\6\u0178\3\2"+
		"\2\2\b\u0185\3\2\2\2\n\u0189\3\2\2\2\f\u018b\3\2\2\2\16\u0197\3\2\2\2"+
		"\20\u019c\3\2\2\2\22\u01a4\3\2\2\2\24\u01ac\3\2\2\2\26\u01b2\3\2\2\2\30"+
		"\u01c0\3\2\2\2\32\u01c7\3\2\2\2\34\u01db\3\2\2\2\36\u01dd\3\2\2\2 \u01e7"+
		"\3\2\2\2\"\u01e9\3\2\2\2$\u01f7\3\2\2\2&\u0208\3\2\2\2(\u020a\3\2\2\2"+
		"*\u021b\3\2\2\2,\u021d\3\2\2\2.\u0227\3\2\2\2\60\u0236\3\2\2\2\62\u025c"+
		"\3\2\2\2\64\u025e\3\2\2\2\66\u0268\3\2\2\28\u027c\3\2\2\2:\u02b8\3\2\2"+
		"\2<\u02ba\3\2\2\2>\u02c2\3\2\2\2@\u02c7\3\2\2\2B\u02d1\3\2\2\2D\u02d9"+
		"\3\2\2\2F\u02dc\3\2\2\2H\u02e2\3\2\2\2J\u02e8\3\2\2\2L\u02ef\3\2\2\2N"+
		"\u02f7\3\2\2\2P\u0309\3\2\2\2R\u030d\3\2\2\2T\u0318\3\2\2\2V\u0321\3\2"+
		"\2\2X\u0330\3\2\2\2Z\u0334\3\2\2\2\\\u0337\3\2\2\2^\u033a\3\2\2\2`\u0342"+
		"\3\2\2\2b\u0347\3\2\2\2d\u0358\3\2\2\2f\u035b\3\2\2\2h\u0361\3\2\2\2j"+
		"\u0377\3\2\2\2l\u0387\3\2\2\2n\u038f\3\2\2\2p\u0391\3\2\2\2r\u03a5\3\2"+
		"\2\2t\u03ae\3\2\2\2v\u03b0\3\2\2\2x\u03b2\3\2\2\2z\u03b4\3\2\2\2|\u03b7"+
		"\3\2\2\2~\u03c1\3\2\2\2\u0080\u03c3\3\2\2\2\u0082\u03d0\3\2\2\2\u0084"+
		"\u03df\3\2\2\2\u0086\u03f9\3\2\2\2\u0088\u03fb\3\2\2\2\u008a\u03fe\3\2"+
		"\2\2\u008c\u0401\3\2\2\2\u008e\u0404\3\2\2\2\u0090\u0406\3\2\2\2\u0092"+
		"\u040e\3\2\2\2\u0094\u0416\3\2\2\2\u0096\u042f\3\2\2\2\u0098\u0431\3\2"+
		"\2\2\u009a\u0434\3\2\2\2\u009c\u0452\3\2\2\2\u009e\u0455\3\2\2\2\u00a0"+
		"\u045b\3\2\2\2\u00a2\u045d\3\2\2\2\u00a4\u045f\3\2\2\2\u00a6\u0467\3\2"+
		"\2\2\u00a8\u046f\3\2\2\2\u00aa\u0477\3\2\2\2\u00ac\u0489\3\2\2\2\u00ae"+
		"\u048b\3\2\2\2\u00b0\u0499\3\2\2\2\u00b2\u049b\3\2\2\2\u00b4\u04ac\3\2"+
		"\2\2\u00b6\u04bd\3\2\2\2\u00b8\u04ce\3\2\2\2\u00ba\u04d0\3\2\2\2\u00bc"+
		"\u04e3\3\2\2\2\u00be\u04e5\3\2\2\2\u00c0\u04f8\3\2\2\2\u00c2\u04fa\3\2"+
		"\2\2\u00c4\u050d\3\2\2\2\u00c6\u050f\3\2\2\2\u00c8\u051f\3\2\2\2\u00ca"+
		"\u0524\3\2\2\2\u00cc\u0526\3\2\2\2\u00ce\u0528\3\2\2\2\u00d0\u052a\3\2"+
		"\2\2\u00d2\u052c\3\2\2\2\u00d4\u0539\3\2\2\2\u00d6\u053b\3\2\2\2\u00d8"+
		"\u053f\3\2\2\2\u00da\u0541\3\2\2\2\u00dc\u0551\3\2\2\2\u00de\u0559\3\2"+
		"\2\2\u00e0\u055e\3\2\2\2\u00e2\u0560\3\2\2\2\u00e4\u0562\3\2\2\2\u00e6"+
		"\u0567\3\2\2\2\u00e8\u056a\3\2\2\2\u00ea\u056e\3\2\2\2\u00ec\u0571\3\2"+
		"\2\2\u00ee\u0576\3\2\2\2\u00f0\u057c\3\2\2\2\u00f2\u0592\3\2\2\2\u00f4"+
		"\u0595\3\2\2\2\u00f6\u0599\3\2\2\2\u00f8\u059c\3\2\2\2\u00fa\u059f\3\2"+
		"\2\2\u00fc\u05a9\3\2\2\2\u00fe\u05c1\3\2\2\2\u0100\u05c8\3\2\2\2\u0102"+
		"\u05ca\3\2\2\2\u0104\u05d0\3\2\2\2\u0106\u05d8\3\2\2\2\u0108\u05f4\3\2"+
		"\2\2\u010a\u05f9\3\2\2\2\u010c\u0600\3\2\2\2\u010e\u0603\3\2\2\2\u0110"+
		"\u061a\3\2\2\2\u0112\u061c\3\2\2\2\u0114\u0625\3\2\2\2\u0116\u0628\3\2"+
		"\2\2\u0118\u062e\3\2\2\2\u011a\u0631\3\2\2\2\u011c\u0637\3\2\2\2\u011e"+
		"\u063d\3\2\2\2\u0120\u0641\3\2\2\2\u0122\u0645\3\2\2\2\u0124\u0648\3\2"+
		"\2\2\u0126\u0686\3\2\2\2\u0128\u0688\3\2\2\2\u012a\u068a\3\2\2\2\u012c"+
		"\u0691\3\2\2\2\u012e\u069a\3\2\2\2\u0130\u06a1\3\2\2\2\u0132\u06a3\3\2"+
		"\2\2\u0134\u06ab\3\2\2\2\u0136\u06ae\3\2\2\2\u0138\u06c0\3\2\2\2\u013a"+
		"\u06c2\3\2\2\2\u013c\u06ca\3\2\2\2\u013e\u06d5\3\2\2\2\u0140\u06da\3\2"+
		"\2\2\u0142\u06e7\3\2\2\2\u0144\u06f0\3\2\2\2\u0146\u06f2\3\2\2\2\u0148"+
		"\u06f9\3\2\2\2\u014a\u06ff\3\2\2\2\u014c\u0704\3\2\2\2\u014e\u070a\3\2"+
		"\2\2\u0150\u070c\3\2\2\2\u0152\u0710\3\2\2\2\u0154\u0718\3\2\2\2\u0156"+
		"\u071c\3\2\2\2\u0158\u071e\3\2\2\2\u015a\u0726\3\2\2\2\u015c\u072a\3\2"+
		"\2\2\u015e\u072c\3\2\2\2\u0160\u072e\3\2\2\2\u0162\u0730\3\2\2\2\u0164"+
		"\u0732\3\2\2\2\u0166\u0734\3\2\2\2\u0168\u0739\3\2\2\2\u016a\u073c\3\2"+
		"\2\2\u016c\u016f\5\u012a\u0096\2\u016d\u016f\5\u0142\u00a2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016d\3\2\2\2\u016f\3\3\2\2\2\u0170\u0175\5\6\4\2\u0171"+
		"\u0172\7\3\2\2\u0172\u0174\5\u00e2r\2\u0173\u0171\3\2\2\2\u0174\u0177"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\5\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u0179\5j\66\2\u0179\u017a\5\b\5\2\u017a\u017b\5\u00e2"+
		"r\2\u017b\7\3\2\2\2\u017c\u017e\7\4\2\2\u017d\u017f\5\u014c\u00a7\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0186\3\2\2\2\u0180\u0182\7\5"+
		"\2\2\u0181\u0183\5\u014c\u00a7\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2"+
		"\2\u0183\u0186\3\2\2\2\u0184\u0186\5\n\6\2\u0185\u017c\3\2\2\2\u0185\u0180"+
		"\3\2\2\2\u0185\u0184\3\2\2\2\u0186\t\3\2\2\2\u0187\u018a\7\6\2\2\u0188"+
		"\u018a\5\u014c\u00a7\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\13"+
		"\3\2\2\2\u018b\u018e\5\6\4\2\u018c\u018d\7\7\2\2\u018d\u018f\5l\67\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0194\3\2\2\2\u0190\u0191\7\3"+
		"\2\2\u0191\u0193\5\16\b\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\r\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\u0197\u019a\5\u00e2r\2\u0198\u0199\7\7\2\2\u0199\u019b\5l\67\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\17\3\2\2\2\u019c\u01a1\5\16\b"+
		"\2\u019d\u019e\7\3\2\2\u019e\u01a0\5\16\b\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\21\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\5j\66\2\u01a5\u01a7\5\26\f\2\u01a6"+
		"\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5\u00e2"+
		"r\2\u01a9\u01aa\5\24\13\2\u01aa\23\3\2\2\2\u01ab\u01ad\5h\65\2\u01ac\u01ab"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5\34\17\2"+
		"\u01af\25\3\2\2\2\u01b0\u01b3\7\b\2\2\u01b1\u01b3\5\u014c\u00a7\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\27\3\2\2\2\u01b4\u01b6\7\t\2"+
		"\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\7\n\2\2\u01b8\u01ba\5l\67\2\u01b9\u01bb\7\13\2\2\u01ba\u01b9\3\2\2\2"+
		"\u01ba\u01bb\3\2\2\2\u01bb\u01c1\3\2\2\2\u01bc\u01be\t\2\2\2\u01bd\u01bc"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\5\32\16\2"+
		"\u01c0\u01b5\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c1\31\3\2\2\2\u01c2\u01c3"+
		"\5\u0160\u00b1\2\u01c3\u01c4\5\u00eex\2\u01c4\u01c5\5\u0162\u00b2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c8\5\u015c\u00af\2\u01c7\u01c2\3\2\2\2\u01c7\u01c6"+
		"\3\2\2\2\u01c8\33\3\2\2\2\u01c9\u01ca\7\16\2\2\u01ca\u01dc\7\17\2\2\u01cb"+
		"\u01cc\7\16\2\2\u01cc\u01cd\5\36\20\2\u01cd\u01ce\7\17\2\2\u01ce\u01dc"+
		"\3\2\2\2\u01cf\u01d0\7\16\2\2\u01d0\u01d3\5\36\20\2\u01d1\u01d2\7\3\2"+
		"\2\u01d2\u01d4\5 \21\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\7\17\2\2\u01d6\u01dc\3\2\2\2\u01d7\u01d8\7\16\2\2"+
		"\u01d8\u01d9\5 \21\2\u01d9\u01da\7\17\2\2\u01da\u01dc\3\2\2\2\u01db\u01c9"+
		"\3\2\2\2\u01db\u01cb\3\2\2\2\u01db\u01cf\3\2\2\2\u01db\u01d7\3\2\2\2\u01dc"+
		"\35\3\2\2\2\u01dd\u01e2\5&\24\2\u01de\u01df\7\3\2\2\u01df\u01e1\5&\24"+
		"\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\37\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\5\"\22\2\u01e6"+
		"\u01e8\5$\23\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8!\3\2\2\2"+
		"\u01e9\u01ea\5\u0164\u00b3\2\u01ea\u01ef\5.\30\2\u01eb\u01ec\7\3\2\2\u01ec"+
		"\u01ee\5.\30\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f4\7\3\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\5\u0166\u00b4\2\u01f6#\3\2\2\2\u01f7\u01f8\5\u0160\u00b1"+
		"\2\u01f8\u01fd\5\60\31\2\u01f9\u01fa\7\3\2\2\u01fa\u01fc\5\60\31\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7\3\2\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0162"+
		"\u00b2\2\u0204%\3\2\2\2\u0205\u0209\5(\25\2\u0206\u0209\5,\27\2\u0207"+
		"\u0209\5*\26\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2"+
		"\2\2\u0209\'\3\2\2\2\u020a\u020c\5j\66\2\u020b\u020d\7\20\2\2\u020c\u020b"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\5\26\f\2"+
		"\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212"+
		"\5\u00e2r\2\u0212\u0213\5\24\13\2\u0213)\3\2\2\2\u0214\u021c\5\6\4\2\u0215"+
		"\u0217\5j\66\2\u0216\u0218\7\20\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5\u00e2r\2\u021a\u021c\3\2\2\2"+
		"\u021b\u0214\3\2\2\2\u021b\u0215\3\2\2\2\u021c+\3\2\2\2\u021d\u021f\5"+
		"j\66\2\u021e\u0220\5\b\5\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\7\21\2\2\u0222\u0223\7\22\2\2\u0223\u0225\5"+
		"\u00e2r\2\u0224\u0226\5\24\13\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2"+
		"\2\u0226-\3\2\2\2\u0227\u022a\5&\24\2\u0228\u0229\7\7\2\2\u0229\u022b"+
		"\5l\67\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b/\3\2\2\2\u022c"+
		"\u022f\5&\24\2\u022d\u022e\7\7\2\2\u022e\u0230\5l\67\2\u022f\u022d\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0237\3\2\2\2\u0231\u0234\5&\24\2\u0232"+
		"\u0233\7\23\2\2\u0233\u0235\5l\67\2\u0234\u0232\3\2\2\2\u0234\u0235\3"+
		"\2\2\2\u0235\u0237\3\2\2\2\u0236\u022c\3\2\2\2\u0236\u0231\3\2\2\2\u0237"+
		"\61\3\2\2\2\u0238\u023a\5j\66\2\u0239\u023b\7\24\2\2\u023a\u0239\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\7\25\2\2\u023d"+
		"\u023f\5\u0168\u00b5\2\u023e\u0240\5h\65\2\u023f\u023e\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u0243\5Z.\2\u0242\u0241\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0246\5\64\33\2\u0245\u0244\3"+
		"\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0249\5\\/\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0250\5\u0160"+
		"\u00b1\2\u024b\u024c\5j\66\2\u024c\u024d\5\66\34\2\u024d\u024f\3\2\2\2"+
		"\u024e\u024b\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251"+
		"\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\5\u0162\u00b2"+
		"\2\u0254\u025d\3\2\2\2\u0255\u0257\5j\66\2\u0256\u0258\7\24\2\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\7\25"+
		"\2\2\u025a\u025b\5^\60\2\u025b\u025d\3\2\2\2\u025c\u0238\3\2\2\2\u025c"+
		"\u0255\3\2\2\2\u025d\63\3\2\2\2\u025e\u025f\7\26\2\2\u025f\u0260\5\u0152"+
		"\u00aa\2\u0260\65\3\2\2\2\u0261\u0262\5:\36\2\u0262\u0263\7\13\2\2\u0263"+
		"\u0269\3\2\2\2\u0264\u0265\58\35\2\u0265\u0266\5\30\r\2\u0266\u0269\3"+
		"\2\2\2\u0267\u0269\5\u015c\u00af\2\u0268\u0261\3\2\2\2\u0268\u0264\3\2"+
		"\2\2\u0268\u0267\3\2\2\2\u0269\67\3\2\2\2\u026a\u026c\5J&\2\u026b\u026d"+
		"\5N(\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u027d\3\2\2\2\u026e"+
		"\u027d\5T+\2\u026f\u0271\7\27\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0272\3\2\2\2\u0272\u027d\5\22\n\2\u0273\u0275\7\27\2\2\u0274"+
		"\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u027d\5F"+
		"$\2\u0277\u0279\7\27\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027d\5H%\2\u027b\u027d\5@!\2\u027c\u026a\3\2\2\2"+
		"\u027c\u026e\3\2\2\2\u027c\u0270\3\2\2\2\u027c\u0274\3\2\2\2\u027c\u0278"+
		"\3\2\2\2\u027c\u027b\3\2\2\2\u027d9\3\2\2\2\u027e\u0281\5X-\2\u027f\u0282"+
		"\5L\'\2\u0280\u0282\5N(\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u02b9\3\2\2\2\u0283\u0286\5J&\2\u0284\u0287\5L\'"+
		"\2\u0285\u0287\5N(\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u02b9\3\2\2\2\u0288\u0289\7\30\2\2\u0289\u02b9\5X-\2\u028a"+
		"\u028b\7\30\2\2\u028b\u02b9\5J&\2\u028c\u028e\7\30\2\2\u028d\u028f\7\27"+
		"\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290"+
		"\u028c\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u02b9\5F"+
		"$\2\u0293\u0295\7\30\2\2\u0294\u0296\7\27\2\2\u0295\u0294\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0293\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\3\2\2\2\u0299\u02b9\5H%\2\u029a\u029c\7\30\2\2\u029b"+
		"\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02b9\5@"+
		"!\2\u029e\u02a0\7\30\2\2\u029f\u02a1\7\27\2\2\u02a0\u029f\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u029e\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02b9\5\22\n\2\u02a5\u02a6\7\27\2\2\u02a6"+
		"\u02a8\t\3\2\2\u02a7\u02a9\5\u014c\u00a7\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02b9\5<\37\2\u02ab\u02ad\7\4\2\2\u02ac"+
		"\u02ae\5\u014c\u00a7\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b9\5\20\t\2\u02b0\u02b2\t\4\2\2\u02b1\u02b0\3\2\2\2"+
		"\u02b1\u02b2\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b6\7\6\2\2\u02b4\u02b6"+
		"\5\u014c\u00a7\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3"+
		"\2\2\2\u02b7\u02b9\5\20\t\2\u02b8\u027e\3\2\2\2\u02b8\u0283\3\2\2\2\u02b8"+
		"\u0288\3\2\2\2\u02b8\u028a\3\2\2\2\u02b8\u0290\3\2\2\2\u02b8\u0297\3\2"+
		"\2\2\u02b8\u029b\3\2\2\2\u02b8\u02a2\3\2\2\2\u02b8\u02a5\3\2\2\2\u02b8"+
		"\u02ab\3\2\2\2\u02b8\u02b1\3\2\2\2\u02b9;\3\2\2\2\u02ba\u02bf\5> \2\u02bb"+
		"\u02bc\7\3\2\2\u02bc\u02be\5> \2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2"+
		"\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0=\3\2\2\2\u02c1\u02bf"+
		"\3\2\2\2\u02c2\u02c3\5\u00e2r\2\u02c3\u02c4\7\7\2\2\u02c4\u02c5\5l\67"+
		"\2\u02c5?\3\2\2\2\u02c6\u02c8\5\26\f\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7\31\2\2\u02ca\u02cb\5B\"\2\u02cb"+
		"\u02cc\5\34\17\2\u02ccA\3\2\2\2\u02cd\u02d2\7\32\2\2\u02ce\u02d2\5D#\2"+
		"\u02cf\u02d2\7\33\2\2\u02d0\u02d2\7\34\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02ce"+
		"\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2C\3\2\2\2\u02d3"+
		"\u02da\5\u00c6d\2\u02d4\u02da\5\u00c2b\2\u02d5\u02da\5\u00be`\2\u02d6"+
		"\u02da\5\u00b2Z\2\u02d7\u02da\7\35\2\2\u02d8\u02da\5\u00ba^\2\u02d9\u02d3"+
		"\3\2\2\2\u02d9\u02d4\3\2\2\2\u02d9\u02d5\3\2\2\2\u02d9\u02d6\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02daE\3\2\2\2\u02db\u02dd\5\26\f\2"+
		"\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df"+
		"\7\36\2\2\u02df\u02e0\5\u00e2r\2\u02e0G\3\2\2\2\u02e1\u02e3\5\26\f\2\u02e2"+
		"\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\7\37"+
		"\2\2\u02e5\u02e6\5\u00e2r\2\u02e6\u02e7\5\34\17\2\u02e7I\3\2\2\2\u02e8"+
		"\u02eb\5\u00e2r\2\u02e9\u02ea\7\22\2\2\u02ea\u02ec\5\u00e2r\2\u02eb\u02e9"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\5\34\17\2"+
		"\u02eeK\3\2\2\2\u02ef\u02f0\7\23\2\2\u02f0\u02f3\7\21\2\2\u02f1\u02f2"+
		"\7\22\2\2\u02f2\u02f4\5\u00e2r\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2"+
		"\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\5\u0094K\2\u02f6M\3\2\2\2\u02f7\u02f8"+
		"\7\23\2\2\u02f8\u02fd\5P)\2\u02f9\u02fa\7\3\2\2\u02fa\u02fc\5P)\2\u02fb"+
		"\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2"+
		"\2\2\u02feO\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0301\7 \2\2\u0301\u030a"+
		"\5\u0094K\2\u0302\u0303\7 \2\2\u0303\u0304\7\22\2\2\u0304\u0305\5\u00e2"+
		"r\2\u0305\u0306\5\u0094K\2\u0306\u030a\3\2\2\2\u0307\u030a\5R*\2\u0308"+
		"\u030a\5\u0124\u0093\2\u0309\u0300\3\2\2\2\u0309\u0302\3\2\2\2\u0309\u0307"+
		"\3\2\2\2\u0309\u0308\3\2\2\2\u030aQ\3\2\2\2\u030b\u030c\7\21\2\2\u030c"+
		"\u030e\7\22\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3"+
		"\2\2\2\u030f\u0310\5\u00e2r\2\u0310\u0311\7\7\2\2\u0311\u0315\5\u00a4"+
		"S\2\u0312\u0314\5\u009aN\2\u0313\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316S\3\2\2\2\u0317\u0315\3\2\2\2"+
		"\u0318\u0319\7!\2\2\u0319\u031c\5\u00e2r\2\u031a\u031b\7\22\2\2\u031b"+
		"\u031d\5\u00e2r\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u031f\5\34\17\2\u031fU\3\2\2\2\u0320\u0322\7\5\2\2\u0321"+
		"\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7!"+
		"\2\2\u0324\u0327\5\u00e2r\2\u0325\u0326\7\22\2\2\u0326\u0328\5\u00e2r"+
		"\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a"+
		"\5\34\17\2\u032a\u032b\7\7\2\2\u032b\u032e\5\u014c\u00a7\2\u032c\u032d"+
		"\7\22\2\2\u032d\u032f\5\u00e2r\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2"+
		"\2\u032fW\3\2\2\2\u0330\u0331\7\5\2\2\u0331\u0332\5\u00e4s\2\u0332\u0333"+
		"\5\34\17\2\u0333Y\3\2\2\2\u0334\u0335\7\"\2\2\u0335\u0336\5\u014c\u00a7"+
		"\2\u0336[\3\2\2\2\u0337\u0338\7#\2\2\u0338\u0339\5\u0152\u00aa\2\u0339"+
		"]\3\2\2\2\u033a\u033c\5\u0168\u00b5\2\u033b\u033d\5h\65\2\u033c\u033b"+
		"\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\7\7\2\2\u033f"+
		"\u0340\5`\61\2\u0340\u0341\7\13\2\2\u0341_\3\2\2\2\u0342\u0343\5\u014c"+
		"\u00a7\2\u0343\u0345\5\64\33\2\u0344\u0346\5\\/\2\u0345\u0344\3\2\2\2"+
		"\u0345\u0346\3\2\2\2\u0346a\3\2\2\2\u0347\u0348\5j\66\2\u0348\u0349\7"+
		"$\2\2\u0349\u034a\5\u0168\u00b5\2\u034a\u034b\5\u0160\u00b1\2\u034b\u0350"+
		"\5d\63\2\u034c\u034d\7\3\2\2\u034d\u034f\5d\63\2\u034e\u034c\3\2\2\2\u034f"+
		"\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0354\3\2"+
		"\2\2\u0352\u0350\3\2\2\2\u0353\u0355\7\3\2\2\u0354\u0353\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\5\u0162\u00b2\2\u0357c"+
		"\3\2\2\2\u0358\u0359\5j\66\2\u0359\u035a\5\u00e2r\2\u035ae\3\2\2\2\u035b"+
		"\u035c\5j\66\2\u035c\u035f\5\u00e2r\2\u035d\u035e\7\"\2\2\u035e\u0360"+
		"\5\u014c\u00a7\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360g\3\2\2"+
		"\2\u0361\u0362\7%\2\2\u0362\u0367\5f\64\2\u0363\u0364\7\3\2\2\u0364\u0366"+
		"\5f\64\2\u0365\u0363\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\7&"+
		"\2\2\u036bi\3\2\2\2\u036c\u036d\7\'\2\2\u036d\u0370\5\u00e4s\2\u036e\u036f"+
		"\7\22\2\2\u036f\u0371\5\u00e2r\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371\u0373\3\2\2\2\u0372\u0374\5\u0094K\2\u0373\u0372\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u036c\3\2\2\2\u0376\u0379\3\2"+
		"\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378k\3\2\2\2\u0379\u0377"+
		"\3\2\2\2\u037a\u037b\5\u00dco\2\u037b\u037c\5\u00a0Q\2\u037c\u037d\5l"+
		"\67\2\u037d\u0388\3\2\2\2\u037e\u0382\5\u00a4S\2\u037f\u0381\5\u009aN"+
		"\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383"+
		"\3\2\2\2\u0383\u0388\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0388\5\u0088E"+
		"\2\u0386\u0388\5\u015c\u00af\2\u0387\u037a\3\2\2\2\u0387\u037e\3\2\2\2"+
		"\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2\2\u0388m\3\2\2\2\u0389\u038a\5"+
		"\u00dco\2\u038a\u038b\5\u00a0Q\2\u038b\u038c\5n8\2\u038c\u0390\3\2\2\2"+
		"\u038d\u0390\5\u00a4S\2\u038e\u0390\5\u008aF\2\u038f\u0389\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390o\3\2\2\2\u0391\u0396\5l\67\2"+
		"\u0392\u0393\7\3\2\2\u0393\u0395\5l\67\2\u0394\u0392\3\2\2\2\u0395\u0398"+
		"\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397q\3\2\2\2\u0398"+
		"\u0396\3\2\2\2\u0399\u03a6\5\u008eH\2\u039a\u039b\7 \2\2\u039b\u03a6\5"+
		"\u00dep\2\u039c\u03a6\5\u008cG\2\u039d\u03a6\5t;\2\u039e\u03a6\5\u00e2"+
		"r\2\u039f\u03a6\5\u0090I\2\u03a0\u03a6\5\u0092J\2\u03a1\u03a2\7\16\2\2"+
		"\u03a2\u03a3\5l\67\2\u03a3\u03a4\7\17\2\2\u03a4\u03a6\3\2\2\2\u03a5\u0399"+
		"\3\2\2\2\u03a5\u039a\3\2\2\2\u03a5\u039c\3\2\2\2\u03a5\u039d\3\2\2\2\u03a5"+
		"\u039e\3\2\2\2\u03a5\u039f\3\2\2\2\u03a5\u03a0\3\2\2\2\u03a5\u03a1\3\2"+
		"\2\2\u03a6s\3\2\2\2\u03a7\u03af\5v<\2\u03a8\u03af\5z>\2\u03a9\u03af\5"+
		"x=\2\u03aa\u03af\5|?\2\u03ab\u03af\5\u0080A\2\u03ac\u03af\5\u0084C\2\u03ad"+
		"\u03af\5\u0082B\2\u03ae\u03a7\3\2\2\2\u03ae\u03a8\3\2\2\2\u03ae\u03a9"+
		"\3\2\2\2\u03ae\u03aa\3\2\2\2\u03ae\u03ab\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae"+
		"\u03ad\3\2\2\2\u03afu\3\2\2\2\u03b0\u03b1\7(\2\2\u03b1w\3\2\2\2\u03b2"+
		"\u03b3\t\5\2\2\u03b3y\3\2\2\2\u03b4\u03b5\t\6\2\2\u03b5{\3\2\2\2\u03b6"+
		"\u03b8\t\7\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba}\3\2\2\2\u03bb\u03bc\7+\2\2\u03bc\u03c2"+
		"\5\u00e2r\2\u03bd\u03be\7,\2\2\u03be\u03bf\5l\67\2\u03bf\u03c0\7\u0080"+
		"\2\2\u03c0\u03c2\3\2\2\2\u03c1\u03bb\3\2\2\2\u03c1\u03bd\3\2\2\2\u03c2"+
		"\177\3\2\2\2\u03c3\u03cd\7-\2\2\u03c4\u03ce\5B\"\2\u03c5\u03ca\5\u00e2"+
		"r\2\u03c6\u03c7\7\3\2\2\u03c7\u03c9\5\u00e2r\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03ce\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03c4\3\2\2\2\u03cd\u03c5\3\2\2\2\u03ce"+
		"\u0081\3\2\2\2\u03cf\u03d1\7\5\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d4\5\u0150\u00a9\2\u03d3\u03d2\3\2\2"+
		"\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03da\5\u0164\u00b3\2"+
		"\u03d6\u03d8\5p9\2\u03d7\u03d9\7\3\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03d6\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03dd\5\u0166\u00b4\2\u03dd\u0083\3\2\2\2\u03de\u03e0"+
		"\7\5\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1"+
		"\u03e3\5\u0150\u00a9\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u03f0\5\u0160\u00b1\2\u03e5\u03ea\5\u0086D\2\u03e6\u03e7"+
		"\7\3\2\2\u03e7\u03e9\5\u0086D\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\3\2\2"+
		"\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ed\u03ef\7\3\2\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f1\3\2\2\2\u03f0\u03e5\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u03f3\5\u0162\u00b2\2\u03f3\u0085\3\2\2\2\u03f4\u03fa\5\u015c"+
		"\u00af\2\u03f5\u03f6\5l\67\2\u03f6\u03f7\7\23\2\2\u03f7\u03f8\5l\67\2"+
		"\u03f8\u03fa\3\2\2\2\u03f9\u03f4\3\2\2\2\u03f9\u03f5\3\2\2\2\u03fa\u0087"+
		"\3\2\2\2\u03fb\u03fc\7.\2\2\u03fc\u03fd\5l\67\2\u03fd\u0089\3\2\2\2\u03fe"+
		"\u03ff\7.\2\2\u03ff\u0400\5n8\2\u0400\u008b\3\2\2\2\u0401\u0402\5\24\13"+
		"\2\u0402\u0403\5\30\r\2\u0403\u008d\3\2\2\2\u0404\u0405\7\21\2\2\u0405"+
		"\u008f\3\2\2\2\u0406\u0407\7/\2\2\u0407\u040a\5\u014c\u00a7\2\u0408\u0409"+
		"\7\22\2\2\u0409\u040b\5\u00e2r\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2"+
		"\2\u040b\u040c\3\2\2\2\u040c\u040d\5\u0094K\2\u040d\u0091\3\2\2\2\u040e"+
		"\u040f\7\5\2\2\u040f\u0412\5\u014c\u00a7\2\u0410\u0411\7\22\2\2\u0411"+
		"\u0413\5\u00e2r\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414"+
		"\3\2\2\2\u0414\u0415\5\u0094K\2\u0415\u0093\3\2\2\2\u0416\u041b\7\16\2"+
		"\2\u0417\u0419\5\u0096L\2\u0418\u041a\7\3\2\2\u0419\u0418\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0417\3\2\2\2\u041b\u041c\3\2"+
		"\2\2\u041c\u041d\3\2\2\2\u041d\u041e\7\17\2\2\u041e\u0095\3\2\2\2\u041f"+
		"\u0424\5\u0098M\2\u0420\u0421\7\3\2\2\u0421\u0423\5\u0098M\2\u0422\u0420"+
		"\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0430\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u042c\5p9\2\u0428\u0429\7\3\2"+
		"\2\u0429\u042b\5\u0098M\2\u042a\u0428\3\2\2\2\u042b\u042e\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2"+
		"\2\2\u042f\u041f\3\2\2\2\u042f\u0427\3\2\2\2\u0430\u0097\3\2\2\2\u0431"+
		"\u0432\5\u0118\u008d\2\u0432\u0433\5l\67\2\u0433\u0099\3\2\2\2\u0434\u0435"+
		"\7\60\2\2\u0435\u0439\5\u009cO\2\u0436\u0438\5\u009eP\2\u0437\u0436\3"+
		"\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u0445\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u0440\5\u00e0q\2\u043d\u043f"+
		"\5\u009eP\2\u043e\u043d\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2"+
		"\2\u0440\u0441\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u043c"+
		"\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446"+
		"\u044b\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\5\u00a0Q\2\u0449\u044a"+
		"\5n8\2\u044a\u044c\3\2\2\2\u044b\u0448\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u009b\3\2\2\2\u044d\u044e\5\u0164\u00b3\2\u044e\u044f\5l\67\2\u044f\u0450"+
		"\5\u0166\u00b4\2\u0450\u0453\3\2\2\2\u0451\u0453\5\u00e2r\2\u0452\u044d"+
		"\3\2\2\2\u0452\u0451\3\2\2\2\u0453\u009d\3\2\2\2\u0454\u0456\5\u0150\u00a9"+
		"\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458"+
		"\5\u0094K\2\u0458\u009f\3\2\2\2\u0459\u045c\7\7\2\2\u045a\u045c\5\u00a2"+
		"R\2\u045b\u0459\3\2\2\2\u045b\u045a\3\2\2\2\u045c\u00a1\3\2\2\2\u045d"+
		"\u045e\t\b\2\2\u045e\u00a3\3\2\2\2\u045f\u0465\5\u00a6T\2\u0460\u0461"+
		"\7=\2\2\u0461\u0462\5n8\2\u0462\u0463\7\23\2\2\u0463\u0464\5n8\2\u0464"+
		"\u0466\3\2\2\2\u0465\u0460\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u00a5\3\2"+
		"\2\2\u0467\u046c\5\u00a8U\2\u0468\u0469\7>\2\2\u0469\u046b\5\u00a8U\2"+
		"\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d"+
		"\3\2\2\2\u046d\u00a7\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0474\5\u00aaV"+
		"\2\u0470\u0471\7?\2\2\u0471\u0473\5\u00aaV\2\u0472\u0470\3\2\2\2\u0473"+
		"\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u00a9\3\2"+
		"\2\2\u0476\u0474\3\2\2\2\u0477\u047c\5\u00acW\2\u0478\u0479\7@\2\2\u0479"+
		"\u047b\5\u00acW\2\u047a\u0478\3\2\2\2\u047b\u047e\3\2\2\2\u047c\u047a"+
		"\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u00ab\3\2\2\2\u047e\u047c\3\2\2\2\u047f"+
		"\u0483\5\u00b0Y\2\u0480\u0481\5\u00aeX\2\u0481\u0482\5\u00b0Y\2\u0482"+
		"\u0484\3\2\2\2\u0483\u0480\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u048a\3\2"+
		"\2\2\u0485\u0486\7 \2\2\u0486\u0487\5\u00aeX\2\u0487\u0488\5\u00b0Y\2"+
		"\u0488\u048a\3\2\2\2\u0489\u047f\3\2\2\2\u0489\u0485\3\2\2\2\u048a\u00ad"+
		"\3\2\2\2\u048b\u048c\t\t\2\2\u048c\u00af\3\2\2\2\u048d\u0493\5\u00b4["+
		"\2\u048e\u0494\5\u00e6t\2\u048f\u0494\5\u00eav\2\u0490\u0491\5\u00b2Z"+
		"\2\u0491\u0492\5\u00b4[\2\u0492\u0494\3\2\2\2\u0493\u048e\3\2\2\2\u0493"+
		"\u048f\3\2\2\2\u0493\u0490\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u049a\3\2"+
		"\2\2\u0495\u0496\7 \2\2\u0496\u0497\5\u00b2Z\2\u0497\u0498\5\u00b4[\2"+
		"\u0498\u049a\3\2\2\2\u0499\u048d\3\2\2\2\u0499\u0495\3\2\2\2\u049a\u00b1"+
		"\3\2\2\2\u049b\u049c\t\n\2\2\u049c\u00b3\3\2\2\2\u049d\u04a2\5\u00b6\\"+
		"\2\u049e\u049f\7D\2\2\u049f\u04a1\5\u00b6\\\2\u04a0\u049e\3\2\2\2\u04a1"+
		"\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04ad\3\2"+
		"\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a8\7 \2\2\u04a6\u04a7\7D\2\2\u04a7\u04a9"+
		"\5\u00b4[\2\u04a8\u04a6\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04a8\3\2\2"+
		"\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u049d\3\2\2\2\u04ac\u04a5"+
		"\3\2\2\2\u04ad\u00b5\3\2\2\2\u04ae\u04b3\5\u00b8]\2\u04af\u04b0\7E\2\2"+
		"\u04b0\u04b2\5\u00b8]\2\u04b1\u04af\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3"+
		"\u04b1\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04be\3\2\2\2\u04b5\u04b3\3\2"+
		"\2\2\u04b6\u04b9\7 \2\2\u04b7\u04b8\7E\2\2\u04b8\u04ba\5\u00b8]\2\u04b9"+
		"\u04b7\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2"+
		"\2\2\u04bc\u04be\3\2\2\2\u04bd\u04ae\3\2\2\2\u04bd\u04b6\3\2\2\2\u04be"+
		"\u00b7\3\2\2\2\u04bf\u04c4\5\u00bc_\2\u04c0\u04c1\7F\2\2\u04c1\u04c3\5"+
		"\u00bc_\2\u04c2\u04c0\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2"+
		"\u04c4\u04c5\3\2\2\2\u04c5\u04cf\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04ca"+
		"\7 \2\2\u04c8\u04c9\7F\2\2\u04c9\u04cb\5\u00bc_\2\u04ca\u04c8\3\2\2\2"+
		"\u04cb\u04cc\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf"+
		"\3\2\2\2\u04ce\u04bf\3\2\2\2\u04ce\u04c7\3\2\2\2\u04cf\u00b9\3\2\2\2\u04d0"+
		"\u04d1\t\13\2\2\u04d1\u00bb\3\2\2\2\u04d2\u04d8\5\u00c0a\2\u04d3\u04d4"+
		"\5\u00be`\2\u04d4\u04d5\5\u00c0a\2\u04d5\u04d7\3\2\2\2\u04d6\u04d3\3\2"+
		"\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04e4\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04df\7 \2\2\u04dc\u04dd\5\u00be"+
		"`\2\u04dd\u04de\5\u00c0a\2\u04de\u04e0\3\2\2\2\u04df\u04dc\3\2\2\2\u04e0"+
		"\u04e1\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2"+
		"\2\2\u04e3\u04d2\3\2\2\2\u04e3\u04db\3\2\2\2\u04e4\u00bd\3\2\2\2\u04e5"+
		"\u04e6\t\f\2\2\u04e6\u00bf\3\2\2\2\u04e7\u04ed\5\u00c4c\2\u04e8\u04e9"+
		"\5\u00c2b\2\u04e9\u04ea\5\u00c4c\2\u04ea\u04ec\3\2\2\2\u04eb\u04e8\3\2"+
		"\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04f9\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f4\7 \2\2\u04f1\u04f2\5\u00c2"+
		"b\2\u04f2\u04f3\5\u00c4c\2\u04f3\u04f5\3\2\2\2\u04f4\u04f1\3\2\2\2\u04f5"+
		"\u04f6\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3\2"+
		"\2\2\u04f8\u04e7\3\2\2\2\u04f8\u04f0\3\2\2\2\u04f9\u00c1\3\2\2\2\u04fa"+
		"\u04fb\t\r\2\2\u04fb\u00c3\3\2\2\2\u04fc\u0502\5\u00c8e\2\u04fd\u04fe"+
		"\5\u00c6d\2\u04fe\u04ff\5\u00c8e\2\u04ff\u0501\3\2\2\2\u0500\u04fd\3\2"+
		"\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u050e\3\2\2\2\u0504\u0502\3\2\2\2\u0505\u0509\7 \2\2\u0506\u0507\5\u00c6"+
		"d\2\u0507\u0508\5\u00c8e\2\u0508\u050a\3\2\2\2\u0509\u0506\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2"+
		"\2\2\u050d\u04fc\3\2\2\2\u050d\u0505\3\2\2\2\u050e\u00c5\3\2\2\2\u050f"+
		"\u0510\t\16\2\2\u0510\u00c7\3\2\2\2\u0511\u0512\5\u00caf\2\u0512\u0513"+
		"\5\u00c8e\2\u0513\u0520\3\2\2\2\u0514\u0520\5\u00d2j\2\u0515\u0520\5\u00d4"+
		"k\2\u0516\u0519\5\u00ccg\2\u0517\u0519\5\u00d0i\2\u0518\u0516\3\2\2\2"+
		"\u0518\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\7 \2\2\u051b\u0520"+
		"\3\2\2\2\u051c\u051d\5\u00dan\2\u051d\u051e\5\u00dco\2\u051e\u0520\3\2"+
		"\2\2\u051f\u0511\3\2\2\2\u051f\u0514\3\2\2\2\u051f\u0515\3\2\2\2\u051f"+
		"\u0518\3\2\2\2\u051f\u051c\3\2\2\2\u0520\u00c9\3\2\2\2\u0521\u0525\5\u00cc"+
		"g\2\u0522\u0525\5\u00ceh\2\u0523\u0525\5\u00d0i\2\u0524\u0521\3\2\2\2"+
		"\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525\u00cb\3\2\2\2\u0526\u0527"+
		"\7K\2\2\u0527\u00cd\3\2\2\2\u0528\u0529\7P\2\2\u0529\u00cf\3\2\2\2\u052a"+
		"\u052b\7\32\2\2\u052b\u00d1\3\2\2\2\u052c\u052d\7Q\2\2\u052d\u052e\5\u00c8"+
		"e\2\u052e\u00d3\3\2\2\2\u052f\u0530\5\u00dco\2\u0530\u0531\5\u00d6l\2"+
		"\u0531\u053a\3\2\2\2\u0532\u0536\5r:\2\u0533\u0535\5\u00d8m\2\u0534\u0533"+
		"\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537"+
		"\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u052f\3\2\2\2\u0539\u0532\3\2"+
		"\2\2\u053a\u00d5\3\2\2\2\u053b\u053c\5\u00dan\2\u053c\u00d7\3\2\2\2\u053d"+
		"\u0540\5\u00e0q\2\u053e\u0540\5\u009eP\2\u053f\u053d\3\2\2\2\u053f\u053e"+
		"\3\2\2\2\u0540\u00d9\3\2\2\2\u0541\u0542\t\17\2\2\u0542\u00db\3\2\2\2"+
		"\u0543\u054b\5r:\2\u0544\u0546\5\u009eP\2\u0545\u0544\3\2\2\2\u0546\u0549"+
		"\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549"+
		"\u0547\3\2\2\2\u054a\u054c\5\u00e0q\2\u054b\u0547\3\2\2\2\u054b\u054c"+
		"\3\2\2\2\u054c\u0552\3\2\2\2\u054d\u054e\7 \2\2\u054e\u054f\5\u00dep\2"+
		"\u054f\u0550\5\u00e2r\2\u0550\u0552\3\2\2\2\u0551\u0543\3\2\2\2\u0551"+
		"\u054d\3\2\2\2\u0552\u00dd\3\2\2\2\u0553\u0554\5\u0164\u00b3\2\u0554\u0555"+
		"\5l\67\2\u0555\u0556\5\u0166\u00b4\2\u0556\u055a\3\2\2\2\u0557\u0558\7"+
		"\22\2\2\u0558\u055a\5\u00e2r\2\u0559\u0553\3\2\2\2\u0559\u0557\3\2\2\2"+
		"\u055a\u00df\3\2\2\2\u055b\u055f\5\u00dep\2\u055c\u055d\7T\2\2\u055d\u055f"+
		"\5\u00e2r\2\u055e\u055b\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u00e1\3\2\2"+
		"\2\u0560\u0561\7z\2\2\u0561\u00e3\3\2\2\2\u0562\u0565\5\u00e2r\2\u0563"+
		"\u0564\7\22\2\2\u0564\u0566\5\u00e2r\2\u0565\u0563\3\2\2\2\u0565\u0566"+
		"\3\2\2\2\u0566\u00e5\3\2\2\2\u0567\u0568\5\u00e8u\2\u0568\u0569\5\u014c"+
		"\u00a7\2\u0569\u00e7\3\2\2\2\u056a\u056c\7U\2\2\u056b\u056d\7P\2\2\u056c"+
		"\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u00e9\3\2\2\2\u056e\u056f\5\u00ec"+
		"w\2\u056f\u0570\5\u014c\u00a7\2\u0570\u00eb\3\2\2\2\u0571\u0572\7V\2\2"+
		"\u0572\u00ed\3\2\2\2\u0573\u0575\5\u00f0y\2\u0574\u0573\3\2\2\2\u0575"+
		"\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u00ef\3\2"+
		"\2\2\u0578\u0576\3\2\2\2\u0579\u057b\5\u0118\u008d\2\u057a\u0579\3\2\2"+
		"\2\u057b\u057e\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f"+
		"\3\2\2\2\u057e\u057c\3\2\2\2\u057f\u0580\5\u00f2z\2\u0580\u00f1\3\2\2"+
		"\2\u0581\u0593\5\32\16\2\u0582\u0593\5\u00f6|\2\u0583\u0593\5\u00fc\177"+
		"\2\u0584\u0593\5\u0102\u0082\2\u0585\u0593\5\u0104\u0083\2\u0586\u0593"+
		"\5\u0106\u0084\2\u0587\u0593\5\u00fa~\2\u0588\u0593\5\u010c\u0087\2\u0589"+
		"\u0593\5\u010e\u0088\2\u058a\u0593\5\u011a\u008e\2\u058b\u0593\5\u011c"+
		"\u008f\2\u058c\u0593\5\u0116\u008c\2\u058d\u0593\5\u011e\u0090\2\u058e"+
		"\u0593\5\u0120\u0091\2\u058f\u0593\5\u00f4{\2\u0590\u0593\5\u0122\u0092"+
		"\2\u0591\u0593\5\u00f8}\2\u0592\u0581\3\2\2\2\u0592\u0582\3\2\2\2\u0592"+
		"\u0583\3\2\2\2\u0592\u0584\3\2\2\2\u0592\u0585\3\2\2\2\u0592\u0586\3\2"+
		"\2\2\u0592\u0587\3\2\2\2\u0592\u0588\3\2\2\2\u0592\u0589\3\2\2\2\u0592"+
		"\u058a\3\2\2\2\u0592\u058b\3\2\2\2\u0592\u058c\3\2\2\2\u0592\u058d\3\2"+
		"\2\2\u0592\u058e\3\2\2\2\u0592\u058f\3\2\2\2\u0592\u0590\3\2\2\2\u0592"+
		"\u0591\3\2\2\2\u0593\u00f3\3\2\2\2\u0594\u0596\5l\67\2\u0595\u0594\3\2"+
		"\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\7\13\2\2\u0598"+
		"\u00f5\3\2\2\2\u0599\u059a\5\f\7\2\u059a\u059b\7\13\2\2\u059b\u00f7\3"+
		"\2\2\2\u059c\u059d\5\22\n\2\u059d\u059e\5\30\r\2\u059e\u00f9\3\2\2\2\u059f"+
		"\u05a0\7W\2\2\u05a0\u05a1\7\16\2\2\u05a1\u05a2\5l\67\2\u05a2\u05a3\7\17"+
		"\2\2\u05a3\u05a6\5\u00f0y\2\u05a4\u05a5\7X\2\2\u05a5\u05a7\5\u00f0y\2"+
		"\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u00fb\3\2\2\2\u05a8\u05aa"+
		"\7Q\2\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab"+
		"\u05ac\7Y\2\2\u05ac\u05ad\7\16\2\2\u05ad\u05ae\5\u00fe\u0080\2\u05ae\u05af"+
		"\7\17\2\2\u05af\u05b0\5\u00f0y\2\u05b0\u00fd\3\2\2\2\u05b1\u05b3\5\u0100"+
		"\u0081\2\u05b2\u05b4\5l\67\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u05b7\7\13\2\2\u05b6\u05b8\5p9\2\u05b7\u05b6\3\2"+
		"\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05c2\3\2\2\2\u05b9\u05ba\5\6\4\2\u05ba"+
		"\u05bb\7Z\2\2\u05bb\u05bc\5l\67\2\u05bc\u05c2\3\2\2\2\u05bd\u05be\5\u00e2"+
		"r\2\u05be\u05bf\7Z\2\2\u05bf\u05c0\5l\67\2\u05c0\u05c2\3\2\2\2\u05c1\u05b1"+
		"\3\2\2\2\u05c1\u05b9\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c2\u00ff\3\2\2\2\u05c3"+
		"\u05c9\5\u00f6|\2\u05c4\u05c6\5l\67\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\7\13\2\2\u05c8\u05c3\3\2\2\2"+
		"\u05c8\u05c5\3\2\2\2\u05c9\u0101\3\2\2\2\u05ca\u05cb\7[\2\2\u05cb\u05cc"+
		"\7\16\2\2\u05cc\u05cd\5l\67\2\u05cd\u05ce\7\17\2\2\u05ce\u05cf\5\u00f0"+
		"y\2\u05cf\u0103\3\2\2\2\u05d0\u05d1\7\\\2\2\u05d1\u05d2\5\u00f0y\2\u05d2"+
		"\u05d3\7[\2\2\u05d3\u05d4\7\16\2\2\u05d4\u05d5\5l\67\2\u05d5\u05d6\7\17"+
		"\2\2\u05d6\u05d7\7\13\2\2\u05d7\u0105\3\2\2\2\u05d8\u05d9\7]\2\2\u05d9"+
		"\u05da\7\16\2\2\u05da\u05db\5l\67\2\u05db\u05dc\7\17\2\2\u05dc\u05e0\5"+
		"\u0160\u00b1\2\u05dd\u05df\5\u0108\u0085\2\u05de\u05dd\3\2\2\2\u05df\u05e2"+
		"\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2"+
		"\u05e0\3\2\2\2\u05e3\u05e5\5\u010a\u0086\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\5\u0162\u00b2\2\u05e7\u0107\3"+
		"\2\2\2\u05e8\u05f5\5\u015c\u00af\2\u05e9\u05eb\5\u0118\u008d\2\u05ea\u05e9"+
		"\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ef\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f0\7^\2\2\u05f0\u05f1\5l\67"+
		"\2\u05f1\u05f2\7\23\2\2\u05f2\u05f3\5\u00eex\2\u05f3\u05f5\3\2\2\2\u05f4"+
		"\u05e8\3\2\2\2\u05f4\u05ec\3\2\2\2\u05f5\u0109\3\2\2\2\u05f6\u05f8\5\u0118"+
		"\u008d\2\u05f7\u05f6\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u05fd\7_"+
		"\2\2\u05fd\u05fe\7\23\2\2\u05fe\u05ff\5\u00eex\2\u05ff\u010b\3\2\2\2\u0600"+
		"\u0601\7`\2\2\u0601\u0602\7\13\2\2\u0602\u010d\3\2\2\2\u0603\u0604\7a"+
		"\2\2\u0604\u060e\5\32\16\2\u0605\u0607\5\u0110\u0089\2\u0606\u0605\3\2"+
		"\2\2\u0607\u0608\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"\u060b\3\2\2\2\u060a\u060c\5\u0114\u008b\2\u060b\u060a\3\2\2\2\u060b\u060c"+
		"\3\2\2\2\u060c\u060f\3\2\2\2\u060d\u060f\5\u0114\u008b\2\u060e\u0606\3"+
		"\2\2\2\u060e\u060d\3\2\2\2\u060f\u010f\3\2\2\2\u0610\u0611\5\u0112\u008a"+
		"\2\u0611\u0612\5\32\16\2\u0612\u061b\3\2\2\2\u0613\u0614\7b\2\2\u0614"+
		"\u0616\5\u014c\u00a7\2\u0615\u0617\5\u0112\u008a\2\u0616\u0615\3\2\2\2"+
		"\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\5\32\16\2\u0619\u061b"+
		"\3\2\2\2\u061a\u0610\3\2\2\2\u061a\u0613\3\2\2\2\u061b\u0111\3\2\2\2\u061c"+
		"\u061d\7c\2\2\u061d\u061e\7\16\2\2\u061e\u0621\5\u00e2r\2\u061f\u0620"+
		"\7\3\2\2\u0620\u0622\5\u00e2r\2\u0621\u061f\3\2\2\2\u0621\u0622\3\2\2"+
		"\2\u0622\u0623\3\2\2\2\u0623\u0624\7\17\2\2\u0624\u0113\3\2\2\2\u0625"+
		"\u0626\7d\2\2\u0626\u0627\5\32\16\2\u0627\u0115\3\2\2\2\u0628\u062a\7"+
		"e\2\2\u0629\u062b\5l\67\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u062d\7\13\2\2\u062d\u0117\3\2\2\2\u062e\u062f\5"+
		"\u00e2r\2\u062f\u0630\7\23\2\2\u0630\u0119\3\2\2\2\u0631\u0633\7f\2\2"+
		"\u0632\u0634\5\u00e2r\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u0635\3\2\2\2\u0635\u0636\7\13\2\2\u0636\u011b\3\2\2\2\u0637\u0639\7"+
		"g\2\2\u0638\u063a\5\u00e2r\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a"+
		"\u063b\3\2\2\2\u063b\u063c\7\13\2\2\u063c\u011d\3\2\2\2\u063d\u063e\7"+
		"h\2\2\u063e\u063f\5l\67\2\u063f\u0640\7\13\2\2\u0640\u011f\3\2\2\2\u0641"+
		"\u0642\7i\2\2\u0642\u0643\5l\67\2\u0643\u0644\7\13\2\2\u0644\u0121\3\2"+
		"\2\2\u0645\u0646\5\u0124\u0093\2\u0646\u0647\7\13\2\2\u0647\u0123\3\2"+
		"\2\2\u0648\u0649\7j\2\2\u0649\u064a\7\16\2\2\u064a\u064d\5l\67\2\u064b"+
		"\u064c\7\3\2\2\u064c\u064e\5l\67\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0650\3\2\2\2\u064f\u0651\7\3\2\2\u0650\u064f\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\7\17\2\2\u0653\u0125\3"+
		"\2\2\2\u0654\u0687\5\62\32\2\u0655\u0687\5b\62\2\u0656\u0687\5\u0154\u00ab"+
		"\2\u0657\u0659\7\30\2\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659"+
		"\u065a\3\2\2\2\u065a\u065b\5\22\n\2\u065b\u065c\7\13\2\2\u065c\u0687\3"+
		"\2\2\2\u065d\u065f\7\30\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0660\3\2\2\2\u0660\u0661\5F$\2\u0661\u0662\7\13\2\2\u0662\u0687\3\2"+
		"\2\2\u0663\u0665\7\30\2\2\u0664\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0667\5H%\2\u0667\u0668\7\13\2\2\u0668\u0687\3\2"+
		"\2\2\u0669\u066a\5\22\n\2\u066a\u066b\5\30\r\2\u066b\u0687\3\2\2\2\u066c"+
		"\u066e\5\26\f\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\3"+
		"\2\2\2\u066f\u0670\7\36\2\2\u0670\u0671\5\u00e2r\2\u0671\u0672\5\30\r"+
		"\2\u0672\u0687\3\2\2\2\u0673\u0675\5\26\f\2\u0674\u0673\3\2\2\2\u0674"+
		"\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\7\37\2\2\u0677\u0678\5"+
		"\u00e2r\2\u0678\u0679\5\34\17\2\u0679\u067a\5\30\r\2\u067a\u0687\3\2\2"+
		"\2\u067b\u067d\t\3\2\2\u067c\u067e\5\u014c\u00a7\2\u067d\u067c\3\2\2\2"+
		"\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\5<\37\2\u0680\u0681"+
		"\7\13\2\2\u0681\u0687\3\2\2\2\u0682\u0683\5\4\3\2\u0683\u0684\7\13\2\2"+
		"\u0684\u0687\3\2\2\2\u0685\u0687\5\u015c\u00af\2\u0686\u0654\3\2\2\2\u0686"+
		"\u0655\3\2\2\2\u0686\u0656\3\2\2\2\u0686\u0658\3\2\2\2\u0686\u065e\3\2"+
		"\2\2\u0686\u0664\3\2\2\2\u0686\u0669\3\2\2\2\u0686\u066d\3\2\2\2\u0686"+
		"\u0674\3\2\2\2\u0686\u067b\3\2\2\2\u0686\u0682\3\2\2\2\u0686\u0685\3\2"+
		"\2\2\u0687\u0127\3\2\2\2\u0688\u0689\t\20\2\2\u0689\u0129\3\2\2\2\u068a"+
		"\u068e\5\u016a\u00b6\2\u068b\u068d\5\u0126\u0094\2\u068c\u068b\3\2\2\2"+
		"\u068d\u0690\3\2\2\2\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u012b"+
		"\3\2\2\2\u0690\u068e\3\2\2\2\u0691\u0695\7k\2\2\u0692\u0694\n\21\2\2\u0693"+
		"\u0692\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2"+
		"\2\2\u0696\u0698\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u0699\7y\2\2\u0699"+
		"\u012d\3\2\2\2\u069a\u069b\5j\66\2\u069b\u069c\7l\2\2\u069c\u069d\5\u0132"+
		"\u009a\2\u069d\u069e\7\13\2\2\u069e\u012f\3\2\2\2\u069f\u06a2\5\u0134"+
		"\u009b\2\u06a0\u06a2\5\u013c\u009f\2\u06a1\u069f\3\2\2\2\u06a1\u06a0\3"+
		"\2\2\2\u06a2\u0131\3\2\2\2\u06a3\u06a8\5\u00e2r\2\u06a4\u06a5\7\3\2\2"+
		"\u06a5\u06a7\5\u00e2r\2\u06a6\u06a4\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8"+
		"\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u0133\3\2\2\2\u06aa\u06a8\3\2"+
		"\2\2\u06ab\u06ac\5j\66\2\u06ac\u06ad\5\u0136\u009c\2\u06ad\u0135\3\2\2"+
		"\2\u06ae\u06af\7m\2\2\u06af\u06b2\5\u0146\u00a4\2\u06b0\u06b1\7V\2\2\u06b1"+
		"\u06b3\5\u00e2r\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b7"+
		"\3\2\2\2\u06b4\u06b6\5\u0138\u009d\2\u06b5\u06b4\3\2\2\2\u06b6\u06b9\3"+
		"\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9"+
		"\u06b7\3\2\2\2\u06ba\u06bb\7\13\2\2\u06bb\u0137\3\2\2\2\u06bc\u06bd\7"+
		"n\2\2\u06bd\u06c1\5\u013a\u009e\2\u06be\u06bf\7o\2\2\u06bf\u06c1\5\u013a"+
		"\u009e\2\u06c0\u06bc\3\2\2\2\u06c0\u06be\3\2\2\2\u06c1\u0139\3\2\2\2\u06c2"+
		"\u06c7\5\u00e2r\2\u06c3\u06c4\7\3\2\2\u06c4\u06c6\5\u00e2r\2\u06c5\u06c3"+
		"\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8"+
		"\u013b\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06cb\5j\66\2\u06cb\u06cc\7p"+
		"\2\2\u06cc\u06d0\5\u0146\u00a4\2\u06cd\u06cf\5\u0138\u009d\2\u06ce\u06cd"+
		"\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1"+
		"\u06d3\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d3\u06d4\7\13\2\2\u06d4\u013d\3"+
		"\2\2\2\u06d5\u06d6\5j\66\2\u06d6\u06d7\7q\2\2\u06d7\u06d8\5\u0144\u00a3"+
		"\2\u06d8\u06d9\7\13\2\2\u06d9\u013f\3\2\2\2\u06da\u06db\5j\66\2\u06db"+
		"\u06dc\7q\2\2\u06dc\u06dd\7r\2\2\u06dd\u06e2\5\u00e2r\2\u06de\u06df\7"+
		"\22\2\2\u06df\u06e1\5\u00e2r\2\u06e0\u06de\3\2\2\2\u06e1\u06e4\3\2\2\2"+
		"\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4\u06e2"+
		"\3\2\2\2\u06e5\u06e6\7\13\2\2\u06e6\u0141\3\2\2\2\u06e7\u06eb\5\u0140"+
		"\u00a1\2\u06e8\u06ea\5\u0126\u0094\2\u06e9\u06e8\3\2\2\2\u06ea\u06ed\3"+
		"\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed"+
		"\u06eb\3\2\2\2\u06ee\u06ef\7\2\2\3\u06ef\u0143\3\2\2\2\u06f0\u06f1\5|"+
		"?\2\u06f1\u0145\3\2\2\2\u06f2\u06f6\5\u0144\u00a3\2\u06f3\u06f5\5\u0148"+
		"\u00a5\2\u06f4\u06f3\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6"+
		"\u06f7\3\2\2\2\u06f7\u0147\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fa\7W"+
		"\2\2\u06fa\u06fb\7\16\2\2\u06fb\u06fc\5\u014a\u00a6\2\u06fc\u06fd\7\17"+
		"\2\2\u06fd\u06fe\5\u0144\u00a3\2\u06fe\u0149\3\2\2\2\u06ff\u0702\5\u0132"+
		"\u009a\2\u0700\u0701\7\35\2\2\u0701\u0703\5|?\2\u0702\u0700\3\2\2\2\u0702"+
		"\u0703\3\2\2\2\u0703\u014b\3\2\2\2\u0704\u0706\5\u014e\u00a8\2\u0705\u0707"+
		"\5\u0150\u00a9\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u014d\3"+
		"\2\2\2\u0708\u070b\5\u00e4s\2\u0709\u070b\7\b\2\2\u070a\u0708\3\2\2\2"+
		"\u070a\u0709\3\2\2\2\u070b\u014f\3\2\2\2\u070c\u070d\7%\2\2\u070d\u070e"+
		"\5\u0152\u00aa\2\u070e\u070f\7&\2\2\u070f\u0151\3\2\2\2\u0710\u0715\5"+
		"\u014c\u00a7\2\u0711\u0712\7\3\2\2\u0712\u0714\5\u014c\u00a7\2\u0713\u0711"+
		"\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716"+
		"\u0153\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u0719\5j\66\2\u0719\u071a\7s"+
		"\2\2\u071a\u071b\5\u0156\u00ac\2\u071b\u0155\3\2\2\2\u071c\u071d\5\u0158"+
		"\u00ad\2\u071d\u0157\3\2\2\2\u071e\u0720\5\u015a\u00ae\2\u071f\u0721\5"+
		"h\65\2\u0720\u071f\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\3\2\2\2\u0722"+
		"\u0723\5\34\17\2\u0723\u0724\7\13\2\2\u0724\u0159\3\2\2\2\u0725\u0727"+
		"\5\26\f\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\3\2\2\2"+
		"\u0728\u0729\5\u00e2r\2\u0729\u015b\3\2\2\2\u072a\u072b\7}\2\2\u072b\u015d"+
		"\3\2\2\2\u072c\u072d\7~\2\2\u072d\u015f\3\2\2\2\u072e\u072f\7\177\2\2"+
		"\u072f\u0161\3\2\2\2\u0730\u0731\7\u0080\2\2\u0731\u0163\3\2\2\2\u0732"+
		"\u0733\7\u0081\2\2\u0733\u0165\3\2\2\2\u0734\u0735\7\u0082\2\2\u0735\u0167"+
		"\3\2\2\2\u0736\u073a\5\u00e2r\2\u0737\u073a\5\u015c\u00af\2\u0738\u073a"+
		"\5\u015e\u00b0\2\u0739\u0736\3\2\2\2\u0739\u0737\3\2\2\2\u0739\u0738\3"+
		"\2\2\2\u073a\u0169\3\2\2\2\u073b\u073d\5\u012c\u0097\2\u073c\u073b\3\2"+
		"\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u0740\5\u012e\u0098"+
		"\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0744\3\2\2\2\u0741\u0743"+
		"\5\u0130\u0099\2\u0742\u0741\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3"+
		"\2\2\2\u0744\u0745\3\2\2\2\u0745\u074a\3\2\2\2\u0746\u0744\3\2\2\2\u0747"+
		"\u0749\5\u013e\u00a0\2\u0748\u0747\3\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748"+
		"\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u016b\3\2\2\2\u074c\u074a\3\2\2\2\u00de"+
		"\u016e\u0175\u017e\u0182\u0185\u0189\u018e\u0194\u019a\u01a1\u01a6\u01ac"+
		"\u01b2\u01b5\u01ba\u01bd\u01c0\u01c7\u01d3\u01db\u01e2\u01e7\u01ef\u01f3"+
		"\u01fd\u0201\u0208\u020c\u020f\u0217\u021b\u021f\u0225\u022a\u022f\u0234"+
		"\u0236\u023a\u023f\u0242\u0245\u0248\u0250\u0257\u025c\u0268\u026c\u0270"+
		"\u0274\u0278\u027c\u0281\u0286\u028e\u0290\u0295\u0297\u029b\u02a0\u02a2"+
		"\u02a8\u02ad\u02b1\u02b5\u02b8\u02bf\u02c7\u02d1\u02d9\u02dc\u02e2\u02eb"+
		"\u02f3\u02fd\u0309\u030d\u0315\u031c\u0321\u0327\u032e\u033c\u0345\u0350"+
		"\u0354\u035f\u0367\u0370\u0373\u0377\u0382\u0387\u038f\u0396\u03a5\u03ae"+
		"\u03b9\u03c1\u03ca\u03cd\u03d0\u03d3\u03d8\u03da\u03df\u03e2\u03ea\u03ee"+
		"\u03f0\u03f9\u040a\u0412\u0419\u041b\u0424\u042c\u042f\u0439\u0440\u0445"+
		"\u044b\u0452\u0455\u045b\u0465\u046c\u0474\u047c\u0483\u0489\u0493\u0499"+
		"\u04a2\u04aa\u04ac\u04b3\u04bb\u04bd\u04c4\u04cc\u04ce\u04d8\u04e1\u04e3"+
		"\u04ed\u04f6\u04f8\u0502\u050b\u050d\u0518\u051f\u0524\u0536\u0539\u053f"+
		"\u0547\u054b\u0551\u0559\u055e\u0565\u056c\u0576\u057c\u0592\u0595\u05a6"+
		"\u05a9\u05b3\u05b7\u05c1\u05c5\u05c8\u05e0\u05e4\u05ec\u05f4\u05f9\u0608"+
		"\u060b\u060e\u0616\u061a\u0621\u062a\u0633\u0639\u064d\u0650\u0658\u065e"+
		"\u0664\u066d\u0674\u067d\u0686\u068e\u0695\u06a1\u06a8\u06b2\u06b7\u06c0"+
		"\u06c7\u06d0\u06e2\u06eb\u06f6\u0702\u0706\u070a\u0715\u0720\u0726\u0739"+
		"\u073c\u073f\u0744\u074a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}