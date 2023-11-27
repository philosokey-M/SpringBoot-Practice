package com.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.myapp.service.MemberService;

// @ResponseBody + @Controller =@RestController
// 데이터를 응답할 controller
@RestController
public class MemberRestController {

	@Autowired
	private MemberService memberService;
	
	
	@GetMapping("IdCheck.do")
	public String IdCheck(String id) {
		
		System.out.println("id :"+id);
		
		String result = memberService.IdCheck(id);
		
		return result; // or return memberService.IdCheck(id);
	}
	
	@PostMapping("memberListAsync.do")
	public String memberListAsync(String check) {
		System.out.println("check :"+check);
		
		String result = memberService.memberListAsync();
		
		return result;
	}
	
}
