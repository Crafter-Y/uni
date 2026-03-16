package game;

public class Board {
    private final Field[] fields = new Field[63];
    
    public Board() {
        int idx = 0;

        for (int i = 1; i <= 20; i++) {
            this.fields[idx] = new Field(i + "", i, false);
            this.fields[idx + 1] = new Field("D" + i, i*2, true);
            this.fields[idx + 2] = new Field("T" + i, i*3, false);
            idx+=3;
        }
        this.fields[60] = new Field("25", 25, false);
        this.fields[61] = new Field("BULL", 50, true);
        this.fields[62] = new Field("x", 0, false);
    }

    public Field parseField(String label) {
        for (int i = 0; i < this.fields.length; i++) {
            if (this.fields[i].getLabel().equalsIgnoreCase(label)) return this.fields[i];
        }

        return null;
    }
}
