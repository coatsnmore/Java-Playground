package com.coatsn.javastuff;

public class Person extends BaseDTO implements FancyPrinterInterface, SimplePrinterInterface {
	
	private String name = "";
	private int age = 0;
	private Gender gender;
	
	public Person (String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	/**
	 * Build from a string "<name> <age> <gender>"
	 * @param line
	 */
	public Person (String line) {
		String [] parts = line.split(" ");
		this.name = parts[0];
		this.age = Integer.parseInt(parts[1]);
		this.gender = Gender.valueOf(parts[2].toUpperCase());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
