package com.multi.ex05.typecasting;

public class TypeCasting {
	// TypeCasting이란? type간의 형을 변환하는 방법, ex) int -> long, int -> double
	
	// 종류 2가지
	// 1) 자동 형변환 : 작은 Type에서 큰 Type으로 갈 때, 아무 문제가 없고, cast를 명시하지 않아도 된다. 
	// 	  묵시적 형변환
	
	// 2) 강제 형변환 : 큰 Type에서 작은 Type으로 갈 때, 데이터 손실이 발생할수 있다!
//					 반드시 cast 문법을 명시해야한다. -> 안하면 에러발생 -> 문제 발생한다!!
	//	  명시적 형변환
	
	public static void main(String[] args) {
		byte val = 100; // 숫자는 int형으로 정의된다!
		val = 123;
		val = (byte)123; // 묵시적 형변환이 가능한데, 문법적으로 cast를 해본 상황, 문제없다!
//		val = 4000; // Type mismatch 발생!!
		val = (byte) 4000; // overflow는 발생
		System.out.println(val); // -96 = overflow 숫자
		
		// 의도한 강제형변환 문법 1. 소수점 버리기!
		int value1 = 0;
		double value2 = 3.14; // 소수점을 버림을 해야한다면? 강제형변환 활용하면 된다!
		value1 = (int) value2;
		System.out.println(value1);
		
		// 의도한 강제형변환 문법 2. 문자열 형변환
		char ch = 'A';
		int alpha = ch; // 65
		System.out.println(ch);
		System.out.println(alpha);
		System.out.println((char)alpha); // 강제형변환!
		System.out.println((char)++alpha); // 강제형변환!
		System.out.println((char)++alpha); // 강제형변환!
		System.out.println((char)++alpha); // 강제형변환!
		System.out.println((char)++alpha); // 강제형변환!
		System.out.println((char)(alpha - 'A' + 'a')); // 소문자 바꾸기? E -> e
	}
}








