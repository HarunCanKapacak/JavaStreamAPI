package com;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {



	public static void main(String[] args) {
	  
		 
		 List<Person> person = new ArrayList<Person>();
	   person.add(new Person("harun", 24));
	   person.add(new Person("erol", 50));
	   person.add(new Person("ayse", 47));
		 
		 System.out.println(getOldestPerson(person).toString());
	}


	public static Person getOldestPerson(List<Person> people) {
	
	 return	people.stream()
			 .max(Comparator.comparingInt(Person::getAge))
			 .orElse(null); //max optional olduðu için
		
	}
	
	
}
