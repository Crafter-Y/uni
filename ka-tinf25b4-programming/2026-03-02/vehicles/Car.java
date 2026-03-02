package vehicles;

public class Car extends Vehicle {
    public Car (double speed) {
        super(speed, 4, 140);
    }

    public Car (double speed, double vMax) {
        super(speed, 4, vMax);
    }
}
