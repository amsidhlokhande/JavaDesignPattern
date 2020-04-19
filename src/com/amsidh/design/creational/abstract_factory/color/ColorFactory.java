package com.amsidh.design.creational.abstract_factory.color;

import com.amsidh.design.creational.abstract_factory.AbstractFactory;
import com.amsidh.design.creational.abstract_factory.color.intf.Color;
import com.amsidh.design.creational.abstract_factory.color.intf.impl.Green;
import com.amsidh.design.creational.abstract_factory.color.intf.impl.Red;
import com.amsidh.design.creational.abstract_factory.color.intf.impl.Yellow;
import com.amsidh.design.creational.factory.intf.Shape;

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeName) {
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        if (colorName == null) {
            return null;
        } else if (colorName.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("YELLOW")) {
            return new Yellow();
        } else if (colorName.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else {
            return null;
        }
    }
}
