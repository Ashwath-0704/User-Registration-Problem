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
	public static void main(String[] args) {
		
		firstName(); //UC1
	}
}
