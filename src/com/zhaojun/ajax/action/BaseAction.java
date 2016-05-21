package com.zhaojun.ajax.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhaojun.ajax.model.User;
import com.zhaojun.ajax.service.SaveService;
import com.zhaojun.ajax.serviceImpl.SaveServiceImpl;



public class BaseAction extends ActionSupport{
	private User user;
	private SaveService saveService = new SaveServiceImpl();
	@Override
	public String execute(){
		return SUCCESS;
	}
	public void test() throws IOException{
		System.out.println("Hello,Ajax");	
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.getWriter().print("hello,Ajax");
	}
	public String register(){	
		saveService.saveUser(user);
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
