package task1;

public class VideoPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Начато воспроизведение видео");
    }

    @Override
    public void stop() {
        System.out.println("Видео остановлено");
    }
}
