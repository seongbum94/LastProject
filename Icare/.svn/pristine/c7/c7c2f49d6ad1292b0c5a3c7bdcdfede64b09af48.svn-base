package icare.employManage.dao;

import java.sql.SQLException;
import java.util.List;

import icare.commons.Criteria;
import icare.dto.TeacherVO;
import icare.employManage.controller.EmployCommand;

/**
 * 원장 - 직원 등록/수정
 * @author YSB
 */
public interface EmployManageDAO {
	/**
	 * 직원 목록을 조회하는 메서드
	 * @param cri
	 * @return 직원목록
	 * @throws SQLException
	 */
	public List<TeacherVO> getEmployList(Criteria cri) throws SQLException;
	
	/**
	 * 검색 조건에 맞는 직원 수를 가져오는 메서드
	 * @param cri
	 * @return 검색한 직원 수 
	 * @throws SQLException
	 */
	public int getTotalCount(Criteria cri) throws SQLException;

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
