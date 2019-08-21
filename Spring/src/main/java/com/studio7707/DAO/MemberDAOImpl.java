package com.studio7707.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.studio7707.DTO.BoardVO;
import com.studio7707.DTO.MemberVO;

@Repository("MemberDAO")
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;
	private static String namespace = "com.studio7707.mapper.MemberMapper.";
	// Spring 에선 autuwire annotatino이 지원되지 않아 Injection으로 교체
	// 치명적인 에러는 아니였지만 콘솔에 WARN이 보기싫은 나 아이고난1
	@Override
	public List<MemberVO> memberList() throws Exception {
		return sqlSession.selectList(namespace + "memberList");
	}

	@Override
	public void joinMember(MemberVO vo) throws Exception {
		System.out.println("joinMember" + vo);
		sqlSession.insert(namespace + "joinMember", vo);
	}

	@Override
	public List<BoardVO> viewMember(String userName) throws Exception {
		System.out.println("viewMember"+ userName);
		/*return sqlSession.selectOne(namespace+"viewMember", UserName);
		*/
		return sqlSession.selectList(namespace+"viewMember", userName);
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

	@Override
	public int checkID(String userId) throws Exception {
		 System.out.println("checkID:"+ sqlSession.selectOne(namespace+"checkID",userId));
		// userId));
		return sqlSession.selectOne(namespace+"checkID",userId);
	}
	@Override
	public int checkName(String userName) throws Exception{
		
		return sqlSession.selectOne(namespace+"checkName",userName);
	}

}
