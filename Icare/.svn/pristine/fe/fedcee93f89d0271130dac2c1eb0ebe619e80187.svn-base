package icare.employManage.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.TeacherVO;

/**
 * 원장 - 직원 등록/수정
 * @author YSB
 */
public interface EmployManageService {
	/**
	 * 직원 목록을 조회하는 메서드
	 * @param cri
	 * @return 직원목록
	 * @throws SQLException
	 */
	public Map<String, Object> getEmployList(Criteria cri) throws SQLException;

	/**
	 * 교사를 등록하는 메서드
	 * @param teacher
	 * @throws SQLException
	 */
	public void insertTeacher(TeacherVO teacher) throws SQLException;

	/**
	 * 교사 정보를 가져오는 메서드
	 * @param tid
	 * @return 교사정보
	 */
	public TeacherVO getTeacher(String tid);
}
