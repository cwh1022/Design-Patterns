package com.study.ChainOfResponseibility;

/**
 * Created on 2019/10/24
 *
 * @author connor.chen
 */
public class ConcreteHandler extends Handler {
    public void handleRequest(int request) {
        if (request >= 0 && request < 10){
            System.out.println(this.getClass().getSimpleName() + "处理器请求：" + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
