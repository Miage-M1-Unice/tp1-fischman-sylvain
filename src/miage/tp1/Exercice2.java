package miage.tp1;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercice2 {
    private Path path;

    public Exercice2(Path path) {
        this.path = path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Path getPath() {
        return path;
    }
}
