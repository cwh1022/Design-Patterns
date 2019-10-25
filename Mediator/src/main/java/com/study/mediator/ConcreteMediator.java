package com.study.mediator;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void send(String message, Colleague colleague) {
        if (colleague instanceof ConcreteColleague1){
            concreteColleague1.notify(message);
        }else if (colleague instanceof ConcreteColleague2){
            concreteColleague2.notify(message);
        }
    }

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
}
