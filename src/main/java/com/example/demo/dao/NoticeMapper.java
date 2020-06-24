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
public interface NoticeMapper {
	 @Update("update notice set content=#{content},title=#{title} where id=#{id}")
	 int updateNotice(String content,String title,int id);//修改
	
	 @Select("select * from notice")
	 List<com.example.demo.domain.Notice> getAllNotice();//查询全部
	 
	 @Select("select * from notice where title = #{txt} or content=#{txt}")
	 List<com.example.demo.domain.Notice> getNotice(String txt);//模糊查询
	 
	 @Delete("delete from notice where id=#{id}")
	 int deleteNotice(int id);//删除

	 @Insert("insert into notice (content,content,userid) values (#{name},#{remark},#{userid})")
	 int insertNotice(String name, String remark,String userid);//新增
}
