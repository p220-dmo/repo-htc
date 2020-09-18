package fr.htc.library.services.impl;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CheckoutServiceTest {

	@Test
	public final void testCheckout() {
		
		
		//fail("Not yet implemented"); // TODO
	}
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	 
	@Test
	public void whenExceptionThrown_thenRuleIsApplied() {
	    exceptionRule.expect(NumberFormatException.class);
	    exceptionRule.expectMessage("For input string");
	    Integer.parseInt("1a");
	}

}
