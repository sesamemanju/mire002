package java_basic;

public class Switch {

	public static void main(String[] args) {
		// Switch
		
		int inputInt = 2;
		
		switch(inputInt%2) {
		case 0:case 1:
			System.out.println("�������� 0 �Ǵ� 1�Դϴ�.");
		break;
		case 2:case 3:
			System.out.println("�������� 2 �Ǵ� 3�Դϴ�.");
		break;
		case 4:
			System.out.println("�������� 4�Դϴ�.");
		break;	
		default:
			System.out.println("�������� 5 �Ǵ� 6�Դϴ�.");
			
		}
		
		

	}

}
