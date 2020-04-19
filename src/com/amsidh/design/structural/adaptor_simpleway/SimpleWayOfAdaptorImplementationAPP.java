package com.amsidh.design.structural.adaptor_simpleway;

public class SimpleWayOfAdaptorImplementationAPP {
    public static void main(String[] args) {
        Charging nokia = new Nokia();
        nokia.charge();
        Charging samsung = new Saumsung();
        samsung.charge();

        Apple apple = new Apple();
        ApplePluginAdaptor applePluginAdaptor = new ApplePluginAdaptor(apple);
        applePluginAdaptor.charge();

    }
}

interface Charging {
    void charge();
}

class Nokia implements Charging {
    @Override
    public void charge() {
        System.out.println("Charging Nokia Phone....");
    }
}

class Saumsung implements Charging {
    @Override
    public void charge() {
        System.out.println("Charging Saumsung Phone....");
    }
}

//This class has its own method
class Apple {

    public void chargeable() {
        System.out.println("Charging Apple Phone....");
    }
}

class ApplePluginAdaptor implements Charging {
    private Apple apple;

    public ApplePluginAdaptor(Apple apple) {
        this.apple = apple;
    }

    //Calling apple charging method inside Charging interface of Nokia
    @Override
    public void charge() {
        apple.chargeable();
    }
}




