package com.programming;

import java.util.Comparator;
import java.util.List;

public class FP03Functional {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "AWS", "Microservices", "Spring boot", "Azure", "Java8", "RESTful Ws");
		List<Integer> listOfNum = List.of(1, 4, 3, 3, 4, 6, 4, 5);
//		sort(courses);
//		naturalOrderSort(courses);
//		reverseSort(courses);
//		sortByLength(courses);
//		sortNumbers(listOfNum);
		sortNumbersInReverseOrder(listOfNum);

	}

	private static void sort(List<String> courses) {

		courses.stream().sorted().forEach(System.out::println);
	}


	private static void reverseSort(List<String> courses) {
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	private static void naturalOrderSort(List<String> courses) {
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}
	
	private static void sortByLength(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
	}

	private static void sortNumbers(List<Integer> listOfNum) {
		listOfNum.stream().distinct().sorted().forEach(System.out::println);
		
	}
	
	private static void sortNumbersInReverseOrder(List<Integer> listOfNum) {
		listOfNum.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}