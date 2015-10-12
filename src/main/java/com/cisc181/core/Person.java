package com.cisc181.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * comment
 */
public abstract class Person<CharArrayList> {

	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private CharArrayList phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(CharArrayList newPhone_number) {
		phone_number = newPhone_number;
	}

	public CharArrayList getPhone() {
		return phone_number;
	}

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	//public String FormatNumber getNumber(){
		//return  correct_format;  
		
	public void CheckPhoneNumber (CharArrayList Phone_number){

	}
	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Person(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, CharArrayList Phone_number, String Email) {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.DOB = DOB;
		this.address = Address;
		this.phone_number = Phone_number;
		CharArrayList phoneNumbers = new CharArrayList (Phone_number); 
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		
		
		//if not valid format, throw new PersonException(this);
		this.email_address = Email;
	}
		
	

	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	public void PrintDOB() {
		System.out.println(this.DOB);
	}

	public int PrintAge() throws PersonException {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		
		if(birthDate.get(Calendar.YEAR) < today.get(Calendar.YEAR)-100){
			throw new PersonException(this);
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;		
	
}
	public CharArrayList PrintNumFormat() throws PersonException{
		
		char [] characters = phone_number.CharArrayList();
		for (char character: characters)
		{
			Matcher matcher = Pattern.matcher(phone_number);
			if (matcher.matches())
			{
			System.out.println(phone_number + " : " +matcher.matches());
			}
			else 
				throw new PersonException(this);
		
	}
	
}
}
