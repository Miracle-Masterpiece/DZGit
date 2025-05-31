package task1;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Начато воспроизведение музыки");
    }

    @Override
    public void stop() {
        System.out.println("Музыка остановлена");
    }
}
