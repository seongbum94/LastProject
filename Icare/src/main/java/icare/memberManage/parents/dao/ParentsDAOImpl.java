
package icare.memberManage.parents.dao;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.dto.ParentsVO;

@Repository
public class ParentsDAOImpl implements ParentsDAO {
	
	//@Resource(name="sqlSession")
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSqlSession(SqlSessionTemplate session){
		this.session=session;
	}

	@Override
	public ParentsVO selectParentsById(String pid) throws SQLException {
		ParentsVO parents = session.selectOne("Parents-Mapper.selectParentsById",pid);
		return parents;
	}
}
