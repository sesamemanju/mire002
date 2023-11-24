package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {

		final int STUDEN_NUM; // 최초할당만 가능함
		final int SUBJECT_NUM;

		Scanner scann = new Scanner(System.in);

		

		System.out.print("학생 수 :");
		STUDEN_NUM = scann.nextInt();
		scann.nextLine();

		ScoreVO[] scores = new ScoreVO[STUDEN_NUM]; //
		
		for(int i=0;i<STUDEN_NUM;i++) {
			scores[i] = new ScoreVO(); 
			scores[i].input(); //입력
		}
		
		//출력
		System.out.println("순번\t");
		ScoreVO.printLabel();
		for(int i=0;i<STUDEN_NUM;i++) {
			System.out.print((i+1+"\t"));
			scores[i].printScore();
		}
		
	}

}
