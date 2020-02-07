import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    public static List<String> readFile(String file) throws IOException {
        List<String> lines;
        lines = Files.readAllLines(Paths.get(file));

        return lines;
    }
}
