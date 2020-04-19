package com.amsidh.design.creational.abstract_factory;

import com.amsidh.design.creational.abstract_factory.color.intf.Color;
import com.amsidh.design.creational.factory.intf.Shape;
//Abstract Factory Pattern says that just define an interface or abstract class for creating families of
// related (or dependent) objects but without specifying their concrete sub-classes.
// That means Abstract Factory lets a class returns a factory of classes.
// So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
public class AbstractFactoryApp {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProvider.getFactory("Shape");
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        AbstractFactory color = FactoryProvider.getFactory("Color");
        Color red = color.getColor("Red");
        red.fillColor();
    }
}
