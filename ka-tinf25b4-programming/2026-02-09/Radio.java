class Radio {
    private boolean turnedOn;
    private int volume;
    private double frequency;

    public Radio() {
        this.turnedOn = false;
        this.volume = 5;
        this.frequency = 85;
    }

    public Radio(boolean turnedOn, int volume, double frequency) {
        this.turnedOn = turnedOn;
        this.volume = volume % 10;
        setFrequency(frequency);
    }

    public void incVolume() {
        if (this.volume == 10) return;
        this.volume++;
    }

    public void decVolume() {
        if (this.volume == 0) return;
        this.volume--;
    }

    public void turnOn() {
        this.turnedOn = true;
    }

    public void turnOff() {
        this.turnedOn = false;
    }

    public void setFrequency(double frequency) {
        if (frequency <= 85 || frequency >= 110) {
            this.frequency = 99.9;
        } else {
            this.frequency = frequency;
        }
    }
    
    public String toString() {
        String state = this.turnedOn ? "an" : "aus";
        return String.format("Radio %s; Lautstärke %d; Frequenz %.1f MHz", state, this.volume ,this.frequency);
    }

    static void main() {
        Radio radio = new Radio(false, 7, 93.5);
        System.out.println(radio);
        radio.turnOn();
        System.out.println(radio);
        radio.incVolume(); radio.incVolume();
        System.out.println(radio);
        radio.incVolume();
        radio.incVolume();
        System.out.println(radio);
        radio.decVolume();
        System.out.println(radio);
        radio.setFrequency(97.8);
        System.out.println(radio);
        radio.setFrequency(112.7);
        System.out.println(radio);
        radio.turnOff();
        System.out.println(radio);
    }
}
