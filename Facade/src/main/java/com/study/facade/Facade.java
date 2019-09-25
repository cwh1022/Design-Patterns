package com.study.facade;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade(){
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法组A");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }
    public void methodB(){
        System.out.println("方法组B");
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }
}
