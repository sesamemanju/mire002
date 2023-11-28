package com.java.dto;

public class RectangleVO extends Shape {

	public int baseline; // ¹Øº¯
	public int height; // ³ôÀÌ
//	public float width;// ³ĞÀÌ

	// ÀÔ·Â

	public RectangleVO() {
	}

	public RectangleVO(int baseline, int height) {
		this.baseline = baseline;
		this.height = height;
	}
	@Override
	public int surface() {
		return (int) (baseline * height);
	}

	public int getBaseline() {
		return baseline;
	}

	public void setBaseline(int baseline) {
		this.baseline = baseline;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
