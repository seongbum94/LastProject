package icare.kinderManage.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import icare.commons.Criteria;
import icare.dto.KindergartenVO;


public interface KindergartenService {
	// 유치원 리스트 조회
	Map<String,Object> getKinderList(Criteria cri)throws SQLException;
	
	// 유치원 조회
	KindergartenVO getKinderById(int kid)throws SQLException;
	
	// 유치원 추가
	void regist(KindergartenVO vo)throws SQLException;
	
	// 유치원 정보 수정
	void modify(KindergartenVO vo)throws SQLException;
	
	// 유치원 정지
	void disable(String kid)throws SQLException;
}
