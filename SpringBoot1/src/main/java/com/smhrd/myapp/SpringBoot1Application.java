package com.smhrd.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication
// 해당 클래스의 위치를 기준으로 하여 하위에 있는 설정 내용들을 읽어서
// 스프링 부트의 설정들을 자동화하고, 
// Bean(객체) 읽기, 생성하는 작업을 자동으로 진행하는 클래스

// src/main/java
//				com
//					smhrd
//						myapp
//							SpringBootApplication
//							Controller, Mapper, Entity...

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

}
