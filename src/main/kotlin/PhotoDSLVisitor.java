// Generated from C:/Users/annak/IdeaProjects/PhotoDoc/src/main/antlr/PhotoDSL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PhotoDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PhotoDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PhotoDSLParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#photoSession}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhotoSession(PhotoDSLParser.PhotoSessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(PhotoDSLParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PhotoDSLParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#photoCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhotoCommand(PhotoDSLParser.PhotoCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#cameraCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCameraCommand(PhotoDSLParser.CameraCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#filmCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilmCommand(PhotoDSLParser.FilmCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#settingsCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsCommand(PhotoDSLParser.SettingsCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#photoDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhotoDetails(PhotoDSLParser.PhotoDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#exposureCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExposureCommand(PhotoDSLParser.ExposureCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#apertureCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApertureCommand(PhotoDSLParser.ApertureCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhotoDSLParser#isoCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsoCommand(PhotoDSLParser.IsoCommandContext ctx);
}