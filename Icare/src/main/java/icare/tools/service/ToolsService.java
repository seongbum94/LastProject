package icare.tools.service;

import java.sql.SQLException;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.ToolsVO;

public interface ToolsService {
	
	/**
	 * 교보재 내역조회
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
	Map<String, Object> getToolsList(Criteria cri) throws SQLException;
	
	
	/**
	 * 교보재 상세조회
	 * @param tsno
	 * @return
	 * @throws SQLException
	 */
	ToolsVO getTools(int tsno) throws SQLException;
	
	
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





