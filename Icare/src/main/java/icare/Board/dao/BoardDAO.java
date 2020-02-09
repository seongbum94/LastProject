package icare.Board.dao;

import java.sql.SQLException;
import java.util.List;

import icare.commons.Criteria;
import icare.dto.BoardVO;

public interface BoardDAO {
	
	//리스트
	List<BoardVO> selectBoardCriteria(Criteria cri) throws SQLException;
	
	int selectBoardCriteriaTotalCount(Criteria cri) throws SQLException;
	//상세

	BoardVO selectBoardByBno(int bno) throws SQLException;
	//글 작성
	void insertBoard(BoardVO board) throws SQLException;
	//viewcnt증가
	void increaseViewCnt(int bno) throws SQLException;
	
	//수정
	void updateBoard(BoardVO board) throws SQLException;
	
	//삭제
	void deleteBoard(int bno) throws SQLException;
}
