package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;


@Entity
@Table(name = "notice")
public class Notice {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer userid;
	private String content;
	private String title;
	private String createdate;


	public Notice(Integer userid,String content, String title,String createdate) {
		// TODO Auto-generated constructor stub
		this.userid=userid;
		this.content = content;
		this.title=title;
		this.createdate=createdate;
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
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
    
    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", createdate='" + createdate + '\'' +
                '}';
    }
    
}
