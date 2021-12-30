package com.javapractices;

public class moodanalyser {
	public static String analysemood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
