package com.amsidh.design.structural.adaptor;

import com.amsidh.design.structural.adaptor.apple.AppleCharger;
import com.amsidh.design.structural.adaptor.apple.Chargeable;
import com.amsidh.design.structural.adaptor.samsung.Charger;
import com.amsidh.design.structural.adaptor.samsung.SamsungCharger;

//An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
public class AdaptorPatternExample {
    public static void main(String[] args) {
        //Iphone
        Chargeable iPhone5Chargeable = new AppleCharger();
        iPhone5Chargeable.setMobileName("IPhone-5");
        iPhone5Chargeable.charge();

        //Samsung
        Charger samsungCharger11 = new SamsungCharger();
        samsungCharger11.setMobileName("Samsung-11");
        samsungCharger11.suppyCharger();

        //One day My Samsung Charger got defect because of which I am unable to charge my Samsung mobile. Means I dont have Chargeable implementation for Nokia phone
        //Now I am looking an adaptor which allows me to use Apple Charger for charging my Samsung Phone
        Charger samsungCharger4 = new SamsungCharger();
        samsungCharger4.setMobileName("Samsung-4");
        AppleAdaptor appleAdaptor = new AppleAdaptor();
        appleAdaptor.setSamsungCharger(samsungCharger4);
        appleAdaptor.charge();
    }
}



