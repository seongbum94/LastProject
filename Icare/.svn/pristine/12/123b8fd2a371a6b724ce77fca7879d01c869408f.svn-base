package icare.homeworkDiary.service;

import java.sql.SQLException;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.HomeworkDiaryVO;

public interface HomeworkDiaryService {
	/**
	 * 알림장
	 * @author LMY
	 */
	
	//목록조회
	Map<String, Object> getDiaryList(Criteria cri) throws SQLException;
	
	//상세보기
	HomeworkDiaryVO getDiary(int hwno) throws SQLException;
	HomeworkDiaryVO getDiaryForModify(int hwno) throws SQLException;
	
	//등록
	void insertDiary(HomeworkDiaryVO diary) throws SQLException;
	
	//수정
	void ModifyDiray(HomeworkDiaryVO diary) throws SQLException;
	
	//삭제
	void deleteDiary(int hwno) throws SQLException;
	
	
	
}
