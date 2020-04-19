package com.amsidh.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//A Flyweight Pattern says that just "to reuse already existing
// similar kind of objects by storing them and create new object when no matching object is found".
public class FlyWeightExampleApp {
    public static void main(String[] args) {
        Pen thickRedPen1 = PenFactory.getThickPen("red");  //Create new pen
        thickRedPen1.draw();
        Pen thickRedPen2 = PenFactory.getThickPen("red");  //Share new pen
        thickRedPen2.draw();
        Pen thickGreenPen1 = PenFactory.getThickPen("green"); //Create new pen
        thickGreenPen1.draw();
        Pen thickGreenPen2 = PenFactory.getThickPen("green"); //Share new pen
        thickGreenPen2.draw();
        Pen thickGreenPen3 = PenFactory.getThickPen("green"); //Share new pen
        thickGreenPen3.draw();


        Pen thinRedPen1 = PenFactory.getThinPen("red");  //Create new pen
        thinRedPen1.draw();
        Pen thinRedPen2 = PenFactory.getThinPen("red");  //Share new pen
        thinRedPen2.draw();
        Pen thinRedPen3 = PenFactory.getThinPen("green"); //Create new pen
        thinRedPen3.draw();
        Pen thinRedPen4 = PenFactory.getThinPen("green"); //Share new pen
        thinRedPen4.draw();
        Pen thinRedPen5 = PenFactory.getThinPen("green"); //Share new pen
        thinRedPen5.draw();

    }
}

interface Pen {
     void setColor(String color); //extrinsic state

    void draw(); //intrinsic state
}

enum BrushSize {
    THIN, MEDIUM, THICK;
}

class ThinkPen implements Pen {
    private String color = null;

    public ThinkPen(){
        System.out.println("ThinkPen constructor called");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public synchronized void draw() { //make this method synchronized for multithread env safety
        System.out.println("Drawing thin content in color " + color);
    }
}

class MediumPen implements Pen {
    private String color = null;

    public MediumPen(){
        System.out.println("MediumPen constructor called");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public synchronized void draw() { //make this method synchronized for multithread env safety
        System.out.println("Drawing medium content in color " + color);
    }
}

class ThickPen implements Pen {
    private String color = null;

    public ThickPen(){
        System.out.println("ThickPen constructor called");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public synchronized void draw() { //make this method synchronized for multithread env safety
        System.out.println("Drawing ThickPen content in color " + color);
    }
}


class PenFactory {

    private static final Map<String, Pen> pensMap = new HashMap<>();

    public static Pen getThinPen(String color) {
        String key = color + BrushSize.THIN;
        Pen p = null;
        if (pensMap.containsKey(key)) {
            p = pensMap.get(key);
        } else {
            p = new ThinkPen();
            p.setColor(color);
            pensMap.put(key, p);
        }

        return p;
    }

    public static Pen getMediumPen(String color) {
        String key = color + BrushSize.MEDIUM;
        Pen p = null;
        if (pensMap.containsKey(key)) {
            p = pensMap.get(key);
        } else {
            p = new MediumPen();
            p.setColor(color);
            pensMap.put(key, p);
        }

        return p;
    }

    public static Pen getThickPen(String color) {
        String key = color + BrushSize.THICK;
        Pen p = null;
        if (pensMap.containsKey(key)) {
            p = pensMap.get(key);
        } else {
            p = new ThickPen();
            p.setColor(color);
            pensMap.put(key, p);
        }

        return p;
    }
}