package com.study.builder;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
