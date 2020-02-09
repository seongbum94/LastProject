package icare.etools.service;

import java.sql.SQLException;

import icare.dto.EtoolsVO;

public interface EtoolsService {
	/**
	 * 교재교구개발안 상세조회
	 * 해당 메서드는 getApproval메서드와 같이 사용하여야 하나의 온전한 문서를 상세조회 할 수 있다.
	 * @param eno
	 * @return
	 * @throws SQLException
	 */
	EtoolsVO getEtools(String eno) throws SQLException;
}
