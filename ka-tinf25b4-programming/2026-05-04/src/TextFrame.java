package src;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFrame extends JFrame {

    public TextFrame(String pathName, int height, int width) throws IOException {
        Path path = Paths.get(pathName);
        String contents = Files.readString(path);

        this.add(new JTextArea(contents));

        this.setTitle(pathName);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main (String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: TextFrame <File> <height> <width>");
            return;
        }

        try {
            int height = Integer.parseInt(args[1]);
            int width = Integer.parseInt(args[2]);

            new TextFrame(args[0], height, width);
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format (Skill issue): " + e.getMessage());
        }
    }
}
