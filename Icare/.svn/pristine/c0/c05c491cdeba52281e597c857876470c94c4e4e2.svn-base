package icare.storage.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.dto.StorageVO;

@Repository
public class StorageDAOImpl implements StorageDAO {

	
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public void deleteStorage(StorageVO storage) throws SQLException {
		session.update("Storage-Mapper.deleteStorage", storage);
	}
	
}
