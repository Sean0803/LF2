package Utils;

import javafx.scene.media.MediaPlayer;

public class Music {
    public static void startLoopMusic(MediaPlayer mp) {
        try {
            new Thread(() -> {
                mp.setCycleCount(MediaPlayer.INDEFINITE);
                mp.play();
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startEffectMusic(MediaPlayer mp) {
        try {
            new Thread(() -> {
                mp.setCycleCount(1);
                mp.play();
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopLoopMusic(MediaPlayer mp) {
        if (mp != null) {
            mp.stop();
        }
    }
}
