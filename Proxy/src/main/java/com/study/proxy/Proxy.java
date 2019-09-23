package com.study.proxy;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
