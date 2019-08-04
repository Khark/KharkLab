package com.studio7707.DAO;

import javax.servlet.http.HttpSession;

import com.studio7707.VO.MemberVO;

public interface MemberDAO {

	public boolean loginCheck(MemberVO vo);
	
	public MemberVO viewMember(MemberVO vo);
	
	public void logout(HttpSession session);
	
}
