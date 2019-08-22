package com.studio7707.DAO;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.studio7707.DTO.BoardVO;
import com.studio7707.DTO.ReplyVO;

@Repository("BoardDAO")
public class BoardDAOImpl implements BoardDAO {
	private Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);

	@Inject
	SqlSession SqlSession;
	private static String namespace = "com.studio7707.mapper.BoardMapper.";

	@Override
	public void create(BoardVO vo) throws Exception {

		SqlSession.insert(namespace + "insert", vo);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		System.out.println(namespace + ".view" + bno);
		return SqlSession.selectOne(namespace + "view", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		System.out.println("BoardDAOImpl:" + namespace + ".updateArticle, vo");
		SqlSession.update(namespace + "updateArticle", vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		SqlSession.delete(namespace + "deleteArticle", bno);
	}

	@Override
	public List<BoardVO> listAll(int dislpalyPost, int postNum) throws Exception{
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("displayPost", dislpalyPost);
		myMap.put("postNum", postNum);
		
		return SqlSession.selectList(namespace+"listAll", myMap);
		
	}
	/*public List<BoardVO> listAll() throws Exception {
		System.out.println("dddddd" + namespace + "listAll");
		return SqlSession.selectList(namespace + "listAll");
	}*/

	@Override
	public int count() throws Exception{
		return SqlSession.selectOne(namespace +"count");
	}
	
	@Override
	public void increaseViewcnt(int bno) throws Exception {

		SqlSession.update(namespace + "increaseViewcnt");
	}
	@Override
	public List<ReplyVO> replyList(int bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ReplyListall bno : " +bno);
		return SqlSession.selectList(namespace + "listReply", bno);
	}

}
