package hello.servlet.web.servletmvc.v1;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

@Controller
public class SpringMemberListControllerV1 {

	MemberRepository memberRepository = MemberRepository.getInstance();

	@RequestMapping("/springmvc/v1/members")
	public ModelAndView process() {

		List<Member> members = memberRepository.findAll();

		ModelAndView mav = new ModelAndView("members");
		mav.addObject("members", members);

		return mav;
	}

}
