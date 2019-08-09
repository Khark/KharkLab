package com.studio7707.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.studio7707.DTO.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;

	private static String namespace = "com.studio7707.mapper.MemberMapper.";

	@Override
	public List<MemberVO> memberList() throws Exception {
		return sqlSession.selectList(namespace + "memberList");
	}

	@Override
	public void joinMember(MemberVO vo) throws Exception {
		System.out.println("MemberDAOImpl :");
		sqlSession.insert(namespace + "joinMember", vo);
	}

	@Override
	public MemberVO viewMember() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberVO loginMember(MemberVO vo) throws Exception {
		System.out.println("SQL:" + namespace + "memberLogin" + vo);
		return sqlSession.selectOne(namespace + "memberLogin", vo);

	}

}
