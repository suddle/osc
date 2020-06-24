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
public interface EmployeeMapper {
	 @Update("update employee set name=#{name},remark=#{tel} where id=#{id}")
	 int updateEmployee(String name,String tel,int id);//修改
	 
	 @Select("select * from employee")
	 List<com.example.demo.domain.Employee> getAllEmployee();//查询全部
	 
	 @Select("select * from employee where name = #{name}")
	 List<com.example.demo.domain.Employee> getEmployee(String name);//模糊查询
	
	 @Delete("delete from employee where id=#{id}")
	 int deleteEmployee(int id);//删除

	 @Insert("insert into employee (jobid, deptid, address, birthday, cardif, createdate, education, email, hobby, name, party, race, phone, postcode, qqnum, remark, sex, speciality, tel) values (#{jobid},#{deptid},#{address},#{birthday},#{cardif},#{createdate},#{education},#{email},#{hobby},#{name},#{party},#{race},#{phone},#{postcode},#{qqnum},#{remark},#{sex},#{speciality},#{tel})")
	 int insertEmployee(Integer jobid,Integer deptid,String address,String birthday,String cardif,String createdate,String education,String email,String hobby,String name,String party,String race,String phone,String postcode,String qqnum,String remark,String sex,String speciality,String tel);//新增 
	 
	 // jobid, deptid, address, birthday, cardif, createdate, education, email, hobby, name, party, race, phone, postcode, qqnum, remark, sex, speciality, tel
	 
	 
	 
	 //各位端午节快乐 这是我们结婚以来得第一个端午节，但是又恰逢疫情，我们回不去了。等疫情缓和，我们会瞅个周末回去看望爸妈。即将端午节了，在此，我和李涛祝爸妈多喜乐，长安宁。我在这里 孝敬爸妈一点心意 明天就是端午节了  今天买点菜 买点肉。我和李涛再北京会吃好喝好玩好，我们会好好的，爸妈不用太过担心。
}
