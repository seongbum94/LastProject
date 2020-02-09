package icare.kinderManage.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import icare.commons.Criteria;
import icare.dto.KindergartenVO;
@Repository
public class KindergartenDAOImpl implements KindergartenDAO {
	@Autowired
	private SqlSession session;
	public void setSqlSession(SqlSession session){
		this.session=session;
	}
	// 유치원 전체조회
//	@Override
//	public List<KindergartenVO> selectKinderList() throws SQLException {
//		List<KindergartenVO> kinderList=session.selectList("Kindergarten-Mapper.selectKinderList");
//		return kinderList;
//	}
	
	@Override
	public List<KindergartenVO> selectSearchKinderList(Criteria cri) throws SQLException {
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		List<KindergartenVO> kinderList = null;
		kinderList = session.selectList("Kindergarten-Mapper.selectSearchKinderList",cri, rowBounds);
		return kinderList;
	}
	
	// 유치원 이름 조회
	@Override
	public KindergartenVO selectKinderById(int kid) throws SQLException {
		KindergartenVO kinder = session.selectOne("Kindergarten-Mapper.selectKinderById",kid);
		return kinder;
	}
	
	// 유치원 등록
	@Override
	public void insertKinder(KindergartenVO vo) throws SQLException {
		session.update("Kindergarten-Mapper.insertKinder",vo);
	}
	
	// 유치원 수정
	@Override
	public void updateKinder(KindergartenVO vo) throws SQLException {
		session.update("Kindergarten-Mapper.updateKinder",vo);
		
	}
	
	@Override
	public void disableKinder(String id) throws SQLException {
		session.update("Kindergarten-Mapper.disableKinder",id);
		
	}
	
	// 카운트
	@Override
	public int selectSearchKinderListCount(Criteria cri) throws SQLException {
		int count = 0;
		count = session.selectOne("Kindergarten-Mapper.selectKinderListCount",cri);
		
		return count;
	}
	

}
