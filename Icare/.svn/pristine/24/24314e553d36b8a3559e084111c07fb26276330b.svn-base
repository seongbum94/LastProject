//package icare.memberManage.teacher.controller;
//
//import java.sql.SQLException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import icare.commons.Criteria;
//import icare.dto.TeacherVO;
//import icare.kinderManage.service.KindergartenService;
//import icare.memberManage.teacher.service.TeacherManageService;
//
//@Controller
//@RequestMapping("/admin/teacher")
//public class TeacherManageController {
//	
//	@Autowired
//	private TeacherManageService service;
//	public void setService(TeacherManageService service) {
//		this.service=service;
//	}
//	
//
//	@RequestMapping("/list")
//	public ModelAndView list (Criteria cri, ModelAndView mnv)throws Exception {
//		String url = "admin/teacher/list";
//		
//		return mnv;
//	}
//	
//	
//	@RequestMapping("/registForm")
//	public String registForm() {
//		String url="admin/teacher/registForm";
//		
//		return url;
//	}
//	
//	@RequestMapping(value="/regist", method=RequestMethod.POST)
//	public ModelAndView regist(TeacherVO teacher, ModelAndView mnv) throws SQLException{
//		String url = "redirect:list";
//		service.regist(teacher);
//		
//		mnv.setViewName(url);
//		
//		return mnv;
//	}
//	
//	@RequestMapping("/modifyForm")
//	public String modifyForm() throws SQLException{
//		String url = "admin/teacher/modifyForm";
//		return url;
//	}
//	
//	@RequestMapping(value="/modify", method=RequestMethod.POST)
//	public ModelAndView modify(TeacherVO teacher, ModelAndView mnv) throws SQLException{
//		String url = "redirect:list";
//		service.modify(teacher);
//		
//		mnv.setViewName(url);
//		
//		return mnv;
//	}
//	
//	@RequestMapping(value="/disable", method=RequestMethod.POST)
//	public ModelAndView disable(String tid, @ModelAttribute("cri")Criteria cri, ModelAndView mnv)throws SQLException{
//		String url = "redirect:list";
//		service.disable(tid);
//		mnv.addObject("cri", cri);
//		mnv.setViewName(url);
//		
//		return mnv;
//	} 
//}
