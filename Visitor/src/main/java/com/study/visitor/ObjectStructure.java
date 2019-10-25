package com.study.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();
    public void attach(Element element){
        elements.add(element);
    }
    public void detach(Element element){
        elements.remove(element);
    }
    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
