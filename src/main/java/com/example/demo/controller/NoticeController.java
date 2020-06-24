package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Job;
import com.example.demo.domain.Notice;
import com.example.demo.service.NoticeServer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class NoticeController {
Map<String,String> map=new HashMap<String,String>();
	
	@Autowired
    private NoticeServer systenmserver;
	
	@RequestMapping(value="/updatenotice",method=RequestMethod.POST)
	public Map<String, String> updateNotice(@RequestParam(value="content",required=true) String content,@RequestParam(value="title",required=true) String title,@RequestParam(value="id",required=true) int id) {
		if(systenmserver.updateNotice(content, title, id)==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
	
	@RequestMapping(value="/getallnotice",method=RequestMethod.GET)
	public List<Notice> getAllNotice(){
		return systenmserver.getAllNotice();
	}
	
	@RequestMapping(value="getNotice")
	public List<Notice> getNotice(@RequestParam(value="txt",required=false) String txt){
		return systenmserver.getNotice(txt);
	}
	
	@RequestMapping(value="deletenotice",method=RequestMethod.GET)
	public Map<String,String> deletenotice(@RequestParam(value="id",required=false) int id){
		if(systenmserver.deleteNotice(id)==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
	
	@RequestMapping(value="insertnotice",method=RequestMethod.POST)
	public Map<String,String> insertNotice(@RequestParam(value="name",required=false) String name,@RequestParam(value="remark",required=false) String remark,@RequestParam(value="userid",required=false) String userid){
		if(systenmserver.insertNotice(name, remark, userid)==1) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
	
	
	
}
