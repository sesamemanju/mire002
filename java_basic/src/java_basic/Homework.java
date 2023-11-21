package java_basic;

public class Homework {

	public static void main(String[] args) {
		
//		4자리 정수를 입력받아 각 자리수를 출력하는 프로그램을 작성하시오
		
	int targetNum = 6789;
	int e0 = 0;
	int e1 = 0;
	int e2 = 0;
	int e3 = 0;
	
	float tempNum = targetNum / 10000f;
	
	tempNum = tempNum * 10;
	e3 = (int)(tempNum);
	tempNum = tempNum - e3;
	
	tempNum = tempNum * 10;
	e2 = (int)(tempNum);
	tempNum = tempNum - e2;
	
	tempNum = tempNum * 10;
	e1 = (int)(tempNum);
	tempNum = tempNum - e1;
	
	tempNum = tempNum * 10;
	e0 = (int)(tempNum+0.5);
	tempNum = tempNum - e0;
	
	System.out.println("입력 정수 : " + targetNum);
	System.out.println("4자리 수 : "+e3);
	System.out.println("3자리 수 : "+e2);
	System.out.println("2자리 수 : "+e1);
	System.out.println("1자리 수 : "+e0);
	
	}

}
