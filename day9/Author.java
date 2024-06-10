package com.ey.day9assignment;

import java.time.LocalDate;

public class Author {
	private Long adharCard;
	private String surname;
	private String firstname;
	private String lastname;
	private LocalDate birthdate;
	private String gender;
	private String city;
	private Long mobile;
	
	public Author(Long adharCard, String surname, String firstname, String lastname, LocalDate birthdate, String gender,
			String city, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.surname = surname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
	}
	
	public Long getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Author [adharCard=" + adharCard + ", surname=" + surname + ", firstname=" + firstname + ", lastname="
				+ lastname + ", birthdate=" + birthdate + ", gender=" + gender + ", city=" + city + ", mobile=" + mobile
				+ "]";
	}
	
	
	
}
