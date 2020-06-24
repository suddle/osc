package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Dept {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String remark;


	public Dept(String name, String remark) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.remark=remark;
	}
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String content) {
        this.name = name;
    }
    
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", remark='" + remark + '\'' +
                ", name='" + name + '\'' +
                '}';
     }
}
