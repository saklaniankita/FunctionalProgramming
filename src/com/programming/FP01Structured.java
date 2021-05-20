package com.programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 3, 3, 4, 6, 4, 5);
		printListStructuralWay(list);
		printEvenNumbersStructuredWay(list);

	}

	// Conventional Structural way
	private static void printListStructuralWay(List<Integer> list) {
		for (int i : list)
			System.out.println(i);

	}

	private static void printEvenNumbersStructuredWay(List<Integer> list) {
		for (int i : list) {
			if (isEven(i))
				System.out.println(i);
		}
	}

	private static boolean isEven(int i) {
		return i % 2 == 0;
	}

}
