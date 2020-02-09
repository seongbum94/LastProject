package icare.weeklyPlan.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.dto.WeeklyPlanVO;

@Repository
public class WeeklyPlanDAOImpl implements WeeklyPlanDAO {
	
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public WeeklyPlanVO selectWeeklyPlanByEno(String eno) throws SQLException {
		
		WeeklyPlanVO week = session.selectOne("ContentShare-Mapper.selectWeeklyPlanByEno", eno);
		
		return week;
	}
}
