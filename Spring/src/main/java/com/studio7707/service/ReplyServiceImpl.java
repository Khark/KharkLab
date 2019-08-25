package com.studio7707.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.studio7707.DAO.ReplyDAOImpl;
import com.studio7707.DTO.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Inject
	ReplyDAOImpl replyDAO;

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		int bno = vo.getBno();
		String writer = vo.getWriter();
		String content = vo.getContent();
		vo.setBno(bno);
		vo.setWriter(writer);
		vo.setContent(content);
		System.out.println("ReplyService"+vo);

		replyDAO.writeReply(vo);
	}

	@Override
	public List<ReplyVO> replyList(int bno) throws Exception {
		return replyDAO.replyList(bno);
	}
	@Override
	public int countReply( int bno) throws Exception{
		return replyDAO.countReply(bno);
	}

	@Override
	public void deleteReply(int rno) throws Exception {
		// TODO Auto-generated method stub

	}

}
