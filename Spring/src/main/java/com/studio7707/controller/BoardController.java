package com.studio7707.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.studio7707.DTO.BoardVO;
import com.studio7707.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	/*
	 * @RequestMapping(value = "/", method =RequestMethod.GET) public String home()
	 * throws Exception{ return "list"; }
	 */
	/*
	 * 게시판 입장 컨트롤러 가장 처음 리스트를 불러오는 컨트롤러
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list() throws Exception {
		logger.info("BoardController LIST");
		List<BoardVO> list = boardService.listAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/list");
		mav.addObject("list", list);
		return mav;

	}

	/*
	 * 게시글 작성 페이지로 가기 위한 컨트롤러
	 */
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}

	/*
	 * 입력 후 리스트로 가기 위한 컨트롤러
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute BoardVO vo) throws Exception {
		boardService.create(vo);
		return "redirect:list.do";
	}

	/*
	 * 게시글을 읽는 컨트롤러
	 */
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public ModelAndView view(@RequestParam int bno, HttpSession session) throws Exception {
		// boardService.increaseViewcnt(bno, session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/view");
		mav.addObject("dto", boardService.read(bno));
		System.out.println("dto" + boardService.read(bno));
		return mav;
	}

	/*
	 * 게시글 삭제를 위한 컨트롤러
	 */
	@RequestMapping("delete.do")
	public String delete(@RequestParam int bno) throws Exception {
		boardService.delete(bno);
		return "redirect:list";
	}

	/*
	 * 수정 페이지를 호출하기 위한 컨트롤러
	 */
	@RequestMapping(value = "modify")
	public ModelAndView modify_view(@RequestParam int bno, HttpSession session) throws Exception {
		System.out.println("bno:" + bno);
		// boardService.increaseViewcnt(bno, session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/modify");
		mav.addObject("dto", boardService.read(bno));
		System.out.println("dto" + boardService.read(bno));
		return mav;
	}
	/*
	 * 수정 완료 후 데이터 입력하고, 리스트로 이동
	 */
	@RequestMapping(value = "update.do", method = RequestMethod.POST)
	public String update(@ModelAttribute BoardVO vo) throws Exception {
		boardService.update(vo);
		return "redirect:list.do";
	}

}
