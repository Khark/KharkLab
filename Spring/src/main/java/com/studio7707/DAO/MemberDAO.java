package com.studio7707.DAO;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.studio7707.DTO.MemberVO;

public interface MemberDAO {

	public List<MemberVO> memberList() throws Exception;
	
	public void joinMember(MemberVO vo) throws Exception;
	
	public MemberVO viewMember() throws Exception;
	
	public void deleteMember(String userId) throws Exception;
	
	public void updateMember(MemberVO vo) throws Exception;
	
}
