package de.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public void createStream() {

		List<Person> persons = createPersonList();

		List<Person> adults = persons.stream().filter(Person::isAdult).collect(Collectors.toList());

		for (Person person : adults) {
			System.out.println(person.getFirstName() + " " + person.getLastName());
		}

		//adults = persons.stream().filter(Person::equals("Regina")).collect(Collectors.toList());

		for (Person person : adults) {
			System.out.println(person.getFirstName() + " " + person.getLastName());
		}

	}

	private List<Person> createPersonList() {

		List<Person> personList = new ArrayList<>();

		Person p = new Person("Regina", "Spaller", true);

		Person p1 = new Person("Minka", "Spaller", false);

		Person p2 = new Person("Jonas", "Spaller", true);

		Person p3 = new Person("Domenik", "Spaller", false);

		personList.add(p);

		personList.add(p1);

		personList.add(p2);

		personList.add(p3);

		return personList;
	}

}
