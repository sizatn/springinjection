package com.sizatn.springinjection.main;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.sizatn.springinjection.service.AnnotationUserService;
import com.sizatn.springinjection.service.ConstructorUserService;
import com.sizatn.springinjection.service.SetterUserService;

public class Start {
	static {
		try {
			Log4jConfigurer.initLogging("classpath:log4j.xml");
		} catch (FileNotFoundException ex) {
			System.err.println("load log4j.xml fail..." + ex.getMessage());
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext*.xml");
		
		/*
		 * 通过setter注入User对象
		 */
		SetterUserService ss = (SetterUserService) context.getBean("setterUserService");
		ss.showUser();
		
		/*
		 * 通过constructor注入User对象
		 */
		ConstructorUserService cs = (ConstructorUserService) context.getBean("constructorUserService");
		cs.showUser();
		
		/*
		 * 通过annotation注入User对象
		 */
		AnnotationUserService as = (AnnotationUserService) context.getBean("annotationUserService");
		as.showUser();
		
		
	}
}
