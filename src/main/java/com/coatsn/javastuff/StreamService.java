package com.coatsn.javastuff;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class StreamService {

	public void printAllPeople(List<Person> people) {
		people.stream().forEach(p -> System.out.println("person: " + p));
	}

	public List<Person> sortAscendingAge(List<Person> people) {
		return people.stream().sorted(comparing(Person::getAge)).collect(toList());
	}

	public boolean isAnyoneTrans(List<Person> people) {
		return people.stream().anyMatch(p -> p.getGender() == Gender.TRANS);
	}

	public List<Person> sortMalesByAscendingAge(List<Person> people) {
		return sortAscendingAge(people.stream().filter(p -> p.getGender() == Gender.MALE).collect(toList()));
	}

	public int findAverageAge(List<Person> people) {
		Double avg = people.stream().mapToDouble(Person::getAge).average().getAsDouble();
		return Integer.valueOf((int) Math.round(avg));
	}
}
