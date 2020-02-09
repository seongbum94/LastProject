package icare.homeworkDiary.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.commons.Criteria;
import icare.commons.PageMaker;
import icare.dto.HomeStudyVO;
import icare.dto.HomeworkDiaryVO;
import icare.homeworkDiary.dao.HomeWorkDiaryDAO;

@Service
public class HomeworkDiaryServiceImpl implements HomeworkDiaryService {

	@Autowired
	private HomeWorkDiaryDAO diaryDAO;
	public void setHomeworkDiaryDAO(HomeWorkDiaryDAO diaryDAO) {
		this.diaryDAO = diaryDAO;
	}
	
	@Override
	public Map<String, Object> getDiaryList(Criteria cri) throws SQLException {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		List<HomeworkDiaryVO> diaryList = diaryDAO.selectDiaryCriteria(cri);
		
		int totalCount = diaryDAO.selectDiaryCriteriaTotalCount(cri);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		
		dataMap.put("diaryList", diaryList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}

	@Override
	public HomeworkDiaryVO getDiary(int hwno) throws SQLException {
		HomeworkDiaryVO diary = diaryDAO.selectDiaryByHwno(hwno);
		diaryDAO.increasViewCnt(hwno);
		return diary;
	}

	@Override
	public HomeworkDiaryVO getDiaryForModify(int hwno) throws SQLException {
		HomeworkDiaryVO diary = diaryDAO.selectDiaryByHwno(hwno);
		return diary;
	}

	@Override
	public void insertDiary(HomeworkDiaryVO diary) throws SQLException {
		
		int hwno = diaryDAO.selectHomeworkDiarySeqNext();
		
		diary.setHwno(hwno);
		
		diaryDAO.insertDiary(diary);

	}

	@Override
	public void ModifyDiray(HomeworkDiaryVO diary) throws SQLException {
		diaryDAO.updateDiary(diary);

	}

	@Override
	public void deleteDiary(int hwno) throws SQLException {
		diaryDAO.deleteDiary(hwno);

	}

}
