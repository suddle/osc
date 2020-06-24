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
public interface FileMapper {
	 @Select("select * from file where filename = #{filename}")
	 List<com.example.demo.domain.File> getFile(String filename);//模糊查询
	
	 @Delete("delete from file where filename = #{filename} and  id=#{id}")
	 com.example.demo.domain.File deleteFile(String filename,int id);//删除

	 @Insert("insert into file (file,filename,remark,title) values (#{file},#{filename},#{remark},#{title})")
	 com.example.demo.domain.File insertFile(String file, String filename, String remark,String title);//新增 
	 
	 @Select("select * from file")
	 List<com.example.demo.domain.File> getAllFile();//查询全部
}
