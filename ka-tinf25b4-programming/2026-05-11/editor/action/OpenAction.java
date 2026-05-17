package editor.action;

import editor.Editor;
import viewer.TextfileViewer;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OpenAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
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
            try {
                Path path = Paths.get(fc.getSelectedFile().getAbsolutePath());
                if (!Files.exists(path) || !Files.isRegularFile(path)) {
                    throw new RuntimeException("Somehow a non-file got selected");
                }
                Editor.getInstance().openFile(path);
            } catch (Exception _) {

            }
        } else {
            // maybe implement logging
        }
    }
}
