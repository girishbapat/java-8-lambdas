/**
 *
 */
package com.core.java8.lambdas.chapter2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.core.java8.lambdas.common.Employee;

/**
 * @author Girish Bapat
 *
 *         Class for demonstrating different Functional Interfaces
 *
 *
 */
public class FunctionalInterfaces {

	private static void getEmpWithMin35(List<Employee> empList,
			Predicate<Employee> atLeast35) {
		for (Employee emp : empList) {
			if (atLeast35.test(emp)) {
				System.out.println("Name of emp is:" + emp.getFirstName()
						+ ", age:" + emp.getAge());
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Predicate<Employee> atLeast35 = emp -> emp.getAge() > 35;

		Consumer<Employee> printFullName = e -> {
			System.out.println("Employee full name is:");
			System.out.println(e.getFirstName() + " " + e.getLastName());
		};

		Function<Employee, String> getEmployeeWithAge = e -> {
			return "Employee name is:" + e.getFirstName() + " is " + e.getAge()
					+ " years old";
		};

		Supplier<Employee> employeeWithNameAndDept = () -> {
			Employee emp = new Employee();
			emp.setFirstName("DefaultName");
			emp.setDepartment("Dev");
			return emp;
		};

		List<Employee> emplst = Employee.getShortList();
		System.out.println("======Predicate=====");
		getEmpWithMin35(emplst, atLeast35);

		System.out.println("=====Functional====");
		for (Employee emp1 : emplst) {
			System.out.println(getEmployeeWithAge.apply(emp1));
		}
		System.out.println("=====Consumer====");
		for (Employee emp1 : emplst) {
			printFullName.accept(emp1);
		}
		System.out.println("===Supplier===");
		printFullName.accept(employeeWithNameAndDept.get());
	}

}
