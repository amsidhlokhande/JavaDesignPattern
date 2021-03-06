package com.amsidh.design.creational.factory;

import com.amsidh.design.creational.factory.intf.Shape;
import com.amsidh.design.creational.factory.intf.impl.Circle;
import com.amsidh.design.creational.factory.intf.impl.Rectangle;
import com.amsidh.design.creational.factory.intf.impl.Square;
import com.amsidh.design.creational.factory.intf.impl.Triangle;

public class ShapeFactory {
    public static Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else if (shapeName.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }

        return null;
    }
}
