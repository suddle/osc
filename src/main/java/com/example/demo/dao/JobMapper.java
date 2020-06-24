package com.example.demo.dao;
import java.util.List;
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
public interface JobMapper {
	
	 @Update("update job set name=#{name},remark=#{remark} where id=#{id}")
	 int updateJob(String name,String remark,int id);//修改
	
	 @Select("select * from job")
	 List<com.example.demo.domain.Job> getAllJob();//查询全部
	 
	 @Select("select * from job where name = #{name}")
	 List<com.example.demo.domain.Job> getJob(String name);//模糊查询
	 
	 @Select("select * from job where id = #{id}")
	 List<com.example.demo.domain.Job> getJobByid(int id);//模糊查询
	
	 @Delete("delete from job where id=#{id}")
	 int deleteJobe(int id);//删除

	 @Insert("insert into job (name,remark) values (#{name},#{remark})")
	 int insertJob(String name, String remark);//新增 

}
