package java_basic;

public class Array2 {

	public static void main(String[] args) {
	
		//소수점 셋째자리에서 반올림
		String[] label = {"국어", "영어", "수학", "과학","총점","평균"};
		int[] kor = {90};
		int[] eng = {65};
		int[] math = {70};
		int[] sci = {80};
		int[] total = new int[1];
		float[] evg = new float[1];
		
		total[0] = kor[0]+eng[0]+math[0]+sci[0];
		evg[0] = (int)((total[0]/(float)(label.length-2))*100+0.5f)/100f;
		
		for(int i=0;i<label.length;i++) {
			System.out.print(label[i]+"\t");
		}
		System.out.println();
		System.out.println(kor[0]+"\t"+eng[0]+"\t"+math[0]+"\t"+sci[0]+"\t"+
						   total[0]+"\t"+evg[0]+"\t");
		
//		System.out.println(label[0]+":"+kor[0]);
//		System.out.println(label[1]+":"+eng[0]);
//		System.out.println(label[2]+":"+math[0]);
//		System.out.println(label[3]+":"+sci[0]);
//		System.out.println(label[4]+":"+total[0]);
//		System.out.println(label[5]+":"+evg[0]);
		

	}

}
