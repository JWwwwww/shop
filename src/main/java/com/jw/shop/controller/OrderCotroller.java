package com.jw.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jw.shop.service.Order;
import com.jw.shop.service.OrderInfo;
import com.jw.shop.service.Product;
import com.jw.shop.service.UserServiceImpl;

@RestController
public class OrderCotroller {

	@Autowired
	UserServiceImpl impl;

	@PostMapping("/order")
	public void oadd(HttpSession session, @RequestBody Order order) {
		order.setUser_id((int) session.getAttribute("id"));
		Order order2 = impl.oquery(order);
		if (order2!=null) {
			int quantity = order2.getQuantity() + 1;
			order2.setQuantity(quantity);
			impl.oupdata(order2);
		} else {
			order.setQuantity(1);
			impl.oadd(order);
		}
	}
	
	@GetMapping("/shopt")
	public List<OrderInfo> sp(HttpSession session) {
		OrderInfo info = new OrderInfo();
		info.setUser_id((int) session.getAttribute("id"));
		List<OrderInfo> list = impl.oall(info);
		return list;
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody OrderInfo info) {
		impl.delete(info);
	}
	
	@PostMapping("/js")
	public void js(HttpSession session,@RequestBody List<OrderInfo> list) {
		for (OrderInfo orderInfo : list) {
			Product product = impl.pslt(orderInfo);
			int quantity = product.getQuantity()-orderInfo.getQuantity();
			product.setQuantity(quantity);
			impl.pxg(product);
		}
		session.setAttribute("js", list);
	}
	
	@GetMapping("/jss")
	public List<OrderInfo> jss(HttpSession session) {
		List<OrderInfo> list = (List<OrderInfo>) session.getAttribute("js");
		return list;
	}
	
	@PostMapping("/tj")
	public void tj(HttpSession session) {
		Order order = new Order();
		order.setUser_id((int) session.getAttribute("id"));
		impl.tj(order);
	}
}
