package com.studio7707.DAO;

import java.util.List;

import com.studio7707.DTO.BoardVO;
import com.studio7707.DTO.ReplyVO;

public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read (int bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
/*	public List<BoardVO> listAll() throws Exception;
*/	
	public List<BoardVO> listAll(int dislpalyPost, int postNum) throws Exception;

	public int count() throws Exception;
	
	public void increaseViewcnt(int bno) throws Exception;
	
	public List<ReplyVO> replyList(int bno) throws Exception;

}




