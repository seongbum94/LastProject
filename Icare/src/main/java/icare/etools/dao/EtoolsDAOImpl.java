package icare.etools.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.dto.EtoolsVO;

@Repository
public class EtoolsDAOImpl implements EtoolsDAO {
	
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	
	@Override
	public EtoolsVO selectEtoolsByEno(String eno) throws SQLException {
		
		EtoolsVO etools = session.selectOne("ContentShare-Mapper.selectEtoolsByEno", eno);
		
		return etools;
	}
	
	
	
	
	
}
