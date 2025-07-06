// Generated from MiniJava.g4 by ANTLR 4.9.3
package org.example.MiniJavaAntlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, ID=58, INTEGER=59, WS=60, 
		LINE_COMMENT=61, BLOCK_COMMENT=62;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_constructorDeclaration = 4, RULE_fieldDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_parameterList = 7, RULE_parameter = 8, RULE_type = 9, RULE_statement = 10, 
		RULE_varDeclar = 11, RULE_varDeclarAssign = 12, RULE_assign = 13, RULE_variableMulDivModAddSubAssign = 14, 
		RULE_fieldAssign = 15, RULE_fieldMulDivModAddSubAssign = 16, RULE_arrayMemberMulDivModAddSubAssign = 17, 
		RULE_forInit = 18, RULE_forInitPart = 19, RULE_forUpdate = 20, RULE_forUpdatePart = 21, 
		RULE_expression = 22, RULE_argumentList = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "classBody", "constructorDeclaration", 
			"fieldDeclaration", "methodDeclaration", "parameterList", "parameter", 
			"type", "statement", "varDeclar", "varDeclarAssign", "assign", "variableMulDivModAddSubAssign", 
			"fieldAssign", "fieldMulDivModAddSubAssign", "arrayMemberMulDivModAddSubAssign", 
			"forInit", "forInitPart", "forUpdate", "forUpdatePart", "expression", 
			"argumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'{'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'int'", 
			"'boolean'", "'if'", "'else'", "'while'", "'do'", "'for'", "'break'", 
			"'continue'", "'return'", "'System'", "'.'", "'out'", "'println'", "'='", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"', '", "'new'", "'++'", "'--'", "'length'", "'!'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'this'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "INTEGER", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramDeclarContext extends ProgramContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramDeclarContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgramDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgramDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgramDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			mainClass();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(49);
				classDeclaration();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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

	public static class MainClassContext extends ParserRuleContext {
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
	 
		public MainClassContext() { }
		public void copyFrom(MainClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainClassDeclarationContext extends MainClassContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassDeclarationContext(MainClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		int _la;
		try {
			_localctx = new MainClassDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(57);
				match(T__0);
				}
			}

			setState(60);
			match(T__1);
			setState(61);
			match(ID);
			setState(62);
			match(T__2);
			setState(63);
			match(T__0);
			setState(64);
			match(T__3);
			setState(65);
			match(T__4);
			setState(66);
			match(T__5);
			setState(67);
			match(T__6);
			setState(68);
			match(T__7);
			setState(69);
			match(T__8);
			setState(70);
			match(T__9);
			setState(71);
			match(ID);
			setState(72);
			match(T__10);
			setState(73);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__11);
			setState(81);
			match(T__11);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclarContext extends ClassDeclarationContext {
		public Token className;
		public Token superClass;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public ClassDeclarContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			((ClassDeclarContext)_localctx).className = match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(85);
				match(T__12);
				setState(86);
				((ClassDeclarContext)_localctx).superClass = match(ID);
				}
			}

			setState(89);
			match(T__2);
			setState(90);
			classBody();
			setState(91);
			match(T__11);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClasssBodyDeclarContext extends ClassBodyContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClasssBodyDeclarContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClasssBodyDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClasssBodyDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClasssBodyDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			_localctx = new ClasssBodyDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(93);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(94);
					constructorDeclaration();
					}
					break;
				case 3:
					{
					setState(95);
					methodDeclaration();
					}
					break;
				}
				}
				setState(100);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	 
		public ConstructorDeclarationContext() { }
		public void copyFrom(ConstructorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstructorDeclarContext extends ConstructorDeclarationContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDeclarContext(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterConstructorDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitConstructorDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitConstructorDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructorDeclaration);
		int _la;
		try {
			_localctx = new ConstructorDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			match(ID);
			setState(103);
			match(T__6);
			setState(104);
			parameterList();
			setState(105);
			match(T__10);
			setState(106);
			match(T__2);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(107);
				statement();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__11);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldDeclarContext extends FieldDeclarationContext {
		public Token fieldName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public FieldDeclarContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		try {
			_localctx = new FieldDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			type();
			setState(116);
			((FieldDeclarContext)_localctx).fieldName = match(ID);
			setState(117);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclarContext extends MethodDeclarationContext {
		public Token methodName;
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__0);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case ID:
				{
				setState(120);
				type();
				}
				break;
			case T__4:
				{
				setState(121);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			((MethodDeclarContext)_localctx).methodName = match(ID);
			setState(125);
			match(T__6);
			setState(126);
			parameterList();
			setState(127);
			match(T__10);
			setState(128);
			match(T__2);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(129);
				statement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__11);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterListDeclarContext extends ParameterListContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListDeclarContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameterListDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameterListDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameterListDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			_localctx = new ParameterListDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(137);
				parameter();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(138);
					match(T__14);
					setState(139);
					parameter();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterDeclarContext extends ParameterContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ParameterDeclarContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameterDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameterDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			_localctx = new ParameterDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			type();
			setState(148);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntArrayTypeContext extends TypeContext {
		public IntArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTypeContext extends TypeContext {
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdentifierTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IntArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__15);
				setState(151);
				match(T__8);
				setState(152);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__16);
				}
				break;
			case 3:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(T__15);
				}
				break;
			case 4:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldMulDivModAddSubAssignmentStatementContext extends StatementContext {
		public FieldMulDivModAddSubAssignContext fieldMulDivModAddSubAssign() {
			return getRuleContext(FieldMulDivModAddSubAssignContext.class,0);
		}
		public FieldMulDivModAddSubAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldMulDivModAddSubAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldMulDivModAddSubAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldMulDivModAddSubAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMemberMulDivModAddSubAssignmentStatementContext extends StatementContext {
		public ArrayMemberMulDivModAddSubAssignContext arrayMemberMulDivModAddSubAssign() {
			return getRuleContext(ArrayMemberMulDivModAddSubAssignContext.class,0);
		}
		public ArrayMemberMulDivModAddSubAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberMulDivModAddSubAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberMulDivModAddSubAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberMulDivModAddSubAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationWithAssignmentStatementContext extends StatementContext {
		public VarDeclarAssignContext varDeclarAssign() {
			return getRuleContext(VarDeclarAssignContext.class,0);
		}
		public VariableDeclarationWithAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableDeclarationWithAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableDeclarationWithAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableDeclarationWithAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignmentStatementContext extends StatementContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public VariableAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnNothingStatementContext extends StatementContext {
		public ReturnNothingStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnNothingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnNothingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnNothingStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAssignmentStatementContext extends StatementContext {
		public FieldAssignContext fieldAssign() {
			return getRuleContext(FieldAssignContext.class,0);
		}
		public FieldAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableMulDivModAddSubAssignmentStatementContext extends StatementContext {
		public VariableMulDivModAddSubAssignContext variableMulDivModAddSubAssign() {
			return getRuleContext(VariableMulDivModAddSubAssignContext.class,0);
		}
		public VariableMulDivModAddSubAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableMulDivModAddSubAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableMulDivModAddSubAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableMulDivModAddSubAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationStatementContext extends StatementContext {
		public VarDeclarContext varDeclar() {
			return getRuleContext(VarDeclarContext.class,0);
		}
		public VariableDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends StatementContext {
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__2);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					{
					setState(159);
					statement();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__17);
				setState(167);
				match(T__6);
				setState(168);
				expression(0);
				setState(169);
				match(T__10);
				setState(170);
				statement();
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(171);
					match(T__18);
					setState(172);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__19);
				setState(176);
				match(T__6);
				setState(177);
				expression(0);
				setState(178);
				match(T__10);
				setState(179);
				statement();
				}
				break;
			case 4:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__20);
				setState(182);
				statement();
				setState(183);
				match(T__19);
				setState(184);
				match(T__6);
				setState(185);
				expression(0);
				setState(186);
				match(T__10);
				setState(187);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(T__21);
				setState(190);
				match(T__6);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					setState(191);
					forInit();
					}
				}

				setState(194);
				match(T__13);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					setState(195);
					expression(0);
					}
				}

				setState(198);
				match(T__13);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					setState(199);
					forUpdate();
					}
				}

				setState(202);
				match(T__10);
				setState(203);
				statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(T__22);
				setState(205);
				match(T__13);
				}
				break;
			case 7:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(T__23);
				setState(207);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new ReturnNothingStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				match(T__24);
				setState(209);
				match(T__13);
				}
				break;
			case 9:
				_localctx = new ReturnExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				match(T__24);
				setState(211);
				expression(0);
				setState(212);
				match(T__13);
				}
				break;
			case 10:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(214);
				varDeclar();
				setState(215);
				match(T__13);
				}
				break;
			case 11:
				_localctx = new VariableDeclarationWithAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(217);
				varDeclarAssign();
				setState(218);
				match(T__13);
				}
				break;
			case 12:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(220);
				assign();
				setState(221);
				match(T__13);
				}
				break;
			case 13:
				_localctx = new FieldAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(223);
				fieldAssign();
				setState(224);
				match(T__13);
				}
				break;
			case 14:
				_localctx = new VariableMulDivModAddSubAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(226);
				variableMulDivModAddSubAssign();
				setState(227);
				match(T__13);
				}
				break;
			case 15:
				_localctx = new FieldMulDivModAddSubAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(229);
				fieldMulDivModAddSubAssign();
				setState(230);
				match(T__13);
				}
				break;
			case 16:
				_localctx = new ArrayMemberMulDivModAddSubAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(232);
				arrayMemberMulDivModAddSubAssign();
				setState(233);
				match(T__13);
				}
				break;
			case 17:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(235);
				expression(0);
				setState(236);
				match(T__13);
				}
				break;
			case 18:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(238);
				match(T__25);
				setState(239);
				match(T__26);
				setState(240);
				match(T__27);
				setState(241);
				match(T__26);
				setState(242);
				match(T__28);
				setState(243);
				match(T__6);
				setState(244);
				expression(0);
				setState(245);
				match(T__10);
				setState(246);
				match(T__13);
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

	public static class VarDeclarContext extends ParserRuleContext {
		public VarDeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclar; }
	 
		public VarDeclarContext() { }
		public void copyFrom(VarDeclarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationContext extends VarDeclarContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public VariableDeclarationContext(VarDeclarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarContext varDeclar() throws RecognitionException {
		VarDeclarContext _localctx = new VarDeclarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDeclar);
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			type();
			setState(251);
			match(ID);
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

	public static class VarDeclarAssignContext extends ParserRuleContext {
		public VarDeclarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarAssign; }
	 
		public VarDeclarAssignContext() { }
		public void copyFrom(VarDeclarAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationAssignmentContext extends VarDeclarAssignContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationAssignmentContext(VarDeclarAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarAssignContext varDeclarAssign() throws RecognitionException {
		VarDeclarAssignContext _localctx = new VarDeclarAssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclarAssign);
		try {
			_localctx = new VariableDeclarationAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			type();
			setState(254);
			match(ID);
			setState(255);
			match(T__29);
			setState(256);
			expression(0);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends AssignContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
			setState(259);
			match(T__29);
			setState(260);
			expression(0);
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

	public static class VariableMulDivModAddSubAssignContext extends ParserRuleContext {
		public VariableMulDivModAddSubAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMulDivModAddSubAssign; }
	 
		public VariableMulDivModAddSubAssignContext() { }
		public void copyFrom(VariableMulDivModAddSubAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableMulDivModAddAssignmentContext extends VariableMulDivModAddSubAssignContext {
		public Token op;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableMulDivModAddAssignmentContext(VariableMulDivModAddSubAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariableMulDivModAddAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariableMulDivModAddAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariableMulDivModAddAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableMulDivModAddSubAssignContext variableMulDivModAddSubAssign() throws RecognitionException {
		VariableMulDivModAddSubAssignContext _localctx = new VariableMulDivModAddSubAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableMulDivModAddSubAssign);
		int _la;
		try {
			_localctx = new VariableMulDivModAddAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(263);
			((VariableMulDivModAddAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
				((VariableMulDivModAddAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264);
			match(T__29);
			setState(265);
			expression(0);
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

	public static class FieldAssignContext extends ParserRuleContext {
		public FieldAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAssign; }
	 
		public FieldAssignContext() { }
		public void copyFrom(FieldAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldAssignmentContext extends FieldAssignContext {
		public ExpressionContext fieldHaver;
		public ExpressionContext value;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FieldAssignmentContext(FieldAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAssignContext fieldAssign() throws RecognitionException {
		FieldAssignContext _localctx = new FieldAssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldAssign);
		try {
			_localctx = new FieldAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((FieldAssignmentContext)_localctx).fieldHaver = expression(0);
			setState(268);
			match(T__26);
			setState(269);
			match(ID);
			setState(270);
			match(T__29);
			setState(271);
			((FieldAssignmentContext)_localctx).value = expression(0);
			setState(272);
			match(T__13);
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

	public static class FieldMulDivModAddSubAssignContext extends ParserRuleContext {
		public FieldMulDivModAddSubAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldMulDivModAddSubAssign; }
	 
		public FieldMulDivModAddSubAssignContext() { }
		public void copyFrom(FieldMulDivModAddSubAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldMulDivModAddSubAssignmentContext extends FieldMulDivModAddSubAssignContext {
		public ExpressionContext fieldHaver;
		public Token op;
		public ExpressionContext value;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FieldMulDivModAddSubAssignmentContext(FieldMulDivModAddSubAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldMulDivModAddSubAssignContext fieldMulDivModAddSubAssign() throws RecognitionException {
		FieldMulDivModAddSubAssignContext _localctx = new FieldMulDivModAddSubAssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fieldMulDivModAddSubAssign);
		int _la;
		try {
			_localctx = new FieldMulDivModAddSubAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			((FieldMulDivModAddSubAssignmentContext)_localctx).fieldHaver = expression(0);
			setState(275);
			match(T__26);
			setState(276);
			match(ID);
			setState(277);
			((FieldMulDivModAddSubAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
				((FieldMulDivModAddSubAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(278);
			((FieldMulDivModAddSubAssignmentContext)_localctx).value = expression(0);
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

	public static class ArrayMemberMulDivModAddSubAssignContext extends ParserRuleContext {
		public ArrayMemberMulDivModAddSubAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMemberMulDivModAddSubAssign; }
	 
		public ArrayMemberMulDivModAddSubAssignContext() { }
		public void copyFrom(ArrayMemberMulDivModAddSubAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayMemberMulDivModAddSubAssignmentContext extends ArrayMemberMulDivModAddSubAssignContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public Token op;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayMemberMulDivModAddSubAssignmentContext(ArrayMemberMulDivModAddSubAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMemberMulDivModAddSubAssignContext arrayMemberMulDivModAddSubAssign() throws RecognitionException {
		ArrayMemberMulDivModAddSubAssignContext _localctx = new ArrayMemberMulDivModAddSubAssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayMemberMulDivModAddSubAssign);
		int _la;
		try {
			_localctx = new ArrayMemberMulDivModAddSubAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).array = expression(0);
			setState(281);
			match(T__8);
			setState(282);
			((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).index = expression(0);
			setState(283);
			match(T__9);
			setState(284);
			((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
				((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(285);
			match(T__29);
			setState(286);
			((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).value = expression(0);
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

	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	 
		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForInitPartsContext extends ForInitContext {
		public List<ForInitPartContext> forInitPart() {
			return getRuleContexts(ForInitPartContext.class);
		}
		public ForInitPartContext forInitPart(int i) {
			return getRuleContext(ForInitPartContext.class,i);
		}
		public ForInitPartsContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forInit);
		int _la;
		try {
			_localctx = new ForInitPartsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			forInitPart();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(289);
				match(T__40);
				setState(290);
				forInitPart();
				}
				}
				setState(295);
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

	public static class ForInitPartContext extends ParserRuleContext {
		public ForInitPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitPart; }
	 
		public ForInitPartContext() { }
		public void copyFrom(ForInitPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForInitPartExpressionContext extends ForInitPartContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitPartExpressionContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartArrayMemberMulDivModAddSubAssignmentContext extends ForInitPartContext {
		public ArrayMemberMulDivModAddSubAssignContext arrayMemberMulDivModAddSubAssign() {
			return getRuleContext(ArrayMemberMulDivModAddSubAssignContext.class,0);
		}
		public ForInitPartArrayMemberMulDivModAddSubAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartArrayMemberMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartArrayMemberMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartArrayMemberMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartVariableDeclarationContext extends ForInitPartContext {
		public VarDeclarContext varDeclar() {
			return getRuleContext(VarDeclarContext.class,0);
		}
		public ForInitPartVariableDeclarationContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartFieldAssignmentContext extends ForInitPartContext {
		public FieldAssignContext fieldAssign() {
			return getRuleContext(FieldAssignContext.class,0);
		}
		public ForInitPartFieldAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartFieldAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartFieldAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartFieldAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartFieldMulDivModAddSubAssignmentContext extends ForInitPartContext {
		public FieldMulDivModAddSubAssignContext fieldMulDivModAddSubAssign() {
			return getRuleContext(FieldMulDivModAddSubAssignContext.class,0);
		}
		public ForInitPartFieldMulDivModAddSubAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartFieldMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartFieldMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartFieldMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartVariableMulDivModAddSubAssignmentContext extends ForInitPartContext {
		public VariableMulDivModAddSubAssignContext variableMulDivModAddSubAssign() {
			return getRuleContext(VariableMulDivModAddSubAssignContext.class,0);
		}
		public ForInitPartVariableMulDivModAddSubAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartVariableMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartVariableMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartVariableMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartAssignmentContext extends ForInitPartContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ForInitPartAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInitPartVariableDeclarationAssignmentContext extends ForInitPartContext {
		public VarDeclarAssignContext varDeclarAssign() {
			return getRuleContext(VarDeclarAssignContext.class,0);
		}
		public ForInitPartVariableDeclarationAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartVariableDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartVariableDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartVariableDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitPartContext forInitPart() throws RecognitionException {
		ForInitPartContext _localctx = new ForInitPartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forInitPart);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ForInitPartVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				varDeclar();
				}
				break;
			case 2:
				_localctx = new ForInitPartVariableDeclarationAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				varDeclarAssign();
				}
				break;
			case 3:
				_localctx = new ForInitPartAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				assign();
				}
				break;
			case 4:
				_localctx = new ForInitPartVariableMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				variableMulDivModAddSubAssign();
				}
				break;
			case 5:
				_localctx = new ForInitPartFieldAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				fieldAssign();
				}
				break;
			case 6:
				_localctx = new ForInitPartFieldMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				fieldMulDivModAddSubAssign();
				}
				break;
			case 7:
				_localctx = new ForInitPartArrayMemberMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				arrayMemberMulDivModAddSubAssign();
				}
				break;
			case 8:
				_localctx = new ForInitPartExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				expression(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	 
		public ForUpdateContext() { }
		public void copyFrom(ForUpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForUpdatePartsContext extends ForUpdateContext {
		public List<ForUpdatePartContext> forUpdatePart() {
			return getRuleContexts(ForUpdatePartContext.class);
		}
		public ForUpdatePartContext forUpdatePart(int i) {
			return getRuleContext(ForUpdatePartContext.class,i);
		}
		public ForUpdatePartsContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdateParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdateParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdateParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forUpdate);
		int _la;
		try {
			_localctx = new ForUpdatePartsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			forUpdatePart();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(307);
				match(T__40);
				setState(308);
				forUpdatePart();
				}
				}
				setState(313);
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

	public static class ForUpdatePartContext extends ParserRuleContext {
		public ForUpdatePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdatePart; }
	 
		public ForUpdatePartContext() { }
		public void copyFrom(ForUpdatePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext extends ForUpdatePartContext {
		public ArrayMemberMulDivModAddSubAssignContext arrayMemberMulDivModAddSubAssign() {
			return getRuleContext(ArrayMemberMulDivModAddSubAssignContext.class,0);
		}
		public ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartArrayMemberMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartArrayMemberMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartArrayMemberMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForUpdatePartAssignmentContext extends ForUpdatePartContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ForUpdatePartAssignmentContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForUpdatePartFieldAssignmentContext extends ForUpdatePartContext {
		public FieldAssignContext fieldAssign() {
			return getRuleContext(FieldAssignContext.class,0);
		}
		public ForUpdatePartFieldAssignmentContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartFieldAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartFieldAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartFieldAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForUpdatePartExpressionContext extends ForUpdatePartContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdatePartExpressionContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForUpdatePartFieldMulDivModAddSubAssignmentContext extends ForUpdatePartContext {
		public FieldMulDivModAddSubAssignContext fieldMulDivModAddSubAssign() {
			return getRuleContext(FieldMulDivModAddSubAssignContext.class,0);
		}
		public ForUpdatePartFieldMulDivModAddSubAssignmentContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartFieldMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartFieldMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartFieldMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForUpdatePartVariableMulDivModAddSubAssignmentContext extends ForUpdatePartContext {
		public VariableMulDivModAddSubAssignContext variableMulDivModAddSubAssign() {
			return getRuleContext(VariableMulDivModAddSubAssignContext.class,0);
		}
		public ForUpdatePartVariableMulDivModAddSubAssignmentContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartVariableMulDivModAddSubAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartVariableMulDivModAddSubAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartVariableMulDivModAddSubAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdatePartContext forUpdatePart() throws RecognitionException {
		ForUpdatePartContext _localctx = new ForUpdatePartContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forUpdatePart);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ForUpdatePartAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				assign();
				}
				break;
			case 2:
				_localctx = new ForUpdatePartVariableMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				variableMulDivModAddSubAssign();
				}
				break;
			case 3:
				_localctx = new ForUpdatePartFieldAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				fieldAssign();
				}
				break;
			case 4:
				_localctx = new ForUpdatePartFieldMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				fieldMulDivModAddSubAssign();
				}
				break;
			case 5:
				_localctx = new ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				arrayMemberMulDivModAddSubAssign();
				}
				break;
			case 6:
				_localctx = new ForUpdatePartExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerBinaryExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntegerBinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntegerBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntegerBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntegerBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMemberIncrementDecrementExpressionContext extends ExpressionContext {
		public ExpressionContext array;
		public Token op;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayMemberIncrementDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberIncrementDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberIncrementDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberIncrementDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjectExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public NewObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpressionContext extends ExpressionContext {
		public ExpressionContext fieldHaver;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdIncrementDecrementExpressionContext extends ExpressionContext {
		public Token op;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdIncrementDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIncrementDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIncrementDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIncrementDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMemberExpressionContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayMemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext methodHaver;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldIncrementDecrementExpressionContext extends ExpressionContext {
		public ExpressionContext fieldHaver;
		public Token op;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldIncrementDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldIncrementDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldIncrementDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldIncrementDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayLengthExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLengthExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewIntArrayExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewIntArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewIntArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewIntArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewIntArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueFalseExpressionContext extends ExpressionContext {
		public Token value;
		public TrueFalseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTrueFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTrueFalseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTrueFalseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(323);
				match(T__6);
				setState(324);
				expression(0);
				setState(325);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(T__41);
				setState(328);
				match(T__15);
				setState(329);
				match(T__8);
				setState(330);
				expression(0);
				setState(331);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new NewObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				match(T__41);
				setState(334);
				match(ID);
				setState(335);
				match(T__6);
				setState(336);
				match(T__10);
				}
				break;
			case 4:
				{
				_localctx = new ArrayMemberIncrementDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				((ArrayMemberIncrementDecrementExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__43) ) {
					((ArrayMemberIncrementDecrementExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				((ArrayMemberIncrementDecrementExpressionContext)_localctx).array = expression(0);
				setState(339);
				match(T__8);
				setState(340);
				((ArrayMemberIncrementDecrementExpressionContext)_localctx).index = expression(0);
				setState(341);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(T__45);
				setState(344);
				expression(12);
				}
				break;
			case 6:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(T__34);
				setState(346);
				expression(11);
				}
				break;
			case 7:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				match(T__54);
				}
				break;
			case 8:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new IdIncrementDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(349);
					match(ID);
					setState(350);
					((IdIncrementDecrementExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__42 || _la==T__43) ) {
						((IdIncrementDecrementExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__42:
				case T__43:
					{
					setState(351);
					((IdIncrementDecrementExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__42 || _la==T__43) ) {
						((IdIncrementDecrementExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(352);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(INTEGER);
				}
				break;
			case 11:
				{
				_localctx = new TrueFalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				((TrueFalseExpressionContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
					((TrueFalseExpressionContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerBinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntegerBinaryExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(360);
						((IntegerBinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((IntegerBinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						((IntegerBinaryExpressionContext)_localctx).rightSide = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new IntegerBinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntegerBinaryExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(363);
						((IntegerBinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((IntegerBinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((IntegerBinaryExpressionContext)_localctx).rightSide = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(366);
						((CompareExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
							((CompareExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(367);
						((CompareExpressionContext)_localctx).rightSide = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(369);
						((BooleanExpressionContext)_localctx).op = match(T__52);
						setState(370);
						((BooleanExpressionContext)_localctx).rightSide = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(372);
						((BooleanExpressionContext)_localctx).op = match(T__53);
						setState(373);
						((BooleanExpressionContext)_localctx).rightSide = expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ArrayMemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayMemberExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(375);
						match(T__8);
						setState(376);
						((ArrayMemberExpressionContext)_localctx).index = expression(0);
						setState(377);
						match(T__9);
						}
						break;
					case 7:
						{
						_localctx = new ArrayMemberIncrementDecrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayMemberIncrementDecrementExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(380);
						match(T__8);
						setState(381);
						((ArrayMemberIncrementDecrementExpressionContext)_localctx).index = expression(0);
						setState(382);
						match(T__9);
						setState(383);
						((ArrayMemberIncrementDecrementExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__42 || _la==T__43) ) {
							((ArrayMemberIncrementDecrementExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 8:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayLengthExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(385);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(386);
						match(T__26);
						setState(387);
						match(T__44);
						}
						break;
					case 9:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FieldExpressionContext)_localctx).fieldHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(389);
						match(T__26);
						setState(390);
						match(ID);
						}
						break;
					case 10:
						{
						_localctx = new FieldIncrementDecrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FieldIncrementDecrementExpressionContext)_localctx).fieldHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(392);
						match(T__26);
						setState(393);
						match(ID);
						setState(394);
						((FieldIncrementDecrementExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__42 || _la==T__43) ) {
							((FieldIncrementDecrementExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 11:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MethodCallExpressionContext)_localctx).methodHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(396);
						match(T__26);
						setState(397);
						match(ID);
						setState(398);
						match(T__6);
						setState(399);
						argumentList();
						setState(400);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentListDeclarContext extends ArgumentListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListDeclarContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgumentListDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgumentListDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArgumentListDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentList);
		int _la;
		try {
			_localctx = new ArgumentListDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				setState(407);
				expression(0);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(408);
					match(T__14);
					setState(409);
					expression(0);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u01a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\5\3=\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5"+
		"c\n\5\f\5\16\5f\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\3\t\3\t\3\t\7\t\u008f\n\t"+
		"\f\t\16\t\u0092\13\t\5\t\u0094\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u009f\n\13\3\f\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c3\n\f\3\f\3\f\5\f\u00c7"+
		"\n\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00fb\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\7\24\u0126\n\24\f\24\16\24\u0129\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0133\n\25\3\26\3\26\3\26\7\26\u0138\n\26\f\26\16"+
		"\26\u013b\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0143\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0164\n\30\3\30\3\30\5\30\u0168\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0195\n\30"+
		"\f\30\16\30\u0198\13\30\3\31\3\31\3\31\7\31\u019d\n\31\f\31\16\31\u01a0"+
		"\13\31\5\31\u01a2\n\31\3\31\2\3.\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\t\3\2!%\4\2  &*\3\2-.\3\2:;\3\2!#\3\2$%\3\2\61\66\2"+
		"\u01d6\2\62\3\2\2\2\4<\3\2\2\2\6U\3\2\2\2\bd\3\2\2\2\ng\3\2\2\2\fu\3\2"+
		"\2\2\16y\3\2\2\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u009e\3\2\2\2\26"+
		"\u00fa\3\2\2\2\30\u00fc\3\2\2\2\32\u00ff\3\2\2\2\34\u0104\3\2\2\2\36\u0108"+
		"\3\2\2\2 \u010d\3\2\2\2\"\u0114\3\2\2\2$\u011a\3\2\2\2&\u0122\3\2\2\2"+
		"(\u0132\3\2\2\2*\u0134\3\2\2\2,\u0142\3\2\2\2.\u0167\3\2\2\2\60\u01a1"+
		"\3\2\2\2\62\66\5\4\3\2\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;=\7"+
		"\3\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\4\2\2?@\7<\2\2@A\7\5\2\2AB\7"+
		"\3\2\2BC\7\6\2\2CD\7\7\2\2DE\7\b\2\2EF\7\t\2\2FG\7\n\2\2GH\7\13\2\2HI"+
		"\7\f\2\2IJ\7<\2\2JK\7\r\2\2KO\7\5\2\2LN\5\26\f\2ML\3\2\2\2NQ\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\16\2\2ST\7\16\2\2T\5\3\2\2"+
		"\2UV\7\4\2\2VY\7<\2\2WX\7\17\2\2XZ\7<\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2"+
		"\2[\\\7\5\2\2\\]\5\b\5\2]^\7\16\2\2^\7\3\2\2\2_c\5\f\7\2`c\5\n\6\2ac\5"+
		"\16\b\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\t"+
		"\3\2\2\2fd\3\2\2\2gh\7\3\2\2hi\7<\2\2ij\7\t\2\2jk\5\20\t\2kl\7\r\2\2l"+
		"p\7\5\2\2mo\5\26\f\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2"+
		"rp\3\2\2\2st\7\16\2\2t\13\3\2\2\2uv\5\24\13\2vw\7<\2\2wx\7\20\2\2x\r\3"+
		"\2\2\2y|\7\3\2\2z}\5\24\13\2{}\7\7\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2~"+
		"\177\7<\2\2\177\u0080\7\t\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7\r\2\2"+
		"\u0082\u0086\7\5\2\2\u0083\u0085\5\26\f\2\u0084\u0083\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\16\2\2\u008a\17\3\2\2\2\u008b\u0090\5\22"+
		"\n\2\u008c\u008d\7\21\2\2\u008d\u008f\5\22\n\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\21\3\2\2\2\u0095\u0096\5\24\13\2\u0096\u0097\7<\2\2\u0097\23\3\2\2\2"+
		"\u0098\u0099\7\22\2\2\u0099\u009a\7\13\2\2\u009a\u009f\7\f\2\2\u009b\u009f"+
		"\7\23\2\2\u009c\u009f\7\22\2\2\u009d\u009f\7<\2\2\u009e\u0098\3\2\2\2"+
		"\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\25"+
		"\3\2\2\2\u00a0\u00a4\7\5\2\2\u00a1\u00a3\5\26\f\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00fb\7\16\2\2\u00a8\u00a9\7\24\2\2"+
		"\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5.\30\2\u00ab\u00ac\7\r\2\2\u00ac\u00af"+
		"\5\26\f\2\u00ad\u00ae\7\25\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ad\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00fb\3\2\2\2\u00b1\u00b2\7\26\2\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3\u00b4\5.\30\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\26"+
		"\f\2\u00b6\u00fb\3\2\2\2\u00b7\u00b8\7\27\2\2\u00b8\u00b9\5\26\f\2\u00b9"+
		"\u00ba\7\26\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\5.\30\2\u00bc\u00bd\7"+
		"\r\2\2\u00bd\u00be\7\20\2\2\u00be\u00fb\3\2\2\2\u00bf\u00c0\7\30\2\2\u00c0"+
		"\u00c2\7\t\2\2\u00c1\u00c3\5&\24\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\7\20\2\2\u00c5\u00c7\5.\30\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\20"+
		"\2\2\u00c9\u00cb\5*\26\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00fb\5\26\f\2\u00ce\u00cf\7"+
		"\31\2\2\u00cf\u00fb\7\20\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00fb\7\20\2\2"+
		"\u00d2\u00d3\7\33\2\2\u00d3\u00fb\7\20\2\2\u00d4\u00d5\7\33\2\2\u00d5"+
		"\u00d6\5.\30\2\u00d6\u00d7\7\20\2\2\u00d7\u00fb\3\2\2\2\u00d8\u00d9\5"+
		"\30\r\2\u00d9\u00da\7\20\2\2\u00da\u00fb\3\2\2\2\u00db\u00dc\5\32\16\2"+
		"\u00dc\u00dd\7\20\2\2\u00dd\u00fb\3\2\2\2\u00de\u00df\5\34\17\2\u00df"+
		"\u00e0\7\20\2\2\u00e0\u00fb\3\2\2\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7"+
		"\20\2\2\u00e3\u00fb\3\2\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7\20\2\2"+
		"\u00e6\u00fb\3\2\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\7\20\2\2\u00e9\u00fb"+
		"\3\2\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7\20\2\2\u00ec\u00fb\3\2\2\2"+
		"\u00ed\u00ee\5.\30\2\u00ee\u00ef\7\20\2\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1"+
		"\7\34\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\7\35\2"+
		"\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\5.\30\2\u00f7"+
		"\u00f8\7\r\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00a0\3"+
		"\2\2\2\u00fa\u00a8\3\2\2\2\u00fa\u00b1\3\2\2\2\u00fa\u00b7\3\2\2\2\u00fa"+
		"\u00bf\3\2\2\2\u00fa\u00ce\3\2\2\2\u00fa\u00d0\3\2\2\2\u00fa\u00d2\3\2"+
		"\2\2\u00fa\u00d4\3\2\2\2\u00fa\u00d8\3\2\2\2\u00fa\u00db\3\2\2\2\u00fa"+
		"\u00de\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00e4\3\2\2\2\u00fa\u00e7\3\2"+
		"\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00ed\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fb"+
		"\27\3\2\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\7<\2\2\u00fe\31\3\2\2\2"+
		"\u00ff\u0100\5\24\13\2\u0100\u0101\7<\2\2\u0101\u0102\7 \2\2\u0102\u0103"+
		"\5.\30\2\u0103\33\3\2\2\2\u0104\u0105\7<\2\2\u0105\u0106\7 \2\2\u0106"+
		"\u0107\5.\30\2\u0107\35\3\2\2\2\u0108\u0109\7<\2\2\u0109\u010a\t\2\2\2"+
		"\u010a\u010b\7 \2\2\u010b\u010c\5.\30\2\u010c\37\3\2\2\2\u010d\u010e\5"+
		".\30\2\u010e\u010f\7\35\2\2\u010f\u0110\7<\2\2\u0110\u0111\7 \2\2\u0111"+
		"\u0112\5.\30\2\u0112\u0113\7\20\2\2\u0113!\3\2\2\2\u0114\u0115\5.\30\2"+
		"\u0115\u0116\7\35\2\2\u0116\u0117\7<\2\2\u0117\u0118\t\3\2\2\u0118\u0119"+
		"\5.\30\2\u0119#\3\2\2\2\u011a\u011b\5.\30\2\u011b\u011c\7\13\2\2\u011c"+
		"\u011d\5.\30\2\u011d\u011e\7\f\2\2\u011e\u011f\t\2\2\2\u011f\u0120\7 "+
		"\2\2\u0120\u0121\5.\30\2\u0121%\3\2\2\2\u0122\u0127\5(\25\2\u0123\u0124"+
		"\7+\2\2\u0124\u0126\5(\25\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\'\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u0133\5\30\r\2\u012b\u0133\5\32\16\2\u012c\u0133\5\34\17\2\u012d"+
		"\u0133\5\36\20\2\u012e\u0133\5 \21\2\u012f\u0133\5\"\22\2\u0130\u0133"+
		"\5$\23\2\u0131\u0133\5.\30\2\u0132\u012a\3\2\2\2\u0132\u012b\3\2\2\2\u0132"+
		"\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133)\3\2\2\2\u0134\u0139"+
		"\5,\27\2\u0135\u0136\7+\2\2\u0136\u0138\5,\27\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a+\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u0143\5\34\17\2\u013d\u0143\5\36\20\2\u013e"+
		"\u0143\5 \21\2\u013f\u0143\5\"\22\2\u0140\u0143\5$\23\2\u0141\u0143\5"+
		".\30\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143-\3\2\2\2"+
		"\u0144\u0145\b\30\1\2\u0145\u0146\7\t\2\2\u0146\u0147\5.\30\2\u0147\u0148"+
		"\7\r\2\2\u0148\u0168\3\2\2\2\u0149\u014a\7,\2\2\u014a\u014b\7\22\2\2\u014b"+
		"\u014c\7\13\2\2\u014c\u014d\5.\30\2\u014d\u014e\7\f\2\2\u014e\u0168\3"+
		"\2\2\2\u014f\u0150\7,\2\2\u0150\u0151\7<\2\2\u0151\u0152\7\t\2\2\u0152"+
		"\u0168\7\r\2\2\u0153\u0154\t\4\2\2\u0154\u0155\5.\30\2\u0155\u0156\7\13"+
		"\2\2\u0156\u0157\5.\30\2\u0157\u0158\7\f\2\2\u0158\u0168\3\2\2\2\u0159"+
		"\u015a\7\60\2\2\u015a\u0168\5.\30\16\u015b\u015c\7%\2\2\u015c\u0168\5"+
		".\30\r\u015d\u0168\79\2\2\u015e\u0168\7<\2\2\u015f\u0160\7<\2\2\u0160"+
		"\u0164\t\4\2\2\u0161\u0162\t\4\2\2\u0162\u0164\7<\2\2\u0163\u015f\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u0168\3\2\2\2\u0165\u0168\7=\2\2\u0166"+
		"\u0168\t\5\2\2\u0167\u0144\3\2\2\2\u0167\u0149\3\2\2\2\u0167\u014f\3\2"+
		"\2\2\u0167\u0153\3\2\2\2\u0167\u0159\3\2\2\2\u0167\u015b\3\2\2\2\u0167"+
		"\u015d\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0166\3\2\2\2\u0168\u0196\3\2\2\2\u0169\u016a\f\f\2\2\u016a"+
		"\u016b\t\6\2\2\u016b\u0195\5.\30\r\u016c\u016d\f\13\2\2\u016d\u016e\t"+
		"\7\2\2\u016e\u0195\5.\30\f\u016f\u0170\f\n\2\2\u0170\u0171\t\b\2\2\u0171"+
		"\u0195\5.\30\13\u0172\u0173\f\t\2\2\u0173\u0174\7\67\2\2\u0174\u0195\5"+
		".\30\n\u0175\u0176\f\b\2\2\u0176\u0177\78\2\2\u0177\u0195\5.\30\t\u0178"+
		"\u0179\f\25\2\2\u0179\u017a\7\13\2\2\u017a\u017b\5.\30\2\u017b\u017c\7"+
		"\f\2\2\u017c\u0195\3\2\2\2\u017d\u017e\f\24\2\2\u017e\u017f\7\13\2\2\u017f"+
		"\u0180\5.\30\2\u0180\u0181\7\f\2\2\u0181\u0182\t\4\2\2\u0182\u0195\3\2"+
		"\2\2\u0183\u0184\f\22\2\2\u0184\u0185\7\35\2\2\u0185\u0195\7/\2\2\u0186"+
		"\u0187\f\21\2\2\u0187\u0188\7\35\2\2\u0188\u0195\7<\2\2\u0189\u018a\f"+
		"\20\2\2\u018a\u018b\7\35\2\2\u018b\u018c\7<\2\2\u018c\u0195\t\4\2\2\u018d"+
		"\u018e\f\17\2\2\u018e\u018f\7\35\2\2\u018f\u0190\7<\2\2\u0190\u0191\7"+
		"\t\2\2\u0191\u0192\5\60\31\2\u0192\u0193\7\r\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0169\3\2\2\2\u0194\u016c\3\2\2\2\u0194\u016f\3\2\2\2\u0194\u0172\3\2"+
		"\2\2\u0194\u0175\3\2\2\2\u0194\u0178\3\2\2\2\u0194\u017d\3\2\2\2\u0194"+
		"\u0183\3\2\2\2\u0194\u0186\3\2\2\2\u0194\u0189\3\2\2\2\u0194\u018d\3\2"+
		"\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"/\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019e\5.\30\2\u019a\u019b\7\21\2\2"+
		"\u019b\u019d\5.\30\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u0199\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\61\3\2\2\2\36\66<OYbdp|\u0086"+
		"\u0090\u0093\u009e\u00a4\u00af\u00c2\u00c6\u00ca\u00fa\u0127\u0132\u0139"+
		"\u0142\u0163\u0167\u0194\u0196\u019e\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}