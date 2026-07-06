package chorona;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ChoronaTerminal extends JFrame {
    private final Variant variant;
    private final Room room;

    private final JLabel stepCounter;
    private final List<CellButton> cells = new ArrayList<>();

    public ChoronaTerminal(Variant variant, Room room) {
        this.variant = variant;
        this.room = room;

        JPanel vertical = new JPanel();

        vertical.setLayout(new BoxLayout(vertical, BoxLayout.Y_AXIS));

        JPanel topRow = new JPanel();
        this.stepCounter = new JLabel();
        topRow.add(this.stepCounter);
        this.updateStepCounter();

        vertical.add(topRow);

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(room.getSetting().getHeight(), room.getSetting().getWidth(), 0, 0));

        for (int y = 0; y < room.getSetting().getHeight(); y++) {
            for (int x = 0; x < room.getSetting().getWidth(); x++) {
                boolean polluter = room.getSetting().getPollutants().contains(new Point(x,y));
                CellButton btn = new CellButton(0, polluter);
                cells.add(btn);
                grid.add(btn);
            }
        }
        this.updateDoses();

        vertical.add(grid);

        JPanel btnGrid = new JPanel();
        btnGrid.setLayout(new GridLayout(1, 3, 3, 0));

        JButton stepButton = new JButton("Step");

        stepButton.addActionListener(_ -> {
            this.room.step();
            this.updateDoses();
            this.updateStepCounter();
        });

        btnGrid.add(stepButton);

        JButton playButton = new JButton("Play");

        playButton.addActionListener(_ -> {
            playButton.setEnabled(false);
            stepButton.setEnabled(false);
            new Thread(() -> {
                for (int i = 0; i < 20; i++) {
                    this.room.step();
                    this.updateDoses();
                    this.updateStepCounter();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                playButton.setEnabled(true);
                stepButton.setEnabled(true);
            }).start();
        });

        btnGrid.add(playButton);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(_ -> save());
        btnGrid.add(saveButton);

        vertical.add(btnGrid);

        this.add(vertical);

        this.pack();
        this.setResizable(false);

        this.setTitle(String.format("Chorona - %s (%s)", variant.getLabel(), variant.getDesignation()));

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void updateStepCounter() {
        this.stepCounter.setText("Steps: " + this.room.getSteps());
    }

    private void updateDoses() {
        int width = room.getSetting().getWidth();
        for (int y = 0; y < room.getSetting().getHeight(); y++) {
            for (int x = 0; x < width; x++) {
                this.cells.get(x+ y*width).setDose(room.getDose(x,y));
            }
        }
    }

    private void save() {
        String filename = String.format("%s-%d-%d-%d-%d.txt",
                this.variant.name(),
                this.room.getSetting().getHeight(),
                this.room.getSetting().getWidth(),
                this.room.getSetting().getPollutants().size(),
                this.room.getSteps()
        );

        try {
            StringBuilder sb = new StringBuilder();

            int width = room.getSetting().getWidth();
            for (int y = 0; y < room.getSetting().getHeight(); y++) {
                for (int x = 0; x < room.getSetting().getWidth(); x++) {
                    CellButton btn = this.cells.get(x+ y*width);
                    sb.append(x).append(";").append(y).append(";").append(btn.getDose()).append("\n");
                }
            }

            Files.writeString(Paths.get("./" + filename), sb, StandardOpenOption.CREATE);

            JOptionPane.showMessageDialog(null, filename + " saved successfully", "Meldung", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception _) {
            JOptionPane.showMessageDialog(null, filename + " not saved successfully", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
