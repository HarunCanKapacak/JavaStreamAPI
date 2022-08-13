package com;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 12, 11, 3, 2);
			

		System.out.println(calculate(list));
		// C�kt� : 40

	}

	// Before
	public static int calculate(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	// Stream API
	public static int calculate2(List<Integer> numbers) {

		return numbers.stream().reduce(Integer::sum).orElse(0);

		// Bir veri setinde s�rayla i�lem yapmak istiyorsan�z ve bir �nceki yapt���n�z
		// i�lemi de dahil etmek istiyorsan�z reduce metodunu kullanabilirsiniz.
	}
}
