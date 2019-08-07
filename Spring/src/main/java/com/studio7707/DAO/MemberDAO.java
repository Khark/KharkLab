package com.studio7707.DAO;

import java.util.List;
import java.util.Map;

import com.studio7707.DTO.MemberVO;

public interface MemberDAO {

	public List<MemberVO> memberList() throws Exception;
	
	public void joinMember(MemberVO vo) throws Exception;
	
	public MemberVO viewMember() throws Exception;
	
	public void deleteMember(String userId) throws Exception;
	
	public void updateMember(MemberVO vo) throws Exception;
	
	public MemberVO loginMember(MemberVO vo) throws Exception;
}
