package Regax;

import java.util.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class email {
	
	/*
	 * As a User need to enter a valid First Name -First name starts with Cap and
	 * has minimum 3 characters
	 */
	public static void firstName() {
		String firstName = JOptionPane.showInputDialog("Enter first name");
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		System.out.println(firstName + "--->" + m.matches());
	}

	/*
	 * As a User need to enter a valid Last Name - Last name starts with Cap and has
	 * minimum 3 characters
	 */
	public static void lastName() {
		String lastName = JOptionPane.showInputDialog("Enter last name");
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		System.out.println(lastName + "--->" + m.matches());
	}

	/*
	 * As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3
	 * mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and .
	 * positions
	 */
	public static String emailId() {
		String emailId = JOptionPane.showInputDialog("Enter email id");
		String regex = "[A-Za-z0-9.+-]*[a-zA-Z0-9]+[@][a-z0-9]+[.][a-z]+[.]?[a-z]+";
//		String regex = "^(?=.[A-Za-z0-9.+-])+@([a-z]{1,}.[a-z]{2,})"; // doutu
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		System.out.println(emailId + "--->" + m.matches());
		return emailId;
	}

	/*
	 * As a User need to follow pre -defined Mobile Format - E.g. 91 9919819801 -
	 * Country code follow by space and 10 digit number
	 */
	public static void phonenumber() {
		String phonenumber = JOptionPane.showInputDialog("Enter phone number");
		String regex = "(91/s)[5-9][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phonenumber);
		System.out.println(phonenumber + "--->" + m.matches());
	}

	/*
	 * As a User need to follow pre-definedPassword rules. Rule1– minimum 8
	 * Characters - NOTE – All rules must be passed
	 */
	public static void passwordRule1() {
		String passwordRule1 = JOptionPane.showInputDialog("Enter password only (Rule-1 character) ");
		String regex = "^.*[a-zA-Z]{8,}.*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passwordRule1);
		System.out.println(passwordRule1 + "--->" + m.matches());
	}

	/*
	 * Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
	 */
	public static void passwordRule2() {
		String passwordRule1 = JOptionPane.showInputDialog("Enter password (Rule-2 atleast one Uppercase character) ");
		String regex = "^(?=.*[a-z])(?=.*[A-Z]){8,}.*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passwordRule1);
		System.out.println(passwordRule1 + "--->" + m.matches());
	}
	public static void main(String[] args) {
		
//		firstName(); //UC1
//		lastName();  //UC2
//		emailId(); //UC3
//		phonenumber(); // UC4
//		passwordRule1(); // UC5
		passwordRule2(); // UC6
	}
}
