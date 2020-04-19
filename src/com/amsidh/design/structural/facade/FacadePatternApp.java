package com.amsidh.design.structural.facade;
//A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem,
// therefore it hides the complexities of the subsystem from the client".
public class FacadePatternApp {
    public static void main(String[] args) {
        //Client is use the facade interface here
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.blackberrySale();
        shopKeeper.iPhoneSale();
        shopKeeper.samsungSale();
    }
}

// Define a interface and provide multiple implementation of it like samsunh,iphone,blackbeery
interface Mobile {
    void modelNo();

    void price();
}

class IPhone implements Mobile {

    @Override
    public void modelNo() {
        System.out.println("Model No -IPhone");
    }

    @Override
    public void price() {
        System.out.println("Price of IPhone is 30000");
    }
}

class Samsung implements Mobile {

    @Override
    public void modelNo() {
        System.out.println("Model No -Samsung");
    }

    @Override
    public void price() {
        System.out.println("Price of Samsung is 10000");
    }
}

class BlackBerry implements Mobile {

    @Override
    public void modelNo() {
        System.out.println("Model No -BlackBerry");
    }

    @Override
    public void price() {
        System.out.println("Price of BlackBerry is 20000");
    }
}

//Make Facade pattern here by providing simplified common interface that has a relationship with all mobiles and corresponding method to use it.
//Give the access to client to this interface so that they will just see the sales of all mobiles without going into details of there implementation
class ShopKeeper {
    private Mobile iPhone;
    private Mobile samsung;
    private Mobile blackberry;

    public ShopKeeper() {
        this.iPhone = new IPhone();
        this.samsung = new Samsung();
        this.blackberry = new BlackBerry();
    }

    public void iPhoneSale() {
        iPhone.modelNo();
        iPhone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

    public void blackberrySale() {
        blackberry.modelNo();
        blackberry.price();
    }
}