package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.apache.ibatis.annotations.Results;



@MapperScan("package com.example.demo.dao")
public interface UserMapper {
	
	 @Select("select * from user where id = #{id}")
	 List<com.example.demo.domain.User> getUser(int id);
	
	 @Select("select * from user where name = #{username} and password = #{password}")
	 List<com.example.demo.domain.User> selectUser(String username,String password);

	 @Insert("insert into user (name,password,telephone,role) values (#{username},#{password},#{telephone},#{role})")
	 com.example.demo.domain.User insertUser(String username, String password, String telephone,String role);
	 
	 @Select("select * from user")
	 List<com.example.demo.domain.User> getAllUser();

}
