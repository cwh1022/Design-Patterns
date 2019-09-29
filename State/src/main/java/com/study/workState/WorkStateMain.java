package com.study.workState;

/**
 * Created on 2019/9/29
 *
 * @author connor.chen
 */
public class WorkStateMain {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(18);
        work.writeProgram();
        work.setHour(20);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }
}
