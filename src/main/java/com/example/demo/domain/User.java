package com.example.demo.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String password;
	private String role;
	private String telephone;
	
	
	
	public User(String username, String password2,String telephone,String role2) {
		// TODO Auto-generated constructor stub
		this.name = username;
		this.password=password2;
		this.role=role2;
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
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String  getRole() {
		return role;
	}
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	public String  getTelephone() {
		return telephone;
	}
	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
