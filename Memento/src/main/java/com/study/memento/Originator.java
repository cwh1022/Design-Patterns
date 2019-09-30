package com.study.memento;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMementu(){
        return new Memento(this.state);
    }

    public void setMementu(Memento memento){
        this.state = memento.getState();
    }

    public void show(){
        System.out.println("State = " + state);
    }
}
