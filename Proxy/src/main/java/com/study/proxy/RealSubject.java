package com.study.proxy;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
