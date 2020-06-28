package com.example.demo.service;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.User;
import com.example.demo.dao.UserMapper;

@Service
public class UserServer {
	@Autowired
    private UserMapper userMapper;

    public List<User> getUser(int id) {
        return userMapper.getUser(id);
    }
    
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
    
    
    public List<User> selectUser(String username,String password) {
		return userMapper.selectUser( username,password);
	}
    
    
    public int insertUser(String username,String password,String telephone,String role) {
    	return userMapper.insertUser( username,password,telephone,role);    	
    }
    
    public int updateUser(String username,String telephone,int id) {
		return userMapper.updateUser(username, telephone, id);
	}
    
    public boolean islogin(String username, String password) {
    	boolean is_true;
    	String user_name=username;
    	try {
    		List<User> user=userMapper.selectUser(username, password);
    		System.out.println(user);
    		System.out.println(user.size());
    		if(user.size()>0) {
    			is_true=true;
    		}else {
    			is_true=false;
    		}
    	}catch (Exception e) {
    		System.out.println(e);
    		is_true=false;
		}
    	return is_true;
    }	
}
