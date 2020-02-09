package icare.Board.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.commons.Criteria;
import icare.dto.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSqlSession(SqlSessionTemplate session){
		this.session=session;
	}
	
	@Override
	public List<BoardVO> selectBoardCriteria(Criteria cri) throws SQLException {
		
		int offset= cri.getPageStartRowNum();
		int limit= cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset,limit);
		
		List<BoardVO> boardList = session.selectList("Board-Mapper.selectSearchBoardList",cri,rowBounds);
		
		return boardList;
	}

	@Override
	public int selectBoardCriteriaTotalCount(Criteria cri) throws SQLException {
		int count = session.selectOne("Board-Mapper.selectSearchBoardListCount",cri);
		
		return count;
	}

	@Override
	public BoardVO selectBoardByBno(int bno) throws SQLException {
		BoardVO board= session.selectOne("Board-Mapper.selectBoardByBno",bno);
		return board;
	}

	@Override
	public void insertBoard(BoardVO board) throws SQLException {
		System.out.println(board);
		session.update("Board-Mapper.insertBoard",board);
	}

	@Override
	public void increaseViewCnt(int bno) throws SQLException {
		session.update("Board-Mapper.increaseViewCnt",bno);
		
		
	}

	@Override
	public void updateBoard(BoardVO board) throws SQLException {
		session.update("Board-Mapper.updateBoard",board);
	}

	@Override
	public void deleteBoard(int bno) throws SQLException {
		session.update("Board-Mapper.deleteBoard",bno);
	}
	

}
