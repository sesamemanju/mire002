package com.java.dto;


public class TriangleVO{
		
		public int height; //����
		public int baseline; //�غ�
		public float width; //����    0�� �������� ������ �ʱ�ȭ
		
							   //�����ڸ� ���� ������ �ʱ�ȭ�� ������ ��
							   // ������ ���� �־ �ʱ�ȭ�� �ϰ�����
			
			
			// 0���� 10���� ���ڸ� ���Ƿ� �̾Ƽ� ¦���� 0, Ȧ���� 1�� �ʱ�ȭ
			{
				int temp = (int)(Math.random()*11);
				if(temp%2 == 0) {
					height = (baseline = 0);
				}else
					height = (baseline =  0);	
			}
			
		public TriangleVO(int height, int baseline) { //������ ���� �޾Ƽ� �ʱ�ȭ�� �ϰ�����
			this.height = height; 
			this.baseline = baseline;
		}



		//�Է�
		public int surface() {
			return (int)(height * baseline * 0.5f);
		}
}
		