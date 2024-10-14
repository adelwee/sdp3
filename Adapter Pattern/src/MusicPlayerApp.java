public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "song1.mp3");
        mp3Player.play("wav", "song2.wav");

        AudioPlayer audioAdapter = new AudioAdapter("wav");
        audioAdapter.play("wav", "song2.wav");

        audioAdapter = new AudioAdapter("aac");
        audioAdapter.play("aac", "song3.aac");
    }
}
