package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.example.sample.mapper.BoardMapper;
import egovframework.example.sample.service.BoardService;
import egovframework.example.sample.service.BoardVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{

	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> freeBoardList() {
		
		List<BoardVO> boardList = boardMapper.freeboardList();
		
		return boardList;
	}
	@Override
	public void freeboardInsert(BoardVO boardVO) {

		boardMapper.freeboardInsert(boardVO);
	}


}
