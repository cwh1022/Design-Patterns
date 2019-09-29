package com.study.state;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        this.state.handle(this);
    }
}
