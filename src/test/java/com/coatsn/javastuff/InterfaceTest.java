package com.coatsn.javastuff;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class InterfaceTest {

	private List<Person> people;
	
	@Before
	public void setup() {
		this.people = new ArrayList<Person>();
		this.people.add(new Person("Nick", 32, Gender.MALE));
		this.people.add(new Person("Jeff", 31, Gender.MALE));
		this.people.add(new Person("Margo", 26, Gender.FEMALE));
		this.people.add(new Person("Julie", 19, Gender.FEMALE));
		this.people.add(new Person("Sam", 20, Gender.TRANS));
		this.people.add(new Person("Mark", 17, Gender.MALE));
	}
	
	@Test
	public void itShouldPrintFancyWithDefaultMethodInInterface() {
		this.people.get(0).printFancy();
	}
	
	@Test
	public void itShouldPrintSimpleWithSecondInterface() {
		this.people.get(0).printSimple();
	}
}
