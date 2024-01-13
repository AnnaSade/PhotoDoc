package gen;
import PhotoDSLLexer
import PhotoDSLParser
import PhotoDSLBaseListener
import PhotoDSLBaseVisitor
//import org.antlr.v4.runtime.CharStreams
//import org.antlr.v4.runtime.CommonTokenStream

import org.antlr.v4.runtime.CharStreams
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

    val lexer = PhotoDSLLexer(CharStreams.fromString(input))
    val tokens = CommonTokenStream(lexer)
    val parser = PhotoDSLParser(tokens)

    val customListener = CustomPhotoDSLListener()
    parser.addParseListener(customListener)

    // Parse startet die Verarbeitung der DSL
    parser.photoSessions()

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
        currentSessionName = ctx.ID().text
    }

    override fun exitPhotoSession(ctx: PhotoDSLParser.PhotoSessionContext) {
        // Hier wird die aktuelle PhotoSession beendet und zur Liste hinzugefügt
        val photoSession = PhotoSession(currentSessionName, currentCamera, currentFilm, currentISO, currentExposureTime, currentAperture)
        photoSessions.add(photoSession)
    }

    override fun enterCamera(ctx: PhotoDSLParser.CameraContext) {
        currentCamera = ctx.STRING().text
    }

    override fun enterFilm(ctx: PhotoDSLParser.FilmContext) {
        currentFilm = ctx.STRING().text
    }

    override fun enterIso(ctx: PhotoDSLParser.IsoContext) {
        currentISO = ctx.INT().text.toInt()
    }

    override fun enterExposureTime(ctx: PhotoDSLParser.ExposureTimeContext) {
        currentExposureTime = ctx.RATIO().text.toDouble()
    }

    override fun enterAperture(ctx: PhotoDSLParser.ApertureContext) {
        currentAperture = ctx.STRING().text
    }

    fun getPhotoSessions(): List<PhotoSession> = photoSessions
}

data class PhotoSession(val name: String, val camera: String, val film: String, val iso: Int, val exposureTime: Double, val aperture: String) {
    override fun toString(): String {
        return "PhotoSession(name='$name', camera='$camera', film='$film', iso=$iso, exposureTime=$exposureTime, aperture='$aperture')"
    }
}



    fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}