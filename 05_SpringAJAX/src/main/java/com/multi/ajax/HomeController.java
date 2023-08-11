package com.multi.ajax;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.multi.ajax.model.vo.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/jsAjax.do", produces="text/html; charset=utf8" )
	@ResponseBody
	public String javascriptAjax(String name, int age) {
		String returnValue = "name : " + name + ", age = " + age;
		return "서버 응답 값<br>" + returnValue;
	}
	
	@RequestMapping(value = "/jqAjax1.do", produces="text/html; charset=utf8" )
	@ResponseBody
	public String jQueryAjax1(String inputValue) {
		return "서버 응답 값<br>" + inputValue;
	}
	
	@RequestMapping(value = "/jqAjax2.do", produces="text/html; charset=utf8" )
	@ResponseBody
	public String jQueryAjax2(String name, int age) {
		String returnValue = "name : " + name + ", age = " + age;
		return "서버 응답 값<br>" + returnValue;
	}
	
	// json-simple lib로 json 만드는 법 
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/jqAjax3.do", produces="application/json;charset=UTF-8" )
	@ResponseBody
	public String jQueryAjax3() {
		// java 객체 -> JSON 
		Member member = new Member(100, "심길동", 33, '남');
		
		// json-simple lib로 json 만드는 법 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("no", member.getNo());
		jsonObject.put("name", member.getName());
		jsonObject.put("age", member.getAge());
//				jsonObject.put("gender", member.getGender()); // 문제 코드
		jsonObject.put("gender", "" + member.getGender()); // 에러 코드!!!!
		// 문자 설계, 지양하거나 gson쓰면 해결된다
		
		System.out.println(jsonObject.toJSONString());
		return jsonObject.toJSONString();
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/jqAjax4.do", produces="application/json;charset=UTF-8" )
	@ResponseBody
	public String jQueryAjax4() {
		List<Member> list = new ArrayList<Member>();
		list.add(new Member(100, "홍길동", 25, '남'));
		list.add(new Member(101, "최길순", 45, '여'));
		list.add(new Member(102, "관길동", 23, '남'));
		list.add(new Member(103, "김길순", 24, '여'));
		list.add(new Member(104, "이길동", 31, '남'));
		
		JSONArray array = new JSONArray();
		for(Member member : list) {
			// JSON 객체를 통한 생성법
			JSONObject object = new JSONObject(); 
			object.put("no", member.getNo());
			object.put("name", member.getName());
			object.put("age", member.getAge());
			object.put("gender", ""+ member.getGender());
			array.add(object);
		}
		System.out.println(array.toJSONString());
		return array.toJSONString();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/jqAjax5.do", produces="application/json;charset=UTF-8" )
	@ResponseBody
	public String jQueryAjax5(int page) {
		List<Member> list = new ArrayList<Member>();
		for(int i = 0; i <page; i++) {
			list.add(new Member(200+i, "홍길동"+i, 25+i, '남'));
		}
		
		// GSON을 통한 객체 생성
		// GSON은 Google에서 만든 library
		
		// 1. gson.toJson으로 만드는 방법 
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		System.out.println(jsonStr);
		
		// 2. GsonBuilder - 스크림을 활용해서 전달 할때
		String jsonStr2 = new GsonBuilder().create().toJson(list);
		System.out.println(jsonStr2);
		
		// setPrettyPrinting() : 사람이 보기 편하게 바꿔주는 옵션
		String jsonStr3 = new GsonBuilder().setPrettyPrinting().create().toJson(list);
		System.out.println(jsonStr3);
		
		return jsonStr2;
	}
	
}
