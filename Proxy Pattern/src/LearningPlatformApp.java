public class LearningPlatformApp {
    public static void main(String[] args) {
        VideoLecture video1 = new ProxyVideoLecture("Design Patterns in Java");
        VideoLecture video2 = new ProxyVideoLecture("Data Structures and Algorithms");

        System.out.println(video1.getInfo());
        video1.play();

        System.out.println(video2.getInfo());
        video2.play();
    }
}
