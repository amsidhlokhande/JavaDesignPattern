package com.amsidh.design.structural.bridge;
//A Bridge Pattern says that just "decouple the functional abstraction from the implementation so that the two can vary independently".
public class BridgePatternApp {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bus(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
//====================================Vehicle===========================================
abstract class Vehicle {
    Workshop produce;
    Workshop assemble;

    public Vehicle(Workshop produce, Workshop assemble) {
        this.produce = produce;
        this.assemble = assemble;
    }

    public abstract void manufacture();
}

class Bus extends Vehicle {

    public Bus(Workshop produce, Workshop assemble) {
        super(produce, assemble);
    }

    @Override
    public void manufacture() {
        System.out.println("Vehicle Name is Bus");
        produce.work();
        assemble.work();
    }
}

class Bike extends Vehicle {

    public Bike(Workshop produce, Workshop assemble) {
        super(produce, assemble);
    }

    @Override
    public void manufacture() {
        System.out.println("Vehicle Name is Bike");
        produce.work();
        assemble.work();
    }
}


//========================================Workshop======================================================
interface Workshop {
    void work();
}

class Produce implements Workshop {

    @Override
    public void work() {
        System.out.println("Producing");
    }
}

class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("Assemble");
    }
}
//==========================================================================================