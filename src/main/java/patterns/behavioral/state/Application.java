package patterns.behavioral.state;

import patterns.behavioral.state.context.AudioPlayer;

public class Application {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.clickPlay();
        player.clickPlay();
        player.clickPause();
        player.clickPlay();
        player.clickStop();
    }
}
