package egovframework.example.sample.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface BoardService {

	void freeboardInsert(BoardVO boardVO);

	List<BoardVO> freeBoardList();


}
