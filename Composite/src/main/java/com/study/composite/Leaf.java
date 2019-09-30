package com.study.composite;

/**
 * Created on 2019/9/30
 *
 * @author connor.chen
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    public void display(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre = pre + "-";
        }
        System.out.println(pre + name);
    }
}
