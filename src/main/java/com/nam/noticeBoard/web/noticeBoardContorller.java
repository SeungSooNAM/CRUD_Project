package com.nam.noticeBoard.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nam.noticeBoard.service.noticeBoardService;

/**
 * 
 * CRUD를 하기 위한 게시판
 * 
 * 
 * */
@Controller
public class noticeBoardContorller {

	/* 의존성 주입 */
	@Autowired
	private noticeBoardService noticeBoardService;
	
	/* main.jsp */
	@RequestMapping(value = "main.do")
	public String mainPage() {
		
		return "main.do";
	}
	
}
