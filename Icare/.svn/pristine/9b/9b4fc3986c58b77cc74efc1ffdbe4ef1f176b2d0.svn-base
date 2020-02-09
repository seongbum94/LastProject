package icare.employManage.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.commons.Criteria;
import icare.commons.PageMaker;
import icare.dto.TeacherVO;
import icare.employManage.dao.EmployManageDAO;

@Service
public class EmployManageServiceImpl implements EmployManageService{
	
	@Autowired
	private EmployManageDAO employDAO;
	
	public void setEmployDAO(EmployManageDAO employMangeDAO) {
		this.employDAO = employMangeDAO;
	}

	@Override
	public Map<String, Object> getEmployList(Criteria cri) throws SQLException {
		
		List<TeacherVO> employList = employDAO.getEmployList(cri);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		PageMaker pageMaker = new PageMaker();	
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(employDAO.getTotalCount(cri));
		
		dataMap.put("employList", employList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}

	@Override
	public void insertTeacher(TeacherVO teacher) throws SQLException {
		employDAO.insertTeacher(teacher);
	}

	@Override
	public TeacherVO getTeacher(String tid) {
		return employDAO.getTeacher(tid);
	}
}
