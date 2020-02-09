package icare.Board.groupController;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import icare.Board.service.BoardService;
import icare.commons.Criteria;
import icare.dto.BoardVO;

@Controller
@RequestMapping("/group/board")
public class GroupBoardController {
	
	@Autowired
	private BoardService service;
	
	public void setService(BoardService service) {
		this.service=service;
	}
	
	@RequestMapping("/list/{gubun}.do")
	public ModelAndView list(Criteria cri,@PathVariable("gubun") String gubun,ModelAndView mnv) throws SQLException{
		String url ="group/board/list";
		cri.setGubun("notice");
		System.out.println();
		Map<String, Object> dataMap = service.getBoardList(cri);
		System.out.println("여기"+dataMap.get("boardList"));
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("notice/detail.do")
	public ModelAndView detail(int bno,@ModelAttribute("cri") Criteria cri,ModelAndView mnv) throws SQLException{
		String url="group/board/notice/detail";
		
		BoardVO board = service.getBoard(bno);
		
		mnv.addObject("board",board);
		mnv.setViewName(url);
		
		return mnv;
	}
	@RequestMapping("notice/registForm.do")
	public String registForm() {
		String url="group/board/notice/registForm";
		return url;
	}
	@RequestMapping("/notice/regist")
	public String regist(BoardVO board,HttpServletResponse response,@ModelAttribute("cri") Criteria cri)throws Exception{
		board.setGubun("notice");
		service.write(board);
		
		System.out.println(board);

		
		String url="redirect:/group/board/list/notice.do";
		return url;
		
	}
	
	@RequestMapping("/notice/modifyForm.do")
	public ModelAndView modifyForm(int bno,@ModelAttribute("cri") Criteria cri, ModelAndView mnv) throws SQLException{
		
		String url="/group/board/notice/modifyForm";
		
		BoardVO board = service.getBoard(bno);
		
		mnv.addObject("board",board);
		mnv.setViewName(url);
		
		return mnv;
	}
	@RequestMapping(value="/notice/modify", method=RequestMethod.POST)
	public String modifyPost(BoardVO board,HttpServletResponse response,@ModelAttribute("cri") Criteria cri) throws Exception{
		System.out.println(board);
		service.modify(board);
		
		String url="redirect:/group/board/list/notice.do";
		return url;
		
		
	}
	@RequestMapping(value="/notice/remove", method=RequestMethod.POST)//버튼 써서 할 대는 RequestMethod.POST로 해라
	public String remove(int bno,@ModelAttribute("cri") Criteria cri, HttpServletResponse response) throws Exception{
		service.remove(bno);
		
		String url="redirect:/group/board/list/notice.do";
		return url;

	}
	
	
	
	
	
	
	
	
}
