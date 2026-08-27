package dancingtext;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DancingText extends JFrame {
    static class TextPanel extends JPanel {
        private final String text = "Dancing Text :-)";
        private final Random random = new Random();
        private final int[] offsets = new int[this.text.length()];
        private final Color[] colors = new Color[this.text.length()];

        public TextPanel() {
            this.setBackground(Color.WHITE);
            for (int i = 0; i < this.text.length(); i++) {
                this.colors[i] = Color.GREEN;
            }
        }

        public void dance() {
            for (int i = 0; i < this.text.length(); i++) {
                this.offsets[i] = this.random.nextInt(41) - 20;
                this.colors[i] = new Color(this.random.nextInt(200), this.random.nextInt(200), this.random.nextInt(200));
            }
            this.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 40));
            int x = 20;
            for (int i = 0; i < this.text.length(); i++) {
                g.setColor(this.colors[i]);
                g.drawString(String.valueOf(this.text.charAt(i)), x, this.getHeight() / 2 + this.offsets[i]);
                x += g.getFontMetrics().charWidth(this.text.charAt(i));
            }
        }
    }

    public DancingText() {
        TextPanel panel = new TextPanel();
        this.add(panel);

        this.setSize(600, 250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Dancing Text");
        this.setVisible(true);

        new Thread(() -> {
            while (true) {
                panel.dance();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }).start();
    }

    public static void main() {
        new DancingText();
    }
}
