package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.File;
import com.example.demo.service.FileServer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class FileController {
	
	Map<String,String> map=new HashMap<String,String>();
	
	
	@Autowired
    private FileServer fileserver;
	
	
	@RequestMapping("/getallfile")
    public List<File> getallfile() {
        return fileserver.getAllFIle();
    }
	
	
	@RequestMapping(value="/getfile",method=RequestMethod.POST)
    public List<File> getfile(String filename) {
        return fileserver.getFile(filename);
    }
	

	@RequestMapping(value="/deletefile",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> deletefile(@RequestParam(value="filename",required=false) String filename,@RequestParam(value="id",required=false) int id){
	    boolean deletefile=fileserver.deleteFile(filename,id);
	    if(deletefile) {
			map.put("msg", "success");
			map.put("code", "200");
		}else {
			map.put("msg", "fail");
			map.put("code", "400");
		}
		return map;
	}
	
	
	
	@RequestMapping(value="/insertfile",method=RequestMethod.POST) //String file, String filename, String remark,String title
	@ResponseBody
	public Map<String, String>  insertfile(@RequestParam(value="file",required=false) String file,@RequestParam(value="filename",required=false) String filename,@RequestParam(value="remark",required=false) String remark,@RequestParam(value="title",required=false) String title) {
		System.out.print(file+filename);
		if(file.length()>0&&filename.length()>0) {
			boolean insertfile=fileserver.insertfile(file, filename, remark, title);
			if(insertfile) {
				map.put("msg", "success");
				map.put("code", "200");
			}else {
				map.put("msg", "fail");
				map.put("code", "400");
			}
		}else {
			map.put("msg", "字数太短");
			map.put("code", "400");
		}
		return map;
	}
}
