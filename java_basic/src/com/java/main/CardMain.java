package com.java.main;

import com.java.dto.Card;

public class CardMain {

	public static void main(String[] args) {

		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		
//		c1.height = 9;
//		c1.width = 5;
//		
//		c2.height = 12;
//		c2.width = 8;
//		
//		c3.height = 21;
//		c3.width = 11;
		
		Card.width = 100;
		Card.height = 200;
		
		System.out.println("c1 ī�� �ʺ� : "+c1.width);
		System.out.println("c1 ī�� ���� : "+c1.height);
		System.out.println("c2 ī�� �ʺ� : "+c2.width);
		System.out.println("c2 ī�� ���� : "+c2.height);
		System.out.println("c3 ī�� �ʺ� : "+c3.width);
		System.out.println("c3 ī�� ���� : "+c3.height);
		System.out.println("Card ī�� �ʺ� : "+Card.width);
		System.out.println("Card ī�� ���� : "+Card.height);
		
	}

}
