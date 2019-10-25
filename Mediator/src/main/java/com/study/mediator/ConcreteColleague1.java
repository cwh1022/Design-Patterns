package com.study.mediator;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message){
        System.out.println("同事1得到消息：" + message);
    }
}
