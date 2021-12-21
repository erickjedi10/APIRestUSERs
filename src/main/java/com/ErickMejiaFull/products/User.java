package com.ErickMejiaFull.products;

public class User {
	private Long id;
	private String name;
	private String mobilNo;
	private Long salary;
	
	public User() {}
	public User(Long id, String name, String mobilNo, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.mobilNo = mobilNo;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilNo() {
		return mobilNo;
	}
	public void setMobilNo(String mobilNo) {
		this.mobilNo = mobilNo;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
}
