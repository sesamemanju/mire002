package com.java.dto;

public class RectangleVO {

	public int base; // ¹Øº¯
	public int height; // ³ôÀÌ
//	public float width;// ³ĞÀÌ

	// ÀÔ·Â

	public RectangleVO() {
	}

	public RectangleVO(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int surface() {
		return (int)(base * height);
	}
	
}
