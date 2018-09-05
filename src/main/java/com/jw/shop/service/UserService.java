package com.jw.shop.service;

import java.util.List;

public interface UserService {

	User login(int id, String password);

	void register(User user);

	List<Product> all();

	void oadd(Order order);

	Order oquery(Order order);

	void oupdata(Order order);

	List<OrderInfo> oall(OrderInfo info);

	void delete(OrderInfo info);

	List<User> alluser();

	void ud(User user);

	void pd(Product product);

	void uxg(User user);

	void pxg(Product product);

	void padd(Product product);

	void tj(Order order);

	List<Product> ser(String pname);

	Product pslt(OrderInfo orderInfo);
	
}
