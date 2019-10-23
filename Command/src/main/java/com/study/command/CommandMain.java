package com.study.command;

/**
 * Created on 2019/10/23
 *
 * @author connor.chen
 */
public class CommandMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand c = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(c);
        invoker.executeCommand();
    }
}
