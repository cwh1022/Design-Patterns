package com.study.flyweight;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class FlyWeightMain {
    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight fx = flyWeightFactory.getFlyWeight("X");
        fx.operation(--extrinsicstate);
        FlyWeight fy = flyWeightFactory.getFlyWeight("Y");
        fx.operation(--extrinsicstate);
        FlyWeight fz = flyWeightFactory.getFlyWeight("Z");
        fx.operation(--extrinsicstate);
        UnSharedConcreteFlyWeight unf = new UnSharedConcreteFlyWeight();
        unf.operation(--extrinsicstate);


    }

}
