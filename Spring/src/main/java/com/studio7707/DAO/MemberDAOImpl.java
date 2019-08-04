package com.studio7707.DAO;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.studio7707.VO.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public boolean loginCheck(MemberVO vo) {
		
		String name = sqlSession.selectOne("member.loginCheck", vo);
		return (name == null) ? false : true;
		
	}

	@Override
	public MemberVO viewMember(MemberVO vo) {
		
		return sqlSession.selectOne("member.viewMember", vo);
		
	}

	@Override
	public void logout(HttpSession session) {

	}

}
