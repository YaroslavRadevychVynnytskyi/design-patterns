package patterns.behavioral.state.state;

import patterns.behavioral.state.context.AudioPlayer;

public class PlayingState implements State {
    @Override
    public void play(AudioPlayer player) {
        System.out.println("Player is already playing.");
    }

    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Pausing playback...");
        player.changeState(new PausedState());
    }

    @Override
    public void stop(AudioPlayer player) {
        System.out.println("Stopping playback...");
        player.changeState(new StoppedState());
    }
}
