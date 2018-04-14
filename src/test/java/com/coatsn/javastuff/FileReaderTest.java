package com.coatsn.javastuff;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class FileReaderTest {

	@Test
	public void itShouldReadTheFileWithoutException() {
		List<String> lines = new BufferedReader(
				new InputStreamReader(ClassLoader.getSystemResourceAsStream("people.txt"))).lines().collect(Collectors.toList());
		
		assertNotNull("Lines collected from file should not be null", lines);
	}
	
	@Test
	public void itShouldCreatePeopleFromFile() {
		List<String> lines = new BufferedReader(
				new InputStreamReader(ClassLoader.getSystemResourceAsStream("people.txt"))).lines().collect(Collectors.toList());

		// create people from file
		List<Person> people = lines.stream().map(line -> new Person(line)).collect(Collectors.toList());
		people.stream().forEach(p -> System.out.println("person: " + p));
		
		assertTrue("It should create a List of people from the file entries", people.size() == 5);
	}
}
