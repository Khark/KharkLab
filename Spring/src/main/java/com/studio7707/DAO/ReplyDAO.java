package com.studio7707.DAO;

import java.util.List;

import com.studio7707.DTO.ReplyVO;

public interface ReplyDAO {
	
	public void writeReply(ReplyVO vo) throws Exception;
	
	public List<ReplyVO> replyList(int bno) throws Exception;
	
	public int countReply(int bno) throws Exception;
	
	public void deleteReply(int rno) throws Exception;
}
