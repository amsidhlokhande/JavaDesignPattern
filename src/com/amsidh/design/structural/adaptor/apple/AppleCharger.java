package com.amsidh.design.structural.adaptor.apple;


//===================================Apple Mobile Phone=================================
public class AppleCharger implements Chargeable {

    private String mobileName;

    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public void charge() {
        System.out.println("Charging...." + this.mobileName);
    }
}
