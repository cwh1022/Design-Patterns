package com.study.flyweight;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class UnSharedConcreteFlyWeight extends FlyWeight {

    public void operation(int extrinsicstate) {
        System.out.println("不具体共享的Flyweight：" + extrinsicstate);
    }
}
