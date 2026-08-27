package trafficlight;

import javax.swing.*;
import java.awt.*;

public class TrafficLight extends JFrame {
    static class LightPanel extends JPanel {
        private LightPhase phase;

        public LightPanel(LightPhase phase) {
            this.phase = phase;
            this.setBackground(Color.BLACK);
        }

        public LightPhase getPhase() {
            return this.phase;
        }

        public void setPhase(LightPhase phase) {
            this.phase = phase;
            this.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.drawLamp(g, 20, this.phase.isRed() ? Color.RED : Color.WHITE);
            this.drawLamp(g, 110, this.phase.isYellow() ? Color.YELLOW : Color.WHITE);
            this.drawLamp(g, 200, this.phase.isGreen() ? Color.GREEN : Color.WHITE);
        }

        private void drawLamp(Graphics g, int y, Color color) {
            g.setColor(color);
            g.fillOval(20, y, 80, 80);
        }
    }

    public TrafficLight() {
        LightPhase red = new LightPhase("Rot", true, false, false, 3000);
        LightPhase redYellow = new LightPhase("Rot-Gelb", true, true, false, 1000);
        LightPhase green = new LightPhase("Grün", false, false, true, 3000);
        LightPhase yellow = new LightPhase("Gelb", false, true, false, 1000);

        red.setNext(redYellow);
        redYellow.setNext(green);
        green.setNext(yellow);
        yellow.setNext(red);

        LightPanel panel = new LightPanel(red);
        this.add(panel);

        this.setSize(140, 320);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Traffic Light");
        this.setVisible(true);

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(panel.getPhase().getDuration());
                } catch (InterruptedException e) {
                    return;
                }
                panel.setPhase(panel.getPhase().getNext());
            }
        }).start();
    }

    public static void main() {
        new TrafficLight();
    }
}
