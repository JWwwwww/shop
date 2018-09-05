package com.jw.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jw.shop.service.User;
import com.jw.shop.service.UserServiceImpl;

@RestController()
public class UserCotroller {

	@Autowired
	UserServiceImpl impl;

	@PostMapping("/register")
	public int register(@RequestBody User user) {
		int i = 0;
		User user2 = impl.login(user.getId(),null);
		if(user2 != null) {
			i = 1;
		}else {
			i = 0;
		}
		return i;
	}
	
	@PostMapping("/register1")
	public void register1(@RequestBody User user) {
		impl.register(user);
	}

	@PostMapping("/login")
	public int login(@RequestBody User user,HttpSession session) {
		int i = 0;
		User user2 = impl.login(user.getId(), user.getPassword());
		if (user2 != null) {
			if (user2.getPassword().equals(user.getPassword())) {
				i = 1;
				session.setAttribute("id", user2.getId());
			}else {
				i = 2;
			}
		} else {
			i = 3;
		}
		return i;
	}
	
	@PostMapping("/tui")
	public void tui(HttpSession session) {
		session.removeAttribute("id");
	}

}
