package icare.memberManage.parents.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.commons.exception.IdNotFoundException;
import icare.commons.exception.InvalidPasswordException;
import icare.dto.ParentsVO;
import icare.memberManage.parents.dao.ParentsDAO;


@Service
public class ParentsServiceImpl implements ParentsService {
	
	@Autowired
	private ParentsDAO parentsDAO;
	
	public void setParentsDAO(ParentsDAO parentsDAO){
		this.parentsDAO = parentsDAO;
	}

	@Override
	public void login(String pid, String pwd) throws SQLException {
		ParentsVO parents = parentsDAO.selectParentsById(pid);
		if (parents == null) throw new IdNotFoundException();
		if (!pwd.equals(parents.getPwd())) throw new InvalidPasswordException();
		
	}

	@Override
	public ParentsVO getParents(String pid) throws SQLException {
		return parentsDAO.selectParentsById(pid);
	}
}
