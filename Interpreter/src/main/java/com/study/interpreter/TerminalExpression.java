package com.study.interpreter;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class TerminalExpression extends AbstractExpression {
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
