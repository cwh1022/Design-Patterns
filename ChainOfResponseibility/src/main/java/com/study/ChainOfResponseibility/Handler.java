package com.study.ChainOfResponseibility;

/**
 * Created on 2019/10/24
 *
 * @author connor.chen
 */
public abstract class Handler {
    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
