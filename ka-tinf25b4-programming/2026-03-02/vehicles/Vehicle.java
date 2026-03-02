package vehicles;

public class Vehicle {
    private int wheels = 0;
    private double vMax = 0;
    private double position = 0;
    private double speed = 0;

    public Vehicle (double speed, int wheels, double vMax) {
        this.wheels = wheels;
        this.vMax = vMax;
        setSpeed(speed);;
    }

    private void setSpeed(double speed) {
        if (speed > this.vMax) {
            this.speed = vMax;
        } else {
            this.speed = speed;
        }
    }

    public void drive(double minutes) {
        this.position += (minutes / 60d) * speed;
    }

    public String toString() {
        return String.format(
            "%s at position %.1f km with %d wheels at speed %.1f km/h of max. %.1f km/h.", 
            this.getClass().getSimpleName(),
            this.position,
            this.wheels,
            this.speed,
            this.vMax
        );
    }
}
