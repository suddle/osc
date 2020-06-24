package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Job;
import com.example.demo.service.JobServer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class JobController {
	
	Map<String,String> map=new HashMap<String,String>();
	
	@Autowired
    private JobServer jobserver;
	
	@RequestMapping(value="/getjob",method=RequestMethod.GET)
    public List<Job> getjob(@RequestParam(value="name",required=false) String name) {
        List<Job> job=jobserver.getJob(name);
        return job;
    }
	
	@RequestMapping(value="/getalljob",method=RequestMethod.GET)
	public List<Job> getalljob() {
		List<Job> job=jobserver.getAllJob();
		return job;
	}
	
	@RequestMapping(value="/updatejob",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> updatejob(@RequestParam(value="name",required=false) String name,@RequestParam(value="remark",required=false) String remark,@RequestParam(value="id",required=false) int id){
		int job=jobserver.updateJob(name, remark, id);
		if(job==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
	
	@RequestMapping(value="/deletejob",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> deleteJobe(@RequestParam(value="id",required=false) int id) {
		int job=jobserver.deleteJobe(id);
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
	
	@RequestMapping(value="/insertjob",method=RequestMethod.POST)
	@ResponseBody
	public  Map<String, String> insertJob(@RequestParam(value="name",required=false) String name,@RequestParam(value="remark",required=false) String remark) {
		int job=jobserver.insertJob(name, remark);
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
