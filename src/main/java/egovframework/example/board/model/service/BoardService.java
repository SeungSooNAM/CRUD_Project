package egovframework.example.board.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BoardService {

	List<BoardVO> boardList();

	
}
