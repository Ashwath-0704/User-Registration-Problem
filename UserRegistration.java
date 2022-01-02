package Regax;

import java.util.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class UserRegistration {
	/*
	 * As a User need to enter a valid First Name -First name starts with Cap and
	 * has minimum 3 characters
	 */
	public static boolean firstName() throws InvalidUserInputException {

		String firstName = JOptionPane.showInputDialog("Enter first name");
		final String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);

		if (firstName != null) {
			if (m.matches() == true) {
				System.out.println(firstName + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * As a User need to enter a valid Last Name - Last name starts with Cap and has
	 * minimum 3 characters
	 */
	public static boolean lastName() throws InvalidUserInputException {
		String lastName = JOptionPane.showInputDialog("Enter last name");
		final String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		if (lastName != null) {
			if (m.matches() == true) {
				System.out.println(lastName + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3
	 * mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and .
	 * positions
	 */
	public static boolean emailId(String emailId) throws InvalidUserInputException {
//		String emailId = JOptionPane.showInputDialog("Enter email id");
		final String regex = "[A-Za-z0-9.+-]*[a-zA-Z0-9]+[@][a-z0-9]+[.][a-z]+[.]?[a-z]+";
//		String regex = "^(?=.[A-Za-z0-9.+-])+@([a-z]{1,}.[a-z]{2,})"; // doutu
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		if (emailId != null) {
			if (m.matches() == true) {
				System.out.println(emailId + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * As a User need to follow pre -defined Mobile Format - E.g. 91 9919819801 -
	 * Country code follow by space and 10 digit number
	 */
	public static boolean phonenumber() throws InvalidUserInputException {
		String phonenumber = JOptionPane.showInputDialog("Enter phone number");
		final String regex = "(91\s)[5-9][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phonenumber);
		if (phonenumber != null) {
			if (m.matches() == true) {
				System.out.println(phonenumber + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * As a User need to follow pre-definedPassword rules. Rule1– minimum 8
	 * Characters - NOTE – All rules must be passed
	 */
	public static boolean passwordRule1() throws InvalidUserInputException {
		String passwordRule1 = JOptionPane.showInputDialog("Enter password only (Rule-1 character) ");
		final String regex = "^.*[a-zA-Z]{8,}.*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passwordRule1);
		if (passwordRule1 != null) {
			if (m.matches() == true) {
				System.out.println(passwordRule1 + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
	 */
	public static boolean passwordRule2() throws InvalidUserInputException {
		String passwordRule2 = JOptionPane.showInputDialog("Enter password (Rule-2 atleast one Uppercase character) ");
		final String regex = "^(?=.*[a-z])(?=.*[A-Z]){8,}.*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passwordRule2);
		if (passwordRule2 != null) {
			if (m.matches() == true) {
				System.out.println(passwordRule2 + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * Rule3– Should have at least 1 numeric number in the password - NOTE – All
	 * rules must be passed
	 */
	public static boolean passwordRule3() throws InvalidUserInputException {
		String passwordRule3 = JOptionPane
				.showInputDialog("Enter password (Rule-3) at least 1 numeric with character ");
		final String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passwordRule3);
		if (passwordRule3 != null) {
			if (m.matches() == true) {
				System.out.println(passwordRule3 + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * Rule3– Should have at least 1 numeric number in the password - NOTE – All
	 * rules must be passed
	 */
	public static boolean passwordRule4() throws InvalidUserInputException {
		String passwordRule4 = JOptionPane.showInputDialog("Enter password (Rule-3) at least 1 Special Character ");
		final String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+(){}_!@#$%^&*., ?]){8,}.*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passwordRule4);
		if (passwordRule4 != null) {
			if (m.matches() == true) {
				System.out.println(passwordRule4 + "--->" + m.matches());
				return m.matches();
			}
		}
		throw new InvalidUserInputException();
	}

	/*
	 * Should clear all email samples provided separately
	 */
	static ArrayList<String> arr = new ArrayList<>();

	public static String emailIdSting() {
		String emailId = JOptionPane.showInputDialog("Enter email id");
		final String regex = "[A-Za-z0-9.+-]*[a-zA-Z0-9]+[@][a-z0-9]+[.][a-z]+[.]?[a-z]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		System.out.println(emailId + "--->" + m.matches());
		return emailId;
	}

	public static void emailTesting() {
		Integer num = Integer.parseInt(JOptionPane.showInputDialog("Enter number of mail id you want to add ?"));
		for (int i = 0; i < num; i++) {
			arr.add(emailIdSting());
		}
	}
	/*|----------------------------------------------------|
	 *|		(Valid) 			|		(Invalid)		   |	
	 *|-------------------------|--------------------------|
	 *| 	abc@yahoo.com 		|		abc123@.com		   |
	 *|  	abc-100@yahoo.com 	|		abc.@gmail.com	   |	
	 *| 	abc.100@yahoo.com 	|		abc@gmail.com.1a   |  	
	 *| 	abc111@abc.com		|    	abc@abc@gmail.com  |
	 *| 	abc+100@gmail.com  	|		abc@gmail.com.1a   |
	 *|----------------------------------------------------|
	 */
//	public static void main(String[] args) {
//		
////		firstName(); //UC1
////		lastName();  //UC2
////		emailId(); //UC3
////		phonenumber(); // UC4
////		passwordRule1(); // UC5
////		passwordRule2(); // UC6
////		passwordRule3(); // UC7
////		passwordRule4(); // UC8
//		emailTesting(); // UC9
//		System.out.print(arr);
//
//	}
}
