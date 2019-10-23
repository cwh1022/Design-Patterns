package com.study.command;

/**
 * Created on 2019/10/23
 *
 * @author connor.chen
 */
public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
