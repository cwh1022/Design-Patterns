package com.study.builder;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.add("部件X");
    }

    public void buildPartB() {
        product.add("部件Y");
    }

    public Product getResult() {
        return product;
    }
}
