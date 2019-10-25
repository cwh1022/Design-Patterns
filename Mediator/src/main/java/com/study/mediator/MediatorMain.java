package com.study.mediator;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class MediatorMain {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(m);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(m);
        m.setConcreteColleague1(concreteColleague1);
        m.setConcreteColleague2(concreteColleague2);
        concreteColleague1.send("吃过了吗");
        concreteColleague2.send("没有，你请客吗");


    }
}
