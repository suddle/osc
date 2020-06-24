package com.example.demo.service;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.Dept;
import com.example.demo.domain.Job;
import com.example.demo.dao.DeptMapper;


import org.springframework.stereotype.Service;

@Service
public class DeptServer {
	@Autowired
	DeptMapper deptMapper;
	public List<Dept> getDept(String name) {
		return deptMapper.getDept(name);
	}
	
	public List<Dept> getAllDept() {
		return deptMapper.getAllDept();
	}
	
	public int updateDept(String name,String remark,Integer id) {
		int jobcount=deptMapper.updateDept(name, remark, id);
		return jobcount;
	}
	
	public int deleteDept(int id) {
		int jobcount=deptMapper.deleteDept(id);
		return jobcount;
	}
	
	public int insertDept(String name,String remark) {
		int jobcount=deptMapper.insertDept(name, remark);
		return jobcount;
	}
}
