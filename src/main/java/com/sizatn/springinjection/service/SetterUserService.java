package com.sizatn.springinjection.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sizatn.springinjection.model.User;

/**
 * 
 * @desc 通过setter注入User对象
 * @author sizatn
 * @date May 21, 2017
 */
public class SetterUserService {

	private static final Log log = LogFactory.getLog(SetterUserService.class);

	private User u;

	public void setU(User u) {
		this.u = u;
	}

	public void showUser() {
		log.info("通过setter注入User对象，userNo：" + u.getUserNo() + "，userName：" + u.getUserName());
	}

}
