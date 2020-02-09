package icare.kinderManage.dao;

import java.sql.SQLException;
import java.util.List;

import icare.commons.Criteria;
import icare.dto.KindergartenVO;

public interface KindergartenDAO {
	// 유치원 리스트 조회
	List<KindergartenVO> selectSearchKinderList(Criteria cri)throws SQLException;
	
	
	int selectSearchKinderListCount(Criteria cri)throws SQLException;
	
	// 유치원 이름으로 조회
	KindergartenVO selectKinderById(int kid)throws SQLException;
	
	// 유치원 추가
	void insertKinder(KindergartenVO vo)throws SQLException;
	
	// 유치원 정보 수정
	void updateKinder(KindergartenVO vo)throws SQLException;
	
	// 유치원 정지
	void disableKinder(String id)throws SQLException;
}
