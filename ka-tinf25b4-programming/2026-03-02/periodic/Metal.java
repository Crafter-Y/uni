package periodic;

public class Metal extends Element {
    private boolean metalloid;
    private double conductivity;

    public Metal(String name, String symbol, int ordinal, char shell, int phase, boolean mainGroup, boolean metalloid, double conductivity) {
        super(name, symbol, ordinal, shell, phase, mainGroup);
        
        this.metalloid = metalloid;
        this.conductivity = conductivity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        if (metalloid) {
            sb.append(", Halbleiter");
        }

        sb.append(", σ=").append(conductivity);

        return sb.toString();
    }

    public boolean isMetalloid() {
        return metalloid;
    }

    public void setMetalloid(boolean metalloid) {
        this.metalloid = metalloid;
    }

    public double getConductivity() {
        return conductivity;
    }

    public void setConductivity(double conductivity) {
        this.conductivity = conductivity;
    }
}
