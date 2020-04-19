package com.amsidh.design.creational.abstract_factory.color.intf.impl;

import com.amsidh.design.creational.abstract_factory.color.intf.Color;

public class Green implements Color {

	@Override
	public void fillColor() {
		System.out.println("Green color filled");
	}

}
