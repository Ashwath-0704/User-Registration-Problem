package Regax;

import java.util.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

@FunctionalInterface
interface UserValidaterLamda {
	boolean validate(String p) throws InvalidUserInputException;
}

public class UserRegistration {
	/*
	 * As a User need to enter a valid First Name -First name starts with Cap and
	 * has minimum 3 characters
	 */
	public static boolean firstName() throws InvalidUserInputException {
		String firstName = JOptionPane.showInputDialog("Enter first name");
		final String regex = "^[A-Z]{1}[a-z]{2,}$";
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(firstName) && (firstName != null) == true) {
			return validateInput.validate(firstName);
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
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(lastName) && (lastName != null) == true) {
			return validateInput.validate(lastName);
		}
		throw new InvalidUserInputException();
	}

	/*
	 * As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3
	 * mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and .
	 * positions
	 */
	public static boolean emailId(String emailId) throws InvalidUserInputException {
		final String regex = "[A-Za-z0-9.+-]*[a-zA-Z0-9]+[@][a-z0-9]+[.][a-z]+[.]?[a-z]+";
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(emailId) && (emailId != null) == true) {
			return validateInput.validate(emailId);
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
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(phonenumber) && (phonenumber != null) == true) {
			return validateInput.validate(phonenumber);
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
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(passwordRule1) && (passwordRule1 != null) == true) {
			return validateInput.validate(passwordRule1);
		}
		throw new InvalidUserInputException();
	}

	/*
	 * Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
	 */
	public static boolean passwordRule2() throws InvalidUserInputException {
		String passwordRule2 = JOptionPane.showInputDialog("Enter password (Rule-2 atleast one Uppercase character) ");
		final String regex = "^(?=.*[a-z])(?=.*[A-Z]){8,}.*$";
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(passwordRule2) && (passwordRule2 != null) == true) {
			return validateInput.validate(passwordRule2);
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
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(passwordRule3) && (passwordRule3 != null) == true) {
			return validateInput.validate(passwordRule3);
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
		UserValidaterLamda validateInput = (userInput) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(userInput);
			return m.matches();
		};
		if (validateInput.validate(passwordRule4) && (passwordRule4 != null) == true) {
			return validateInput.validate(passwordRule4);
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
}
