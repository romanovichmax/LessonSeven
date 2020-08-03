package TaskFour.RemoteDevice;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Samsung");
        RemoteController remoteController = new RemoteController(tv);
        remoteController.powerOn();
        remoteController.setChannel(10);
        remoteController.currentChannel();
        remoteController.upVolume();
        remoteController.downVolume();
        remoteController.mute();
        remoteController.setChannel(4);
        remoteController.currentChannel();
        remoteController.upVolume();
        remoteController.powerOff();
    }
}
