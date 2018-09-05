package com.jw.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jw.shop.service.Product;
import com.jw.shop.service.User;
import com.jw.shop.service.UserServiceImpl;

@RestController()
public class BsmCotroller {

	@Autowired
	UserServiceImpl impl;

	@GetMapping("/alluser")
	public List<User> alluser() {
		List<User> list = impl.alluser();
		return list;
	}

	@GetMapping("/allproduct")
	public List<Product> allproduct() {
		List<Product> list = impl.all();
		return list;
	}

	@PostMapping("/ud")
	public void ud(@RequestBody User user) {
		impl.ud(user);
	}

	@PostMapping("/pd")
	public void pd(@RequestBody Product product) {
		impl.pd(product);
	}

	@PostMapping("/uxg")
	public void uxg(@RequestBody User user) {
		impl.uxg(user);
	}

	@PostMapping("/pxg")
	public void pxg(@RequestBody Product product) {
		impl.pxg(product);
	}
	
	@PostMapping("/padd")
	public void padd(@RequestBody Product product) {
		impl.padd(product);
	}

}
