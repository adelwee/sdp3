public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        System.out.println("Advanced features activated");
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Mute device");
    }
}