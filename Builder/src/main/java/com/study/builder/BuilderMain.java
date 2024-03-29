package com.study.builder;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */
public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        director.construct(concreteBuilder1);
        Product p1 = concreteBuilder1.getResult();
        p1.show();
        director.construct(concreteBuilder2);
        Product p2 = concreteBuilder2.getResult();
        p2.show();
    }
}
