package com.study.strategy;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */

/**
 * Context， 用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口，根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}
