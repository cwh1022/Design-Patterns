package com.study.strategy;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class StrategyMain {
    public static void main(String[] args) {
        Context context = null;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
