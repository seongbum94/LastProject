package icare.homeworkDiary.controller;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import icare.approval.controller.ApprovalCommand;
import icare.commons.Criteria;
import icare.dto.HomeworkDiaryVO;
import icare.homeworkDiary.service.HomeworkDiaryService;

@Controller
@RequestMapping("/homeworkdiary")
public class HomeworkDiaryController {
	@Autowired
	private HomeworkDiaryService service;
	public void setService(HomeworkDiaryService service) {
		this.service = service;
	}
	
	
	@RequestMapping("/list.do")
	public ModelAndView list(Criteria cri, ModelAndView mnv) throws SQLException{
		
		String url = "group/homeworkdiary/list";
		Map<String, Object> dataMap = service.getDiaryList(cri);
		
		mnv.addAllObjects(dataMap);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("/registForm.do")
	public String regist(){
		
		String url = "group/homeworkdiary/registDiaryForm";
		
		return url;
	}
	
	@RequestMapping("/regist")
	public String regist(HomeworkDiaryVO diary, HttpServletResponse response, ModelAndView mnv) throws Exception{
		
		String url ="redirect:list.do";
		
		service.insertDiary(diary);
		
		return url;
	}
	
	@RequestMapping("/detail.do")
	public ModelAndView detail(int hwno, ModelAndView mnv, @ModelAttribute Criteria cri) throws SQLException{
		
		String url = "group/homeworkdiary/detail";
		
		HomeworkDiaryVO diary = service.getDiary(hwno);
		
		System.out.println(diary);
		mnv.addObject("diary", diary);
		mnv.setViewName(url);
		
		
		return mnv;
	}
	
	@RequestMapping(value = "/modifyForm.do", method = RequestMethod.GET)
	public ModelAndView modifyForm( @ModelAttribute Criteria cri, ModelAndView mnv,
									HttpServletRequest request) throws SQLException{
		
		String url ="group/homeworkdiary/modifyBoard";
		System.out.println("123123123123");
//		HomeworkDiaryVO diary = service.getDiary(Integer.parseInt(request.getParameter("hwno")));
//		
//		mnv.addObject("diary",diary);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public void modifyPost(HomeworkDiaryVO diary, HttpServletResponse response) throws Exception{
		
		String url ="redirect:/detail.do?hwno=${hwno}";
		
		service.ModifyDiray(diary);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("window.opener.location.reload(true);window.close()");
		out.println("</script>");
	
	}
	
	
	@RequestMapping(value = "/remove" , method= RequestMethod.POST)
	public void remove(int hwno, @ModelAttribute("cri") Criteria cri,
						HttpServletResponse response) throws Exception{
		
		String url ="redirect:/list.do";
		
		service.deleteDiary(hwno);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("window.opener.location.reload(true);window.close()");
		out.println("</script>");
		
	}
	
}
