package TaskThree;

public class Main {
    public static void main(String[] args) {
        MyDevice myDevice = new MyDevice();
        myDevice.on();
        myDevice.changeVolume(25.8);
        myDevice.changeVolume(15.3);
        myDevice.off();
    }
}
