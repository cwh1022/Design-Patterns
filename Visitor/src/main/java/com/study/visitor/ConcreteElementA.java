package com.study.visitor;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteElementA extends Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    public void operationA(){}
}
