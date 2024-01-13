// Generated from C:/Users/annak/IdeaProjects/PhotoDoc/src/main/antlr/PhotoDSL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PhotoDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING_LITERAL=15, FLOAT_LITERAL=16, 
		INT_LITERAL=17;
	public static final int
		RULE_start = 0, RULE_photoSession = 1, RULE_commands = 2, RULE_command = 3, 
		RULE_photoCommand = 4, RULE_cameraCommand = 5, RULE_filmCommand = 6, RULE_settingsCommand = 7, 
		RULE_photoDetails = 8, RULE_exposureCommand = 9, RULE_apertureCommand = 10, 
		RULE_isoCommand = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "photoSession", "commands", "command", "photoCommand", "cameraCommand", 
			"filmCommand", "settingsCommand", "photoDetails", "exposureCommand", 
			"apertureCommand", "isoCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'photoSession'", "'{'", "'}'", "';'", "'photo'", "'camera'", "'film'", 
			"'settings'", "'date'", "'time'", "'location'", "'exposureTime'", "'aperture'", 
			"'iso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING_LITERAL", "FLOAT_LITERAL", "INT_LITERAL"
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
	public String getGrammarFileName() { return "PhotoDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PhotoDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public PhotoSessionContext photoSession() {
			return getRuleContext(PhotoSessionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			photoSession();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PhotoSessionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PhotoDSLParser.STRING_LITERAL, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public PhotoSessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_photoSession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterPhotoSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitPhotoSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitPhotoSession(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhotoSessionContext photoSession() throws RecognitionException {
		PhotoSessionContext _localctx = new PhotoSessionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_photoSession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(STRING_LITERAL);
			setState(28);
			match(T__1);
			setState(29);
			commands();
			setState(30);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) {
				{
				{
				setState(32);
				command();
				setState(33);
				match(T__3);
				}
				}
				setState(39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public PhotoCommandContext photoCommand() {
			return getRuleContext(PhotoCommandContext.class,0);
		}
		public CameraCommandContext cameraCommand() {
			return getRuleContext(CameraCommandContext.class,0);
		}
		public FilmCommandContext filmCommand() {
			return getRuleContext(FilmCommandContext.class,0);
		}
		public SettingsCommandContext settingsCommand() {
			return getRuleContext(SettingsCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				photoCommand();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				cameraCommand();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				filmCommand();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				settingsCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PhotoCommandContext extends ParserRuleContext {
		public PhotoDetailsContext photoDetails() {
			return getRuleContext(PhotoDetailsContext.class,0);
		}
		public PhotoCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_photoCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterPhotoCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitPhotoCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitPhotoCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhotoCommandContext photoCommand() throws RecognitionException {
		PhotoCommandContext _localctx = new PhotoCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_photoCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			setState(47);
			match(T__1);
			setState(48);
			photoDetails();
			setState(49);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CameraCommandContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PhotoDSLParser.STRING_LITERAL, 0); }
		public CameraCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cameraCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterCameraCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitCameraCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitCameraCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CameraCommandContext cameraCommand() throws RecognitionException {
		CameraCommandContext _localctx = new CameraCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cameraCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__5);
			setState(52);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilmCommandContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PhotoDSLParser.STRING_LITERAL, 0); }
		public IsoCommandContext isoCommand() {
			return getRuleContext(IsoCommandContext.class,0);
		}
		public FilmCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filmCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterFilmCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitFilmCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitFilmCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilmCommandContext filmCommand() throws RecognitionException {
		FilmCommandContext _localctx = new FilmCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filmCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
			setState(55);
			match(STRING_LITERAL);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(56);
				isoCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SettingsCommandContext extends ParserRuleContext {
		public ExposureCommandContext exposureCommand() {
			return getRuleContext(ExposureCommandContext.class,0);
		}
		public ApertureCommandContext apertureCommand() {
			return getRuleContext(ApertureCommandContext.class,0);
		}
		public SettingsCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterSettingsCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitSettingsCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitSettingsCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsCommandContext settingsCommand() throws RecognitionException {
		SettingsCommandContext _localctx = new SettingsCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_settingsCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__7);
			setState(60);
			match(T__1);
			setState(61);
			exposureCommand();
			setState(62);
			apertureCommand();
			setState(63);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PhotoDetailsContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(PhotoDSLParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(PhotoDSLParser.STRING_LITERAL, i);
		}
		public PhotoDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_photoDetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterPhotoDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitPhotoDetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitPhotoDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhotoDetailsContext photoDetails() throws RecognitionException {
		PhotoDetailsContext _localctx = new PhotoDetailsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_photoDetails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
			match(STRING_LITERAL);
			setState(67);
			match(T__9);
			setState(68);
			match(STRING_LITERAL);
			setState(69);
			match(T__10);
			setState(70);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExposureCommandContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(PhotoDSLParser.FLOAT_LITERAL, 0); }
		public ExposureCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exposureCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterExposureCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitExposureCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitExposureCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExposureCommandContext exposureCommand() throws RecognitionException {
		ExposureCommandContext _localctx = new ExposureCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exposureCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__11);
			setState(73);
			match(FLOAT_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApertureCommandContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(PhotoDSLParser.FLOAT_LITERAL, 0); }
		public ApertureCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apertureCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterApertureCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitApertureCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitApertureCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApertureCommandContext apertureCommand() throws RecognitionException {
		ApertureCommandContext _localctx = new ApertureCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_apertureCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__12);
			setState(76);
			match(FLOAT_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IsoCommandContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(PhotoDSLParser.INT_LITERAL, 0); }
		public IsoCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isoCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).enterIsoCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhotoDSLListener ) ((PhotoDSLListener)listener).exitIsoCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhotoDSLVisitor ) return ((PhotoDSLVisitor<? extends T>)visitor).visitIsoCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsoCommandContext isoCommand() throws RecognitionException {
		IsoCommandContext _localctx = new IsoCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_isoCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__13);
			setState(79);
			match(INT_LITERAL);
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
		"\u0004\u0001\u0011R\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002$\b"+
		"\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003-\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006:\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000J\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004"+
		"%\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b.\u0001\u0000"+
		"\u0000\u0000\n3\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e"+
		";\u0001\u0000\u0000\u0000\u0010A\u0001\u0000\u0000\u0000\u0012H\u0001"+
		"\u0000\u0000\u0000\u0014K\u0001\u0000\u0000\u0000\u0016N\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005\u000f\u0000"+
		"\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001e\u0003\u0004\u0002"+
		"\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f\u0003\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0006\u0003\u0000!\"\u0005\u0004\u0000\u0000\"$\u0001\u0000"+
		"\u0000\u0000# \u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000(-\u0003\b\u0004\u0000)-\u0003\n\u0005"+
		"\u0000*-\u0003\f\u0006\u0000+-\u0003\u000e\u0007\u0000,(\u0001\u0000\u0000"+
		"\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000"+
		"\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005\u0005\u0000\u0000"+
		"/0\u0005\u0002\u0000\u000001\u0003\u0010\b\u000012\u0005\u0003\u0000\u0000"+
		"2\t\u0001\u0000\u0000\u000034\u0005\u0006\u0000\u000045\u0005\u000f\u0000"+
		"\u00005\u000b\u0001\u0000\u0000\u000067\u0005\u0007\u0000\u000079\u0005"+
		"\u000f\u0000\u00008:\u0003\u0016\u000b\u000098\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\b\u0000"+
		"\u0000<=\u0005\u0002\u0000\u0000=>\u0003\u0012\t\u0000>?\u0003\u0014\n"+
		"\u0000?@\u0005\u0003\u0000\u0000@\u000f\u0001\u0000\u0000\u0000AB\u0005"+
		"\t\u0000\u0000BC\u0005\u000f\u0000\u0000CD\u0005\n\u0000\u0000DE\u0005"+
		"\u000f\u0000\u0000EF\u0005\u000b\u0000\u0000FG\u0005\u000f\u0000\u0000"+
		"G\u0011\u0001\u0000\u0000\u0000HI\u0005\f\u0000\u0000IJ\u0005\u0010\u0000"+
		"\u0000J\u0013\u0001\u0000\u0000\u0000KL\u0005\r\u0000\u0000LM\u0005\u0010"+
		"\u0000\u0000M\u0015\u0001\u0000\u0000\u0000NO\u0005\u000e\u0000\u0000"+
		"OP\u0005\u0011\u0000\u0000P\u0017\u0001\u0000\u0000\u0000\u0003%,9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}