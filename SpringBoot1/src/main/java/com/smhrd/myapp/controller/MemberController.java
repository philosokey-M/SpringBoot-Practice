package com.smhrd.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smhrd.myapp.entity.Member;
import com.smhrd.myapp.service.MemberService;

// 경로는 myapp 밑으로
// view를 반환할 controller
@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/")
	public String welcom() {
		return "MemberMain";
	}
	
	@RequestMapping("/MemberJoinPage.do")
	public String MemberJoinPage(){
		return "MemberJoin";
	}
	
	@RequestMapping("/MemberMainPage.do")
	public String MemberMainPage(){
		return "MemberMain";
	}
	
	@RequestMapping("MemberJoin.do")
	public String MemberJoin(Member member) {
		memberService.MemberJoin(member);
		return "redirect:/MemberMainPage.do";
	}
	
	@RequestMapping("MemberList.do")
	public String MemberList(Model model) {
		List<Member>member_list =memberService.MemberList();
						
		model.addAttribute("member_list",member_list);
		return "MemberList";
	}
	
//	@ResponseBody // Controller에서 데이터만 응답하고 싶을 때 사용하는 annotation
//	@RequestMapping(value="IdCheck.do", produces="application/text; charset=UTF-8")
//	public void IdCheck() {
//		
//	}
	
	
}
