package com.multi.basic.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private String id;
	private String name;
	private int age;
	private String gender;
	private String address;		  // form에는 존재하지 않을 멤버변수 -> 안쓸 예정
//	private List<String> devLang; // 개발 가능한 언어 -> 파라메터 List 설계 지양할것!
	private String[] devLang; // 개발 가능한 언어
}
