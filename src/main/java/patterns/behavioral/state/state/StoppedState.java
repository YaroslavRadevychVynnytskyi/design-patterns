package patterns.behavioral.state.state;

import patterns.behavioral.state.context.AudioPlayer;

public class StoppedState implements State {

    @Override
    public void play(AudioPlayer player) {
        System.out.println("Starting playback...");
        player.changeState(new PlayingState());
    }

    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Player is stopped. Can't pause");
    }

    @Override
    public void stop(AudioPlayer player) {
        System.out.println("Player is already stopped.");
    }

}
