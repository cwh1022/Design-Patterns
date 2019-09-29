package com.study.workState;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class EventState extends State {
    public void writeProgram(Work w) {
        if (w.isFinish()){
            w.setCurrent(new ResetState());
            w.writeProgram();
        }else {
            if (w.getHour() < 21) {
                System.out.println("当前时间：" + w.getHour() + ",休息一下，累了");
            }else{
                w.setCurrent(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
