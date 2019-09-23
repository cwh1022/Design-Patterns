package com.study.decorator;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        this.addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
