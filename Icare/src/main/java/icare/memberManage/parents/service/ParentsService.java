package icare.memberManage.parents.service;

import java.sql.SQLException;
import java.util.Map;

import icare.dto.ParentsVO;


public interface ParentsService {

	public void login(String pid, String pwd)throws SQLException;
	
	ParentsVO getParents(String pid) throws SQLException;
}	
