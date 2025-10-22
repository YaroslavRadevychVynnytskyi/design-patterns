package patterns.behavioral.state.state;

import patterns.behavioral.state.context.AudioPlayer;

public class PausedState implements State {
    @Override
    public void play(AudioPlayer player) {
        System.out.println("Resuming playback...");
        player.changeState(new PlayingState());
    }

    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Player is already paused.");
    }

    @Override
    public void stop(AudioPlayer player) {
        System.out.println("Stopping playback...");
        player.changeState(new StoppedState());
    }
}
