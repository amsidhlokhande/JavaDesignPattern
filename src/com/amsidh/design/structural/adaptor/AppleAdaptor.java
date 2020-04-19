package com.amsidh.design.structural.adaptor;

import com.amsidh.design.structural.adaptor.apple.Chargeable;
import com.amsidh.design.structural.adaptor.samsung.Charger;

//As We are looking to use Apple charging functionality to charging Samsung then
// Samsung Interface is has-a releationship and Apple Charger is-a releation with AppleAdaptor

public class AppleAdaptor implements Chargeable {
    private Charger samsungCharger;

    public void setSamsungCharger(Charger samsungCharger) {
        this.samsungCharger = samsungCharger;
    }

    @Override
    public void setMobileName(String mobileName) {
        //empty
    }

    //this method internally calls Samsung Charger method
    @Override
    public void charge() {
        this.samsungCharger.suppyCharger();
    }
}
