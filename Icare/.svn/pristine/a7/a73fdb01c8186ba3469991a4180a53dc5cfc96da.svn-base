package icare.kinderManage.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.commons.Criteria;
import icare.commons.PageMaker;
import icare.dto.KindergartenVO;
import icare.kinderManage.dao.KindergartenDAO;

@Service
public class KindergartenServiceImpl implements KindergartenService{
	
	@Autowired
	private KindergartenDAO kinderDAO;
	
	public void setKinderDAO(KindergartenDAO dao) {
		this.kinderDAO=dao;
	}
	
	
	@Override
	public Map<String, Object> getKinderList(Criteria cri) throws SQLException {
		List<KindergartenVO> kinderList = kinderDAO.selectSearchKinderList(cri);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(kinderDAO.selectSearchKinderListCount(cri));
		
		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("kinderList", kinderList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}

	@Override
	public KindergartenVO getKinderById(int kid) throws SQLException {
		return kinderDAO.selectKinderById(kid);
	}

	@Override
	public void regist(KindergartenVO vo) throws SQLException {
		kinderDAO.insertKinder(vo);
	}

	@Override
	public void modify(KindergartenVO vo) throws SQLException {
		kinderDAO.updateKinder(vo);
		
	}

	@Override
	public void disable(String kid) throws SQLException {
		kinderDAO.disableKinder(kid);
		
	}


}
