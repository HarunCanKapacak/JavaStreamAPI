package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		System.out.println(mapToUppercase2("a", "b", "c"));

	}
//Array elemanlarýnýn tamamýný al => stream()
//buyuk harflere cevir => map ()
//liste olarak geri don => collect()
//stream adýnda bir collectiona çeviriyor stream bir collection deðildir

	// Before
	public static Collection<String> mapToUppercase(String... names) {
		Collection<String> uppercaseNames = new ArrayList<>();
		for (String name : names) {
			uppercaseNames.add(name.toUpperCase());
		}
		return uppercaseNames;
	}

	// Stream API
	public static Collection<String> mapToUppercase2(String... names) {
		return Arrays.asList(names).stream()
				.map(name -> name.toUpperCase()).collect(Collectors.toList());
		// Arrays.asList()= aldýðý array i listeye çeviriyor.

	}
}
