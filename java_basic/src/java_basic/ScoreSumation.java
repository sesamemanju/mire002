package java_basic;

public class ScoreSumation { 
	public static void main(String[] args) { 
	
		int kor=78; 
		int eng=98;
		int math=85;
		int scien=87;
		int total; /* int = �������� ����, �̸��� ���� �ְ� ;�� ������ / float = �Ǽ����� ����
				      ���� �ʱ�ȭ(0�̶� �ִ°�)�� ����� ������ ���� ����.*/
		total = kor + eng + math + scien;
		System.out.println(total); /* total���� ��� */
		System.out.println(total/4);
	}
}
