package com.jw.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jw.shop.service.Product;

@Mapper
public interface ProductMapper {

	@Select("select * from product")
	List<Product> all();

	@Delete("delete from product where id=#{id}")
	void pd(Product product);

	@Update("update product set num=#{num},name=#{name},info=#{info},price=#{price},quantity=#{quantity},img=#{img} where id=#{id}")
	void pxg(Product product);

	@Insert("insert into product(num,name,info,price,quantity,img) values(#{num},#{name},#{info},#{price},#{quantity},#{img})")
	void padd(Product product);

	@Select("select * from product where name like #{pname}")
	List<Product> ser(String pname);

}
