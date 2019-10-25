package com.study.visitor;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
