package com.study.observer;

/**
 * Created on 2019/9/26
 *
 * @author connor.chen
 */
public class ConcreteSubject extends Subject {
    /**
     * 被观察者的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
