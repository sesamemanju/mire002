package java_basic;

public class LoginOperation {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;

//		result = ((a=1) < (b=2)) && ((c=3)> 2); // 앞이 false면 뒤는 실행 안함.

		a = 1;
		b = 2;
		c = 3;
		result = a < b || c > 2; // 앞이 true라 뒤는 실행 안함.

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("result : " + result);

	}

}
