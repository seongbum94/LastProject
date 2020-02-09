package icare.storage.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.dto.StorageVO;
import icare.storage.dao.StorageDAO;

@Service
public class StorageServiceImpl implements StorageService {
	
	@Autowired
	private StorageDAO storageDAO;
	public void setStorageDAO(StorageDAO storageDAO) {
		this.storageDAO = storageDAO;
	}
	
	@Override
	public void deleteStorage(StorageVO storage) throws SQLException {
		storageDAO.deleteStorage(storage);
		
	}
	
	
}
