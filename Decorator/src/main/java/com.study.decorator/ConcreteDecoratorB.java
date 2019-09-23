package com.study.decorator;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象B的操作");
    }
}
