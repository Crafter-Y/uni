package editor;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Editor extends JFrame {
//    private String content = null;
    private final JTextPane container;
    private Path file;
    private static Editor instance;

    public Editor() {
        instance = this;
        EditorMenuBar.MenuBar menuBar = EditorMenuBar.getMenuBar();
        this.setJMenuBar(menuBar);

        this.container = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(this.container);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);

        this.initialize();
    }

    public static Editor getInstance() {
        return instance;
    }

    public void openFile(Path file) throws IOException {
        this.file = file;
        if (file != null) {
            container.setText(Files.readString(file));
            this.setTitle(file.toFile().getName());
            EditorMenuBar.saveButton.setEnabled(true);
        } else {
            container.setText("");
            this.setTitle("New File");
            EditorMenuBar.saveButton.setEnabled(false);
        }

        container.setCaretPosition(0);
    }

    public void save() throws IOException {
        Files.writeString(this.file, this.container.getText());
    }

    private void initialize() {
        this.setTitle("New File");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(640, 480);
        this.setVisible(true);
    }

    public static void main() {
        new Editor();
    }
}
