package java_basic;

public class variable {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		  //�޸� ũ�� ���ϱ�, �ʱⰪ ����(���������� ���ÿ� �ص� ��)
		b=Byte.MAX_VALUE;
		s=Short.MAX_VALUE;
		i=Integer.MAX_VALUE;
		l=Long.MAX_VALUE;
		str = "\"�ȳ��ϼ���.\"\t\n�ݰ����ϴ�.";
		
		c='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("���� : "+ c);
		System.out.printf("���� : "+(int)c);
		System.out.println(str);
	}

}
