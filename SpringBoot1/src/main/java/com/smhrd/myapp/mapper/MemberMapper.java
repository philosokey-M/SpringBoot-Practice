package com.smhrd.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.myapp.entity.Member;

@Mapper
public interface MemberMapper {

	public void MemberJoin(Member member);

	public String IdCheck(String id);

	public List<Member> MemberList();
}
