package com.java.dto;

public class CircleVO {
		
	public int radius; //¹İÁö¸§
		
	public CircleVO() {}

	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	public int surface() {
		return (int)(radius * radius * Math.PI);
	}
	
}
