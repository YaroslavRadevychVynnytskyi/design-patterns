package patterns.behavioral.state.context;

import patterns.behavioral.state.state.State;
import patterns.behavioral.state.state.StoppedState;

public class AudioPlayer {
    private State currentState;

    public AudioPlayer() {
        this.currentState = new StoppedState();
    }

    public void changeState(State newState) {
        this.currentState = newState;
    }

    public void clickPlay() {
        System.out.println("Play button is pressed");
        currentState.play(this);
    }

    public void clickPause() {
        System.out.println("Pause button is pressed");
        currentState.pause(this);
    }

    public void clickStop() {
        System.out.println("Stop button is pressed");
        currentState.stop(this);
    }
}
