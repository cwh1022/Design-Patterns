package com.study.bridge;

/**
 * Created on 2019/10/23
 *
 * @author connor.chen
 */
public class BridgeMain {
    public static void main(String[] args) {
        RefinedAbstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementOrA());
        ab.operation();
        ab.setImplementor(new ConcreteImplementOrB());
        ab.operation();
    }
}
