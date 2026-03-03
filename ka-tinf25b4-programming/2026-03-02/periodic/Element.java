package periodic;

public class Element {
    private String name;
    private String symbol;
    private int ordinal;
    private char shell;
    private int phase;
    private boolean mainGroup;

    public Element(String name, String symbol, int ordinal, char shell, int phase, boolean mainGroup) {
        this.name = name;
        this.symbol = symbol;
        this.ordinal = ordinal;
        this.shell = shell;
        setPhase(phase);
        this.mainGroup = mainGroup;
    }

    public boolean equals(Object o) {
        return o instanceof Element && ((Element) o).ordinal == this.ordinal;
    }

    public String toString() {
        return String.format(
            "%s (%s, %d) Schale: %c, %s, Gruppe: %s", 
            name,
            symbol,
            ordinal,
            shell,
            phase == 1 ? "fest" : phase == 2 ? "flüssig" : "gas",
            mainGroup ? "Hauptgruppe" : "Nebengruppe"
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public char getShell() {
        return shell;
    }

    public void setShell(char shell) {
        this.shell = shell;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = Math.clamp(phase, 1, 3);
    }

    public boolean isMainGroup() {
        return mainGroup;
    }

    public void setMainGroup(boolean mainGroup) {
        this.mainGroup = mainGroup;
    }
}
