package com.jw.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jw.shop.service.User;

@Mapper
public interface UserMapper {

	@Select("select * from user where id=#{id}")
	User query(int id, String password);

	@Insert("insert into user(id,username,password,sex,date,phone,root,address,address1,address2) values(#{id},#{username},#{password},#{sex},#{date},#{phone},#{root},#{address},#{address1},#{address2})")
	void add(User user);

	@Select("select * from user")
	List<User> alluser();

	@Delete("delete from user where id=#{id}")
	void ud(User user);

	@Update("update user set username=#{username},password=#{password},sex=#{sex},date=#{date},phone=#{phone},root=#{root},address=#{address},address1=#{address1},address2=#{address2} where id=#{id}")
	void uxg(User user);

}
