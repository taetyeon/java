package com.multi.ex06.inoutput;

public class OutputPractice {
	public static void main(String[] args) {
		String name = "김길동";
		int age = 26;
		double height = 180.5324;
		double weight = 65.5;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		
		
		System.out.println("안녕하세요? 저는 " + name + "입니다.");
		
		// printf = format 출력
		System.out.printf("이름은 %s, 나이는 %d, 키는 %f, 몸무게 %f\n", name, age, height, weight);
		System.out.printf("키는 %.2f, 몸무게 %.2f\n", height, weight); // 소수점 2자리까지 출력
		
		System.out.println("안녕하세요? 저는 " + name + "입니다. 키는 " + height +" 입니다.");
		
		// 문자열 format 활용하는 방법
		String heightStr = String.format("%.2f", height);
		System.out.println("안녕하세요? 저는 " + name + "입니다. 키는 " + heightStr +" 입니다.");
	}
}
