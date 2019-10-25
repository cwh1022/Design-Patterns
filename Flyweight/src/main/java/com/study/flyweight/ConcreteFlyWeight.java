package com.study.flyweight;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteFlyWeight extends FlyWeight {
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate);
    }
}
