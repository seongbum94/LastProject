//package icare.memberManage.teacher.service;
//
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import icare.commons.Criteria;
//import icare.commons.PageMaker;
//import icare.dto.TeacherVO;
//import icare.memberManage.teacher.dao.TeacherManageDAO;
//@Service
//public class TeacherManageServiceImpl implements TeacherManageService {
//	@Autowired
//	private TeacherManageDAO teacherManageDAO;
//	public void setTeacherManageDAO(TeacherManageDAO dao) {
//		this.teacherManageDAO = dao;
//	}
//	
//	@Override
//	public void regist(TeacherVO teacher) throws SQLException {
//		teacherManageDAO.insertTeacher(teacher);	
//	}
//
//	@Override
//	public Map<String, Object> getTeacherList(Criteria cri) throws SQLException {
//		List<TeacherVO> teacherList=teacherManageDAO.selectSearchTeacherList(cri);
//		
//		PageMaker pageMaker = new PageMaker();
//		pageMaker.setCri(cri);
//		pageMaker.setTotalCount(teacherManageDAO.selectSearchTeacherListCount(cri));
//		
//		Map<String, Object> dataMap = new HashMap<String, Object>();
//		dataMap.put("teacherList", teacherList);
//		dataMap.put("pageMaker", pageMaker);
//		
//		return dataMap;
//	}
//
//	@Override
//	public TeacherVO getTeacher(String tid) throws SQLException {
//		TeacherVO teacher = teacherManageDAO.selectSearchTeacherById(tid);
//		return teacher;
//	}
//
//	@Override
//	public void modify(TeacherVO teacher) throws SQLException {
//		teacherManageDAO.updateTeacher(teacher);
//	}
//
//	@Override
//	public void disable(String tid) throws SQLException {
//		teacherManageDAO.disableTeacher(tid);
//	}
//
//}
