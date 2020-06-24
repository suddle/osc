package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Dept;
import com.example.demo.service.DeptServer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class DeptController {
	Map<String,String> map=new HashMap<String,String>();
	
	@Autowired
    private DeptServer deptserver;
	
	@RequestMapping(value="/getDept",method=RequestMethod.GET)
    public List<Dept> getDept(@RequestParam(value="name",required=false) String name) {
        List<Dept> job=deptserver.getDept(name);
        return job;
    }
	
	@RequestMapping(value="/getAllDept",method=RequestMethod.GET)
	public List<Dept> getAllDept() {
		List<Dept> job=deptserver.getAllDept();
		return job;
	}
	
	@RequestMapping(value="/updateDept",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> updateDept(@RequestParam(value="name",required=false) String name,@RequestParam(value="remark",required=false) String remark,@RequestParam(value="id",required=false) int id){
		int job=deptserver.updateDept(name, remark, id);
		if(job==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
	
	@RequestMapping(value="/deleteDept",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> deleteDept(@RequestParam(value="id",required=false) int id) {
		int job=deptserver.deleteDept(id);
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
	
	@RequestMapping(value="/insertDept",method=RequestMethod.POST)
	@ResponseBody
	public  Map<String, String> insertDept(@RequestParam(value="name",required=false) String name,@RequestParam(value="remark",required=false) String remark) {
		int job=deptserver.insertDept(name, remark);
		if(job==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
}
