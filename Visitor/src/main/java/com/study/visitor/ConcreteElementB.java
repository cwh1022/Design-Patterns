package com.study.visitor;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteElementB extends Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    public void operationB(){}
}
