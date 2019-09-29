package com.study.workState;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class AfternoonState extends State {
    public void writeProgram(Work w) {
        if (w.getHour() < 17){
            System.out.println("当前时间：" + w.getHour() + " 下午状态还不错，继续努力");
        }else{
            w.setCurrent(new EventState());
            w.writeProgram();
        }
    }
}
