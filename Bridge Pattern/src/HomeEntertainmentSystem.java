public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.powerOn();
        basicRemote.setChannel(1);
        basicRemote.setVolume(15);
        basicRemote.powerOff();

        Device dvd = new DVDDevice();
        RemoteControl advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.powerOn();
        advancedRemote.setChannel(1);
        advancedRemote.setVolume(40);
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.powerOff();
    }
}
