package icare.tools.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icare.commons.Criteria;
import icare.commons.PageMaker;
import icare.dto.ToolsVO;
import icare.tools.dao.ToolsDAO;

@Service
public class ToolsServiceImpl implements ToolsService {
	
	@Autowired
	private ToolsDAO toolsDAO;
	public void setToolsDAO(ToolsDAO toolsDAO) {
		this.toolsDAO = toolsDAO;
	}
	
	@Override
	public Map<String, Object> getToolsList(Criteria cri) throws SQLException {
		Map<String, Object> dataMap = new HashMap<String,Object>();
		
		//현재 page 번호에 맞는 리스트를 perPageNum 개수 만큼 가져오기.
		List<ToolsVO> toolsList = toolsDAO.selectToolsCriteria(cri);
		
		//전체 tools 개수
		int totalCount = toolsDAO.selectToolsCriteriaTotalCount(cri);
		
		//pageMaker 생성
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		
		dataMap.put("toolsList", toolsList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}
	
	@Override
	public ToolsVO getTools(int tsno) throws SQLException {
		ToolsVO tools = toolsDAO.selectToolsByTsno(tsno);
		
		return tools;
	}
	
	@Override
	public void insertTools(ToolsVO tools) throws SQLException {
		toolsDAO.insertTools(tools);
		
	}
	
	@Override
	public void updateTools(ToolsVO tools) throws SQLException {
		toolsDAO.updateTools(tools);
		
	}
	
	@Override
	public void deleteTools(int tsno) throws SQLException {
		toolsDAO.deleteTools(tsno);
		
	}
	
	
	
}
