package icare.memberManage.teacher.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.TeacherVO;

public interface TeacherManageService {
	
	// 선생 등록
	void regist (TeacherVO teacher)throws SQLException;
	
	// 선생 조회
	Map<String, Object> getTeacherList(Criteria cri) throws SQLException;
	
	// 선생 상세
	TeacherVO getTeacher(String tid) throws SQLException;
	
	// 선생 수정
	void modify(TeacherVO teacher)throws SQLException;
	
	// 선생 정지
	void disable(String tid)throws SQLException;
	
}
