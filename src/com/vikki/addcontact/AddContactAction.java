package com.vikki.addcontact;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddContactAction extends ActionSupport {
	
	ContactBean bean;
	String msg;
	public ContactBean getBean() {
		return bean;
	}
	public void setBean(ContactBean bean) {
		this.bean = bean;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void validate() {
		if(bean.getEmail().equals("v.v@gmail.com"))
			addFieldError("bean.email", getText("bean.email.wrong"));
		System.out.println("after validate");
	}
	@Override
	public String execute() throws Exception {
		if(bean.getUname().equals("bond"))
		{
			System.out.println("Inside execute bond");
			addActionError("addcontactview.cannotadd.killer");
		}
		return Action.SUCCESS;
	}

}
