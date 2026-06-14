package state.AbusePattern;

public class Stopwatch {
    private State currentState = new StoppedState(this);    //we set stopped state at first

    public void click(){
        currentState.click();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
