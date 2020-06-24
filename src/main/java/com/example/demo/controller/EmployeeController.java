package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Dept;
import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeServer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class EmployeeController {
	Map<String,String> map=new HashMap<String,String>();
	
	@Autowired
    private EmployeeServer employeeserver;
	
	@RequestMapping(value="/getEmployee",method=RequestMethod.GET)
    public List<Employee> getEmployee(@RequestParam(value="name",required=false) String name) {
        List<Employee> job=employeeserver.getEmployee(name);
        return job;
    }
	
	@RequestMapping(value="/getAllEmployee",method=RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        List<Employee> job=employeeserver.getAllEmployee();
        return job;
    }
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
    public Map<String, String> updateEmployee(@RequestParam(value="name",required=false) String name,@RequestParam(value="tel",required=false) String tel,@RequestParam(value="id",required=false) int id) {
        int job=employeeserver.updateEmployee(name, tel, id);
        if(job==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
    }
	
	@RequestMapping(value="/deleteEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> deleteEmployee(@RequestParam(value="id",required=false) int id) {
		int job=employeeserver.deleteEmployee(id);
		if(job==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
		// TODO Auto-generated method stub
	}
	
	@RequestMapping(value="/insertEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> insertEmployee(
			@RequestParam(value="jobid",required=false) int jobid,
			@RequestParam(value="deptid",required=false) int deptid,
			@RequestParam(value="address",required=false) String address,
			@RequestParam(value="birthday",required=false) String birthday,
			@RequestParam(value="cardif",required=false) String cardif,
			@RequestParam(value="createdate",required=false) String createdate,
			@RequestParam(value="education",required=false) String education,
			@RequestParam(value="email",required=false) String email,
			@RequestParam(value="hobby",required=false) String hobby,
			@RequestParam(value="name",required=false) String name,
			@RequestParam(value="party",required=false) String party,
			@RequestParam(value="race",required=false) String race,
			@RequestParam(value="phone",required=false) String phone,
			@RequestParam(value="postcode",required=false) String postcode,
			@RequestParam(value="qqnum",required=false) String qqnum,
			@RequestParam(value="remark",required=false) String remark,
			@RequestParam(value="sex",required=false) String sex,
			@RequestParam(value="speciality",required=false) String speciality,
			@RequestParam(value="tel",required=false) String tel) {
		int job=employeeserver.insertEmployee(jobid, deptid, address, birthday, cardif, createdate, education, email, hobby, name, party, race, phone, postcode, qqnum, remark, sex, speciality, tel);
		if(job==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
		// TODO Auto-generated method stub
	}
}
