package com.java.dto;


public class TriangleVO{
		
		public int height; //높이
		public int baseline; //밑변
		public float width; //넓이    0의 개념으로 묵시적 초기화
		
							   //생성자를 만든 이유는 초기화를 이유로 함
							   // 임의의 값을 넣어서 초기화를 하고있음
			
			
			// 0부터 10까지 숫자를 임의로 뽑아서 짝수면 0, 홀수면 1로 초기화
			{
				int temp = (int)(Math.random()*11);
				if(temp%2 == 0) {
					height = (baseline = 0);
				}else
					height = (baseline =  0);	
			}
			
		public TriangleVO(int height, int baseline) { //임의의 값을 받아서 초기화를 하고있음
			this.height = height; 
			this.baseline = baseline;
		}



		//입력
		public int surface() {
			return (int)(height * baseline * 0.5f);
		}
}
		