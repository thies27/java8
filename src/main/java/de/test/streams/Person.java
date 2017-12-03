package de.test.streams;

import java.util.Date;



public class Person {

	public Person() {

	}

	public Person(String firstName, String lastName, Date geburtstag, String adresse) {

		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGeburtstag(geburtstag);
		this.setAdresse(adresse);
	}
	
	public Person(String firstName, String lastName, boolean adult) {

		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAdult(adult);		
	}

	private String firstName;

	private String lastName;

	private Date geburtstag;

	private String adresse;
	
	private boolean adult;

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
