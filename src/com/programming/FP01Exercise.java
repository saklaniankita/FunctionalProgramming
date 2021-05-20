package com.programming;

import java.util.List;

public class FP01Exercise {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "AWS", "Microservices", "Spring boot", "Azure", "Java8", "RESTful Ws");
//		printAllCourses(courses);
//		printSpringCourses(courses);
//		print6LettersCourse(courses);
//		printSquaresOfEven(List.of(1,2,3,4,5,6,7,8,9,10));
		printNumOfCharacters(courses);
	}

	static void printAllCourses(List<String> courses) {

		courses.stream().forEach(System.out::println);
	}

	/**
	 * Filter Example....Filter corresponds to an if statement
	 * @param courses
	 */
	static void printSpringCourses(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}
	
	static void print6LettersCourse(List<String> courses) {
		courses.stream().filter(course -> course.length()>=6).forEach(System.out::println);
	}
	
	/**
	 * map Example....map corresponds to a function call
	 * @param list
	 */
	static void printSquaresOfEven(List<Integer> list) {
		list.stream().filter(num -> num%2 == 0).map(num -> num*num).forEach(System.out::println);
	}
	
	static void printNumOfCharacters(List<String> courses) {
		courses.stream().map(course -> course +": "+course.length()).forEach(System.out::println);
	}
}
