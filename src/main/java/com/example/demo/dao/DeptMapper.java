package com.example.demo.dao;
import java.util.List;
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
public interface DeptMapper {
	
	 @Update("update dept set name=#{name},remark=#{remark} where id=#{id}")
	 int updateDept(String name,String remark,int id);//修改
	
	 @Select("select * from dept")
	 List<com.example.demo.domain.Dept> getAllDept();//查询全部
	 
	 @Select("select * from dept where name = #{name}")
	 List<com.example.demo.domain.Dept> getDept(String name);//模糊查询
	 
	 @Select("select * from job where id = #{id}")
	 List<com.example.demo.domain.Job> getDeptByid(int id);//模糊查询
	
	 @Delete("delete from dept where id=#{id}")
	 int deleteDept(int id);//删除

	 @Insert("insert into dept (name,remark) values (#{name},#{remark})")
	 int insertDept(String name, String remark);//新增 
}
