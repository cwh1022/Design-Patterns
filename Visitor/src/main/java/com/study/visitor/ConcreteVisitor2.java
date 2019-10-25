package com.study.visitor;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteVisitor2 extends Visitor {
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
    }
}
