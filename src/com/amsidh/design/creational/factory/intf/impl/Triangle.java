package com.amsidh.design.creational.factory.intf.impl;

import com.amsidh.design.creational.factory.intf.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle a circle");
    }
}
