package icare.tools.dao;

import java.sql.SQLException;
import java.util.List;

import icare.commons.Criteria;
import icare.dto.ToolsVO;

public interface ToolsDAO {
	
	/**
	 * 검색을 위한 메서드
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
	List<ToolsVO> selectToolsCriteria(Criteria cri) throws SQLException;
	
	/**
	 * 페이징을 위해 교보재의 총 수량을 구하는 메서드
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
	int selectToolsCriteriaTotalCount(Criteria cri) throws SQLException;
	
	/**
	 * Tsno를 통해 교보재를 상세조회하는 메서드
	 * @param tsno
	 * @return
	 * @throws SQLException
	 */
	ToolsVO selectToolsByTsno(int tsno) throws SQLException;
	
	/**
	 * 교보재 등록
	 * @param tools
	 * @throws SQLException
	 */
	void insertTools(ToolsVO tools) throws SQLException;
	
	/**
	 * 교보재 수정
	 * @param tools
	 * @throws SQLException
	 */
	void updateTools(ToolsVO tools) throws SQLException;
	
	/**
	 * 교보재 삭제
	 * @param tsno
	 * @throws SQLException
	 */
	void deleteTools(int tsno) throws SQLException;
	
	
}
