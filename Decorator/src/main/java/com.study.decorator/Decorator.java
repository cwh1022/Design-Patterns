package com.study.decorator;

/**
 * Created on 2019/9/23
 *
 * @author connor.chen
 */
public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
