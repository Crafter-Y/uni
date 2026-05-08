package race;

public class Bicycle extends Vehicle {
    public Bicycle (double speed) {
        super(speed, 2, 30);
    }

    @Override
    protected String getSpecificInfo() {
        return "This is a bicycle";
    }
}
