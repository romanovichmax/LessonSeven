package TaskFour.RemoteDevice;

public class TV extends TVDevice {
    int chanel = 1;

    public TV() {
        modelName = "Samsung";
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("TV is ON");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("TV is OFF");

    }

    @Override
    public void setChannel(int chanel) {
        this.chanel = chanel;
        System.out.println("Setting chanel to: " + chanel);
    }

    @Override
    public void currentChannel() {
        System.out.println("Current Chanel: " + chanel);
    }

    @Override
    public void upVolume() {
        System.out.println("The volume is up");

    }

    @Override
    public void downVolume() {
        System.out.println("The volume is down");
    }

    @Override
    public void mute() {
        System.out.println("TV is muted");
    }
}
