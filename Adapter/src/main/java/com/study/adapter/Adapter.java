package com.study.adapter;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
