package race;

public class RacingCar extends Car {
    public RacingCar (double speed) {
        super(speed, 220);
    }

    @Override
    protected String getSpecificInfo() {
        return "This is a racing car";
    }


}
