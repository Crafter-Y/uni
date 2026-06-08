package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ClickRectFiller extends JFrame {
    public ClickRectFiller() {
        JPanel layout = new JPanel();
        layout.setLayout(new BoxLayout(layout, BoxLayout.X_AXIS));
        layout.add(new FillableRect());
        layout.add(new FillableRect());
        layout.add(new FillableRect());

        this.add(layout);
        this.setTitle("Shape Exercise");
        this.setResizable(false);
        //this.pack();
        this.setSize(220, 150);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private static class FillableRect extends JComponent {
        private final Color color;
        private boolean filled = false;

        public FillableRect() {
            Random rand = new Random();
            this.color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));

            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    FillableRect.this.filled = !FillableRect.this.filled;
                    FillableRect.this.repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(new Color(0,0,0));
            g.drawRect(10, 10, 50, 30);
            g.setColor(this.color);

            if (filled) g.fillRect(10,10,50, 30);
        }
    }

    public static void main() {
        new ClickRectFiller();
    }
}
