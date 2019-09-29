package com.study.workState;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class ResetState extends State {
    public void writeProgram(Work w) {
        System.out.println("时间：" + w.getHour() + ", 下班");
    }
}
