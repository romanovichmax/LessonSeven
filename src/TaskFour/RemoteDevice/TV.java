package TaskFour.RemoteDevice;

public class TV extends TVDevice {
    private int chanel = 1;
    private int volume = 1;

    public TV(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println(modelName + " TV is ON");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println(modelName + " TV is OFF");
    }

    @Override
    public void setChannel(int chanel) {
        this.chanel = chanel;
        System.out.println("Setting chanel to: " + chanel);
    }

    @Override
    public void currentChannel() {
        System.out.println("Current chanel: " + chanel);
    }

    @Override
    public void upVolume() {
        if (volume == 10) {
            System.out.println("Maximum volume");
        } else {
            volume++;
            System.out.println("The volume is up to " + volume);
        }
    }

    @Override
    public void downVolume() {
        if (volume == 0) {
            System.out.println("Volume is muted");
        } else {
            volume--;
            System.out.println("The volume is down to " + volume);
        }
    }

    @Override
    public void mute() {
        volume = 0;
        System.out.println(modelName + " TV is muted");
    }
}
