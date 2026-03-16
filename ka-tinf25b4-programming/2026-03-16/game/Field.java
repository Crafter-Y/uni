package game;

public class Field {
    private final String label;
    private final int value;
    private final boolean doubleField;

    public Field(String label, int value, boolean doubleField) {
        this.label = label;
        this.value = value;
        this.doubleField = doubleField;
    }   
    
    public String getLabel() {
        return this.label;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isDoubleField() {
        return this.doubleField;
    }
}
