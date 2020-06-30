package TaskThree;

public class MyDevice implements Volume, State {

    @Override
    public void on() {
        System.out.println("Device is ON");
    }

    @Override
    public void off() {
        System.out.println("Device is OFF");
    }

    @Override
    public void changeVolume(double value) {
        System.out.println("Volume changed to " + value);

    }
}
