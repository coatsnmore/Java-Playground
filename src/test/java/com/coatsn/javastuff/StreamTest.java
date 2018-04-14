package com.coatsn.javastuff;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StreamTest {
	
	private List<Person> people;
	private StreamService streamService;
	
	@Before
	public void setup() {
		this.streamService = new StreamService();
		
		this.people = new ArrayList<Person>();
		this.people.add(new Person("Nick", 32, Gender.MALE));
		this.people.add(new Person("Jeff", 31, Gender.MALE));
		this.people.add(new Person("Margo", 26, Gender.FEMALE));
		this.people.add(new Person("Julie", 19, Gender.FEMALE));
		this.people.add(new Person("Sam", 20, Gender.TRANS));
		this.people.add(new Person("Mark", 17, Gender.MALE));
	}
	
	@Test
	public void itShouldPrintWithoutException() {
		streamService.printAllPeople(people);
	}
	
	@Test
	public void itShouldSortByAscendingAge() {
		List<Person> peopleSortedByAge = streamService.sortAscendingAge(people);
		assertTrue("First is Mark who is 17", peopleSortedByAge.get(0).getName().equals("Mark"));
		assertTrue("Last is Nick who is 32", peopleSortedByAge.get(peopleSortedByAge.size() - 1).getName().equals("Nick"));
	}
	
	@Test
	public void itShouldFilterByGenderAndSortByAge() {
		List<Person> malesSortedByAge = streamService.sortMalesByAscendingAge(people);
		assertTrue("There should only be males..", malesSortedByAge.stream().allMatch(p -> p.getGender() == Gender.MALE));
		assertTrue("First is Mark who is 17", malesSortedByAge.get(0).getName().equals("Mark"));
		assertTrue("Last is Nick who is 32", malesSortedByAge.get(malesSortedByAge.size() - 1).getName().equals("Nick"));
	}
	
	@Test
	public void itShouldSeeIfAnyoneTrans() {
		boolean anyMale = streamService.isAnyoneTrans(people);
		assertTrue("There should be transgender in the collection.", anyMale);
	}
	
	@Test
	public void itShouldFindTheMeanAge() {
		int computedAge = streamService.findAverageAge(people);
		assertTrue("The mean age should be 24", computedAge == 24);
	}

}
