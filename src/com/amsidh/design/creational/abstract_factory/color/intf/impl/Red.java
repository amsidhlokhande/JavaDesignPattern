package com.amsidh.design.creational.abstract_factory.color.intf.impl;


import com.amsidh.design.creational.abstract_factory.color.intf.Color;

public class Red implements Color {

	@Override
	public void fillColor() {
		System.out.println("Red color filled");
	}

}
