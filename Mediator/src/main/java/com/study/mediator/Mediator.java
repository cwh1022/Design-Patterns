package com.study.mediator;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
