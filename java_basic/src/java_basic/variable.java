package java_basic;

public class variable {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		  //메모리 크기 정하기, 초기값 설정(변수만들기와 동시에 해도 됨)
		b=Byte.MAX_VALUE;
		s=Short.MAX_VALUE;
		i=Integer.MAX_VALUE;
		l=Long.MAX_VALUE;
		str = "\"안녕하세요.\"\t\n반갑습니다.";
		
		c='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("문자 : "+ c);
		System.out.printf("숫자 : "+(int)c);
		System.out.println(str);
	}

}
