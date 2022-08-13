package com;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {

	public static void main(String[] args) {

		List<Person> person1 = new ArrayList<Person>();
		person1.add(new Person("harun", 8));
		person1.add(new Person("erol", 50));
		person1.add(new Person("ayse", 47));

		System.out.println(getKidNames2(person1).toString());
		// Cýktý: [harun]
	}

	// Before
	public static Set<String> getKidNames(List<Person> people) {
		Set<String> kids = new HashSet<>();
		for (Person person : people) {
			if (person.getAge() < 18) {
				kids.add(person.getName());
			}
		}
		return kids;
	}

	// Stream API
	public static Set<String> getKidNames2(List<Person> people) {
		return people.stream()
				.filter(person -> person.getAge() < 18).map(Person::getName)
				.collect(Collectors.toSet());

	}
}
