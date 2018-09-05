package com.jw.shop.service;

public class Product {

	int id;
	int num;
	String name;
	String info;
	int price;
	int quantity;
	String img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", info=" + info + ", price=" + price + ", quantity="
				+ quantity + ", img=" + img + "]";
	}
}
