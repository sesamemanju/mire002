package com.java.dto;

import java.util.Scanner;

public class Triangle{
		
		public float base; //πÿ∫Ø
		public float height; //≥Ù¿Ã
		public float width; //≥–¿Ã
		
		//¿‘∑¬
		public float width() {
			return (base * height);
		}
		
		public void input() {
			Scanner scann = new Scanner(System.in);
			
			System.out.print("πÿ∫Ø ±Ê¿Ã : ");
			base = scann.nextFloat();
			scann.nextLine();
			
			System.out.print("≥Ù¿Ã : ");
			height = scann.nextFloat();
			scann.nextLine();
			
			
		}
}
