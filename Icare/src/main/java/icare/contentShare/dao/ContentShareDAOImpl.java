package icare.contentShare.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.commons.Criteria;
import icare.dto.ApprovalVO;
import icare.dto.EtoolsVO;
import icare.dto.StorageVO;
import icare.dto.WeeklyPlanVO;

@Repository
public class ContentShareDAOImpl implements ContentShareDAO {
	
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	
	
	
//	@Override
//	public List<WeeklyPlanVO> selectWeeklyPlanCriteria(Criteria cri) throws SQLException {
//		
//		int offset = cri.getPageStartRowNum();
//		int limit = cri.getPerPageNum();
//		RowBounds rowBounds = new RowBounds(offset, limit);
//		
//		List<WeeklyPlanVO> weekList = session.selectList("ContentShare-Mapper.selectWeeklyPlanCriteria", cri, rowBounds);
//		
//		return weekList;
//	}
//	@Override
//	public List<EtoolsVO> selectEtoolsCriteria(Criteria cri) throws SQLException {
//		
//		int offset = cri.getPageStartRowNum();
//		int limit = cri.getPerPageNum();
//		RowBounds rowBounds = new RowBounds(offset, limit);
//		
//		List<EtoolsVO> etoolsList = session.selectList("ContentShare-Mapper.selectEtoolsCriteria", cri, rowBounds);
//		
//		return etoolsList;
//	}
	
	// -------------------------------------------------------------------------------------
	

//	@Override
//	public int selectContentCriteriaTotalCount(Criteria cri) throws SQLException {
//		
//		int count = session.selectOne("ContentShare-Mapper.selectContentCriteriaTotalCount", cri);
//		
//		return count;
//	}
//	@Override
//	public int selectStorageCriteriaTotalCount(Criteria cri) throws SQLException {
//		
//		int count = session.selectOne("ContentShare-Mapper.selectStorageCriteriaTotalCount", cri);
//		
//		return count;
//	}
	
	// -------------------------------------------------------------------------------------
	


	
//	@Override
//	public ApprovalVO selectApprovalByEno(String eno) throws SQLException {
//		
//		ApprovalVO approval = session.selectOne("ContentShare-Mapper.selectApprovalByEno", eno);
//		
//		return approval;
//	}
	
	// -------------------------------------------------------------------------------------
	
//	@Override
//	public void insertWeeklyPlan(String eno) throws SQLException {
//		
//		session.update("ContentShare-Mapper.insertWeeklyPlan", eno);
//	}
//	@Override
//	public void insertEtools(EtoolsVO etools) throws SQLException {
//		session.update("ContentShare-Mapper.insertEtools", etools);
//	}
	

	
	// -------------------------------------------------------------------------------------
	
//	@Override
//	public void deleteWeeklyPlan(String eno) throws SQLException {
//		session.update("ContentShare-Mapper.deleteWeeklyPlan", eno);
//	}
//	@Override
//	public void deleteEtools(String eno) throws SQLException {
//		session.update("ContentShare-Mapper.deleteEtools", eno);
//	}
	

	

}
