import java.util.Scanner;

public class ControlPractice {

	public static Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num > 0) {
			System.out.println("양수다.");
		}else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void practice2() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num > 0) {
			System.out.println("양수다.");
		}else if(num == 0){
			System.out.println("0이다.");
		}else { // num < 0
			System.out.println("음수이다.");
		}
	}
	
	public void practice3() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num % 2 ==  0) {
			System.out.println("짝수다.");
		}else {
			System.out.println("홀수다.");
		}
	}
	
	public void practice4() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num < 0) {
			System.out.println("양수가 아니다.");
			return;
		}
		
		if(num % 2 ==  0) {
			System.out.println("짝수다.");
		}else {
			System.out.println("홀수다.");
		}
	}
	
	public void practice5() {
		// 주민번호를 입력하세요(- 포함) : 132456-2123456
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = sc.nextLine();
		
		// 2000년생 이후 남여 성별 구분
		if(str.charAt(7) == '1' || str.charAt(7) == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
	}
	
	public void practice6() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
//		성인(19세 초과)인지 출력하세요.
//		ex.
//		나이 : 19
		
		// 나중에 개발자 스스로 검증하기 좋은 코드 = 가독성이 좋은 코드
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		if(age <= 13) {
			System.out.println("어린이");
		}else if (age > 13 && age <= 19) {
			System.out.println("청소년");
		} else { // age > 19
			System.out.println("성인");
		}
	}
	
	public void practice7() {
//		아이디, 비밀번호를 test/1212로 정하고 로그인 기능을 작성하세요.
//		로그인 성공 시 “로그인 성공”, 
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		String userID = "test";
		String userPW = "1234";
		System.out.println("아이디 : ");
		String inputID = sc.nextLine();
		System.out.println("비밀번호 : ");
		String inputPW = sc.nextLine();
		
		// 문자열 비교는 equals!!! contains 틀린답!! -> 이유 포함이라 일부 PW만 입력해도 로그인 성공 
		if(userID.equals(inputID) && userPW.equals(inputPW)) {
			System.out.println("로그인 성공");
		}else if(userID.equals(inputID) == false) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(userPW.equals(inputPW) == false) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	// 강사 패턴, 이렇게 하기를 추천!
	public void practice7_1() {
		String userID = "test";
		String userPW = "1234";
		System.out.println("아이디 : ");
		String inputID = sc.nextLine();
		System.out.println("비밀번호 : ");
		String inputPW = sc.nextLine();
		
		// 필터링 패턴! 예외를 제거한다.
		if(userID.equals(inputID) == false) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		if(userPW.equals(inputPW) == false) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		
		// 클린한 영역! = 문제 없는 영역
		System.out.println("로그인에 성공하였습니다.");
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int operand1 = Integer.parseInt(sc.nextLine());
		System.out.print("피연산자2 입력 : ");
		int operand2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.nextLine();
		
		String result = ""; // 문자열의 초기화 현업버전
		
		if(operand1 < 1 || operand2 < 1) {
			System.out.println("양수가 아닙니다.");
			return;
		}
		
		switch(operator) {
			case "+" : result += (operand1 + operand2); break;
			case "-" : result += (operand1 - operand2); break;
			case "*" : result += operand1 * operand2; break;
			case "/" : result += String.format("%.6f", ((double)operand1 / operand2)); break;
			case "%" : result += operand1 % operand2; break;
			default : System.out.println("잘못 입력하였습니다. 프로그램 종료");
					  return;
		}
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
	}
	
	public static void main(String[] args) {
		ControlPractice cp = new ControlPractice();
//		cp.practice1();
//		cp.practice2();
//		cp.practice3();
		cp.practice4();
		cp.practice5();
		cp.practice6();
		cp.practice7();
		cp.practice8();
	}
}
