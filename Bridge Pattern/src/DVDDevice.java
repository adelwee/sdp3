public class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD Player is turned ON");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is turned OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player channel is not supporting " );
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD Player volume set to " + volume);
    }
}