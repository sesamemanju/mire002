package java_basic;

public class Array2 {

	public static void main(String[] args) {
	
		//�Ҽ��� ��°�ڸ����� �ݿø�
		String[] label = {"����","�̸�","����", "����", "����", "����","����","���"};
		
		String[] name = {"�̹�ȣ","�̻���","�����","Ź����"};
		int[] kor = {71,81,91,61};
		int[] eng = {72,82,92,62};
		int[] math = {73,83,93,63};
		int[] sci = {74,84,94,64};
		int[] total = new int[4];
		float[] avg = new float[4];
		
		for (int stuNum = 0; stuNum < 4; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + sci[stuNum];
			avg[stuNum] = (int) ((total[stuNum] / 4f) * 100 + 0.5f) / 100f;
		}
		
		
		//���
		for(int i=0;i<label.length;i++) {
			System.out.print(label[i]+"\t");
		}
		System.out.println();
		for(int stuNum = 0;stuNum < 4;stuNum++) {
				System.out.println(stuNum+"\t"+name[stuNum]+"\t"
								   +kor[stuNum]+"\t"+eng[stuNum]+"\t"
								   +math[stuNum]+"\t"+sci[stuNum]+"\t"
								   +total[stuNum]+"\t"+avg[stuNum]+"\t");
		}
		
//		System.out.println(label[0]+":"+kor[0]);
//		System.out.println(label[1]+":"+eng[0]);
//		System.out.println(label[2]+":"+math[0]);
//		System.out.println(label[3]+":"+sci[0]);
//		System.out.println(label[4]+":"+total[0]);
//		System.out.println(label[5]+":"+evg[0]);
		

	}

}
