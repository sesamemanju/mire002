package com.java.dto;

public class CircleVO extends Shape{

	public int radius; // ¹İÁö¸§

	public CircleVO() {
	}

	public CircleVO(int radius) {
		this.radius = radius;
	}
	@Override
	public int surface() {
		return (int) (radius * radius * Math.PI);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
}
