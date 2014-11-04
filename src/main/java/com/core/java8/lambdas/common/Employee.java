package com.core.java8.lambdas.common;

import java.util.ArrayList;
import java.util.Arrays;
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
	String nationality;
	List<String> languagesKnown;

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

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the languagesKnown
	 */
	public List<String> getLanguagesKnown() {
		return languagesKnown;
	}

	/**
	 * @param languagesKnown
	 *            the languagesKnown to set
	 */
	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public static List<Employee> getShortList() {
		List<Employee> lst = new ArrayList<>();
		Employee emp = new Employee();
		emp.setFirstName("Bob");
		emp.setLastName("Baker");
		emp.setNationality("American");
		emp.setLanguagesKnown(Arrays.asList(new String[] { "English",
				"Spanish", "Mexican" }));
		emp.setAge(30);
		emp.setEmpId(1000);
		emp.setSalary(12.5);
		emp.setDepartment("Dev");

		Employee emp2 = new Employee();
		emp2.setFirstName("Jane");
		emp2.setLastName("Doe");
		emp2.setNationality("American");
		emp2.setLanguagesKnown(Arrays.asList(new String[] { "English",
				"Spanish", "Mexican" }));

		emp2.setAge(40);
		emp2.setEmpId(2000);
		emp2.setSalary(15.0);
		emp2.setDepartment("Dev");

		Employee emp3 = new Employee();
		emp3.setFirstName("Dave");
		emp3.setLastName("Doe");
		emp3.setNationality("Canadian");
		emp3.setLanguagesKnown(Arrays.asList(new String[] { "French",
				"Italian", "English" }));

		emp3.setAge(50);
		emp3.setEmpId(2002);
		emp3.setSalary(17.0);
		emp3.setDepartment("QA");

		Employee emp4 = new Employee();
		emp4.setFirstName("Sally");
		emp4.setLastName("Johnson");
		emp4.setNationality("Canadian");
		emp4.setLanguagesKnown(Arrays.asList(new String[] { "French",
				"Spanish", "Mexican" }));

		emp4.setAge(32);
		emp4.setEmpId(2003);
		emp4.setSalary(10.0);
		emp4.setDepartment("QA");

		Employee emp5 = new Employee();
		emp5.setFirstName("John");
		emp5.setLastName("Bailey");
		emp5.setAge(38);
		emp5.setEmpId(2043);
		emp5.setSalary(15.0);
		emp5.setDepartment("Sales");
		emp5.setNationality("African");
		emp5.setLanguagesKnown(Arrays.asList(new String[] { "English",
				"Italian", "Mexican" }));

		Employee emp6 = new Employee();
		emp6.setFirstName("Andrew");
		emp6.setLastName("Smith");
		emp6.setAge(58);
		emp6.setEmpId(26);
		emp6.setSalary(22.0);
		emp6.setDepartment("Sales");
		emp6.setNationality("Indian");
		emp6.setLanguagesKnown(Arrays.asList(new String[] { "English", "Hindi",
				"German" }));

		Employee emp7 = new Employee();
		emp7.setFirstName("Kelly");
		emp7.setLastName("Jones");
		emp7.setAge(32);
		emp7.setEmpId(333);
		emp7.setSalary(12.0);
		emp7.setDepartment("Admin");
		emp7.setNationality("Indian");
		emp7.setLanguagesKnown(Arrays.asList(new String[] { "English", "Hindi",
				"German" }));

		lst.add(emp2);
		lst.add(emp7);
		lst.add(emp6);
		lst.add(emp5);
		lst.add(emp4);
		lst.add(emp3);
		lst.add(emp);
		return lst;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", empId=" + empId + ", salary=" + salary
				+ ", department=" + department + ", nationality=" + nationality
				+ ", languagesKnown=" + languagesKnown + "]";
	}

}
