package com.study.templete.method;

/**
 * Created on 2019/9/25
 *
 * @author connor.chen
 */
public abstract class TestPaper {
    public void testQuestion1(){
        System.out.println("问题1，答案：A B C D， 选择：" + answer1());
    }
    public void testQuestion2(){
        System.out.println("问题2，答案：A B C D， 选择：" + answer2());
    }
    public void testQuestion3(){
        System.out.println("问题3，答案：A B C D， 选择：" + answer3());
    }

    public abstract String answer1();
    public abstract String answer2();
    public abstract String answer3();
}
