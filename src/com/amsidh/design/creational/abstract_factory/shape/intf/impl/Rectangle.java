package com.amsidh.design.creational.abstract_factory.shape.intf.impl;

import com.amsidh.design.creational.abstract_factory.shape.intf.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle a circle");
    }
}
