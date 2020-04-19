package com.amsidh.design.creational.abstract_factory.color.intf.impl;

import com.amsidh.design.creational.abstract_factory.color.intf.Color;

public class Yellow implements Color {

	@Override
	public void fillColor() {
		System.out.println("Yellow color filled");
	}

}
