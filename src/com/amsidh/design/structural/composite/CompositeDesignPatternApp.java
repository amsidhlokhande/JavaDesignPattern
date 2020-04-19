package com.amsidh.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

//A Composite Pattern says that just "allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects".
public class CompositeDesignPatternApp {
    public static void main(String[] args) {

        //MotherBoard
        Component cpu = new Leaf("CPU", 8334);
        Component ram = new Leaf("RAM", 5647);
        Component hdd = new Leaf("HDD", 5647);
        Composite motherBoard = new Composite("RAM");
        motherBoard.addLeaf(cpu);
        motherBoard.addLeaf(ram);
        motherBoard.addLeaf(hdd);

        System.out.println("MethodBoard Details");
        motherBoard.showPrice();
        //Peripheral devices
        Component keyboard = new Leaf("KeyBoard", 533);
        Component mouse = new Leaf("Mouse", 53);
        Composite peripheralDevice = new Composite("P Devices");
        peripheralDevice.addLeaf(keyboard);
        peripheralDevice.addLeaf(mouse);
        System.out.println("\n\nPeripheral Device");
        peripheralDevice.showPrice();

        //Computer
        Composite computer = new Composite("Computer");
        computer.addLeaf(motherBoard);
        computer.addLeaf(peripheralDevice);

        System.out.println("\n\n");
        computer.showPrice();


    }
}


interface Component {
    void showPrice();
}

class Leaf implements Component {
    private double price;
    private String name;

    public Leaf(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + this.price);
    }
}

class Composite implements Component {
    private String name;
    List<Component> leaves = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addLeaf(Component leaf) {
        this.leaves.add(leaf);
    }

    @Override
    public void showPrice() {
        leaves.forEach(Component::showPrice);
    }
}