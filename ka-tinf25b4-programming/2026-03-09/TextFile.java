import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFile {
    private List<String> contents;
    private File file;

    private final class LineNumberOutOfBoundsException extends Exception {}

    public TextFile(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " not found");
        }
        this.file = file;
        read();
    }

    public TextFile(String pathname) throws IOException {
        this(new File(pathname));
    }

    public void read() throws IOException {
        try (FileReader reader = new FileReader(this.file)) {
            this.contents = reader.readAllLines();
        }
    }

    public void write() throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(this.file))) {
            for (String line : this.contents) {
                out.write(line);
                out.newLine();
            }
            out.flush();
        }
    }

    public int availableLines() {
        return this.contents.size();
    }

    public String[] getLines() {
        String[] strArr = new String[this.contents.size()];

        for (int i = 0; i < this.contents.size(); i++) {
            strArr[i] = this.contents.get(i);
        }
        return strArr;
    }

    public String getLine(int i) throws LineNumberOutOfBoundsException {
        try {
            return this.contents.get(i + 1);
        } catch (IndexOutOfBoundsException ex) {
            throw new LineNumberOutOfBoundsException();
        }
    }

    public void setLine(int i, String s) throws LineNumberOutOfBoundsException {
        if (i < 1 || i > this.contents.size()) {
            throw new LineNumberOutOfBoundsException();
        }

        this.contents.set(i, s);
    }

    public void replaceAll(String regexp, String ersatz) {
        List<String> newContents = new ArrayList<>();
        for (String line : this.contents) {
            line = line.replaceAll(regexp, ersatz);
            newContents.add(line);
        }

        this.contents = newContents;
    }

    public void close() {
        // nothing to do here.
    }

    public static void main(String[] args) throws IOException {
        TextFile file = new TextFile("./bla.txt");
        file.replaceAll("meine", "unsre");

        for (String string : file.getLines()) {
            System.out.println(string);
        }
    }
}

