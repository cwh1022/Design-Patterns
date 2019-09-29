package com.study.workState;

/**
 * Created on 2019/9/27
 *
 * @author connor.chen
 */
public class Work {
    private State current;
    private double hour;
    private boolean finish = false;

    public Work() {
        current = new ForenoonState();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
