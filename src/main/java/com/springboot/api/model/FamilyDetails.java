package com.springboot.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Family")
public class FamilyDetails {
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int num;
	
	private String name;
	
	private String surName;
	
	private int age;
	
	private String gender;
	
	private String study;
	
	private String mblNum;
	
	//Parameterized method
	
	public FamilyDetails(){
		
	}
	public FamilyDetails(int num,String name,String surName,int age,String gender,String study,String mblNum) {
		this.num=num;
		this.name=name;
		this.surName=surName;
		this.age=age;
		this.gender=gender;
		this.study=study;
		this.mblNum=mblNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getMblNum() {
		return mblNum;
	}
	public void setMblNum(String mblNum) {
		this.mblNum = mblNum;
	}
	@Override
	public String toString() {
		return "FamilyDetails [num=" + num + ", name=" + name + ", surName=" + surName + ", age=" + age + ", gender="
				+ gender + ", study=" + study + ", mblNum=" + mblNum + "]";
	}
	
	
	
	
	

}
