package TaskFour.RemoteDevice;

public class RemoteController {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOn();
        tv.setChannel(5);
        tv.currentChannel();
        tv.upVolume();
        tv.downVolume();
        tv.mute();
        tv.powerOff();
    }
}
