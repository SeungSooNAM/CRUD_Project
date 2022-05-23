package com.nam.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nam.board.service.boardService;

/**
 * 
 * CRUD를 하기 위한 게시판
 * 
 * 
 * */
@Controller
public class boardContorller {

	/* 의존성 주입 */
	@Autowired
	private boardService boardService;
	
	/* main.jsp */
	@RequestMapping(value = "main.do")
	public String mainPage() {
		
		return "main.do";
	}
	
	/* 공지사항 리스트 */
	
	/* 자유 게시판 리스트 */
	@RequestMapping(value="freeboard.do")
	public ModelAndView freeboardList(ModelAndView mv) {
		
		return mv;
	}
	
	/* 공지사항 상세보기 */
	
	/* 자유게시판 상세보기 */
	@RequestMapping(value = "freeboarddeatil.do")
	public ModelAndView freeboardDetail(ModelAndView mv) {
		
		
		return mv;
	}
	
	/* 공지사항 작성 */
	
	/* 자유 게시판 작성 */
	@RequestMapping(value = "freeboardInsert.do")
	public ModelAndView freeboardInsert(ModelAndView mv) {
		
		
		return mv;
	}
	
	
}
