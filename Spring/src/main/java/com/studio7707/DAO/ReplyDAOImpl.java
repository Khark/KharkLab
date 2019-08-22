package com.studio7707.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.studio7707.DTO.ReplyVO;

@Repository("ReplyDAO")
public class ReplyDAOImpl implements ReplyDAO {

	@Inject
	SqlSession SqlSession;
	private static String namespace = "com.studio7707.mapper.ReplyMapper.";

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		 SqlSession.insert(namespace+"writeReply", vo);

	}

	@Override
	public List<ReplyVO> replyList(int bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ReplyListall bno : "+bno);
		return SqlSession.selectList(namespace + "listReply", bno);
	}

	@Override
	public int countReply(int bno) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne(namespace + "countReply", bno);
	}
	
	
	@Override
	public void deleteReply(int rno) throws Exception {
		// TODO Auto-generated method stub

	}

}
