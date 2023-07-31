package com.multi.ex06.inoutput;

import java.util.Scanner;

public class InputPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기
		System.out.println("문자열 입력 바랍니다.");
		String str = sc.nextLine();
		System.out.println(str);
		
		// 숫자 입력받기
//		System.out.println("숫자를 입력하세요.");
//		int value = sc.nextInt(); // 이 방법 사용하지 말것!!
//		System.out.println(value);
		
		// 실수 입력받기
//		System.out.println("실수를 입력하세요.");
//		double value2 = sc.nextDouble(); // 이 방법 사용하지 말것!!
//		System.out.println(value2);
		
		// 아래의 방법으로 향후 과제 진행해주세요!!
		// 정수 입력받기
		System.out.println("숫자를 입력하세요.");
		String str1 = sc.nextLine(); // 문자열 받기
		int value = Integer.parseInt(str1); // parseInt() : 문자열을 숫자로 변환해주는 함수
		System.out.println(value);

		// 실수 입력받기
		System.out.println("실수를 입력하세요.");
		String str2 = sc.nextLine(); // 문자열 받기
		double value2 = Double.parseDouble(str2); // parseDouble() : 문자열을 실수로 변환하는 함수
		System.out.println(value2);
		
		sc.close(); // 당분간 쓰지마세요!!
	}
}











