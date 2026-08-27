package trafficlight;

public class LightPhase {
    private final String name;
    private final boolean red;
    private final boolean yellow;
    private final boolean green;
    private final int duration;
    private LightPhase next;

    public LightPhase(String name, boolean red, boolean yellow, boolean green, int duration) {
        this.name = name;
        this.red = red;
        this.yellow = yellow;
        this.green = green;
        this.duration = duration;
    }

    public String getName() {
        return this.name;
    }

    public boolean isRed() {
        return this.red;
    }

    public boolean isYellow() {
        return this.yellow;
    }

    public boolean isGreen() {
        return this.green;
    }

    public int getDuration() {
        return this.duration;
    }

    public LightPhase getNext() {
        return this.next;
    }

    public void setNext(LightPhase next) {
        this.next = next;
    }
}
