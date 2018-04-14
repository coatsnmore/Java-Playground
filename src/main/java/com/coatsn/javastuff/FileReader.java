package com.coatsn.javastuff;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {
	public List<String> readFile(String fileName) {
		return new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(fileName))).lines()
				.collect(Collectors.toList());
	}

	public List<Person> buildPeopleFromFile(String fileName) {
		return this.readFile(fileName).stream().map(line -> new Person(line)).collect(Collectors.toList());
	}
}
