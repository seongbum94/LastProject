package icare.weeklyPlan.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.dto.WeeklyPlanVO;
import icare.weeklyPlan.dao.WeeklyPlanDAO;

@Service
public class WeeklyPlanServiceImpl implements WeeklyPlanService {
	
	@Autowired
	private WeeklyPlanDAO weeklyPlanDAO;
	public void setWeeklyPlanDAO(WeeklyPlanDAO weeklyPlanDAO) {
		this.weeklyPlanDAO = weeklyPlanDAO;
	}
	
	
	@Override
	public WeeklyPlanVO getWeeklyPlan(String eno) throws SQLException {
		
		WeeklyPlanVO week = weeklyPlanDAO.selectWeeklyPlanByEno(eno);
		
		return week;
	}
	
	
	
	
	
	
	
}
