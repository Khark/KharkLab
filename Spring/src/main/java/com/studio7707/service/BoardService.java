package com.studio7707.service;

import java.util.List;

import com.studio7707.DTO.BoardVO;

public interface BoardService {

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(int bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(int bno) throws Exception;

	/*public List<BoardVO> listAll() throws Exception;
	*/
	
	public List<BoardVO> listAll(int displayPost, int postNum) throws Exception;
	
	public int count() throws Exception;


}
