package com.multi.ex01.basic;

import java.math.BigDecimal;

public class BasicVariable2 {
	// 기본형 Type = 8개.
	// 1. 정수형 : byte(1), short(2), int(4)★, long(8)★
	// 2. 실수 : float(4), double(8)★
	// 3. 문자 : char(2)
	// 4. 논리형 : boolean(1)★
	// 기본형의 특징 : 메모리에 직접 값이 저장되는 변수
	// 참고 : 참조형의 경우 메모리에 저장되는 값은 실제 값이 있는 메모리(heap) 주소지가 저장됨 
	
	public static void main(String[] args) {
		// 1. 정수형 byte(1), short(2), int(4)★, long(8)★
		byte byteValue = 100 ;
		short shortValue = 200;
		int intValue = 40000;
		long longValue = 123895028590835092L; // long 리터럴은 끝에 'l','L'이 있어야함
		
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		
		// 2. 실수 : float(4), double(8)★
		float floatValue = 3.141592653589793238f; // float 리털은 끝에 'f', 'F'가 있어야함
		double doubleValue = 3.141592653589793238;
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
		// 부동소수점의 표현은 계산의 오류가 내포한다는 것을 인지해야함
		// 컴퓨터에서 부동소수점 연산은 항상 오차를 발생하나 double로 사용할 경우 오차가 극히 적음. 
		// 부동소수점 표현 방법 지수부(10^-1), 가수부(314159265...)로 구성되어 있음
		// 실제 변수 크기에 따라 표현이 제한적이다!
		
		// BigDecimal -> 가급적 프로그래밍적으로 쓰지 말것!!
		BigDecimal bigValue = new BigDecimal("3.141592653589793238283940823049823904");
		System.out.println(bigValue);

		float testFloat = 0.1f + 0.2f;
		double testDouble = 0.1 + 0.2;
		System.out.println(testFloat); // 0.3
		System.out.println(testDouble); // 0.3
		// 결론 : 부동소수점은 항상 오차 가능성이 존재함으로 자리수 제한이 필요!
		
		String str = String.format("%.2f", testDouble);
		System.out.println(str);
		
		// 3. 문자 : char(2)
		char charValue1 = 65; // A
		char charValue2 = 'A';
//		char charValue3 = '가나다'; // 한글자만 가능!
		char charValue3 = '가';
		String strValue = "안녕하세요?";
		
		System.out.println(charValue1);
		System.out.println(charValue2);
		System.out.println(charValue3);
		System.out.println(strValue);
		System.out.println(strValue + charValue1); // 합연산 가능!
		System.out.println(charValue1 + strValue); // 합연산 가능!
		System.out.println((int)charValue3); // 가의 숫자 : 44032
		
		// 알파뱃 순서대로 출력하는 방법
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(i + 'A'));
		}
		// 가나다 순서대로 출력하는 방법 -> 안된다!!
//		for(int i = 0; i < 12; i++) {
//			System.out.print((char)(i + '가'));
//		}
		System.out.println();
		
		// 4. 논리형 : boolean(1)
		boolean isTrue = true; // 참
		System.out.println(isTrue);
		isTrue = false; // 거짓!
		System.out.println(isTrue);
		
		// 상수란? 프로그래밍에서 변하지 않는 수
		// 상수 표기법 : 모두 대문자 사용하고 띄어쓰기를 '_' 헝가리안식 표기(?)
		final int LECTURE_MAX_SIZE = 50; // 수강생 최대인원
//		LECTURE_MAX_SIZE = 60;
		System.out.println(LECTURE_MAX_SIZE);
		System.out.println(LECTURE_MAX_SIZE2);
	}
	
	// 상수는 public static final로 표현하는 것이 정석
	public static final int LECTURE_MAX_SIZE2 = 60; // 수강생 최대 인원
}













