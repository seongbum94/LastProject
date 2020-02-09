package icare.approval.service;

import java.sql.SQLException;
import java.util.Map;

import icare.approval.controller.ApprovalCommand;
import icare.commons.Criteria;

public interface ApprovalService {
	
	/**
	 * 내역조회를 위한 메서드
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
	Map<String, Object> getApprovalList(ApprovalCommand command) throws SQLException;
	
	
	/**
	 * 전자결재 등록 메서드
	 * 해당 메서드는 insertWeeklyPlan메서드 or  insertEtools메서드 와 함께 사용된다.
	 * @param approval
	 * @throws SQLException
	 */
	void insertApproval(String eno) throws SQLException;
}
