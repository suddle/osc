package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "file")
public class File {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer userid;
	private String remark;
	private String file;
	private String title;
	private String filename;
	
	public File(Integer userid,String remark, String file, String title,String filename) {
		// TODO Auto-generated constructor stub
		this.userid=userid;
		this.remark = remark;
		this.file=file;
		this.title=title;
		this.filename=filename;
	}
	
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file=file;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename=filename;
	}
	@Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", remark='" + remark + '\'' +
                ", file='" + file + '\'' +
                ", title='" + title + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}
