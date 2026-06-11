package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Election extends JComponent {
    private static final Party[] PARTIES = {
            new Party("SPD", 16.4, new Color(238, 46, 0)),
            new Party("Union", 28.6, Color.BLACK),
            new Party("Grüne", 11.6, new Color(111, 255, 28)),
            new Party("FDP", 4.3, new Color(255, 255, 40)),
            new Party("AfD", 20.8, new Color(38, 0, 255)),
            new Party("Linke", 8.8, new Color(220, 35, 235)),
            new Party("SSW", 0.2, new Color(20, 20, 150)),
            new Party("Andere", 9.4, new Color(65, 62, 62))
    };

    private static final String TITLE = "BUNDESTAGSWAHL 2025";
    private static final DecimalFormat PERCENT_FORMAT =
            new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.GERMANY));

    private static final Color BACKGROUND = new Color(135, 170, 207);
    private static final Color HEADER = new Color(36, 73, 130);
    private static final Color BASE_LINE = new Color(70, 111, 176);
    private static final Color GRID = new Color(205, 222, 238);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Wahl");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new Election());
            frame.setSize(760, 570);
            frame.setMinimumSize(new Dimension(520, 360));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Graphics2D g = (Graphics2D) graphics.create();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        g.setColor(BACKGROUND);
        g.fillRect(0, 0, w, h);

        int headerH = Math.max(36, h / 14);
        int partyLabelH = Math.max(32, h / 12);
        int valueRowH = Math.max(32, h / 15);
        int chartTop = headerH;
        int chartBottom = h - partyLabelH - valueRowH;
        int chartH = chartBottom - chartTop;

        drawHeader(g, w, headerH);
        drawGrid(g, w, chartTop, chartBottom, chartH);
        drawBars(g, w, chartTop, chartBottom, chartH);
        drawFooter(g, w, chartBottom, partyLabelH, valueRowH);

        g.dispose();
    }

    private static void drawHeader(Graphics2D g, int w, int headerH) {
        g.setColor(HEADER);
        g.fillRect(0, 0, w, headerH);

        Font font = new Font("SansSerif", Font.BOLD, Math.max(16, headerH / 2));
        g.setFont(font);
        g.setColor(Color.WHITE);

        FontMetrics fm = g.getFontMetrics();
        int y = (headerH - fm.getHeight()) / 2 + fm.getAscent();

        g.drawString(TITLE, 14, y);

        String right = "in %";
        int rightWidth = fm.stringWidth(right);
        g.drawString(right, w - rightWidth - 12, y);
    }

    private static void drawGrid(Graphics2D g, int w, int chartTop, int chartBottom, int chartH) {
        g.setColor(GRID);

        for (int i = 1; i <= 2; i++) {
            int y = chartBottom - i * chartH / 3;
            g.drawLine(0, y, w, y);
        }

        g.setColor(BASE_LINE);
        g.setStroke(new BasicStroke(10f));
        g.drawLine(0, chartBottom, w, chartBottom);
        g.setStroke(new BasicStroke(1f));
    }

    private static void drawBars(Graphics2D g, int w, int chartTop, int chartBottom, int chartH) {
        double max = maxPercent();
        double scaleMax = niceUpperBound(max);

        int slotW = w / PARTIES.length;
        int barW = Math.max(18, (int) (slotW * 0.72));

        for (int i = 0; i < PARTIES.length; i++) {
            Party party = PARTIES[i];

            int barH = Math.max(1, (int) Math.round(party.percent / scaleMax * (chartH - 24)));
            int x = i * slotW + (slotW - barW) / 2;
            int y = chartBottom - barH;

            g.setColor(new Color(0, 0, 0, 60));
            g.fillRect(x + 4, y - 2, barW, barH + 2);

            g.setColor(party.color);
            g.fillRect(x, y, barW, barH);

            g.setColor(new Color(255, 255, 255, 85));
            g.drawLine(x + 1, y, x + barW - 2, y);

            g.setColor(new Color(0, 0, 0, 110));
            g.drawRect(x, y, barW, barH);
        }
    }

    private static void drawFooter(Graphics2D g, int w, int chartBottom, int partyLabelH, int valueRowH) {
        int partyY = chartBottom;
        int valueY = chartBottom + partyLabelH;

        g.setColor(Color.WHITE);
        g.fillRect(0, partyY, w, partyLabelH);

        g.setColor(BACKGROUND);
        g.fillRect(0, valueY, w, valueRowH);

        g.setColor(BASE_LINE);
        g.drawLine(0, valueY, w, valueY);
        g.drawLine(0, valueY + valueRowH - 1, w, valueY + valueRowH - 1);

        int slotW = w / PARTIES.length;

        Font partyFont = new Font("SansSerif", Font.BOLD, Math.max(13, partyLabelH / 2));
        Font valueFont = new Font("SansSerif", Font.BOLD, Math.max(13, valueRowH / 2));

        for (int i = 0; i < PARTIES.length; i++) {
            Party party = PARTIES[i];

            int x = i * slotW;
            int slotCenter = x + slotW / 2;

            g.setColor(Color.BLACK);
            g.setFont(partyFont);
            drawCentered(g, party.name, slotCenter, partyY, partyLabelH);

            g.setFont(valueFont);
            drawCentered(g, PERCENT_FORMAT.format(party.percent), slotCenter, valueY, valueRowH);
        }
    }

    private static void drawCentered(Graphics2D g, String text, int centerX, int topY, int height) {
        FontMetrics fm = g.getFontMetrics();
        Rectangle2D bounds = fm.getStringBounds(text, g);

        int x = centerX - (int) Math.round(bounds.getWidth() / 2.0);
        int y = topY + (height - fm.getHeight()) / 2 + fm.getAscent();

        g.drawString(text, x, y);
    }

    private static double maxPercent() {
        double max = 0.0;
        for (Party party : PARTIES) {
            max = Math.max(max, party.percent);
        }
        return max;
    }

    private static double niceUpperBound(double max) {
        if (max <= 0) {
            return 1;
        }

        double raw = max * 1.04;
        if (raw <= 10) return 10;
        if (raw <= 20) return 20;
        if (raw <= 30) return 30;
        if (raw <= 40) return 40;
        if (raw <= 50) return 50;
        if (raw <= 60) return 60;
        if (raw <= 80) return 80;
        return 100;
    }

    private record Party(String name, double percent, Color color) {
    }
}