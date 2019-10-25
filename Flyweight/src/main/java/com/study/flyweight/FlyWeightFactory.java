package com.study.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2019/10/25
 *
 * @author connor.chen
 */
public class FlyWeightFactory {
    private Map flyWeights = new HashMap();

    public FlyWeightFactory() {
        flyWeights.put("X", new ConcreteFlyWeight());
        flyWeights.put("Y", new ConcreteFlyWeight());
        flyWeights.put("Z", new ConcreteFlyWeight());
    }
    public FlyWeight getFlyWeight(String key){
        return (FlyWeight) flyWeights.get(key);
    }
}
