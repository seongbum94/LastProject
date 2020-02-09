package icare.kinderManage.controller;

import icare.commons.Criteria;
import icare.dto.KindergartenVO;
import icare.kinderManage.service.KindergartenService;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 준짱
 *
 */

@Controller
@RequestMapping("/admin/kinder")
public class KinderManageController {
	
	@Autowired
	private KindergartenService service;
	public void setService(KindergartenService service){
		this.service=service;
	}
	
	
	@RequestMapping("/list")
	public ModelAndView list(Criteria cri, ModelAndView mnv)throws Exception{
		String url="admin/kinder/list";
		
		mnv.setViewName(url);
		return mnv;
	}
	
	// 유치원 등록 폼
	@RequestMapping("/registForm")
	public String registForm()throws Exception{
		String url = "admin/kinder/registForm";
		return url;
	}
	
	// 등록
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public ModelAndView regist(KindergartenVO vo,ModelAndView mnv) throws Exception{
		String url = "redirect:admin/kinder/list";
		
		service.regist(vo);
		mnv.setViewName(url);
		
		return mnv;
		
	}
	
	// 상세
	@RequestMapping
	public ModelAndView detail(int kid, ModelAndView mnv) throws Exception{
		String url = "admin/kinder/detail";
		KindergartenVO kinder = service.getKinderById(kid);
		
		mnv.addObject("kinder", kinder);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 유치원  수정 폼
	@RequestMapping("/modifyForm")
	public ModelAndView modifyForm(int kid, ModelAndView mnv)throws Exception {
		
		String url = "admin/kinder/modifyForm";
		
		KindergartenVO vo = service.getKinderById(kid);
		
		mnv.addObject(vo);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 유치원 정보 수정
	@RequestMapping("/modify")
	public ModelAndView modify(KindergartenVO vo, ModelAndView mnv)throws Exception {
		String url = "redirect:admin/kinder/list";
		
		service.modify(vo);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 유치원 정지
	@RequestMapping(value="/disable", method=RequestMethod.POST)
	public ModelAndView disable(String kid, @ModelAttribute("cri") Criteria cri, ModelAndView mnv)throws SQLException {
		String url = "redirect:kinder/list";
		
		service.disable(kid);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	
}
