// 패키지 명 : 폴더 구분 또는 소스 코드 그룹핑 용도
package com.multi;

// 실행법 2가지
// 1. 재생 버튼 (run)
// 2. ctrl + F11(실행) / F11 디버깅

// 코드가 변경되면 반드시 저장이 필수다! 
// ctrl + s를 누르면 파일이 저장된다. 
// 강사 버릇 : 한줄 치면 자동으로 ctrl + s가 완성된다.
// 만약 저장하지 않은 경우는 파일 앞에 '*'이 붙는다.

// 주석 다는법(주석이란? 실행되지 않은 코드 = 설명 할 때 쓰는데 안쓰는 습관이 좋으나... 학습용으로는 최고!)
// 1. '//' 통해서 주석을 단다. -> 한줄만 가능
// 2. /* */을 통해서 주석을 다는데, * ~~~ * 안쪽은 모두 주석
// 3. 이클립스 주석 다는 법 : ctrl + / -> shift 된 범위가 모두 주석 처리 됨
/* 
 * 여기는 모두 주석
 * */

import java.util.Date;
// 외부 패키지를 가져오는 명령어
// F3를 누르면 코드 안을 볼수 있다. (보이지 않는 코드도 존재)

// Class를 지칭 'public class'가 붙으면 파일의 이름과 일치해야한다
//  -> 일치하지 않으면 에러 발생!
public class MyFirstClass {
	// 이름 바꾸고 싶다면 alt + shift + r

	// main : 프로그램의 시작 경로
	// ※ 주의 : main은 반드시 'public static void main(String[] args)'이어야 한다.
	// class 내에서 반드시 하나만 존재할수 있다!!
	// 'main'을 입력하고 Ctrl + space로 자동완성한다!
	public static void main(String[] args) {
//		sysout -> System.out.println의 단축 키워드로 자동완성 지원
		System.out.println("Hello Java World!!"); // println -> 문장 출력 이후 한줄(line) 띄는 명령어
		System.out.print("Hello Java World!"); // print -> 문장을 출력하는 명령, line 안띔!
		System.out.println("Hello Java World!!");

//		오류 고치는 방법
//		1. 마우스를 오류(에러, 빨간줄) 위에 위치하면 이클립스가 자동으로 팁을 준다. -> 해결까지 가능하다.
//		2. 자동 임포트 기능 활용 : ctrl + shift + o
		System.out.println(new Date());
		// 들여쓰기 중요하다.
		// -> java 문법적으로는 필요없다. 다만 가독성을 위해서 반드시 지켜야하는 암묵적인 룰
		// 이클립스 기준으로는 탭(\t)을 사용

		// Intent : 라인 들여쓰기. 고수는 가장 중요하게 여긴다. tab 사용
		// Format : 띄여쓰기 ' '
		// ctrl + space : 자동완성
		// ctrl + / : 주석 자동완성
		// ctrl + A : 모든 라인 선택
		// ctrl + i : 자동 들여쓰기
		// ctrl + shift + f : format 정렬 -> ctrl + i도 같이 수행
		// ctrl + z : 되돌리기
		// ctrl + y : 다시 실행하기
		// ctrl + d : 선택된 라인지우기
		// alt + ↑ : 선택된 라인 위로 옮기기
		// alt + ↓ : 선택된 라인 아래로로 옮기기
		// ctrl + alt + ↑ : 선택된 라인 위로 복사하기
		// ctrl + alt + ↓ : 선택된 라인 아래로 복사하기

	}

}
