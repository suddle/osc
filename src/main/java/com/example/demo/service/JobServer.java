package com.example.demo.service;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.domain.Job;
import com.example.demo.dao.JobMapper;
import org.springframework.stereotype.Service;

@Service
public class JobServer {
	@Autowired 
	JobMapper jobMapper;
	
	public List<Job> getJob(String name) {
		return jobMapper.getJob(name);
	}
	
	public List<Job> getAllJob() {
		return jobMapper.getAllJob();
	}
	
	public int updateJob(String name,String remark,Integer id) {
		int jobcount=jobMapper.updateJob(name, remark, id);
		return jobcount;
	}
	
	public int deleteJobe(int id) {
		int jobcount=jobMapper.deleteJobe(id);
		return jobcount;
	}
	
	public int insertJob(String name,String remark) {
		int jobcount=jobMapper.insertJob(name, remark);
		return jobcount;
	}
}
