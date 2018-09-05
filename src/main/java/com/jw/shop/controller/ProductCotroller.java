package com.jw.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jw.shop.service.Product;
import com.jw.shop.service.User;
import com.jw.shop.service.UserServiceImpl;

@RestController
public class ProductCotroller {

	@Autowired
	UserServiceImpl impl;

	@GetMapping("/product")
	public List<Product> all() {
		List<Product> list = impl.all();
		return list;
	}

	@GetMapping("/getUser")
	public User getUser(HttpSession session) {
		User user2 = impl.login((int) session.getAttribute("id"), null);
		return user2;
	}

	@PostMapping("/ser")
	public List<Product> ser(@RequestBody Product product,HttpSession session){
		String name = product.getName();
		List<Product> list = impl.ser("%"+name+"%");
		return list;
	}
	
}
