package com.amsidh.design.structural.adaptor.samsung;

public interface Charger {
    void setMobileName(String mobileName);

    //This method is the only difference between Apple and Samsung Charger
    void suppyCharger();
}
