package com.study.state;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class ConcerteStateB extends State {
    public void handle(Context context) {
        context.setState(new ConcerteStateA());
    }
}
