package com.multi.ex03.string;

public class StringPractice {
	// String은 자바에서 가장 많이 활용되는 Type이자 Java에서 특수취급을 받는 Type
	// 웹페이지 구성시 가장 많이 활용되는 Type
	
	public static void main(String[] args) {
		String str = "abc"; // 이 방법이 가장 표준적인 방법
		str = new String("abc"); // String은 절대 new로 생성하지 말 것!
		str = "ABC" +  "DEF"; // 합연산자
		str = new String("ABC" + "DEF");
		System.out.println(str);
		
		// 12345ABCDEF
		str = 123 + 45 + "ABC" + "DEF";
		System.out.println(str);
		
		// 해결법1 = 괄호 사용 (3 + 4) * 5 = 35;
		str = 123 + (45 + "ABC") + "DEF";
		System.out.println(str);

		// 해결법2 = 앞에 ""로 시작!
		str = "" + 123 + 45 + "ABC" + "DEF";
		System.out.println(str);
		
		// 문자열 한글 사용 가능
		str = "한글도 사용 가능!";
		System.out.println(str);
		
		// \t : tab, 들여쓰기
		System.out.println("홍길동이\t12\t010-5433-3333");
		System.out.println("최길\t12\t010-2121-3333");
		System.out.println("박길동\t31\t010-4124-1242");
		
		// \n : new line
		System.out.print("ABC\n");
		System.out.println("ABC");
		System.out.print("ABC\nABC\nABC\n");
		
		// \" : "을 출력할때 사용
		System.out.println("\"안녕?\"");
		
		// File path or 역슬러시를 쓰고 싶을때는? \\를 쓰면 \로 출력됨
		System.out.println("path : '\\' ");
		System.out.println("/02_Variable/src/com/multi/ex03/string/StringPractice.java");
		System.out.println("C:\\dev_source\\work_space_java_multi313\\02_Variable\\src\\com\\multi\\ex03\\string\\StringPractice.java");
		
		// unicode 출력하는 방법
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println(Integer.toHexString((int)'A'));
		System.out.println("\u0041");  // \\u를 붙여서 유니코드를 문자열로 출력 가능
		// 16진수란?
		// 0x0, 0x1, 0x2, 0x3 .... 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF -> 0x10
	}
}








