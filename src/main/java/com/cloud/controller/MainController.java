package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainController {

	@Value(value = "${sessiontimeout}")
	private String sessionTimeout;

	@Value(value = "${username}")
	private String userName;

	@Value(value = "${password}")
	private String password;

	@RequestMapping(value = "/getCfg")
	public String getConfigInfo() {

		return "SessionTimeout =" + sessionTimeout + "<BR>UserName =" + userName + "<BR>Password =" + password;
	}

}
