package icare.Board.service;

import java.sql.SQLException;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.BoardVO;

public interface BoardService {
	
	//목록조회
	Map<String, Object> getBoardList(Criteria cri) throws SQLException;
	
	//상세보기
	BoardVO getBoard(int bno)throws SQLException;
	
	//등록
	void write(BoardVO board)throws SQLException;
	
	//수정
	void modify(BoardVO board) throws SQLException;
	
	//삭제
	void remove(int bno) throws SQLException;
}
