import java.util.Scanner;

public class OperatorPractice {
	// 글로벌 변수로 사용
	public static Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		System.out.print("인원 수 : ");
		int userSize = Integer.parseInt(sc.nextLine());
		System.out.print("사탕 개수 : "); 
		int candySize = Integer.parseInt(sc.nextLine());
		System.out.println("1인당 사탕 개수 : " + (userSize / candySize)); 
		System.out.println("남는 사탕 개수 : " + (userSize % candySize)); 
	}
	
	public void practice2(){
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
	}

	public void practice3(){
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(result);
	}
	
	public void practice4(){
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		String result1 = num % 2 == 0 ? "짝수다" : "홀수다";
		String result2 = num % 2 == 0 ? (num == 0 ? "0이다" : "짝수다") : "홀수다";
		System.out.println(result1);
		System.out.println(result2);
	}
	
	public static void main(String[] args) {
		OperatorPractice practice = new OperatorPractice();
//		practice.practice1();
//		practice.practice2();
//		practice.practice3();
		practice.practice4();
	}
}
