package com;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {

		List<Person> person1 = new ArrayList<Person>();
		person1.add(new Person("harun", 8));
		person1.add(new Person("erol", 50));
		person1.add(new Person("ayse", 47));

		System.out.println(namesToString2(person1));
		// cýktý: Names: harun,erol,ayse.
	}

	// Before
	public static String namesToString(List<Person> people) {
		String label = "Names: ";
		StringBuilder sb = new StringBuilder(label);
		for (Person person : people) {
			if (sb.length() > label.length()) {
				sb.append(", ");
			}
			sb.append(person.getName());
		}
		sb.append(".");
		return sb.toString();
	}

	// Stream API
	public static String namesToString2(List<Person> people) {
		return "Names: " + people.stream().map(Person::getName).collect(Collectors.joining(",")) + ".";
	}
}
