package com.studio7707.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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
		/*
		title = title.replace("<", "&lt;");
		title = title.replace("<", "&gt;");
		writer = writer.replace("<", "&lt;");
		writer = writer.replace("<", "&gt");
		 */	

			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriter(writer);
			boardDao.create(vo);
		
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		System.out.println("AA:"+boardDao.read(bno));
		return boardDao.read(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		System.out.println("BoardServiceImpl"+vo);
		boardDao.update(vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		
		boardDao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return boardDao.listAll();
	}
/*
	@Override
	public void increaseViewcnt(int bno, HttpSession session) throws Exception {

		long update_time = 0;
		
		if(session.getAttribute("update_time_"+bno) != null) {
			update_time = (Long)session.getAttribute("update_time_"+bno);
		}
		
		long current_time = System.currentTimeMillis();
		
		if(current_time - update_time > 5*1000) {
			boardDao.increaseViewcnt(bno);
			
			session.setAttribute("update_time_" +bno, current_time );
		}
	
	}*/

}
