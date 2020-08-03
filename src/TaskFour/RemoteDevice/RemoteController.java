package TaskFour.RemoteDevice;

public class RemoteController implements Volume, Device {

    private final TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    @Override
    public void powerOn() {
        tv.powerOn();
    }

    @Override
    public void powerOff() {
        tv.powerOff();
    }

    @Override
    public void setChannel(int chanel) {
        tv.setChannel(chanel);
    }

    @Override
    public void currentChannel() {
        tv.currentChannel();
    }

    @Override
    public void mute() {
        tv.mute();
    }

    @Override
    public void upVolume() {
        tv.upVolume();
    }

    @Override
    public void downVolume() {
        tv.downVolume();
    }
}