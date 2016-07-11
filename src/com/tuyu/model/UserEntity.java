package com.tuyu.model;

public class UserEntity {
     //登录帐号信息
	private String password;
	private String account;
	private String email;
	private int power;
	
	//实名认证信息
	private String name;
	private String IDcard;
	private String telNumber;
	private String address;
	private String brith;
	private String height;
	private String weight;
	private String hobby;
	private String remarks;
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBrith() {
		return brith;
	}
	public void setBrith(String brith) {
		this.brith = brith;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public UserEntity( String account, String email, int power,
			String name, String iDcard, String telNumber, String address,
			String brith, String height, String weight, String hobby,
			String remarks) {
		this.account = account;
		this.email = email;
		this.power = power;
		this.name = name;
		IDcard = iDcard;
		this.telNumber = telNumber;
		this.address = address;
		this.brith = brith;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
		this.remarks = remarks;
	}
	public UserEntity() {
	}

 }
