package egovframework.example.board.model.mappers;

import java.util.List;

import egovframework.example.board.model.service.BoardVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardMapper")
public interface BoardMapper {

	List<BoardVO> boardList();

}
