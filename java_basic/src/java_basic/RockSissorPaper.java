package java_basic;

import java.util.Scanner;

public class RockSissorPaper {

	public static void main(String[] args) {
		String com_rsp = ""; // ���� 0 ���� 1 �� 2
		int com_rsp_num = 0;

		String my_rsp = ""; // ���� 0 ���� 1 �� 2
		int my_rsp_num = 0;

		int menu = 0;
		String judge = ""; // �̱�� 1 ���� 0 ���� 2

		String quit = "";

		while (!quit.toUpperCase().equals("Q")) {

			// �Է�
			com_rsp_num = (int) (Math.random() * 3);
			System.out.println("��ǻ�Ϳ� ������������ �غ��ô�.");
			System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
			System.out.println("����� ������");
			System.out.println("1.���� 2.���� 3.��");

			Scanner scanner = new Scanner(System.in);
			while (true) {
				menu = scanner.nextInt(); scanner.nextLine();

				if (menu < 1 || menu > 3) {
					System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
				} else{
					break;
				}
			}
			my_rsp_num = menu - 1;

			if (com_rsp_num == ((my_rsp_num + 1) % 3)) { // �й�
				judge = "�����ϴ�.";
			} else {
				if (com_rsp_num == my_rsp_num) { // ���
					judge = "�����ϴ�.";

				} else { // �¸�
					judge = "�̰���ϴ�.";
				}
			}
//		if(my_rsp_num == 0) {
//			my_rsp = "����";
//		}else if(my_rsp_num == 1) {
//				my_rsp = "����";
//			}else {
//				my_rsp = "��";
//			}
//		if(com_rsp_num == 0) {
//			com_rsp = "����";
//		}else if(com_rsp_num == 1) {
//				com_rsp = "����";
//			}else {
//				com_rsp = "��";
//			}

			switch (my_rsp_num) {
			case 0:
				my_rsp = "����";
				break;
			case 1:
				my_rsp = "����";
				break;
			case 2:
				my_rsp = "��";
				break;
			}
			switch (com_rsp_num) {
			case 0:
				com_rsp = "����";
				break;
			case 1:
				com_rsp = "����";
				break;
			case 2:
				com_rsp = "��";
				break;
			}

			// ���
			System.out.println("��ǻ�� : " + com_rsp);
			System.out.println("��� : " + my_rsp);
			System.out.println(judge);

			System.out.println("�� �Ͻðڽ��ϱ�?(�׸��Ϸ��� Q)");
			System.out.println("����Ϸ��� �ƹ� Ű�� ��������.");

			quit = scanner.nextLine();

		}
	}

}
