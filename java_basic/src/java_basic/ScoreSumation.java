package java_basic;

public class ScoreSumation { 
	public static void main(String[] args) { 
	
		int kor=78; 
		int eng=98;
		int math=85;
		int scien=87;
		int total; /* int = 정수임을 선언, 이름과 값을 주고 ;로 마무리 / float = 실수임을 선언
				      변수 초기화(0이라도 넣는것)을 해줘야 오류가 나지 않음.*/
		total = kor + eng + math + scien;
		System.out.println(total); /* total값을 출력 */
		System.out.println(total/4);
	}
}
