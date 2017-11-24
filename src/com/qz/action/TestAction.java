package com.qz.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	
	String username = null, password = null;

	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String fuctest() {
		System.out.println("测试成功，username=" + username + "password=" + password);
		
		return "success";
	}
}
