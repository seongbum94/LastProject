package icare.approval.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.approval.controller.ApprovalCommand;
import icare.approval.dao.ApprovalDAO;
import icare.commons.Criteria;
import icare.commons.PageMaker;
import icare.dto.ApprovalVO;

@Service
public class ApprovalServiceImpl implements ApprovalService {
	
	@Autowired
	private ApprovalDAO approvalDAO;
	public void setApprovalDAO(ApprovalDAO approvalDAO) {
		this.approvalDAO = approvalDAO;
	}
	
	
	@Override
	public Map<String, Object> getApprovalList(ApprovalCommand command) throws SQLException {
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		List<ApprovalVO> approvalList = approvalDAO.selectApprovalCriteria(command);
		System.out.println(approvalList.get(0));
		int totalCount = approvalDAO.selectApprovalCriteriaTotalCount(command);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(command.getCriteria());
		pageMaker.setTotalCount(totalCount);
		
		dataMap.put("approvalList", approvalList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}
	
	@Override
	public void insertApproval(String eno) throws SQLException {
		approvalDAO.insertApproval(eno);
		
	}
}
