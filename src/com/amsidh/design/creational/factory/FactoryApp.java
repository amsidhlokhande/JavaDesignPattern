package com.amsidh.design.creational.factory;

import com.amsidh.design.creational.factory.intf.Shape;

/*
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating
an object but let the subclasses decide which class to instantiate.
In other words, subclasses are responsible to create the instance of the class.
The Factory Method Pattern is also known as Virtual Constructor.
 */
public class FactoryApp {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape triangle = ShapeFactory.getShape("Triangle");
        triangle.draw();
        Shape square = ShapeFactory.getShape("Square");
        square.draw();

        Shape shape = ShapeFactory.getShape(null);
        System.out.println(shape);

    }
}
