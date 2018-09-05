package com.jw.shop.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jw.shop.mapper.OrderMapper;
import com.jw.shop.mapper.ProductMapper;
import com.jw.shop.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper umapper;

	@Autowired
	ProductMapper pmapper;

	@Autowired
	OrderMapper omapper;

	@Override
	public User login(int id, String password) {
		User user = umapper.query(id, password);
		return user;
	}

	@Override
	public void register(User user) {
		umapper.add(user);
	}

	@Override
	public List<Product> all() {
		List<Product> list = pmapper.all();
		return list;
	}

	@Override
	public void oadd(Order order) {
		omapper.oadd(order);
	}

	@Override
	public void oupdata(Order order) {
		omapper.oupdata(order);
	}

	@Override
	public Order oquery(Order order) {
		Order order2 = omapper.oquery(order);
		return order2;
	}

	@Override
	public List<OrderInfo> oall(OrderInfo info) {
		List<OrderInfo> list = omapper.oall(info);
		return list;
	}

	@Override
	public void delete(OrderInfo info) {
		omapper.delete(info);
	}

	@Override
	public List<User> alluser() {
		List<User> list = umapper.alluser();
		return list;
	}

	@Override
	public void ud(User user) {
		umapper.ud(user);
	}

	@Override
	public void pd(Product product) {
		pmapper.pd(product);
	}

	@Override
	public void uxg(User user) {
		umapper.uxg(user);
	}

	@Override
	public void pxg(Product product) {
		pmapper.pxg(product);
	}

	@Override
	public void padd(Product product) {
		pmapper.padd(product);
	}

	@Override
	public void tj(Order order) {
		omapper.tj(order);
	}

	@Override
	public List<Product> ser(String pname) {
		List<Product> list = pmapper.ser(pname);
		return list;
	}

	@Override
	public Product pslt(OrderInfo orderInfo) {
		Product product = omapper.pslt(orderInfo);
		return product;
	}

}
