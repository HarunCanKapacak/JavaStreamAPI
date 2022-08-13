package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {

		List<Person> person1 = new ArrayList<Person>();
		person1.add(new Person("harun", 8,"Turkiye"));
		person1.add(new Person("erol", 50,"Turkiye"));
		person1.add(new Person("ayse", 47,"Abd"));

		System.out.println(groupByNationality(person1));
		// Cýktý: {Turkiye=[name:harun age:8 nationality:Turkiye, name:erol age:50 nationality:Turkiye], Abd=[name:ayse age:47 nationality:Abd]}

	}
    //Before
	public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		Map<String, List<Person>> map = new HashMap<>();
		for (Person person : people) {
			if (!map.containsKey(person.getNationality())) {
				map.put(person.getNationality(), new ArrayList<>());
			}
			map.get(person.getNationality()).add(person);
		}
		return map;
	}
	//Stream API
	public static Map<String, List<Person>> groupByNationality2(List<Person> people) {
		return people.stream().collect(Collectors.groupingBy(person -> person.getNationality(), Collectors.toList()));

	}
}
