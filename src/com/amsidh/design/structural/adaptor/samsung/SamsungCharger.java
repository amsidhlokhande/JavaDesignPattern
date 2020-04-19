package com.amsidh.design.structural.adaptor.samsung;

//======================================Samsung Phone==================================
public class SamsungCharger implements Charger {

    private String mobileName;

    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public void suppyCharger() {
        System.out.println("Charging ..." + mobileName);
    }
}
