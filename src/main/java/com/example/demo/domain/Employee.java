package com.example.demo.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer jobid;
	private Integer deptid;
	private String address;
	private String birthday;
	private String cardif;
	private String createdate;
	private String education;
	private String email;
	private String hobby;
	private String name;
	private String party;
	private String race;
	private String phone;
	private String postcode;
	private String qqnum;
	private String remark;
	private String sex;
	private String speciality;
	private String tel;
	
	public Employee(Integer jobid,Integer deptid,String address,String birthday,String cardif,String createdate,String education,String email,String hobby,String name,String party,String race,String phone,String postcode,String qqnum,String remark,String sex,String speciality,String tel) {
		// TODO Auto-generated constructor stub
		this.jobid = jobid;
		this.deptid=deptid;
		this.address=address;
		this.birthday=birthday;
		this.cardif=cardif;
		this.createdate=createdate;
		this.education=education;
		this.email=email;
		this.hobby=hobby;
		this.name=name;
		this.party=party;
		this.phone=phone;
		this.postcode=postcode;
		this.qqnum=qqnum;
		this.remark=remark;
		this.sex=sex;
		this.speciality=speciality;
		this.tel=tel;
	}
	
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }
    
    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    
    public String getCardif() {
        return cardif;
    }
    public void setCardif(String cardif) {
        this.cardif = cardif;
    }
    
    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
    
    
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getParty() {
        return party;
    }
    public void setParty(String party) {
        this.party = party;
    }
    
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public String getQqnum() {
        return qqnum;
    }
    public void setQqnum(String qqnum) {
        this.qqnum = qqnum;
    }
    
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
