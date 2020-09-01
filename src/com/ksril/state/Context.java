package com.ksril.state;

public class Context {
    private State currentState;

    public void handle1() {
        currentState.handle1();
    }

    public void handle2() {
        currentState.handle2();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
