package com.study.factory.method;

/**
 * Created on 2019/9/24
 *
 * @author connor.chen
 */
public class UndergraduateFactory implements IFactory {
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
