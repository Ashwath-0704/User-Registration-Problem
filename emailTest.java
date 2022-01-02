package com.javapractices;

import org.junit.Assert;
import org.junit.Test;

import Regax.InvalidUserInputException;
import Regax.UserRegistration;
import Regax.UserRegistration;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

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
@RunWith(Parameterized.class)
public class emailTest {

	private String inputEmailId;
	private Boolean expectedResult;

	public emailTest(String inputEmailId, Boolean expectedResult) {
		this.inputEmailId = inputEmailId;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection emailIds() {
		return Arrays.asList(new Object[][] {

				{ "", true }, // null
				{ "abc-100@yahoo.com", true }, // true
				{ "abc+100@gmail.com", true }, 
				{ "abc.100@yahoo.com", true }, 
				{ "abc@gmail.com.1a", false }, // false
				{ "abc@abc@gmail.com", false },
				{ "abc.@gmail.com", false }, 
				{ "abc@gmail.com.1a", false }});
	}

	@Test
	public void testEmailId() {
		try {
			assertEquals(expectedResult, UserRegistration.emailId(inputEmailId));
		} catch (InvalidUserInputException e) {
			System.out.println("Invalid email id");
		}
	}

	@Test
	public void firstNameTest() {
		try {
			boolean firstResult = UserRegistration.firstName();
			Assert.assertEquals(true, firstResult);
		} catch (InvalidUserInputException e) {
			System.out.println("Invalid first name");
		}
	}

	@Test
	public void lastNameTest() {
		try {
			boolean lastresult = UserRegistration.lastName();
			Assert.assertEquals(true, lastresult);
		} catch (InvalidUserInputException e) {
			System.out.println("Invalid last name");
		}
	}

	@Test
	public void phoneNumberTest() {
		try {
			boolean phoneNumberresult = UserRegistration.phonenumber();
			Assert.assertEquals(true, phoneNumberresult);
		} catch (InvalidUserInputException e) {
			System.out.println("Invalid phone number");
		}
	}

	@Test
	public void passwordRule4Test() {
		try {
			boolean passwordRule4Result = UserRegistration.passwordRule4();
			Assert.assertEquals(true, passwordRule4Result);
		} catch (InvalidUserInputException e) {
			System.out.println("Invalid password");
		}
	}
}
