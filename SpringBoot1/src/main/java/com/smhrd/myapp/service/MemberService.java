package com.smhrd.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.smhrd.myapp.entity.Member;
import com.smhrd.myapp.mapper.MemberMapper;

// Spring 기본순서
// 요청 : Controller - Service - Mapper Interface - Mapper.xml
// 결과 : Mapper.xml - Mapper Interface - Service - Controller

// Controller : 요청을 받고, 응답을 하는 작업에 집중
// Service : DB에서 가지고 온 데이터를 가공하는 작업에 집중(비지니스 로직)
@Service
public class MemberService {

	@Autowired // 이미 만들어져있는 객체를 호출
	private MemberMapper memberMapper;
	
	public void MemberJoin(Member member) {
		memberMapper.MemberJoin(member);
	}

	public String IdCheck(String id) {
		String result=memberMapper.IdCheck(id);
		System.out.println("result :"+result);
		// 데이터 가공
		if(result==null) {
			result="사용가능한 아이디 입니다.";
		}else {
			result = "중복된 아이디 입니다.";
		}
		
		return result;
	}

	public List<Member> MemberList() {
		
		return memberMapper.MemberList();
	}

	public String memberListAsync() {

		return null;
	}
}
