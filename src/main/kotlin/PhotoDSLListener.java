// Generated from C:/Users/annak/IdeaProjects/PhotoDoc/src/main/antlr/PhotoDSL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PhotoDSLParser}.
 */
public interface PhotoDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PhotoDSLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PhotoDSLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#photoSession}.
	 * @param ctx the parse tree
	 */
	void enterPhotoSession(PhotoDSLParser.PhotoSessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#photoSession}.
	 * @param ctx the parse tree
	 */
	void exitPhotoSession(PhotoDSLParser.PhotoSessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(PhotoDSLParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(PhotoDSLParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PhotoDSLParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PhotoDSLParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#photoCommand}.
	 * @param ctx the parse tree
	 */
	void enterPhotoCommand(PhotoDSLParser.PhotoCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#photoCommand}.
	 * @param ctx the parse tree
	 */
	void exitPhotoCommand(PhotoDSLParser.PhotoCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#cameraCommand}.
	 * @param ctx the parse tree
	 */
	void enterCameraCommand(PhotoDSLParser.CameraCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#cameraCommand}.
	 * @param ctx the parse tree
	 */
	void exitCameraCommand(PhotoDSLParser.CameraCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#filmCommand}.
	 * @param ctx the parse tree
	 */
	void enterFilmCommand(PhotoDSLParser.FilmCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#filmCommand}.
	 * @param ctx the parse tree
	 */
	void exitFilmCommand(PhotoDSLParser.FilmCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#settingsCommand}.
	 * @param ctx the parse tree
	 */
	void enterSettingsCommand(PhotoDSLParser.SettingsCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#settingsCommand}.
	 * @param ctx the parse tree
	 */
	void exitSettingsCommand(PhotoDSLParser.SettingsCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#photoDetails}.
	 * @param ctx the parse tree
	 */
	void enterPhotoDetails(PhotoDSLParser.PhotoDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#photoDetails}.
	 * @param ctx the parse tree
	 */
	void exitPhotoDetails(PhotoDSLParser.PhotoDetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#exposureCommand}.
	 * @param ctx the parse tree
	 */
	void enterExposureCommand(PhotoDSLParser.ExposureCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#exposureCommand}.
	 * @param ctx the parse tree
	 */
	void exitExposureCommand(PhotoDSLParser.ExposureCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#apertureCommand}.
	 * @param ctx the parse tree
	 */
	void enterApertureCommand(PhotoDSLParser.ApertureCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#apertureCommand}.
	 * @param ctx the parse tree
	 */
	void exitApertureCommand(PhotoDSLParser.ApertureCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhotoDSLParser#isoCommand}.
	 * @param ctx the parse tree
	 */
	void enterIsoCommand(PhotoDSLParser.IsoCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhotoDSLParser#isoCommand}.
	 * @param ctx the parse tree
	 */
	void exitIsoCommand(PhotoDSLParser.IsoCommandContext ctx);
}