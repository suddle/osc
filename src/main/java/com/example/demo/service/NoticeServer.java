package com.example.demo.service;
import java.util.List;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.domain.Job;
import com.example.demo.domain.Notice;
import com.example.demo.dao.NoticeMapper;
import org.springframework.stereotype.Service;

@Service
public class NoticeServer {
	@Autowired
	NoticeMapper noticemapper;
	
	
	public int updateNotice(String content,String title,int id) {
		return noticemapper.updateNotice(content, title, id);
	}
	
	public List<Notice> getAllNotice(){
		return noticemapper.getAllNotice();
	}
	
	public List<Notice> getNotice(String txt){
		return noticemapper.getNotice(txt);
	}
	
	public int deleteNotice(int id) {
		return noticemapper.deleteNotice(id);
	}
	
	public int insertNotice(String name, String remark,String userid) {
		return noticemapper.insertNotice(name, remark, userid);
	}
	
	
}
