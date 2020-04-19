package com.amsidh.design.creational.factory.intf.impl;

import com.amsidh.design.creational.factory.intf.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle a circle");
    }
}
