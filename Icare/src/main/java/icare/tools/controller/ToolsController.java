package icare.tools.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import icare.commons.Criteria;
import icare.dto.ToolsVO;
import icare.tools.service.ToolsService;

@Controller
@RequestMapping("/group/tools")
public class ToolsController {
	
	@Autowired
	private ToolsService service;
	public void setToolsService(ToolsService service) {
		this.service = service;
	}
	
	// 교보재 내역조회
	@RequestMapping("/list")
	public ModelAndView list(Criteria cri, ModelAndView mnv) throws SQLException {
		
		String url = "group/tools/list";
		
		Map<String, Object> dataMap = service.getToolsList(cri);
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	
	// 교보재 상세조회
	@RequestMapping("/detail")
	public ModelAndView detail(int tsno, @ModelAttribute("cri") Criteria cri, 
			ModelAndView mnv) throws SQLException {
		
		String url = "group/tools/detail";
		
		ToolsVO tools = service.getTools(tsno);
		
		mnv.addObject("tools", tools);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 교보재 등록 폼
	@RequestMapping("/registForm")
	public String registForm() {
		String url = "group/tools/registForm";
		
		return url;
	}
	
	// 교보재 등록
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public ModelAndView regist(ToolsVO tools, ModelAndView mnv) throws Exception {
		String url = "redirect:list";
		
		service.insertTools(tools);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 교보재 수정 폼
	@RequestMapping("/modifyForm")
	public ModelAndView modifyForm(int tsno, @ModelAttribute("cri") Criteria cri, 
								ModelAndView mnv) throws SQLException {
		
		String url = "group/tools/modifyForm";
		
		ToolsVO tools = service.getTools(tsno);
		
		mnv.addObject("tools", tools);
		mnv.setViewName(url);
		
		return mnv;
	}

	// 교보재 수정
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public ModelAndView modify(ToolsVO tools, ModelAndView mnv) throws SQLException {
		
		String url = "redirect:list";
		
		service.updateTools(tools);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 교보재 삭제
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView delete(int tsno, @ModelAttribute("cri") Criteria cri, ModelAndView mnv) throws SQLException {
		
		String url = "redirect:list";
		
		service.deleteTools(tsno);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	
}
