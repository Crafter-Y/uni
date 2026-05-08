package race;

public abstract class Vehicle {
    private int wheels = 0;
    private double vMax = 0;
    private double position = 0;
    private double speed = 0;

    protected abstract String getSpecificInfo();

    public Vehicle (double speed, int wheels, double vMax) {
        this.wheels = wheels;
        this.vMax = vMax;
        setSpeed(speed);
    }

    public void info() {
        System.out.println(getSpecificInfo());
        System.out.println(this.toString());
    }

    private void setSpeed(double speed) {
        this.speed = Math.min(speed, this.vMax);
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
