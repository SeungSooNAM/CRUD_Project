package egovframework.example.board.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.board.model.mappers.BoardMapper;
import egovframework.example.board.model.service.BoardService;
import egovframework.example.board.model.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> boardList() {
		
		List<BoardVO> boardList = boardMapper.boardList();
		
		return boardList;
	}
}
