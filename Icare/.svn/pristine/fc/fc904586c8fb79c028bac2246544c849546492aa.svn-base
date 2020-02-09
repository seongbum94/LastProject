package icare.employManage.controller;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import icare.commons.Criteria;
import icare.dto.TeacherVO;
import icare.employManage.service.EmployManageService;

@Controller
@RequestMapping("/group/employ")
public class EmployManageController {
	
	@Autowired
	private EmployManageService service;
	
	@RequestMapping(value = "/registForm.do", method = RequestMethod.GET)
	public String registForm(@ModelAttribute Criteria cri) throws SQLException {
		String url = "/group/employManage/regist";
		return url;
	}
	
	@RequestMapping("/regist")
	public ModelAndView regist(EmployCommand command,
								@ModelAttribute Criteria cri,
								ModelAndView mnv) throws SQLException{
		String url = "redirect:/group/employ/list.do";
		
		TeacherVO teacher = command.toTeacherVO();
		System.out.println(teacher);
		service.insertTeacher(teacher);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("/list.do")
	public ModelAndView list(ModelAndView mnv, Criteria cri) throws SQLException {
		String url = "/group/employManage/list";
		
		Map<String, Object> dataMap = service.getEmployList(cri);
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("/detail.do")
	public ModelAndView detail(ModelAndView mnv, 
								@RequestParam String tid,
								@ModelAttribute Criteria cri) {
		String url = "/group/employManage/detail";
		
		TeacherVO teacher = service.getTeacher(tid);
		mnv.addObject("teacher",teacher);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("/modifyForm.do")
	public ModelAndView modifyForm(ModelAndView mnv,
								   @RequestParam String tid,
								   @ModelAttribute Criteria cri) {
		String url = "/group/employManage/modify";
		
		TeacherVO teacher = service.getTeacher(tid);
		mnv.addObject("teacher", teacher);
		mnv.setViewName(url);
		
		return mnv;
	}
}
