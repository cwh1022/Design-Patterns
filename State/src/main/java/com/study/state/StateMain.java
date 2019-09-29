package com.study.state;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class StateMain {
    public static void main(String[] args) {
        Context c = new Context(new ConcerteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
