package icare.homeworkDiary.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.commons.Criteria;
import icare.dto.HomeworkDiaryVO;
/**
 * 알림장
 * @author LMY
 *
 */
@Repository
public class HomeworkDiaryDAOImpl implements HomeWorkDiaryDAO {
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session=session;
	}
	
	
	@Override
	public List<HomeworkDiaryVO> selectDiaryCriteria(Criteria cri) throws SQLException {
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset,limit);
		
		List<HomeworkDiaryVO> diaryList = session.selectList("HomeworkDiary-Mapper.selectDiaryList", cri, rowBounds);
		
		return diaryList;
	}

	@Override
	public int selectDiaryCriteriaTotalCount(Criteria cri) throws SQLException {
		int count = session.selectOne("HomeworkDiary-Mapper.selectSearchDiartLsitCount", cri);
		return count;
	}

	@Override
	public HomeworkDiaryVO selectDiaryByHwno(int hwno) throws SQLException {
		
		HomeworkDiaryVO diary = session.selectOne("HomeworkDiary-Mapper.selectDiaryByHwno", hwno);
		return diary;
	}

	@Override
	public void insertDiary(HomeworkDiaryVO diary) throws SQLException {
		session.update("HomeworkDiary-Mapper.insertDiary", diary);

	}

	@Override
	public void updateDiary(HomeworkDiaryVO diary) throws SQLException {
		session.update("HomeworkDiary-Mapper.updateDiary", diary);

	}

	@Override
	public void deleteDiary(int hwno) throws SQLException {
		session.update("HomeworkDiary-Mapper.deleteDiary", hwno);

	}

	@Override
	public void increasViewCnt(int hwno) throws SQLException {
		session.update("HomeworkDiary-Mapper.increaseViewCnt", hwno);

	}

	@Override
	public int selectHomeworkDiarySeqNext() throws SQLException {
		
		int seq_num = session.selectOne("HomeworkDiary-Mapper.selectHomeworkDiarySeqNext");
		
		return seq_num;
	}

}
