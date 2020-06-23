package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.domain.File;
import com.example.demo.dao.FileMapper;
import org.springframework.stereotype.Service;
import com.example.demo.service.FileServer;


@Service
public class FileServer {
	@Autowired 
	FileMapper fileMapper;
	
	public List<File> getFile(String filename) {
		return fileMapper.getFile(filename);
	}
	
	public boolean deleteFile(String filename,int id) {
		boolean is_true;
    	try {
    		fileMapper.deleteFile(filename,id);
    		is_true=true;
    	}catch (Exception e) {
    		System.out.print(e);
			is_true=false;
		}
    	return is_true;
	}
	
	public boolean insertfile(String file, String filename, String remark,String title) {
		boolean is_true;
    	try {
    		fileMapper.insertFile(file, filename, remark, title);
    		is_true=true;
    	}catch (Exception e) {
    		if(e.toString().contains("has an unsupported return type")) {
    			is_true=true;
			}else {
				is_true=false;
			}
		}
    	return is_true;
	}
	public List<File> getAllFIle(){
		return fileMapper.getAllFile();
	}
	
}
