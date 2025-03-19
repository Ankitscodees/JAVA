import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;

public class AsciiArtGenerator {
    public static void main(String[] args) throws IOException {
        String text = "HELLO";
        String asciiArt = FigletFont.convertOneLine(text);
        System.out.println(asciiArt);
    }
}
