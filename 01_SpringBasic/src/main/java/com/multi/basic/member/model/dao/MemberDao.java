package com.multi.basic.member.model.dao;

import java.util.List;

import com.multi.basic.member.model.vo.Member;

// DI 추상 설계 - Spring은 interface 설계를 권장, 이를 상속 받아 동작하는 클래스를 다시 정의가 필요함 -> XXXImpl
//
// 설계 이점 (?) 
// 1. 설계 이점이 존재, 개발하기 전에 기능을 클래스에서 정의 가능하고 미리 정리하기 위해 작성
//  -> 협업시 개발 되지 않은 부분도 interface를 통해 미리 작동하도록 코드 구현이 가능
// 2. 느슨한 결합으로 실제 코드부가 변경되어 다른 코드가 영향을 받지 않는다. 
// 3. 같은 interface를 상속 받았지만, 다른 기능을 가진 객체를 설계할수 있다.
//  -> 관례적인 기법이기도 하다. 그래 안쓰는 곳은 안쓴다.

// 참고로 Spring에서는 impl을 쓰지 않아도 잘 동작된다. -> 프로젝트 할때는 interface 설계 안하는 것을 권장

public interface MemberDao {
	int insertMember(Member member);
	List<Member> selectAll();
	Member selectById(String id);
}
