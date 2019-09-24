package com.study.factory.method;

/**
 * Created on 2019/9/24
 *
 * @author connor.chen
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng leiFeng = undergraduateFactory.createLeiFeng();
        leiFeng.buyRice();
    }
}
