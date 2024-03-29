package com.studio7707.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.studio7707.DAO.MemberDAOImpl;
import com.studio7707.DTO.BoardVO;
import com.studio7707.DTO.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAOImpl memberDao;

	@Override
	public List<MemberVO> memberList() throws Exception {
		return memberDao.memberList();
	}

	@Override
	public void joinMember(MemberVO vo) throws Exception {

		String id = vo.getUserId();
		String pwd = vo.getUserPw();
		String username = vo.getUserName();
		String Email = vo.getUserEmail();
		System.out.println(id + pwd + Email);
		vo.setUserId(id);
		vo.setUserPw(pwd);
		vo.setUserName(username);
		vo.setUserEmail(Email);
		memberDao.joinMember(vo);
	}

	@Override
	public List<BoardVO> viewMember(String UserName) throws Exception {
		return memberDao.viewMember(UserName);
	}

	@Override
	public void deleteMember(String userId) throws Exception {
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		// 이ㅏㅇ
	}

	@Override
	public MemberVO loginMember(MemberVO vo) throws Exception {
		String id = vo.getUserId();
		String pwd = vo.getUserPw();
		System.out.print("MemberServiceIMPL" + id + pwd);
		vo.setUserId(id);
		vo.setUserPw(pwd);

		return memberDao.loginMember(vo);

	}

	@Override
	public int checkID(String userId) throws Exception {
		System.out.println("ServiceImpl" + userId);
		return memberDao.checkID(userId);
	}

	@Override
	public int checkName(String userName) throws Exception {
		return memberDao.checkName(userName);
	}

}
