package com.study.decorator;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class DecoratorMain {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();

    }
}
