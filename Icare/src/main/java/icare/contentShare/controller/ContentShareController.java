package icare.contentShare.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import icare.approval.controller.ApprovalCommand;
import icare.approval.service.ApprovalService;
import icare.commons.Criteria;
import icare.contentShare.service.ContentShareService;
import icare.dto.ApprovalVO;
import icare.dto.EtoolsVO;
import icare.dto.StorageVO;
import icare.dto.TeacherVO;
import icare.dto.WeeklyPlanVO;
import icare.etools.service.EtoolsService;
import icare.storage.service.StorageService;
import icare.weeklyPlan.service.WeeklyPlanService;

@Controller
@RequestMapping("/group/share")
public class ContentShareController {
	
	@Autowired
	private ContentShareService contentShareService;
	public void setContentShareService(ContentShareService contentShareService) {
		this.contentShareService = contentShareService;
	}
	
	@Autowired
	private ApprovalService approvalService;
	public void setApprovalService(ApprovalService approvalService) {
		this.approvalService = approvalService;
	}
	
	@Autowired
	private WeeklyPlanService weeklyPlanService;
	public void setWeeklyPlanService(WeeklyPlanService weeklyPlanService) {
		this.weeklyPlanService = weeklyPlanService;
	}
	
	@Autowired
	private EtoolsService etoolsService;
	public void setEtoolsService(EtoolsService etoolsService) {
		this.etoolsService = etoolsService;
	}
	
	@Autowired
	private StorageService storageService;
	public void setStorageService(StorageService storageService) {
		this.storageService = storageService;
	}
	
	
	// 내역조회
	@RequestMapping("/list")
	public ModelAndView list(ApprovalCommand command, ModelAndView mnv) throws SQLException {
//		System.out.println(command);
		
		String url = "group/share/list";
		
		Map<String, Object> dataMap = approvalService.getApprovalList(command);
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);

		// 게시판이 총 3개인데 각각의 게시판의 내역을 가져와야하는데, 
		// 교육안업로드 게시판은 앞서 코딩한 if문처럼 stts 값 비교해서 가져온다치면
		// 공유 게시판이랑, 보관함 게시판은 어떻게 가져와야할까
		// 두 게시판은 int cnno가 기본키로 있는데, conno로 어떻게 비교해서 가져올 수 없는지
		
		// 공유 게시판 : 교육안업로드에서 등록버튼 눌려진 문서들을 담은 게시판
		// 보관함 게시판 : 공유 게시판에서 담기버튼 눌려진 문서들을 담은 게시판
		
		return mnv;
	}
	
	
	// 상세조회
	@RequestMapping("/detail")
	public ModelAndView detail(String eno, String type, ApprovalCommand command, ModelAndView mnv) throws SQLException {
		
		String url = "group/share/detail";
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		WeeklyPlanVO week;
		EtoolsVO etools;
		ApprovalVO approval;
		
		if(type.equals("WeeklyPlan")) {
			week = weeklyPlanService.getWeeklyPlan(eno);
			approval = weeklyPlanService.getWeeklyPlan(eno);
			
			// 수신자 참조 초기화 시키기 (null값 만들기) or 여기서 하지 말고 jsp에서 값 안 넣어버리기.
			
			dataMap.put("week", week);
			dataMap.put("approval", approval);
		}else {
			etools = etoolsService.getEtools(eno);
			approval = etoolsService.getEtools(eno);
			
			dataMap.put("etools", etools);
			dataMap.put("approval", approval);
		}
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	// 등록 폼
	@RequestMapping("/registForm")
	public ModelAndView registForm(@ModelAttribute("cri") Criteria cri,  ModelAndView mnv) throws SQLException {
		
		String url = "group/share/registForm";
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	
	// 등록
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public ModelAndView regist(String eno, ModelAndView mnv, @ModelAttribute("cri") Criteria cri) throws SQLException {
		String url = "redirect:list";
		
		approvalService.insertApproval(eno);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	
	// 보관함(storage)에서 글 삭제하기. 
	@RequestMapping("/delete")
	public ModelAndView delete(int conno, HttpSession session, @ModelAttribute("command") ApprovalCommand command, ModelAndView mnv) throws Exception {
		
		String url = "redirect:list";
		
		TeacherVO teacher = (TeacherVO) session.getAttribute("loginUser");
		StorageVO storage = new StorageVO();
		storage.setConno(conno);
		storage.setTid(teacher.getTid());
//		storage.setConno(1);
//		storage.setTid(123+"");
		storageService.deleteStorage(storage);
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	
}
