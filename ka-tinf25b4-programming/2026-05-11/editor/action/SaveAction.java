package editor.action;

import editor.Editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SaveAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Editor.getInstance().save();
        } catch (IOException _) {}
    }
}
