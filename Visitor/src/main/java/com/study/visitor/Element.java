package com.study.visitor;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
