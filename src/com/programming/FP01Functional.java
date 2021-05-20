package com.programming;

import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 3, 3, 4, 6, 4, 5);
		printListFunctionalWay(list);
		printEvenNumbersFunctionalWay(list);
	}

	private static void printNum(int num) {
		System.out.println(num);
	}
	
	private static boolean isEven(int i) {
		return i % 2 == 0;
	}

	/**
	 * Java 8 using streams and METHOD REFERENCE
	 * @param list
	 */
	private static void printListFunctionalWay(List<Integer> list) {
		list.stream().forEach(FP01Functional::printNum);

		// Still easier way
		list.stream().forEach(System.out::println);
	}
	
//	private static void printEvenNumbersStructuredWay(List<Integer> list) {
//		list.stream()
//		.filter(FP01Functional::isEven) //Filtering even numbers
//		.forEach(System.out::println);  //Method Reference
//		
//	}
	
	/**
	 * LAMBDA Expression
	 * @param list
	 */
	private static void printEvenNumbersFunctionalWay(List<Integer> list) {
		list.stream()
		.filter(number -> number%2==0) //Filtering even numbers
		.forEach(System.out::println);  //Method Reference
		
	}

}
