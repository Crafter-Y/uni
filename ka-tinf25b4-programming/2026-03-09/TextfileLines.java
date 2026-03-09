import java.io.File;
import java.io.FileReader;
import java.io.IOException;

void main() throws IOException {
    try(FileReader reader = new FileReader(new File("./beispiel.txt"))) {
        List<String> lines = reader.readAllLines();

        StringBuilder combined = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            if (i >=1 && i <=4) {
                System.out.println(lines.get(i));
                combined.append(lines.get(i));
            }
        }
        System.out.println("Zeile 2-5: " + combined);
    }
}