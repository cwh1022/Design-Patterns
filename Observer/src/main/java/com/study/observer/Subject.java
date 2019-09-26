package com.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/9/26
 *
 * @author connor.chen
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notify_() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
