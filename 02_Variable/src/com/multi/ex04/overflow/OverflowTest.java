package com.multi.ex04.overflow;

public class OverflowTest { // overflow = 넘침, 홍수

	public static void main(String[] args) {
		byte temp = 125;
		System.out.println(++temp); // 126
		System.out.println(++temp); // 127
		System.out.println(++temp); // 128
		System.out.println(++temp); // 129
		// 의도치 않은 overflow,
		// 해결법!? 개발자가 적절한 범위를 선정하여 변수를 사용해야한다!! 
		// Tip. 절절하게 큰 type을 사용한다. ex)int(+-21억까지 범위!)
		
		// byte범위 : -128 ~ +127
		for(byte i = 0; i < 300; i++) {
			System.out.println(i);
		}
	}
}
