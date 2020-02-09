package icare.memberManage.parents.dao;

import java.sql.SQLException;

import icare.dto.ParentsVO;

public interface ParentsDAO {
	ParentsVO selectParentsById(String pid) throws SQLException;
}
