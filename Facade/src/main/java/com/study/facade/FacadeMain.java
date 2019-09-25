package com.study.facade;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */
public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
