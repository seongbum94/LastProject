package icare.approval.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.approval.controller.ApprovalCommand;
import icare.commons.Criteria;
import icare.dto.ApprovalVO;

@Repository
public class ApprovalDAOImpl implements ApprovalDAO {
	
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	// 내역조회를 위한 메서드
		@Override
		public List<ApprovalVO> selectApprovalCriteria(ApprovalCommand command) throws SQLException {
			
			int offset = command.getPageStartRowNum();
			int limit = command.getPerPageNum();
			RowBounds rowBounds = new RowBounds(offset, limit);
			
			List<ApprovalVO> approvalList = session.selectList("Approval-Mapper.selectApprovalCriteria", command, rowBounds);
			
			return approvalList;
		}
		
		
		@Override
		public int selectApprovalCriteriaTotalCount(ApprovalCommand command) throws SQLException {
			
			int count = session.selectOne("Approval-Mapper.selectApprovalCriteriaCount", command);
			
			return count;
		}
		
		
		@Override
		public void insertApproval(String eno) throws SQLException {
			session.update("Approval-Mapper.insertApproval", eno);
		}
		
		
		
		
		
}
