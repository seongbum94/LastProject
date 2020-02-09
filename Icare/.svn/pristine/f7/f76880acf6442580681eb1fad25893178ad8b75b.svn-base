package icare.contentShare.service;

import java.sql.SQLException;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.ApprovalVO;
import icare.dto.EtoolsVO;
import icare.dto.StorageVO;
import icare.dto.WeeklyPlanVO;

public interface ContentShareService {
	
	/**
	 * 교육안 업로드 내역조회
	 * 전자결재 테이블에서 상태가 "승인"인 문서들의 list만 가져온다.
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	Map<String, Object> getUploadList(Criteria cri) throws SQLException;
	
	/**
	 * 컨텐츠 공유 게시판 내역조회
	 * 교육안 업로드에서 등록버튼을 누른 문서들의 list만 가져온다. (해당 유치원의 모든 교사들이 등록 버튼 누른 문서들)
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	Map<String, Object> getContentList(Criteria cri) throws SQLException;
	
	/**
	 * 교육안 업로드 내역조회
	 * 컨텐츠 공유 게시판에서 담기 버튼을 누른 문서들의 list만 가져온다.
	 * @param cri
	 * @return
	 * @throws SQLException
	 */
//	Map<String, Object> getStorageList(Criteria cri) throws SQLException;
	
	


	// ------------------------------------------------------------------------
	
	

	

	
	/**
	 * 전자결재 상세조회
	 * 해당 메서드는 getWeeklyPlan or getEtools메서드와 같이 사용한다.
	 * @param eno
	 * @return
	 * @throws SQLException
	 */
//	ApprovalVO getApproval(String eno) throws SQLException;
	
	// ------------------------------------------------------------------------
	
	/**
	 * 주간수업계획안 등록 메서드
	 * 해당 메서드는 insertApproval메서드와 함께 사용되어야 하나의 온전한 문서가 등록된다.
	 * @param week
	 * @throws SQLException
	 */
//	void insertWeeklyPlan(String eno) throws SQLException;
	
	
	/**
	 * 교재교구개발안 등록 메서드
	 * 해당 메서드는 insertApproval메서드와 함께 사용되어야 하나의 온전한 문서가 등록된다.
	 * @param etools
	 * @throws SQLException
	 */
//	void insertEtools(EtoolsVO etools) throws SQLException;
	
	

	
	// ------------------------------------------------------------------------
	
	/**
	 * 주간수업계획안 삭제 메서드
	 * 해당 메서드는 insertApproval메서드와 함께 사용되어야 하나의 온전한 문서가 삭제된다.
	 * @param eno
	 * @throws SQLException
	 */
//	void deleteWeeklyPlan(String eno) throws SQLException;
	
	/**
	 * 교재교구개발안 삭제 메서드
	 * 해당 메서드는 insertApproval메서드와 함께 사용되어야 하나의 온전한 문서가 삭제된다.
	 * @param eno
	 * @throws SQLException
	 */
//	void deleteEtools(String eno) throws SQLException;
	

	
	
}
