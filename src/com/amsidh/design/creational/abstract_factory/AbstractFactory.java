package com.amsidh.design.creational.abstract_factory;

import com.amsidh.design.creational.abstract_factory.color.intf.Color;
import com.amsidh.design.creational.factory.intf.Shape;

public interface AbstractFactory {
    Shape getShape(String shapeName);
    Color getColor(String colorName);
}
