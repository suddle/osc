package com.example.demo.service;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Dept;
import com.example.demo.domain.Employee;
import com.example.demo.domain.Job;
import com.example.demo.dao.EmployeeMapper;

@Service
public class EmployeeServer {
	@Autowired
	EmployeeMapper employeeMapper;
	public List<Employee> getEmployee(String name) {
		return employeeMapper.getEmployee(name);
	}
	
	public List<Employee> getAllEmployee() {
		return employeeMapper.getAllEmployee();
	}
	
	public int updateEmployee(String name,String tel,Integer id) {
		int jobcount=employeeMapper.updateEmployee(name, tel, id);
		return jobcount;
	}
	
	public int deleteEmployee(int id) {
		int jobcount=employeeMapper.deleteEmployee(id);
		return jobcount;
	}
	
	public int insertEmployee(Integer jobid,Integer deptid,String address,String birthday,String cardif,String createdate,String education,String email,String hobby,String name,String party,String race,String phone,String postcode,String qqnum,String remark,String sex,String speciality,String tel) {
		int jobcount=employeeMapper.insertEmployee(jobid, deptid, address, birthday, cardif, createdate, education, email, hobby, name, party, race, phone, postcode, qqnum, remark, sex, speciality, tel);
		return jobcount;
	}
}
