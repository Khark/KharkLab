package com.studio7707.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.studio7707.VO.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	SqlSession SqlSession;
	private static String namespace = "com.studio7707.mapper.BoardMapper";
	@Override
	public void create(BoardVO vo) throws Exception {

		SqlSession.insert(namespace+".insert", vo);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		System.out.println(namespace+".view"+ bno);
		return SqlSession.selectOne(namespace+".view", bno);
	}
/*
	@Override
	public void update(BoardVO vo) throws Exception {
		SqlSession.update("board.updateArticle, vo");
	}
*/
	@Override
	public void delete(int bno) throws Exception {
		SqlSession.delete(namespace+".deleteArticle", bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		System.out.println(namespace+".listAll");
		return SqlSession.selectList(namespace+".listAll");
	}

	@Override
	public void increaseViewcnt(int bno) throws Exception {
		System.out.println("aaaaaa");

		SqlSession.update(namespace+".increaseViewcnt");
	}

}
