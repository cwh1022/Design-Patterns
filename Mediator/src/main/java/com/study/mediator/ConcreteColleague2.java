package com.study.mediator;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到消息：" + message);
    }
}
