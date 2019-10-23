package com.study.bridge;

/**
 * Created on 2019/10/23
 *
 * @author connor.chen
 */
public class Abstraction {
    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public  void operation(){
        implementor.operation();
    }
}
