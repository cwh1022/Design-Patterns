package com.study.memento;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMementu());

        originator.setState("off");
        originator.show();

        originator.setMementu(caretaker.getMemento());
        originator.show();
    }
}
