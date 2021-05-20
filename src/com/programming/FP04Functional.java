package com.programming;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FP04Functional {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "AWS", "Microservices", "Spring boot", "Azure", "Java8", "RESTful Ws");
		List<Integer> numbers = List.of(1, 3, 2, 6, 4, 6, 8, 3, 4);

		List<Integer> squaredList = squaredList(numbers);
		Set<Integer> evenNumbersList = evenNumbersList(numbers);
		List<Integer> lengthsOfCourses = lengthOfCourses(courses);
		System.out.println(squaredList);
		System.out.println(evenNumbersList);
		System.out.println(lengthsOfCourses);
	}

	private static List<Integer> lengthOfCourses(List<String> courses) {
		return courses.stream().map(str -> str.length()).collect(Collectors.toList());

	}

	private static Set<Integer> evenNumbersList(List<Integer> numbers) {
		return numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

	}

	private static List<Integer> squaredList(List<Integer> numbers) {
		return numbers.stream().map(x -> x * x).collect(Collectors.toList());

	}
}
