package icare.memberManage.teacher.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import icare.commons.Criteria;
import icare.dto.TeacherVO;

@Repository
public interface TeacherManageDAO {
	
	// 선생목록
	List<TeacherVO> selectSearchTeacherList(Criteria cri)throws SQLException;
	
	//선생목록 카운트
	int selectSearchTeacherListCount(Criteria cri) throws SQLException;
	
	//선생 상세
	TeacherVO selectSearchTeacherById(String tid)throws SQLException; 
	
	// 선생등록
	void insertTeacher(TeacherVO teacher)throws SQLException;
	
	// 선생수정
	void updateTeacher(TeacherVO teacher) throws SQLException;
	
	// 선생정지
	void disableTeacher(String tid) throws SQLException;
	
	
	
}
