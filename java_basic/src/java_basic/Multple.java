package java_basic;

public class Multple {

	public static void main(String[] args) {
		
//		int orgn = 2;
//		int sum = 0;
		
//		for(int i=1;i<10;i++) {
//			sum = orgn*i;
//			System.out.println(orgn+"*"+i+"="+sum);		
//			}

//		int dan = 2;
		String result = "";
//		for(int gop=1;gop<10;gop++) {
//			result = result+(dan + "*" + gop + " = " + (dan*gop)+"\n");
			
//		}
				
//		System.out.println(result);

		for (int dan=2; dan <10; dan++) {
			for (int gop=1; gop<10; gop++) {				
				result = (dan+"*"+gop+"="+(dan*gop)+"\n");			
			}
			
			result = result + "\n";			
		}
		
		System.out.println(result);
		
	}
	
}