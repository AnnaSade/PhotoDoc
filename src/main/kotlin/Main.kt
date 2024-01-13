package gen
import PhotoDSLLexer
import PhotoDSLParser
import PhotoDSLBaseListener
//import PhotoDSLBaseVisitor
import org.antlr.v4.runtime.ANTLRInputStream

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream


fun main() {
    val input = """
       
        photoSession "Session1" {
            camera "Canon AE-1"
            film "Kodak Tri-X"
            iso 400
            settings {
                exposureTime 1/125
                aperture f/4
            }
        }
        
        photoSession "Session2" {
            camera "Nikon FM"
            film "Ilford HP5"
            iso 800
            settings {
                exposureTime 1/250
                aperture f/8
            }
        }
    """

    val inputStream: CharStream = ANTLRInputStream(input)
    val lexer = PhotoDSLLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = PhotoDSLParser(tokens)


    val customListener = CustomPhotoDSLListener()
    parser.addParseListener(customListener)

    // Parse startet die Verarbeitung der DSL
    parser.photoSession()

    // Hier kannst du auf die gespeicherten PhotoSessions zugreifen
    val photoSessions = customListener.getPhotoSessions()
    for (session in photoSessions) {
        println(session.toString())
    }
}

class CustomPhotoDSLListener : PhotoDSLBaseListener() {
    private val photoSessions = mutableListOf<PhotoSession>()

    private var currentSessionName = ""
    private var currentCamera = ""
    private var currentFilm = ""

    private var currentISO = 0
    private var currentExposureTime = 0.0
    private var currentAperture = ""

    override fun enterPhotoSession(ctx: PhotoDSLParser.PhotoSessionContext) {
        // Hier wird eine neue PhotoSession gestartet
        currentSessionName = ctx.STRING_LITERAL().text.replace("\"", "")
    }

    override fun exitPhotoSession(ctx: PhotoDSLParser.PhotoSessionContext) {
        // Hier wird die aktuelle PhotoSession beendet und zur Liste hinzugefügt
        val photoSession = PhotoSession(currentSessionName, currentCamera, currentFilm, currentISO, currentExposureTime, currentAperture)
        photoSessions.add(photoSession)
    }

    fun enterCamera(ctx: PhotoDSLParser.CameraCommandContext) {
        currentCamera = ctx.STRING_LITERAL().text
    }

    fun enterFilm(ctx: PhotoDSLParser.FilmCommandContext) {
        currentFilm = ctx.STRING_LITERAL().text
    }

    fun enterIso(ctx: PhotoDSLParser.IsoCommandContext) {
        currentISO = ctx.INT_LITERAL().text.toInt()
    }

    fun enterExposureTime(ctx: PhotoDSLParser.ExposureCommandContext) {
        currentExposureTime = ctx.FLOAT_LITERAL().text.toDouble()
    }

    fun enterAperture(ctx: PhotoDSLParser.ApertureCommandContext) {
        currentAperture = ctx.FLOAT_LITERAL().text
    }

    fun getPhotoSessions(): List<PhotoSession> = photoSessions
}

data class PhotoSession(val name: String, val camera: String, val film: String, val iso: Int, val exposureTime: Double, val aperture: String) {
    override fun toString(): String {
        return "PhotoSession(name='$name', camera='$camera', film='$film', iso=$iso, exposureTime=$exposureTime, aperture='$aperture')"
    }
}
