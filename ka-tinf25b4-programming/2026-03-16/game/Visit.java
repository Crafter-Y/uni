package game;

public class Visit {
    private final Field[] fields;

    public Visit(Field[] fields) {
        if (fields.length > 3) throw new IllegalArgumentException();

        this.fields = fields;
    }

    public Field[] getFields() {
        return this.fields;
    }

    public int getValue() {
        int sum = 0;

        for (Field field : this.fields) {
            sum += field.getValue();
        }

        return sum;
    }

    public Field getLastField() {
        return this.fields[this.fields.length - 1];
    }
}
