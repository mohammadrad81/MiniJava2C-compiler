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
		ID=53, INTEGER=54, WS=55, LINE_COMMENT=56, BLOCK_COMMENT=57;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_constructorDeclaration = 4, RULE_fieldDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_parameterList = 7, RULE_parameter = 8, RULE_type = 9, RULE_statement = 10, 
		RULE_varDeclar = 11, RULE_varDeclarAssign = 12, RULE_assign = 13, RULE_variableMulDivModAddSubAssign = 14, 
		RULE_fieldAssign = 15, RULE_fieldMulDivModAddSubAssign = 16, RULE_arrayMemberAssign = 17, 
		RULE_arrayMemberMulDivModAddSubAssign = 18, RULE_forInit = 19, RULE_forInitPart = 20, 
		RULE_forUpdate = 21, RULE_forUpdatePart = 22, RULE_expression = 23, RULE_argumentList = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "classBody", "constructorDeclaration", 
			"fieldDeclaration", "methodDeclaration", "parameterList", "parameter", 
			"type", "statement", "varDeclar", "varDeclarAssign", "assign", "variableMulDivModAddSubAssign", 
			"fieldAssign", "fieldMulDivModAddSubAssign", "arrayMemberAssign", "arrayMemberMulDivModAddSubAssign", 
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
			"'*'", "'/'", "'%'", "'+'", "'-'", "', '", "'new'", "'++'", "'length'", 
			"'--'", "'!'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'this'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "INTEGER", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
			setState(50);
			mainClass();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(51);
				classDeclaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(59);
				match(T__0);
				}
			}

			setState(62);
			match(T__1);
			setState(63);
			match(ID);
			setState(64);
			match(T__2);
			setState(65);
			match(T__0);
			setState(66);
			match(T__3);
			setState(67);
			match(T__4);
			setState(68);
			match(T__5);
			setState(69);
			match(T__6);
			setState(70);
			match(T__7);
			setState(71);
			match(T__8);
			setState(72);
			match(T__9);
			setState(73);
			match(ID);
			setState(74);
			match(T__10);
			setState(75);
			match(T__2);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__11);
			setState(83);
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
			setState(85);
			match(T__1);
			setState(86);
			((ClassDeclarContext)_localctx).className = match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(87);
				match(T__12);
				setState(88);
				((ClassDeclarContext)_localctx).superClass = match(ID);
				}
			}

			setState(91);
			match(T__2);
			setState(92);
			classBody();
			setState(93);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(95);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(96);
					constructorDeclaration();
					}
					break;
				case 3:
					{
					setState(97);
					methodDeclaration();
					}
					break;
				}
				}
				setState(102);
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
			setState(103);
			match(T__0);
			setState(104);
			match(ID);
			setState(105);
			match(T__6);
			setState(106);
			parameterList();
			setState(107);
			match(T__10);
			setState(108);
			match(T__2);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
			setState(117);
			type();
			setState(118);
			((FieldDeclarContext)_localctx).fieldName = match(ID);
			setState(119);
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
			setState(121);
			match(T__0);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case ID:
				{
				setState(122);
				type();
				}
				break;
			case T__4:
				{
				setState(123);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			((MethodDeclarContext)_localctx).methodName = match(ID);
			setState(127);
			match(T__6);
			setState(128);
			parameterList();
			setState(129);
			match(T__10);
			setState(130);
			match(T__2);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(139);
				parameter();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(140);
					match(T__14);
					setState(141);
					parameter();
					}
					}
					setState(146);
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
			setState(149);
			type();
			setState(150);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IntArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__15);
				setState(153);
				match(T__8);
				setState(154);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__16);
				}
				break;
			case 3:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__15);
				}
				break;
			case 4:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
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
	public static class ArrayMemberAssignmentStatementContext extends StatementContext {
		public ArrayMemberAssignContext arrayMemberAssign() {
			return getRuleContext(ArrayMemberAssignContext.class,0);
		}
		public ArrayMemberAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberAssignmentStatement(this);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__2);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					{
					setState(161);
					statement();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__17);
				setState(169);
				match(T__6);
				setState(170);
				expression(0);
				setState(171);
				match(T__10);
				setState(172);
				statement();
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(173);
					match(T__18);
					setState(174);
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
				setState(177);
				match(T__19);
				setState(178);
				match(T__6);
				setState(179);
				expression(0);
				setState(180);
				match(T__10);
				setState(181);
				statement();
				}
				break;
			case 4:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__20);
				setState(184);
				statement();
				setState(185);
				match(T__19);
				setState(186);
				match(T__6);
				setState(187);
				expression(0);
				setState(188);
				match(T__10);
				setState(189);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(T__21);
				setState(192);
				match(T__6);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					setState(193);
					forInit();
					}
				}

				setState(196);
				match(T__13);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					setState(197);
					expression(0);
					}
				}

				setState(200);
				match(T__13);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
					{
					setState(201);
					forUpdate();
					}
				}

				setState(204);
				match(T__10);
				setState(205);
				statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				match(T__22);
				setState(207);
				match(T__13);
				}
				break;
			case 7:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(T__23);
				setState(209);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new ReturnNothingStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				match(T__24);
				setState(211);
				match(T__13);
				}
				break;
			case 9:
				_localctx = new ReturnExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				match(T__24);
				setState(213);
				expression(0);
				setState(214);
				match(T__13);
				}
				break;
			case 10:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(216);
				varDeclar();
				setState(217);
				match(T__13);
				}
				break;
			case 11:
				_localctx = new VariableDeclarationWithAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(219);
				varDeclarAssign();
				setState(220);
				match(T__13);
				}
				break;
			case 12:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(222);
				assign();
				setState(223);
				match(T__13);
				}
				break;
			case 13:
				_localctx = new FieldAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(225);
				fieldAssign();
				setState(226);
				match(T__13);
				}
				break;
			case 14:
				_localctx = new ArrayMemberAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(228);
				arrayMemberAssign();
				setState(229);
				match(T__13);
				}
				break;
			case 15:
				_localctx = new VariableMulDivModAddSubAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(231);
				variableMulDivModAddSubAssign();
				setState(232);
				match(T__13);
				}
				break;
			case 16:
				_localctx = new FieldMulDivModAddSubAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(234);
				fieldMulDivModAddSubAssign();
				setState(235);
				match(T__13);
				}
				break;
			case 17:
				_localctx = new ArrayMemberMulDivModAddSubAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(237);
				arrayMemberMulDivModAddSubAssign();
				setState(238);
				match(T__13);
				}
				break;
			case 18:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(240);
				expression(0);
				setState(241);
				match(T__13);
				}
				break;
			case 19:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(243);
				match(T__25);
				setState(244);
				match(T__26);
				setState(245);
				match(T__27);
				setState(246);
				match(T__26);
				setState(247);
				match(T__28);
				setState(248);
				match(T__6);
				setState(249);
				expression(0);
				setState(250);
				match(T__10);
				setState(251);
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
			setState(255);
			type();
			setState(256);
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
			setState(258);
			type();
			setState(259);
			match(ID);
			setState(260);
			match(T__29);
			setState(261);
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
			setState(263);
			match(ID);
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
			setState(267);
			match(ID);
			setState(268);
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
			setState(269);
			match(T__29);
			setState(270);
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
			setState(272);
			((FieldAssignmentContext)_localctx).fieldHaver = expression(0);
			setState(273);
			match(T__26);
			setState(274);
			match(ID);
			setState(275);
			match(T__29);
			setState(276);
			((FieldAssignmentContext)_localctx).value = expression(0);
			setState(277);
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
			setState(279);
			((FieldMulDivModAddSubAssignmentContext)_localctx).fieldHaver = expression(0);
			setState(280);
			match(T__26);
			setState(281);
			match(ID);
			setState(282);
			((FieldMulDivModAddSubAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
				((FieldMulDivModAddSubAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(283);
			match(T__29);
			setState(284);
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

	public static class ArrayMemberAssignContext extends ParserRuleContext {
		public ArrayMemberAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMemberAssign; }
	 
		public ArrayMemberAssignContext() { }
		public void copyFrom(ArrayMemberAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayMemberAssignmentContext extends ArrayMemberAssignContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayMemberAssignmentContext(ArrayMemberAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMemberAssignContext arrayMemberAssign() throws RecognitionException {
		ArrayMemberAssignContext _localctx = new ArrayMemberAssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayMemberAssign);
		try {
			_localctx = new ArrayMemberAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((ArrayMemberAssignmentContext)_localctx).array = expression(0);
			setState(287);
			match(T__8);
			setState(288);
			((ArrayMemberAssignmentContext)_localctx).index = expression(0);
			setState(289);
			match(T__9);
			setState(290);
			match(T__29);
			setState(291);
			((ArrayMemberAssignmentContext)_localctx).value = expression(0);
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
		enterRule(_localctx, 36, RULE_arrayMemberMulDivModAddSubAssign);
		int _la;
		try {
			_localctx = new ArrayMemberMulDivModAddSubAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).array = expression(0);
			setState(294);
			match(T__8);
			setState(295);
			((ArrayMemberMulDivModAddSubAssignmentContext)_localctx).index = expression(0);
			setState(296);
			match(T__9);
			setState(297);
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
			setState(298);
			match(T__29);
			setState(299);
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
		enterRule(_localctx, 38, RULE_forInit);
		int _la;
		try {
			_localctx = new ForInitPartsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			forInitPart();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(302);
				match(T__35);
				setState(303);
				forInitPart();
				}
				}
				setState(308);
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
	public static class ForInitPartArrayMemberAssignmentContext extends ForInitPartContext {
		public ArrayMemberAssignContext arrayMemberAssign() {
			return getRuleContext(ArrayMemberAssignContext.class,0);
		}
		public ForInitPartArrayMemberAssignmentContext(ForInitPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInitPartArrayMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInitPartArrayMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInitPartArrayMemberAssignment(this);
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
		enterRule(_localctx, 40, RULE_forInitPart);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ForInitPartVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				varDeclar();
				}
				break;
			case 2:
				_localctx = new ForInitPartVariableDeclarationAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				varDeclarAssign();
				}
				break;
			case 3:
				_localctx = new ForInitPartAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				assign();
				}
				break;
			case 4:
				_localctx = new ForInitPartVariableMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				variableMulDivModAddSubAssign();
				}
				break;
			case 5:
				_localctx = new ForInitPartFieldAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				fieldAssign();
				}
				break;
			case 6:
				_localctx = new ForInitPartFieldMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				fieldMulDivModAddSubAssign();
				}
				break;
			case 7:
				_localctx = new ForInitPartArrayMemberAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				arrayMemberAssign();
				}
				break;
			case 8:
				_localctx = new ForInitPartArrayMemberMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				arrayMemberMulDivModAddSubAssign();
				}
				break;
			case 9:
				_localctx = new ForInitPartExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(317);
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
		enterRule(_localctx, 42, RULE_forUpdate);
		int _la;
		try {
			_localctx = new ForUpdatePartsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			forUpdatePart();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(321);
				match(T__35);
				setState(322);
				forUpdatePart();
				}
				}
				setState(327);
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
	public static class ForUpdatePartArrayMemberAssignmentContext extends ForUpdatePartContext {
		public ArrayMemberAssignContext arrayMemberAssign() {
			return getRuleContext(ArrayMemberAssignContext.class,0);
		}
		public ForUpdatePartArrayMemberAssignmentContext(ForUpdatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdatePartArrayMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdatePartArrayMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdatePartArrayMemberAssignment(this);
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
		enterRule(_localctx, 44, RULE_forUpdatePart);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ForUpdatePartAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				assign();
				}
				break;
			case 2:
				_localctx = new ForUpdatePartVariableMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				variableMulDivModAddSubAssign();
				}
				break;
			case 3:
				_localctx = new ForUpdatePartFieldAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				fieldAssign();
				}
				break;
			case 4:
				_localctx = new ForUpdatePartFieldMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				fieldMulDivModAddSubAssign();
				}
				break;
			case 5:
				_localctx = new ForUpdatePartArrayMemberAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				arrayMemberAssign();
				}
				break;
			case 6:
				_localctx = new ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				arrayMemberMulDivModAddSubAssign();
				}
				break;
			case 7:
				_localctx = new ForUpdatePartExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
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
	public static class FieldDecrementExpressionContext extends ExpressionContext {
		public ExpressionContext fieldHaver;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldDecrementExpression(this);
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
	public static class FieldIncrementExpressionContext extends ExpressionContext {
		public ExpressionContext fieldHaver;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldIncrementExpression(this);
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
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMulDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMulDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMulDivModExpression(this);
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
	public static class IdDecrementExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAddSubExpression(this);
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
	public static class TrueExpressionContext extends ExpressionContext {
		public TrueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTrueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTrueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext leftSide;
		public Token op;
		public ExpressionContext rightSide;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext fieldHaver;
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
	public static class IdIncrementExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMemberIncrementExpressionContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayMemberIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayMemberIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayMemberIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayMemberIncrementExpression(this);
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
	public static class FalseExpressionContext extends ExpressionContext {
		public FalseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFalseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFalseExpression(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(338);
				match(T__6);
				setState(339);
				expression(0);
				setState(340);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new NewIntArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(T__36);
				setState(343);
				match(T__15);
				setState(344);
				match(T__8);
				setState(345);
				expression(0);
				setState(346);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new NewObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(T__36);
				setState(349);
				match(ID);
				setState(350);
				match(T__6);
				setState(351);
				match(T__10);
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				match(T__40);
				setState(353);
				expression(14);
				}
				break;
			case 5:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(T__34);
				setState(355);
				expression(13);
				}
				break;
			case 6:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				match(T__49);
				}
				break;
			case 7:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new IdIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(358);
					match(ID);
					setState(359);
					match(T__37);
					}
					break;
				case T__37:
					{
					setState(360);
					match(T__37);
					setState(361);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				_localctx = new IdDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(364);
					match(ID);
					setState(365);
					match(T__39);
					}
					break;
				case T__39:
					{
					setState(366);
					match(T__39);
					setState(367);
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
				setState(370);
				match(INTEGER);
				}
				break;
			case 11:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371);
				match(T__50);
				}
				break;
			case 12:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(372);
				match(T__51);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivModExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(376);
						((MulDivModExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((MulDivModExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(377);
						((MulDivModExpressionContext)_localctx).rightSide = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(378);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(379);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(380);
						((AddSubExpressionContext)_localctx).rightSide = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(381);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(382);
						((CompareExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
							((CompareExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(383);
						((CompareExpressionContext)_localctx).rightSide = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(385);
						((AndExpressionContext)_localctx).op = match(T__47);
						setState(386);
						((AndExpressionContext)_localctx).rightSide = expression(10);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).leftSide = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(388);
						((OrExpressionContext)_localctx).op = match(T__48);
						setState(389);
						((OrExpressionContext)_localctx).rightSide = expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ArrayMemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayMemberExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(391);
						match(T__8);
						setState(392);
						((ArrayMemberExpressionContext)_localctx).index = expression(0);
						setState(393);
						match(T__9);
						}
						break;
					case 7:
						{
						_localctx = new ArrayMemberIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayMemberIncrementExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(396);
						match(T__8);
						setState(397);
						((ArrayMemberIncrementExpressionContext)_localctx).index = expression(0);
						setState(398);
						match(T__9);
						setState(399);
						match(T__37);
						}
						break;
					case 8:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayLengthExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(402);
						match(T__26);
						setState(403);
						match(T__38);
						}
						break;
					case 9:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FieldExpressionContext)_localctx).fieldHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(405);
						match(T__26);
						setState(406);
						match(ID);
						}
						break;
					case 10:
						{
						_localctx = new FieldIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FieldIncrementExpressionContext)_localctx).fieldHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(407);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(408);
						match(T__26);
						setState(409);
						match(ID);
						setState(410);
						match(T__37);
						}
						break;
					case 11:
						{
						_localctx = new FieldDecrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FieldDecrementExpressionContext)_localctx).fieldHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(412);
						match(T__26);
						setState(413);
						match(ID);
						setState(414);
						match(T__39);
						}
						break;
					case 12:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MethodCallExpressionContext)_localctx).fieldHaver = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(416);
						match(T__26);
						setState(417);
						match(ID);
						setState(418);
						match(T__6);
						setState(419);
						argumentList();
						setState(420);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			_localctx = new ArgumentListDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID) | (1L << INTEGER))) != 0)) {
				{
				setState(427);
				expression(0);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(428);
					match(T__14);
					setState(429);
					expression(0);
					}
					}
					setState(434);
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
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\5\3?\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3"+
		"\16\3S\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6q\n\6"+
		"\f\6\16\6t\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\177\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\3\b\3\t\3\t\3"+
		"\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\5\t\u0096\n\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\7\f\u00a5\n\f\f\f\16\f"+
		"\u00a8\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f"+
		"\3\f\3\f\5\f\u00c9\n\f\3\f\3\f\5\f\u00cd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0100\n\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u0133\n\25\f\25\16\25\u0136\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0141\n\26\3\27\3\27\3\27\7\27\u0146\n\27\f"+
		"\27\16\27\u0149\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0152\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016d"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u0173\n\31\3\31\3\31\3\31\5\31\u0178\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\7\31\u01a9\n\31\f\31\16\31\u01ac\13\31\3"+
		"\32\3\32\3\32\7\32\u01b1\n\32\f\32\16\32\u01b4\13\32\5\32\u01b6\n\32\3"+
		"\32\2\3\60\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2"+
		"\6\3\2!%\3\2!#\3\2$%\3\2,\61\2\u01ef\2\64\3\2\2\2\4>\3\2\2\2\6W\3\2\2"+
		"\2\bf\3\2\2\2\ni\3\2\2\2\fw\3\2\2\2\16{\3\2\2\2\20\u0095\3\2\2\2\22\u0097"+
		"\3\2\2\2\24\u00a0\3\2\2\2\26\u00ff\3\2\2\2\30\u0101\3\2\2\2\32\u0104\3"+
		"\2\2\2\34\u0109\3\2\2\2\36\u010d\3\2\2\2 \u0112\3\2\2\2\"\u0119\3\2\2"+
		"\2$\u0120\3\2\2\2&\u0127\3\2\2\2(\u012f\3\2\2\2*\u0140\3\2\2\2,\u0142"+
		"\3\2\2\2.\u0151\3\2\2\2\60\u0177\3\2\2\2\62\u01b5\3\2\2\2\648\5\4\3\2"+
		"\65\67\5\6\4\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2"+
		"\2:8\3\2\2\2;<\7\2\2\3<\3\3\2\2\2=?\7\3\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2"+
		"\2\2@A\7\4\2\2AB\7\67\2\2BC\7\5\2\2CD\7\3\2\2DE\7\6\2\2EF\7\7\2\2FG\7"+
		"\b\2\2GH\7\t\2\2HI\7\n\2\2IJ\7\13\2\2JK\7\f\2\2KL\7\67\2\2LM\7\r\2\2M"+
		"Q\7\5\2\2NP\5\26\f\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2"+
		"SQ\3\2\2\2TU\7\16\2\2UV\7\16\2\2V\5\3\2\2\2WX\7\4\2\2X[\7\67\2\2YZ\7\17"+
		"\2\2Z\\\7\67\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\5\2\2^_\5\b\5\2_"+
		"`\7\16\2\2`\7\3\2\2\2ae\5\f\7\2be\5\n\6\2ce\5\16\b\2da\3\2\2\2db\3\2\2"+
		"\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2ij\7\3"+
		"\2\2jk\7\67\2\2kl\7\t\2\2lm\5\20\t\2mn\7\r\2\2nr\7\5\2\2oq\5\26\f\2po"+
		"\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\16\2\2"+
		"v\13\3\2\2\2wx\5\24\13\2xy\7\67\2\2yz\7\20\2\2z\r\3\2\2\2{~\7\3\2\2|\177"+
		"\5\24\13\2}\177\7\7\2\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\7\67\2\2\u0081\u0082\7\t\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\r\2\2"+
		"\u0084\u0088\7\5\2\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7\16\2\2\u008c\17\3\2\2\2\u008d\u0092\5\22"+
		"\n\2\u008e\u008f\7\21\2\2\u008f\u0091\5\22\n\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\21\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\67\2\2\u0099\23\3\2\2"+
		"\2\u009a\u009b\7\22\2\2\u009b\u009c\7\13\2\2\u009c\u00a1\7\f\2\2\u009d"+
		"\u00a1\7\23\2\2\u009e\u00a1\7\22\2\2\u009f\u00a1\7\67\2\2\u00a0\u009a"+
		"\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a6\7\5\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a3\3\2\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u0100\7\16\2\2\u00aa\u00ab\7\24\2\2"+
		"\u00ab\u00ac\7\t\2\2\u00ac\u00ad\5\60\31\2\u00ad\u00ae\7\r\2\2\u00ae\u00b1"+
		"\5\26\f\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00af\3\2\2"+
		"\2\u00b1\u00b2\3\2\2\2\u00b2\u0100\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4"+
		"\u00b5\7\t\2\2\u00b5\u00b6\5\60\31\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\5"+
		"\26\f\2\u00b8\u0100\3\2\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bb\5\26\f\2"+
		"\u00bb\u00bc\7\26\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\5\60\31\2\u00be"+
		"\u00bf\7\r\2\2\u00bf\u00c0\7\20\2\2\u00c0\u0100\3\2\2\2\u00c1\u00c2\7"+
		"\30\2\2\u00c2\u00c4\7\t\2\2\u00c3\u00c5\5(\25\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7\20\2\2\u00c7\u00c9\5"+
		"\60\31\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\7\20\2\2\u00cb\u00cd\5,\27\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\r\2\2\u00cf\u0100\5\26\f\2\u00d0"+
		"\u00d1\7\31\2\2\u00d1\u0100\7\20\2\2\u00d2\u00d3\7\32\2\2\u00d3\u0100"+
		"\7\20\2\2\u00d4\u00d5\7\33\2\2\u00d5\u0100\7\20\2\2\u00d6\u00d7\7\33\2"+
		"\2\u00d7\u00d8\5\60\31\2\u00d8\u00d9\7\20\2\2\u00d9\u0100\3\2\2\2\u00da"+
		"\u00db\5\30\r\2\u00db\u00dc\7\20\2\2\u00dc\u0100\3\2\2\2\u00dd\u00de\5"+
		"\32\16\2\u00de\u00df\7\20\2\2\u00df\u0100\3\2\2\2\u00e0\u00e1\5\34\17"+
		"\2\u00e1\u00e2\7\20\2\2\u00e2\u0100\3\2\2\2\u00e3\u00e4\5 \21\2\u00e4"+
		"\u00e5\7\20\2\2\u00e5\u0100\3\2\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7"+
		"\20\2\2\u00e8\u0100\3\2\2\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\7\20\2\2"+
		"\u00eb\u0100\3\2\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\7\20\2\2\u00ee\u0100"+
		"\3\2\2\2\u00ef\u00f0\5&\24\2\u00f0\u00f1\7\20\2\2\u00f1\u0100\3\2\2\2"+
		"\u00f2\u00f3\5\60\31\2\u00f3\u00f4\7\20\2\2\u00f4\u0100\3\2\2\2\u00f5"+
		"\u00f6\7\34\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8\7\36\2\2\u00f8\u00f9"+
		"\7\35\2\2\u00f9\u00fa\7\37\2\2\u00fa\u00fb\7\t\2\2\u00fb\u00fc\5\60\31"+
		"\2\u00fc\u00fd\7\r\2\2\u00fd\u00fe\7\20\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00a2\3\2\2\2\u00ff\u00aa\3\2\2\2\u00ff\u00b3\3\2\2\2\u00ff\u00b9\3\2"+
		"\2\2\u00ff\u00c1\3\2\2\2\u00ff\u00d0\3\2\2\2\u00ff\u00d2\3\2\2\2\u00ff"+
		"\u00d4\3\2\2\2\u00ff\u00d6\3\2\2\2\u00ff\u00da\3\2\2\2\u00ff\u00dd\3\2"+
		"\2\2\u00ff\u00e0\3\2\2\2\u00ff\u00e3\3\2\2\2\u00ff\u00e6\3\2\2\2\u00ff"+
		"\u00e9\3\2\2\2\u00ff\u00ec\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f2\3\2"+
		"\2\2\u00ff\u00f5\3\2\2\2\u0100\27\3\2\2\2\u0101\u0102\5\24\13\2\u0102"+
		"\u0103\7\67\2\2\u0103\31\3\2\2\2\u0104\u0105\5\24\13\2\u0105\u0106\7\67"+
		"\2\2\u0106\u0107\7 \2\2\u0107\u0108\5\60\31\2\u0108\33\3\2\2\2\u0109\u010a"+
		"\7\67\2\2\u010a\u010b\7 \2\2\u010b\u010c\5\60\31\2\u010c\35\3\2\2\2\u010d"+
		"\u010e\7\67\2\2\u010e\u010f\t\2\2\2\u010f\u0110\7 \2\2\u0110\u0111\5\60"+
		"\31\2\u0111\37\3\2\2\2\u0112\u0113\5\60\31\2\u0113\u0114\7\35\2\2\u0114"+
		"\u0115\7\67\2\2\u0115\u0116\7 \2\2\u0116\u0117\5\60\31\2\u0117\u0118\7"+
		"\20\2\2\u0118!\3\2\2\2\u0119\u011a\5\60\31\2\u011a\u011b\7\35\2\2\u011b"+
		"\u011c\7\67\2\2\u011c\u011d\t\2\2\2\u011d\u011e\7 \2\2\u011e\u011f\5\60"+
		"\31\2\u011f#\3\2\2\2\u0120\u0121\5\60\31\2\u0121\u0122\7\13\2\2\u0122"+
		"\u0123\5\60\31\2\u0123\u0124\7\f\2\2\u0124\u0125\7 \2\2\u0125\u0126\5"+
		"\60\31\2\u0126%\3\2\2\2\u0127\u0128\5\60\31\2\u0128\u0129\7\13\2\2\u0129"+
		"\u012a\5\60\31\2\u012a\u012b\7\f\2\2\u012b\u012c\t\2\2\2\u012c\u012d\7"+
		" \2\2\u012d\u012e\5\60\31\2\u012e\'\3\2\2\2\u012f\u0134\5*\26\2\u0130"+
		"\u0131\7&\2\2\u0131\u0133\5*\26\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135)\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0141\5\30\r\2\u0138\u0141\5\32\16\2\u0139\u0141\5\34\17"+
		"\2\u013a\u0141\5\36\20\2\u013b\u0141\5 \21\2\u013c\u0141\5\"\22\2\u013d"+
		"\u0141\5$\23\2\u013e\u0141\5&\24\2\u013f\u0141\5\60\31\2\u0140\u0137\3"+
		"\2\2\2\u0140\u0138\3\2\2\2\u0140\u0139\3\2\2\2\u0140\u013a\3\2\2\2\u0140"+
		"\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u013f\3\2\2\2\u0141+\3\2\2\2\u0142\u0147\5.\30\2\u0143\u0144"+
		"\7&\2\2\u0144\u0146\5.\30\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148-\3\2\2\2\u0149\u0147\3\2\2\2"+
		"\u014a\u0152\5\34\17\2\u014b\u0152\5\36\20\2\u014c\u0152\5 \21\2\u014d"+
		"\u0152\5\"\22\2\u014e\u0152\5$\23\2\u014f\u0152\5&\24\2\u0150\u0152\5"+
		"\60\31\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014c\3\2\2\2\u0151"+
		"\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2"+
		"\2\2\u0152/\3\2\2\2\u0153\u0154\b\31\1\2\u0154\u0155\7\t\2\2\u0155\u0156"+
		"\5\60\31\2\u0156\u0157\7\r\2\2\u0157\u0178\3\2\2\2\u0158\u0159\7\'\2\2"+
		"\u0159\u015a\7\22\2\2\u015a\u015b\7\13\2\2\u015b\u015c\5\60\31\2\u015c"+
		"\u015d\7\f\2\2\u015d\u0178\3\2\2\2\u015e\u015f\7\'\2\2\u015f\u0160\7\67"+
		"\2\2\u0160\u0161\7\t\2\2\u0161\u0178\7\r\2\2\u0162\u0163\7+\2\2\u0163"+
		"\u0178\5\60\31\20\u0164\u0165\7%\2\2\u0165\u0178\5\60\31\17\u0166\u0178"+
		"\7\64\2\2\u0167\u0178\7\67\2\2\u0168\u0169\7\67\2\2\u0169\u016d\7(\2\2"+
		"\u016a\u016b\7(\2\2\u016b\u016d\7\67\2\2\u016c\u0168\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u0178\3\2\2\2\u016e\u016f\7\67\2\2\u016f\u0173\7*\2\2\u0170"+
		"\u0171\7*\2\2\u0171\u0173\7\67\2\2\u0172\u016e\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0178\3\2\2\2\u0174\u0178\78\2\2\u0175\u0178\7\65\2\2\u0176"+
		"\u0178\7\66\2\2\u0177\u0153\3\2\2\2\u0177\u0158\3\2\2\2\u0177\u015e\3"+
		"\2\2\2\u0177\u0162\3\2\2\2\u0177\u0164\3\2\2\2\u0177\u0166\3\2\2\2\u0177"+
		"\u0167\3\2\2\2\u0177\u016c\3\2\2\2\u0177\u0172\3\2\2\2\u0177\u0174\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u01aa\3\2\2\2\u0179"+
		"\u017a\f\16\2\2\u017a\u017b\t\3\2\2\u017b\u01a9\5\60\31\17\u017c\u017d"+
		"\f\r\2\2\u017d\u017e\t\4\2\2\u017e\u01a9\5\60\31\16\u017f\u0180\f\f\2"+
		"\2\u0180\u0181\t\5\2\2\u0181\u01a9\5\60\31\r\u0182\u0183\f\13\2\2\u0183"+
		"\u0184\7\62\2\2\u0184\u01a9\5\60\31\f\u0185\u0186\f\n\2\2\u0186\u0187"+
		"\7\63\2\2\u0187\u01a9\5\60\31\13\u0188\u0189\f\27\2\2\u0189\u018a\7\13"+
		"\2\2\u018a\u018b\5\60\31\2\u018b\u018c\7\f\2\2\u018c\u01a9\3\2\2\2\u018d"+
		"\u018e\f\26\2\2\u018e\u018f\7\13\2\2\u018f\u0190\5\60\31\2\u0190\u0191"+
		"\7\f\2\2\u0191\u0192\7(\2\2\u0192\u01a9\3\2\2\2\u0193\u0194\f\25\2\2\u0194"+
		"\u0195\7\35\2\2\u0195\u01a9\7)\2\2\u0196\u0197\f\24\2\2\u0197\u0198\7"+
		"\35\2\2\u0198\u01a9\7\67\2\2\u0199\u019a\f\23\2\2\u019a\u019b\7\35\2\2"+
		"\u019b\u019c\7\67\2\2\u019c\u01a9\7(\2\2\u019d\u019e\f\22\2\2\u019e\u019f"+
		"\7\35\2\2\u019f\u01a0\7\67\2\2\u01a0\u01a9\7*\2\2\u01a1\u01a2\f\21\2\2"+
		"\u01a2\u01a3\7\35\2\2\u01a3\u01a4\7\67\2\2\u01a4\u01a5\7\t\2\2\u01a5\u01a6"+
		"\5\62\32\2\u01a6\u01a7\7\r\2\2\u01a7\u01a9\3\2\2\2\u01a8\u0179\3\2\2\2"+
		"\u01a8\u017c\3\2\2\2\u01a8\u017f\3\2\2\2\u01a8\u0182\3\2\2\2\u01a8\u0185"+
		"\3\2\2\2\u01a8\u0188\3\2\2\2\u01a8\u018d\3\2\2\2\u01a8\u0193\3\2\2\2\u01a8"+
		"\u0196\3\2\2\2\u01a8\u0199\3\2\2\2\u01a8\u019d\3\2\2\2\u01a8\u01a1\3\2"+
		"\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\61\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b2\5\60\31\2\u01ae\u01af\7\21"+
		"\2\2\u01af\u01b1\5\60\31\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01ad\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\63\3\2\2\2\378>Q[d"+
		"fr~\u0088\u0092\u0095\u00a0\u00a6\u00b1\u00c4\u00c8\u00cc\u00ff\u0134"+
		"\u0140\u0147\u0151\u016c\u0172\u0177\u01a8\u01aa\u01b2\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}