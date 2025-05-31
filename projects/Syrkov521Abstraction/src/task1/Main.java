package task1;

public class Main {

    public static void testMediaPlayer(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.stop();
    }

    public static void main(String[] args) {
        testMediaPlayer(new AudioPlayer());
        System.out.println();
        testMediaPlayer(new VideoPlayer());
    }
}