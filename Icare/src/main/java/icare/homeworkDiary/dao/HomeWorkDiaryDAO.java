package icare.homeworkDiary.dao;

import java.sql.SQLException;
import java.util.List;

import icare.commons.Criteria;
import icare.dto.HomeworkDiaryVO;
/**
 * 교사 - 알림장 crud
 * @author LMY
 *
 */
public interface HomeWorkDiaryDAO {
	
	List<HomeworkDiaryVO> selectDiaryCriteria(Criteria cri) throws SQLException;
	
	int selectDiaryCriteriaTotalCount(Criteria cri) throws SQLException;
	
	//알림장 가져오기
	HomeworkDiaryVO selectDiaryByHwno(int hwno) throws SQLException;
	
	//알림장 작성
	void insertDiary(HomeworkDiaryVO diary) throws SQLException;
	
	//알림장 수정
	void updateDiary(HomeworkDiaryVO diary) throws SQLException;
	
	//알림장 삭제
	void deleteDiary(int hwno) throws SQLException;
	
	//viewcnt 증가
	void increasViewCnt(int hwno) throws SQLException;
	
	//HomeworkDiary_seq.nextval가져오기
	int selectHomeworkDiarySeqNext() throws SQLException;
	
	
}
