package com.studio7707.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.studio7707.DAO.BoardDAO;
import com.studio7707.DTO.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO boardDao;

	@Override
	public void create(BoardVO vo) throws Exception {
		String title = vo.getTitle();
		String content = vo.getContent();
		String writer = vo.getWriter();
		System.out.println("writer" + writer);
		/*
		 * title = title.replace("<", "&lt;"); title = title.replace("<", "&gt;");
		 * writer = writer.replace("<", "&lt;"); writer = writer.replace("<", "&gt");
		 */

		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		boardDao.create(vo);

	}

	@Override
	public BoardVO read(int bno) throws Exception {
		System.out.println("AA:" + boardDao.read(bno));
		return boardDao.read(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		System.out.println("BoardServiceImpl" + vo);
		boardDao.update(vo);
	}

	@Override
	public void delete(int bno) throws Exception {

		boardDao.delete(bno);
	}

	/*@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("list query" + boardDao.listAll());
		return boardDao.listAll();
	}*/
	@Override
	public List<BoardVO> listAll(int displayPost, int postNum) throws Exception{
		return boardDao.listAll(displayPost, postNum);
	}
	
	public int count() throws Exception{
		return boardDao.count();
	}

	

}
