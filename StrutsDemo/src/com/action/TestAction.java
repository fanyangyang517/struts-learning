package com.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction extends ActionSupport{

	private String helo;

	public String getHelo() {
		return helo;
	}

	public void setHelo(String helo) {
		this.helo = helo;
	}
	
	public String execute() throws Exception{
		helo="hello ,world!";
		return SUCCESS;
	}
	
}
