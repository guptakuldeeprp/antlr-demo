// Generated from Icinga.g4 by ANTLR 4.4

    package com.zycus.antlr.icinga;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcingaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ICINGA_OBJ_TYPE=17, OBJECT=18, TEMPLATE=19, APPLY=20, VAR=21, STRING=22, 
		TEXT=23, WS=24, NUMBER=25, COMMENT=26, BLOCKCOMMENT=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'true'", "'CheckCommand'", "'['", "'{'", "']'", "'='", "'}'", 
		"'Host'", "'Notification'", "'null'", "'User'", "'Service'", "','", "'import'", 
		"'Zone'", "'false'", "ICINGA_OBJ_TYPE", "'object'", "'template'", "'apply'", 
		"VAR", "STRING", "TEXT", "WS", "NUMBER", "'//'", "BLOCKCOMMENT"
	};
	public static final int
		RULE_icingaObj = 0, RULE_objType = 1, RULE_obj = 2, RULE_pair = 3, RULE_array = 4, 
		RULE_value = 5;
	public static final String[] ruleNames = {
		"icingaObj", "objType", "obj", "pair", "array", "value"
	};

	@Override
	public String getGrammarFileName() { return "Icinga.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IcingaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IcingaObjContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(IcingaParser.OBJECT, 0); }
		public TerminalNode TEMPLATE() { return getToken(IcingaParser.TEMPLATE, 0); }
		public TerminalNode STRING() { return getToken(IcingaParser.STRING, 0); }
		public IcingaObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icingaObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterIcingaObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitIcingaObj(this);
		}
	}

	public final IcingaObjContext icingaObj() throws RecognitionException {
		IcingaObjContext _localctx = new IcingaObjContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_icingaObj);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); match(OBJECT);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(13); match(TEMPLATE);
				setState(14); objType();
				setState(15); match(STRING);
				setState(16); obj();
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

	public static class ObjTypeContext extends ParserRuleContext {
		public ObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitObjType(this);
		}
	}

	public final ObjTypeContext objType() throws RecognitionException {
		ObjTypeContext _localctx = new ObjTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(IcingaParser.STRING, i);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(IcingaParser.STRING); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(T__12);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(23); match(T__2);
				setState(24); match(STRING);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(30); pair();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); match(T__9);
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

	public static class PairContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VAR() { return getToken(IcingaParser.VAR, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(VAR);
			setState(39); match(T__10);
			setState(40); value();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); match(T__13);
				setState(43); value();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(44); match(T__3);
					setState(45); value();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51); match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(T__13);
				setState(54); match(T__11);
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

	public static class ValueContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode STRING() { return getToken(IcingaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(IcingaParser.NUMBER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IcingaListener ) ((IcingaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(NUMBER);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); obj();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(60); array();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(T__15);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(62); match(T__0);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(63); match(T__6);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\4\3\4\3\4\7\4\34\n\4\f\4\16\4\37\13\4\3\4\7\4\"\n\4\f\4\16"+
		"\4%\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\3\6\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7C\n\7\3"+
		"\7\2\2\b\2\4\6\b\n\f\2\3\6\2\4\4\n\13\r\16\21\21I\2\24\3\2\2\2\4\26\3"+
		"\2\2\2\6\30\3\2\2\2\b(\3\2\2\2\n9\3\2\2\2\fB\3\2\2\2\16\25\7\24\2\2\17"+
		"\20\7\25\2\2\20\21\5\4\3\2\21\22\7\30\2\2\22\23\5\6\4\2\23\25\3\2\2\2"+
		"\24\16\3\2\2\2\24\17\3\2\2\2\25\3\3\2\2\2\26\27\t\2\2\2\27\5\3\2\2\2\30"+
		"\35\7\6\2\2\31\32\7\20\2\2\32\34\7\30\2\2\33\31\3\2\2\2\34\37\3\2\2\2"+
		"\35\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\b\5\2! \3"+
		"\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\t\2\2\'"+
		"\7\3\2\2\2()\7\27\2\2)*\7\b\2\2*+\5\f\7\2+\t\3\2\2\2,-\7\5\2\2-\62\5\f"+
		"\7\2./\7\17\2\2/\61\5\f\7\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\7\2\2\66:\3\2\2\2\678"+
		"\7\5\2\28:\7\7\2\29,\3\2\2\29\67\3\2\2\2:\13\3\2\2\2;C\7\30\2\2<C\7\33"+
		"\2\2=C\5\6\4\2>C\5\n\6\2?C\7\3\2\2@C\7\22\2\2AC\7\f\2\2B;\3\2\2\2B<\3"+
		"\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\r\3\2\2\2\b"+
		"\24\35#\629B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}