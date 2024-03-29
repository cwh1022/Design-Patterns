package com.study.workState;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class NoonState extends State {
    public void writeProgram(Work w) {
        if (w.getHour() < 13){
            System.out.println("当前时间：" + w.getHour() + ", 饿了，午饭；犯困，午休");
        }else{
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }
}
