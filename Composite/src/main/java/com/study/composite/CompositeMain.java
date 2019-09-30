package com.study.composite;

/**
 * Created on 2019/9/30
 *
 * @author connor.chen
 */
public class CompositeMain {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
//        root.display(1);
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);
        root.display(1);


    }
}
