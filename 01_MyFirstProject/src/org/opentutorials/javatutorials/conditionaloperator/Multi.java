package org.opentutorials.javatutorials.conditionaloperator;

public class Multi {
//	public static void main(String[] args) {
//		String id = args[0];
//		String password = args[1];
//		if (id.equals("egoing") && password.equals("111111")) {
//			System.out.println("right");
//		} else {
//			System.out.println("wrong");
//		}
//	}
//}
//	public static void numbering() {
//		int i = 0; 	//정의 
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}
//	}
//
//	public static void main(String[] args) {
//		numbering(); //호출
//		numbering(); //호출
//		numbering(); //호출
//	}
//}
	public static void numbering(int init, int limit) {

//		int limit = 5;
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(3,5);
//		numbering();
//		numbering();
	}
	
}



