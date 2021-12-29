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
