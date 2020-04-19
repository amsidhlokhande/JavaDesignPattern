package com.amsidh.design.creational.abstract_factory;

import com.amsidh.design.creational.abstract_factory.color.ColorFactory;
import com.amsidh.design.creational.abstract_factory.shape.ShapeFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        } else if (factoryName.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryName.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
