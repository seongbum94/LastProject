package icare.contentShare.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.commons.Criteria;
import icare.commons.PageMaker;
import icare.contentShare.dao.ContentShareDAO;
import icare.dto.ApprovalVO;
import icare.dto.EtoolsVO;
import icare.dto.StorageVO;
import icare.dto.WeeklyPlanVO;

@Service
public class ContentShareServiceImpl implements ContentShareService {
	
	@Autowired
	private ContentShareDAO contentShareDAO;
	public void setContentShareDAO(ContentShareDAO contentShareDAO) {
		this.contentShareDAO = contentShareDAO;
	}
	
	// -----------------------------------------------------------------------
	

	
	
//	@Override
//	public Map<String, Object> getUploadList(Criteria cri) throws SQLException {
//		
//		Map<String, Object> dataMap = new HashMap<String, Object>();
//		
//		List<WeeklyPlanVO> weekList = contentShareDAO.selectWeeklyPlanCriteria(cri);
//		List<EtoolsVO> etoolsList = contentShareDAO.selectEtoolsCriteria(cri);
//		
//		int totalCount = contentShareDAO.selectApprovalCriteriaTotalCount(cri);
//		
//		PageMaker pageMaker = new PageMaker();
//		pageMaker.setCri(cri);
//		pageMaker.setTotalCount(totalCount);
//		
//		dataMap.put("weekList", weekList);
//		dataMap.put("etoolsList", etoolsList);
//		dataMap.put("pageMaker", pageMaker);
//		
//		return dataMap;
//	}
//	@Override
//	public Map<String, Object> getContentList(Criteria cri) throws SQLException {
//		
//		Map<String, Object> dataMap = new HashMap<String, Object>();
//		
//		List<WeeklyPlanVO> weekList = contentShareDAO.selectWeeklyPlanCriteria(cri);
//		List<EtoolsVO> etoolsList = contentShareDAO.selectEtoolsCriteria(cri);
//		
//		int totalCount = contentShareDAO.selectContentCriteriaTotalCount(cri);
//		
////		ApprovalVO approval = null;
////		approval.setTemp("등록");
//		
//		PageMaker pageMaker = new PageMaker();
//		pageMaker.setCri(cri);
//		pageMaker.setTotalCount(totalCount);
//		
//		dataMap.put("weekList", weekList);
//		dataMap.put("etoolsList", etoolsList);
//		dataMap.put("pageMaker", pageMaker);
////		dataMap.put("approval", approval);
//		return dataMap;
//	}
//	@Override
//	public Map<String, Object> getStorageList(Criteria cri) throws SQLException {
//		
//		Map<String, Object> dataMap = new HashMap<String, Object>();
//		
//		List<WeeklyPlanVO> weekList = contentShareDAO.selectWeeklyPlanCriteria(cri);
//		List<EtoolsVO> etoolsList = contentShareDAO.selectEtoolsCriteria(cri);
//		
//		int totalCount = contentShareDAO.selectStorageCriteriaTotalCount(cri);
//		
//		PageMaker pageMaker = new PageMaker();
//		pageMaker.setCri(cri);
//		pageMaker.setTotalCount(totalCount);
//		
//		dataMap.put("weekList", weekList);
//		dataMap.put("etoolsList", etoolsList);
//		dataMap.put("pageMaker", pageMaker);
//		
//		return dataMap;
//	}
	
	// -----------------------------------------------------------------------
	

	

	
//	@Override
//	public ApprovalVO getApproval(String eno) throws SQLException {
//		
//		ApprovalVO approval = contentShareDAO.selectApprovalByEno(eno);
//		
//		return approval;
//	}
	
	// -----------------------------------------------------------------------
	
//	@Override
//	public void insertWeeklyPlan(String eno) throws SQLException {
//		contentShareDAO.insertWeeklyPlan(eno);
//		
//	}
//	
//	@Override
//	public void insertEtools(EtoolsVO etools) throws SQLException {
//		contentShareDAO.insertEtools(etools);
//		
//	}
	

	
	// -----------------------------------------------------------------------
	
//	@Override
//	public void deleteWeeklyPlan(String eno) throws SQLException {
//		contentShareDAO.deleteWeeklyPlan(eno);
//		
//	}
//	
//	@Override
//	public void deleteEtools(String eno) throws SQLException {
//		contentShareDAO.deleteEtools(eno);
//		
//	}
	

	

	
}
