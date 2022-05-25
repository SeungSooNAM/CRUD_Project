package egovframework.example.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.board.model.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "main.do")
	public String maingPage() {
		
		return "main";
	}
	
	@GetMapping(value = "boardList.do")
	public ModelAndView boardList(ModelAndView mv) {
		
		
		
		mv.setViewName("boardList");
		
		return mv;
	}
	
	@RequestMapping("boardInsert.do")
	public ModelAndView boardInsert(ModelAndView mv) {
		
		
		mv.setViewName("boardInsert");
		
		return mv;
	}
}
