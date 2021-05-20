package com.programming;

import java.util.List;

public class FP02Structured {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 3, 5, 4, 5, 1, 5, 6, 9, 10);
		int sum = add(list);
		System.out.println(sum);
	}

	private static int add(List<Integer> list) {
		int tmp = 0;
		for (int num : list) {
			tmp += num;
		}
		return tmp;
	}

}
