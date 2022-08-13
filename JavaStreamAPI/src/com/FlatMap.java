package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	// nested list e ait deðerleri al -> Stream()
	// her bir elemani bir listeye ekle -> flatmap()

	public static void main(String[] args) {
		List<String> x1 = Arrays.asList("abc", "abc");
		List<String> x2 = Arrays.asList("xyx", "asd");
		List<String> x3 = Arrays.asList("qwe", "lhg");
		List<List<String>> a = new ArrayList<List<String>>();
		a.add(x1);
		a.add(x2);
		a.add(x3);
		System.out.println(transform2(a));
		// Cýktý:[abc, abc, xyx, asd, qwe, lhg]

	}

	// Before
	public static List<String> transform(List<List<String>> collection) {
		List<String> newCollection = new ArrayList<>();
		for (List<String> subCollection : collection) {
			for (String value : subCollection) {
				newCollection.add(value);
			}
		}
		return newCollection;
	}

	// Stream API
	public static List<String> transform2(List<List<String>> collection) {
		return collection.stream().flatMap(Collection::stream) // Stream<Stream<String>> -> Stream<String>
				.collect(Collectors.toList()); // Stream<String> -> List<String>
	}

//Stream API
	public static String transform3(List<Person> people) {
		return "Names: " + people.stream()
		.map(Person::getName).reduce((i, sum) -> i + ", " + sum)
		.orElse("") + ".";
	}

}
