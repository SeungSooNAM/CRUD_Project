package egovframework.example.sample.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.sample.service.BoardService;
import egovframework.example.sample.service.BoardVO;

@Controller
public class BoardController {
	
	private BoardService boardService;
	
	@RequestMapping(value = "main.do")
	public String main() {
		
		return "board/main";
	}
	
	@RequestMapping(value = "board/freeboardList.do")
	public String freeBoardList() {
		
		return "board/freeboardList";
	}
	
	/*@RequestMapping(value="board/freeboardList.do")
	public ModelAndView freeList(ModelAndView mv) {
		
		List<BoardVO> boardVO = boardService.freeBoardList();
		
		mv.addObject("list", boardVO);
		mv.setViewName("board/freeboardList");
		
		return mv;
	}*/
	
	@GetMapping(value="board/freeboardWrite.do")
	public String freeboardInsertForm() {
		
		return "board/freeboardWrite";
	}
	
	@PostMapping(value = "board/freeboardWrite.do")
	public ModelAndView freeboardInsert(ModelAndView mv, BoardVO boardVO) {
		
		boardService.freeboardInsert(boardVO);
		
		mv.setViewName("board/freeboardWrite");
		return mv;
	}
}
