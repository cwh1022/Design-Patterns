package com.study.observer;

/**
 * Created on 2019/9/26
 *
 * @author connor.chen
 */
public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("X", s));
        s.attach(new ConcreteObserver("Y", s));
        s.attach(new ConcreteObserver("Z", s));
        s.setSubjectState("ABC");
        s.notify_();
    }
}
