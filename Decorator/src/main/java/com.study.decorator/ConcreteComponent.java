package com.study.decorator;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体操作的对象");
    }
}
