/**
 *
 */
package com.core.java8.lambdas.chapter3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.core.java8.lambdas.common.Employee;

/**
 * @author GIRISH
 *
 */
public class StreamsBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> lstEmployee = Employee.getShortList();

		int count = 0;
		Iterator<Employee> iterator = lstEmployee.iterator();
		while (iterator.hasNext()) {
			Employee emp = iterator.next();
			if (emp.getDepartment().equals("Dev")) {
				count++;
			}
		}
		System.out.println("Count is:" + count);

		long lambdaCount = lstEmployee.stream()
				.filter(e -> e.getDepartment().equals("Dev")).count();
		System.out.println("Count with lambda is:" + lambdaCount);

		lstEmployee.stream().filter(e -> {
			boolean check = e.getDepartment().equals("Dev");
			if (check) {
				System.out.println("Not Printing this");
			}
			return check;
		});

		lstEmployee.stream().filter(e -> {
			boolean check = e.getDepartment().equals("Dev");
			if (check) {
				System.out.println("Printing this");
			}
			return check;
		}).count();

		System.out.println("Common Stream operations");

		List<String> collected = Stream.of("a", "b", "c").collect(
				Collectors.toList());
		System.out.println("collect:" + collected);

		collected = Stream.of("a", "b", "c").map(str -> str.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("map:" + collected);

		collected = Stream.of("a", "b", "c").filter(str -> str.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("filter:" + collected);

		List<Integer> numbersTogether = Stream
				.of(Arrays.asList(new Integer[] { 1, 2 }),
						Arrays.asList(new Integer[] { 4, 5 }))
						.flatMap(numbers -> numbers.stream())
						.collect(Collectors.toList());
		System.out.println("numbersTogether:" + numbersTogether);

		int sum = Stream.of(1, 2, 4, 5).reduce(0,
				(acc, element) -> acc + element);

		System.out.println("reduce:" + sum);

		BinaryOperator<Integer> accumulator = (acc, ele) -> acc + ele;
		sum = accumulator
				.apply(5,
						accumulator.apply(
								4,
								accumulator.apply(
										3,
										accumulator.apply(2,
												accumulator.apply(1, 0)))));
		System.out.println("normal accumulator sum is:" + sum);

	}

}
