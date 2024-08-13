package com.org;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	String gender;
	String dept;
	int JOD;
	double salary;
	public Employee(int id, String name, String gender, String dept, int jOD, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		JOD = jOD;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", JOD=" + JOD
				+ ", salary=" + salary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(JOD, dept, gender, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return JOD == other.JOD && Objects.equals(dept, other.dept) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getJOD() {
		return JOD;
	}
	public void setJOD(int jOD) {
		JOD = jOD;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
