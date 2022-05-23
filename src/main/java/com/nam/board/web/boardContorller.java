package com.nam.board.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	private static final Logger log = LoggerFactory.getLogger(boardContorller.class);
	
	/* main.jsp */
	@RequestMapping(value = "/main", method= RequestMethod.GET)
	public String mainPage() {
		
		return "main";
	}
	
	/* 공지사항 리스트 */
	
	/* 자유 게시판 리스트 */
	@RequestMapping(value="/freeboard")
	public ModelAndView freeboardList(ModelAndView mv) {
		
		return mv;
	}
	
	/* 공지사항 상세보기 */
	
	/* 자유게시판 상세보기 */
	@RequestMapping(value = "/freeboarddeatil")
	public ModelAndView freeboardDetail(ModelAndView mv) {
		
		
		return mv;
	}
	
	/* 공지사항 작성 */
	
	/* 자유 게시글 작성 */
	@RequestMapping(value = "/freeboardinsert")
	public ModelAndView freeboardInsert(ModelAndView mv) {
		
		
		return mv;
	}
	
	/* 자유 게시글 수정 */
	@RequestMapping(value = "/freeboardupdate")
	public ModelAndView freeboardUpdate(ModelAndView mv) {
		
		
		return mv;
	}
	
	/* 자유게시글 삭제 */
	@RequestMapping(value = "/freeboarddelete")
	public ModelAndView freeboardDelete(ModelAndView mv) {
		
		
		return mv;
	}
}
