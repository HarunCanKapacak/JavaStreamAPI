package com;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 12, 11, 3, 2);
			

		System.out.println(calculate(list));
		// Cýktý : 40

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

		// Bir veri setinde sýrayla iþlem yapmak istiyorsanýz ve bir önceki yaptýðýnýz
		// iþlemi de dahil etmek istiyorsanýz reduce metodunu kullanabilirsiniz.
	}
}
