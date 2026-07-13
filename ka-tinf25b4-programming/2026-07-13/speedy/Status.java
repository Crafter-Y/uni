package speedy;

import java.awt.*;

public enum Status {
    ACTIVE(Color.ORANGE, 0, "aktuell gestellte Frage"),
    CORRECT(Color.GREEN, 1, "richtig beantwortete Frage"),
    WRONG(Color.RED, -1 , "falsch beantwortete Frage"),
    PENDING(Color.WHITE, 0, "noch nicht gespielte/ausstehende Frage"),
    NO_ANSWER(Color.GRAY, 0, "Frage auf die ein anderer Spieler geantwortet hat");

    private final Color color;
    private final int points;
    private final String description;

    Status(Color color, int points, String description) {
        this.color = color;
        this.points = points;
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public String getDescription() {
        return description;
    }
}
