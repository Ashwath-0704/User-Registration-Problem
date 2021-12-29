package com.javapractices;

import org.junit.Assert;
import org.junit.Test;
import Regax.email;

/**
 * Unit test for simple App.
 */
public class emailTest{
    /**
     * Email Test :-)
     */
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
    public void passwordRule1Test(){
		boolean passwordRule1Result = email.passwordRule1();
    	Assert.assertEquals(true,passwordRule1Result);
    }
	@Test
    public void passwordRule2Test(){
		boolean passwordRule2Result =email.passwordRule2();
    	Assert.assertEquals(true,passwordRule2Result);
    }
	@Test
    public void passwordRule3Test(){
		boolean passwordRule3Result = email.passwordRule3();
    	Assert.assertEquals(true,passwordRule3Result);
    }
	@Test
    public void passwordRule4Test(){
		boolean passwordRule4Result=email.passwordRule4();
    	Assert.assertEquals(true, passwordRule4Result);
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
    @Test
    public void emailJUnitTesting(){
    	boolean emailJUnitTesting=email.emailId();
    	Assert.assertEquals(true, emailJUnitTesting);
    }
    
}
