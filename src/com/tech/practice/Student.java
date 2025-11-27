package com.tech.practice;

public class Student {

	private int id;

	private String name;

	private String address;

	private long rank;

	private String department;

	private String gender;

	private int age;

	public Student(int id, String name, String address, long rank, String department, String gender, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.rank = rank;
		this.department = department;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public long getRank() {
		return rank;
	}

	public String getDepartment() {
		return department;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", rank=" + rank + ", department="
				+ department + ", gender=" + gender + ", age=" + age + "]";
	}

}
