package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable {
	private String uid;
	private String name;
	private int age;
	private String address;

	public AadharDTO() {

	}

	public AadharDTO(String uid, String name, int age, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "AadharDTO [uid=" + uid + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
