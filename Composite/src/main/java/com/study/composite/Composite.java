package com.study.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/9/30
 *
 * @author connor.chen
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();
    public Composite(String name) {
        super(name);
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public void display(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre = pre + "-";
        }
        System.out.println(pre + name);
        for (Component child : children) {
            child.display(depth+2);
        }
    }
}
