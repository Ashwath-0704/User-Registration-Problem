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

	public static void main(String[] args) {
		
//		firstName(); //UC1
//		lastName();  //UC2
		emailId(); //UC3
	}
}
