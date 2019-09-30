package com.study.composite;

/**
 * Created on 2019/9/30
 *
 * @author connor.chen
 */
public abstract class Component {
    protected String name;

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
