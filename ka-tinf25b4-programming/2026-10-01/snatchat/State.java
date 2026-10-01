package snatchat;

public enum State {
    AVAILABLE("Available"),
    AWAY("Away"),
    DHD("Do not disturb");

    private final String label;

    State(String label) {
        this.label = label;
    }
}
