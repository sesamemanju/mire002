package java_basic;

import java.util.Scanner;

public class SubjectScore {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		int scien=0;
		
		int total=0;
		float evg=0f;
		
		System.out.print("���� ���� : ");
		kor = scann.nextInt();
		
		System.out.print("���� ���� : ");
		eng = scann.nextInt();
		
		System.out.print("���� ���� : ");
		math = scann.nextInt();
		
		System.out.print("���� ���� : ");
		scien = scann.nextInt();
		
		
		total = kor + eng + math + scien;
		evg = total/4f;
		evg = (int)((evg*100+5)/10)/10f;
		
		
		System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,scien,total,evg);
		
		
		
	}

}
