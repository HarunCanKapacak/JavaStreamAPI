package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
	public static void main(String[] args) {

		List<Person> person = new ArrayList<Person>();
		person.add(new Person("harun", 24));
		person.add(new Person("erol", 5));
		person.add(new Person("ayse", 47));

		System.out.println(partitionAdults2(person));
		// Cýktý:{false=[name:erol age:5 nationality:], true=[name:harun age:24
		// nationality:, name:ayse age:47 nationality:]}

	}

	// Before
	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		Map<Boolean, List<Person>> map = new HashMap<>();
		map.put(true, new ArrayList<>());
		map.put(false, new ArrayList<>());
		for (Person person : people) {
			map.get(person.getAge() >= 18).add(person);
		}
		return map;
	}

	// Stream API
	public static Map<Boolean, List<Person>> partitionAdults2(List<Person> people) {
		return people.stream().
				collect(Collectors.groupingBy(person -> person.getAge() >= 18,
				 Collectors.toList()));
	}

}