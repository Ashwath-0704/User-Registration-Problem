package com.javapractices;

import org.junit.Assert;
import org.junit.Test;
import Regax.email;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
/**
 * Email Test :-)
 */
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
public class emailTest{
    
	   private String inputEmailId;
	   private Boolean expectedResult;
	  	   
	   public emailTest(String inputEmailId, Boolean expectedResult) {
	      this.inputEmailId = inputEmailId;
	      this.expectedResult = expectedResult;
	   }
//
	   @Parameterized.Parameters
	   public static Collection emailIds() {
	      return Arrays.asList(new Object[][] {
	         { "abc@yahoo.com", true },
	         { "abc-100@yahoo.com", true},
	         {"abc+100@gmail.com", true},
	         { "abc.100@yahoo.com", true },
	         { "abc@gmail.com.1a", false },
	         { "abc@abc@gmail.com", false },
	         {"abc.@gmail.com",false},
	         {"abc@gmail.com.1a",false}
	      });
	   }
	   
	   @Test
	   public void testEmailId() {
	      assertEquals(expectedResult, email.emailId(inputEmailId));
	   }
	
	@Test
    public void firstNameTest(){
    	boolean firstResult=email.firstName();
    	Assert.assertEquals(true,firstResult);
    }
	@Test
    public void lastNameTest() {
		boolean lastresult =email.lastName();
    	Assert.assertEquals(true,lastresult);
    }
	@Test
    public void phoneNumberTest(){
		boolean phoneNumberresult = email.phonenumber();
    	Assert.assertEquals(true,phoneNumberresult);
    }
	@Test
    public void passwordRule4Test(){
		boolean passwordRule4Result=email.passwordRule4();
    	Assert.assertEquals(true, passwordRule4Result);
    }
    @Test
    public void sadJUnitTesting(){
    	String sadJUnitTesting=moodanalyser.analysemood("This is a Sad message");
    	Assert.assertEquals("SAD", sadJUnitTesting);
    }
    @Test
    public void happyJUnitTesting(){
    	String sadJUnitTesting=moodanalyser.analysemood("This is a Happy message");
    	Assert.assertEquals("HAPPY", sadJUnitTesting);
    }    
}
