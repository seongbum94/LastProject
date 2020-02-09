package icare.approval.dao;

import java.sql.SQLException;
import java.util.List;

import icare.approval.controller.ApprovalCommand;
import icare.commons.Criteria;
import icare.dto.ApprovalVO;

public interface ApprovalDAO {
	
	/**
	 * 검색을 위한 메서드
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
	List<ApprovalVO> selectApprovalCriteria(ApprovalCommand command) throws SQLException;
	
	
	/**
	 * 페이징을 위해 교육안업로드 게시판에 있는 게시물의 총 합 수
	 * 총 합 수 : 승인된 주간수업계획안 게시물의 총 개수 + 승인된 교재교구개발안의 총 개수
	 * 
	 *  ! 쿼리문에서 두 테이블을 조인하던지 아니면 서비스임플에서 2개의 다오 메서드를 받아서 쓸지 결정.
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
	int selectApprovalCriteriaTotalCount(ApprovalCommand command) throws SQLException;
	
	
	/**
	 * 전자결재 등록 매서드
	 * 해당 메서드는 WeeklyPlan메서드 or Etools메서드와 합쳐져서 사용된다.
	 * @param approval
	 * @throws SQLException
	 */
	void insertApproval(String eno) throws SQLException;
	
}
