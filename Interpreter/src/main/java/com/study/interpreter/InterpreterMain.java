package com.study.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class InterpreterMain {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }
}
