package com.multi.basic.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.basic.member.model.dao.MemberDao;
import com.multi.basic.member.model.vo.Member;


// @Service : 서비스임을 알리는 어노테이션 Bean 자동으로 생성되는 객체, new안쓸예정!
@Service
public class MemberServiceImpl implements MemberService {
	
	// 기존 서블릿에서 만들었던 방법 -> 강한 결합(?) -> Spring에서 new는 지양한다.
//	private MemberDao dao = new MemberDaoImpl();
	
//	@Autowired : 사용자가 별도로 객체를 만들지 않고 BeanFactory로 부터 객체의 관리를 위임하는 어노테이션
	// type은 MemberDao가 되고, 실제 생성되는 객체 MemberDaoImpl가 된다. 
	//    -> MemberDaoImpl에 @Repository 어노테이션으로 인해 자동으로 맵핑된다.    
	@Autowired
	private MemberDao dao;
	

	@Override
	public int joinMember(Member member) {
		return dao.insertMember(member);
	}

	@Override
	public List<Member> getAllList() {
		return dao.selectAll();
	}

	@Override
	public Member login(String id) {
		return dao.selectById(id);
	}

}
