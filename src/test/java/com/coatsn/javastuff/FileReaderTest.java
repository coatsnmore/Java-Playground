package com.coatsn.javastuff;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {
	
	private FileReader fileReader;
	private String fileName;
	
	@Before
	public void setup() {
		fileReader = new FileReader();
		fileName = "people.txt";
	}

	@Test
	public void itShouldReadTheFileWithoutException() {
		List<String> lines = fileReader.readFile(fileName);
		assertNotNull("Lines collected from file should not be null", lines);
	}

	@Test
	public void itShouldCreatePeopleFromFile() {
		List<Person> people = fileReader.buildPeopleFromFile(fileName);
		assertTrue("It should create a List of people from the file entries", people.size() == 5);
	}
}
