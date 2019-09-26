package com.study.observer;

/**
 * Created on 2019/9/26
 *
 * @author connor.chen
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        String subjectState = concreteSubject.getSubjectState();
        System.out.println("观察者:"+ name + " 的状态是:" + subjectState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}
