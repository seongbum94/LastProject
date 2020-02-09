package icare.contentShare.dao;

import java.sql.SQLException;
import java.util.List;

import icare.commons.Criteria;
import icare.dto.ApprovalVO;
import icare.dto.ContentVO;
import icare.dto.EtoolsVO;
import icare.dto.StorageVO;
import icare.dto.WeeklyPlanVO;

public interface ContentShareDAO {
	
	/**
	 * 검색을 위한 메서드(주간수업계획안)
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	List<WeeklyPlanVO> selectWeeklyPlanCriteria(Criteria cri) throws SQLException;
	
	/**
	 * 검색을 위한 메서드(교재교구개발안)
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	List<EtoolsVO> selectEtoolsCriteria(Criteria cri) throws SQLException;
	
	
	
	// ----------------------------------------------------------------------
	


	
	/**
	 * 페이징을 위해 컨텐츠공유게시판에 있는 게시물의 총 합 수
	 * select count(*) from content;
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	int selectContentCriteriaTotalCount(Criteria cri) throws SQLException;
	
	/**
	 * 페이징을 위해 컨텐츠공유보관함에 있는 게시물의 총 합 수
	 * select count(*) from storage
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	int selectStorageCriteriaTotalCount(Criteria cri) throws SQLException;
	
	// ----------------------------------------------------------------------
	
	
	
	/**
	 * 상세보기(ApprovalVO에 있는 값들을 가져오는 메서드)
	 * 
	 * @param eno
	 * @return
	 * @throws SQLException
	 */
//	ApprovalVO selectApprovalByEno(String eno) throws SQLException;
	
	// ----------------------------------------------------------------------
	
	/**
	 * 주간수업계획안 작성 메서드
	 * 해당 메서드는 approval메서드와 합쳐져서 사용되어야 전자결재 문서 하나가 비로소 완성된다.
	 * @param week
	 * @throws SQLException
	 */
//	void insertWeeklyPlan(String eno) throws SQLException;
	
	/**
	 * 교재교구개발안 작성 메서드
	 * 해당 메서드는 approval메서드와 합쳐져서 사용되어야 전자결재 문서 하나가 비로소 완성된다.
	 * @param etools
	 * @throws SQLException
	 */
//	void insertEtools(EtoolsVO etools) throws SQLException;
	

	
	// ----------------------------------------------------------------------
	
	/**
	 * 주간수업계획안을 삭제하는 메서드
	 * 해당 메서드는 Approval메서드와 함께 사용하여야 온전한 문서 하나가 삭제된다.
	 * @param eno
	 * @throws SQLException
	 */
//	void deleteWeeklyPlan(String eno) throws SQLException;
	
	/**
	 * 교재교구개발안을 삭제하는 메서드
	 * 해당 메서드는 Approval메서드와 함께 사용하여야 온전한 문서 하나가 삭제된다.
	 * @param eno
	 * @throws SQLException
	 */
//	void deleteEtools(String eno) throws SQLException;
	

	
	
	
}
