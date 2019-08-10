package com.studio7707.service;

import java.util.List;

import com.studio7707.DTO.MemberVO;

public interface MemberService {

	public List<MemberVO> memberList() throws Exception;

	public void joinMember(MemberVO vo) throws Exception;

	public MemberVO viewMember() throws Exception;

	public void deleteMember(String userId) throws Exception;

	public void updateMember(MemberVO vo) throws Exception;

	public MemberVO loginMember(MemberVO vo) throws Exception;

	public int checkID(String userId) throws Exception;
}
