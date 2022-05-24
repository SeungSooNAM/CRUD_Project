package egovframework.example.sample.mapper;

import java.util.List;

import egovframework.example.sample.service.BoardVO;

public interface BoardMapper {

	List<BoardVO> freeboardList();
	void freeboardInsert(BoardVO boardVO);


}
