package viewer;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TextfileViewer extends JFrame{
    public TextfileViewer (String pathString) throws IOException {
        Path path = Paths.get(pathString);
        String contents = Files.readString(path);

        String[] lines = contents.split("\n");

        if (lines.length <= 10) {
            this.setLayout(new GridLayout(lines.length, 1, 0, 3));
            for (String line : lines) {
                this.add(new JLabel(line));
            }
        } else {
            JTextArea textArea = new JTextArea(contents);
            JScrollPane scrollBar = new JScrollPane(textArea);
            scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            this.add(scrollBar);
        }

        this.pack();
        this.setTitle(pathString);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main() throws IOException {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() ||
                        f.getName().toLowerCase().endsWith(".txt");
            }
            @Override
            public String getDescription() {
                return "Text Files";
            }
        });
        int state = fc.showOpenDialog(null);
        if (state == JFileChooser.APPROVE_OPTION){
            new TextfileViewer(fc.getSelectedFile().getAbsolutePath());
        } else {
            System.out.println("No selection");
        }

    }
}
