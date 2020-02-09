package icare.tools.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.commons.Criteria;
import icare.dto.ToolsVO;

@Repository
public class ToolsDAOImpl implements ToolsDAO {
	
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public List<ToolsVO> selectToolsCriteria(Criteria cri) throws SQLException {
		
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		List<ToolsVO> toolsList = session.selectList("Tools-Mapper.selectSearchToolsList", cri, rowBounds);
		 
		return toolsList;
	}
	
	@Override
	public int selectToolsCriteriaTotalCount(Criteria cri) throws SQLException {
		
		int count = session.selectOne("Tools-Mapper.selectSearchToolsListCount", cri);
		
		return count;
	}
	
	@Override
	public ToolsVO selectToolsByTsno(int tsno) throws SQLException {
		
		ToolsVO tools = session.selectOne("Tools-Mapper.selectToolsByTsno", tsno);
		
		return tools;
	}

	@Override
	public void insertTools(ToolsVO tools) throws SQLException {
		
		session.update("Tools-Mapper.insertTools", tools);
	}

	@Override
	public void updateTools(ToolsVO tools) throws SQLException {
		
		session.update("Tools-Mapper.updateTools", tools);
	}

	@Override
	public void deleteTools(int tsno) throws SQLException {
		
		session.update("Tools-Mapper.deleteTools", tsno);
	}

}
