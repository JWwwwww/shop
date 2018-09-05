package com.jw.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jw.shop.service.Order;
import com.jw.shop.service.OrderInfo;
import com.jw.shop.service.Product;

@Mapper
public interface OrderMapper {

	@Select("select * from orders where user_id=#{user_id} and product_id=#{product_id}")
	Order oquery(Order order);

	@Select("select user_id,id,num,name,price,img,info,orders.quantity from orders,product where user_id=#{user_id} and product_id=id;")
	List<OrderInfo> oall(OrderInfo info);
	
	@Update("update orders set quantity=#{quantity} where user_id=#{user_id} and product_id=#{product_id}")
	void oupdata(Order order);
	
	@Insert("insert into orders(user_id,product_id,quantity) values(#{user_id},#{product_id},#{quantity})")
	void oadd(Order order);
	
	@Delete("delete from orders where user_id=#{user_id} and product_id=#{id}")
	void delete(OrderInfo info);

	@Delete("delete from orders where user_id=#{user_id}")
	void tj(Order order);

	@Select("select * from product where id=#{id}")
	Product pslt(OrderInfo orderInfo);
	
}
