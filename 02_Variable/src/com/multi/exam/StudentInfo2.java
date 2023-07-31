package com.multi.exam;

import java.util.Scanner;

public class StudentInfo2 {

	// 정상 동작하는 코드 작성 및 스타일 조정
	public static void main(String[] args) {
		// 학사정보 관리 프로그램입니다.
		// 학생의 이름, 나이, 주소, 학년, 학점(소수점 까지 관리) 입력 받아주세요.
		// 모든 정보를 입력받으면 출력하는 기능을 만들어 주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름(을)를 입력하세요!");
		String name = sc.nextLine();
		
		System.out.println("나이(을)를 입력하세요!");
		int age = Integer.parseInt(sc.nextLine());
//		age = age + 3;
//		age = age - 3;
		
		System.out.println("주소(을)를 입력하세요!");
		String address = sc.nextLine();
		
		System.out.println("학년(을)를 입력하세요!");
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.println("학점(을)를 입력하세요!");
		double credit = Double.parseDouble(sc.nextLine());
		
		System.out.println("----------학사 정보-----------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("학년 : " + grade);
		System.out.println("학점 : " + credit);
	}
}
