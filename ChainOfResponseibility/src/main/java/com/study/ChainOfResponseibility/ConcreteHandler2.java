package com.study.ChainOfResponseibility;

/**
 * Created on 2019/10/24
 *
 * @author connor.chen
 */
public class ConcreteHandler2 extends Handler {
    public void handleRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println(this.getClass().getSimpleName() + "处理器请求：" + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
