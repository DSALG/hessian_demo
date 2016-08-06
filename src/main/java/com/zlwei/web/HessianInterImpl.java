package com.zlwei.web;

import com.caucho.hessian.server.HessianServlet;
import com.zlwei.api.User;

public class HessianInterImpl extends HessianServlet implements HessianInter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1459826996234777383L;

	public void sayHello() {
		System.out.println("hello hessian!!!");
	}

	public void addUser(User user) {
		System.out.println("hello" + user);
	}

	public User delUser(Integer id, String name) {
		System.out.println("id: " + id + ", name: " + name);
		return new User(id, name);
	}

}
