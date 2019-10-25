package com.study.mediator;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
