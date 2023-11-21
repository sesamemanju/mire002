package java_basic;

public class Casting {

	public static void main(String[] args) {

		byte b = 120;
		short s = 3000;
		int i = 21;
		long l = 9l;
		float f = 2f; //double type이라 오류남 그래서 f를 붙여야함
		double d = 1.2;
		
		b = (byte)i;
		
		System.out.println(b);
		
		System.out.println(s+i);
		System.out.println(s/i);
		
		System.out.println(s+f);
		System.out.println(s/f);
		
		System.out.println(1/2);
		System.out.println(1/2f);
		System.out.println("몫 : "+ s/i);
		System.out.println("나머지 : " + s%i);
	}

}
