package icare.Board.kinderController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import icare.Board.service.BoardService;
import icare.commons.Criteria;
import icare.dto.BoardVO;

@Controller
@RequestMapping("/kinder")
public class KinderBoardController {
	
	@Autowired
	private BoardService service;
	
	public void setService(BoardService service) {
		this.service=service;
	}
	
//	@RequestMapping("/board/list")
//	public ModelAndView list(Criteria cri, ModelAndView mnv) throws SQLException{
//		String url ="board/list";
//		
//		Map<String, Object> dataMap = service.getBoardList(cri);
//		
//		mnv.addAllObjects(dataMap);
//		mnv.setViewName(url);
//		
//		return mnv;
//	}
}
