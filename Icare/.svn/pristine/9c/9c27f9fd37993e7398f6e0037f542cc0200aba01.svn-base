package icare.login;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import icare.commons.exception.IdNotFoundException;
import icare.commons.exception.InvalidPasswordException;
import icare.dto.ParentsVO;
import icare.memberManage.parents.service.ParentsService;


@Controller
@RequestMapping("/")
public class KinderLoginController {
	/**
	 * @author LMY 로그인/로그아웃 기능
	 */
	// test위한 service 선언
	@Autowired
	private ParentsService service;

	public void setService(ParentsService service) {
		this.service = service;
	}

	@RequestMapping("/main.do")
	public String main() {
		String url = "main";
		return url;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		String url = "/kinderLogin";

		return url;
	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(String pid, String pwd, HttpSession session) {
		String url = "redirect:/main";

		session.removeAttribute("msg");
		session.removeAttribute("pid");

		String message = null;

		try {
			service.login(pid, pwd);
			
			ParentsVO loginUser = service.getParents(pid);

			if (loginUser.getAuthor().equals("ROLE_PARENTS")) {
				message = "사용정지된 아이디로 이용이 제한됩니다.";
				url = "redirect:login";

			} else {
				session.setAttribute("loginUser", loginUser);
			}

		} catch (IdNotFoundException e) {
			message = "존재하지 않는 아이디 입니다.";
			url = "redirect:login";

		} catch (InvalidPasswordException e) {
			message = "패스워드가 일치하지 않습니다.";
			url = "redirect:login";
		} catch (SQLException e) {
			e.printStackTrace();

			message = "시스템 장애로 로그인이 불가능합니다.";
			url = "redirect:login";
		}

		session.setAttribute("msg", message);
		session.setAttribute("pid", pid);

		return url;

	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session, HttpServletRequest request) {
		String url = "/logout";

		session.invalidate();
		request.setAttribute("msg", "정상적으로 로그아웃되었습니다.");

		return url;
	}

}
