package com.sizatn.springinjection.service;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.sizatn.springinjection.model.User;

/**
 * 
 * @desc 通过annotation注入User对象
 * @author sizatn
 * @date May 21, 2017
 */
@Service("annotationUserService")
public class AnnotationUserService {
	
	private static final Log log = LogFactory.getLog(AnnotationUserService.class);

	@Resource(name = "annotationUser")
	private User u;

	public void showUser() {
		log.info("通过annotation注入User对象，userNo：" + u.getUserNo() + "，userName：" + u.getUserName());
	}

}
