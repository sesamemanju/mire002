package com.java.dto;

public class RectangleVO {

	public int base; // �غ�
	public int height; // ����
//	public float width;// ����

	// �Է�

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
