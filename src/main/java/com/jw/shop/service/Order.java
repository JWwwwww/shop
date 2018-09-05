package com.jw.shop.service;

public class Order {

	int user_id;
	int product_id;
	int quantity;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "Order [user_id=" + user_id + ", product_id=" + product_id + ", quantity=" + quantity + "]";
	}

}
