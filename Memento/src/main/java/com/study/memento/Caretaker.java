package com.study.memento;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
