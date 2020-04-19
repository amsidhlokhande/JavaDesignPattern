package com.amsidh.design.creational.factory.intf.impl;

import com.amsidh.design.creational.factory.intf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
