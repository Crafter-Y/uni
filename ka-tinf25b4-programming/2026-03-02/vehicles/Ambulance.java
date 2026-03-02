package vehicles;

public class Ambulance extends Car {
    private boolean signalOn = false;

    public Ambulance (double speed, boolean signalOn) {
        super(speed);
        this.signalOn = signalOn;
    }

    public void enableSirene() {
        this.signalOn = true;
    }

    public void disableSirene() {
        this.signalOn = false;
    }
    
    public String toString() {
        return super.toString() + " Signal " + (signalOn ? "on" : "off");
    }
}
