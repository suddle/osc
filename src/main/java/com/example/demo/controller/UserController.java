package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserServer;

@RestController
public class UserController {
	
	Map<String,String> map=new HashMap<String,String>();
	
	@Autowired
    private UserServer userService;

    @RequestMapping("/getUser")
    public List<User> getUser(@RequestParam("id") int id) {
        return userService.getUser(id);
    }
    
    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
    
    @RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String>  register(@RequestParam(value="username",required=false) String username,@RequestParam(value="password",required=false) String password,@RequestParam(value="telephone",required=false) String telephone,@RequestParam(value="role",required=false) String role) {
    	System.out.print(username+password+telephone);
		if(username.length()<4) {
			map.put("msg", "名字太短");
			map.put("code", "400");
			return map;
		}
		if(password.length()<6) {
			map.put("msg", "密码太短");
			map.put("code", "400");
			return map;
		}
		if(telephone.length()<11) {
			map.put("msg", "手机号太短");
			map.put("code", "400");
			return map;
		}
		if(username.length()>3&&password.length()>5&&telephone.length()>10) {
			int register=userService.insertUser(username,password,telephone,role);
			System.out.print(String.valueOf(register)+"很好");
			if(register==1) {
				map.put("msg", "success");
				map.put("code", "200");
			}else {
				map.put("msg", "fail");
				map.put("code", "400");
			}
		}
		return map;
	}
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> login(@RequestParam String username,@RequestParam String password){

    	if(username.length()<4) {
			map.put("msg", "名字太短");
			map.put("code", "400");
			return map;
		}else if(password.length()<6) {
			map.put("msg", "密码太短");
			map.put("code", "400");
			return map;
		}else {
			boolean islogin = userService.islogin(username,password);
			System.out.println(islogin);
			if(islogin) {
				map.put("code", "200");
				map.put("msg", "success");
			}else {
				map.put("msg", "fail");
				map.put("code", "400");
			}
		}
    	return map;
    }
    
    @RequestMapping(value="/updateuser",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> updateuser(@RequestParam(value="username",required=true) String username,@RequestParam(value="telephone",required=true) String telephone,@RequestParam(value="id",required=true) int id) {
		if(userService.updateUser(username, telephone, id)==1){
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
    
}
