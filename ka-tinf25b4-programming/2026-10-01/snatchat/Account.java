package snatchat;

import java.awt.*;
import java.util.Random;

public class Account {
    private final String name;
    private State state = State.AVAILABLE;
    private final Color color;

    public Account(String name) {
        Random random = new Random();
        this.name = name;
        this.color = new Color(random.nextInt(200),random.nextInt(200), random.nextInt(200));
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public Color getColor() {
        return color;
    }
}
