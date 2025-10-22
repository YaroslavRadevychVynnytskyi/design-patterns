package patterns.behavioral.state.state;

import patterns.behavioral.state.context.AudioPlayer;

public interface State {
    void play(AudioPlayer player);
    void pause(AudioPlayer player);
    void stop(AudioPlayer player);
}
