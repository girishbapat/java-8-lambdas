package com.core.java8.lambdas.common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RDXSZ0030
 *
 */
public class Employee {
	String firstName;
	String lastName;
	int age;
	int empId;
	double salary;
	String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static List<Employee> getShortList() {
		List<Employee> lst = new ArrayList<>();
		Employee emp = new Employee();
		emp.setFirstName("Bob");
		emp.setLastName("Baker");
		emp.setAge(30);
		emp.setEmpId(1000);
		emp.setSalary(12.5);
		emp.setDepartment("Dev");

		Employee emp2 = new Employee();
		emp.setFirstName("Jane");
		emp.setLastName("Doe");
		emp.setAge(40);
		emp.setEmpId(2000);
		emp.setSalary(15.0);
		emp.setDepartment("Dev");

		Employee emp3 = new Employee();
		emp.setFirstName("Dave");
		emp.setLastName("Doe");
		emp.setAge(50);
		emp.setEmpId(2002);
		emp.setSalary(17.0);
		emp.setDepartment("QA");

		Employee emp4 = new Employee();
		emp.setFirstName("Sally");
		emp.setLastName("Johnson");
		emp.setAge(32);
		emp.setEmpId(2003);
		emp.setSalary(10.0);
		emp.setDepartment("QA");

		Employee emp5 = new Employee();
		emp.setFirstName("John");
		emp.setLastName("Bailey");
		emp.setAge(38);
		emp.setEmpId(2043);
		emp.setSalary(15.0);
		emp.setDepartment("Sales");

		Employee emp6 = new Employee();
		emp.setFirstName("Andrew");
		emp.setLastName("Smith");
		emp.setAge(58);
		emp.setEmpId(26);
		emp.setSalary(22.0);
		emp.setDepartment("Sales");

		Employee emp7 = new Employee();
		emp.setFirstName("Kelly");
		emp.setLastName("Jones");
		emp.setAge(32);
		emp.setEmpId(333);
		emp.setSalary(12.0);
		emp.setDepartment("Admin");

		lst.add(emp2);
		lst.add(emp7);
		lst.add(emp6);
		lst.add(emp5);
		lst.add(emp4);
		lst.add(emp3);
		lst.add(emp);
		return lst;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", empId=" + empId + ", salary=" + salary
				+ ", department=" + department + "]";
	}

}
