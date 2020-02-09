package icare.etools.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.dto.EtoolsVO;
import icare.etools.dao.EtoolsDAO;

@Service
public class EtoolsServiceImpl implements EtoolsService {
	
	@Autowired
	private EtoolsDAO etoolsDAO;
	public void setEtoolsDAO(EtoolsDAO etoolsDAO) {
		this.etoolsDAO = etoolsDAO;
	}
	
	
	@Override
	public EtoolsVO getEtools(String eno) throws SQLException {
		
		EtoolsVO etools = etoolsDAO.selectEtoolsByEno(eno);
		
		return etools;
	}
}
