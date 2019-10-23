package com.study.command;

/**
 * Created on 2019/10/23
 *
 * @author connor.chen
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        receiver.action();
    }
}
