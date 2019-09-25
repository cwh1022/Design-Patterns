package com.study.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */

/**
 * 产品类，由多个部件组成
 */
public class Product {
    private List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show(){
        System.out.println("产品 创建————");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
