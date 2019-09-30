package com.study.memento;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class Memento {
    private String state;

    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
