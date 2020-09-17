package fr.htc.library.dao;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.htc.library.dao.impls.BookDaoMapImp;
import fr.htc.library.data.Book;
import fr.htc.library.utils.exceptions.CoteMandatoryException;

public class BookDaoMapImpTest {
	
	private BookDao bookDaoMap = new BookDaoMapImp();
	@Test
	public final void testFindBookByCote() {
		
		final String expectedExcpetionMessage = "Null or Empty is not a valid cote";
				
		Assert.assertTrue("The data base should be empty", Storage.getBookDB().isEmpty());
		Book expected = new Book("Nedjma", "Kateb Yacine", 1985);
		bookDaoMap.save(expected);
		
		
		
		try {
			final String cote = "KA85-10";
			Book actual =  bookDaoMap.findBookByCote(cote);
			Assert.assertEquals(expected, actual);
			Assert.assertNotNull("Actual book should not be null", actual);
			Assert.assertEquals(actual.getCote(), cote);
			
		} catch (CoteMandatoryException e1) {
			e1.printStackTrace();
		}
		
		try {
			final String cote = null;
			System.out.println("_____1_______");
			Book actual =  bookDaoMap.findBookByCote(cote);
			System.out.println("_____2_______");
			Assert.assertNotNull(cote);
//			Assert.assertNotNull("Actual book should not be null", actual);
//			Assert.assertEquals(actual.getCote(), cote);
			
		} catch (CoteMandatoryException cme) {
			System.out.println("______3______");
			Assert.assertNotNull("CoteMandatoryException should not be null", cme);
			Assert.assertEquals(expectedExcpetionMessage, cme.getMessage());
		}
		
		try {
			final String cote = "";
			System.out.println("_____11_______");
			Book actual =  bookDaoMap.findBookByCote(cote);
			System.out.println("_____21_______");
			Assert.assertNotNull(cote);
//			Assert.assertNotNull("Actual book should not be null", actual);
//			Assert.assertEquals(actual.getCote(), cote);
			
		} catch (CoteMandatoryException cme) {
			System.out.println("______31______");
			Assert.assertNotNull("CoteMandatoryException should not be null", cme);
			Assert.assertEquals(expectedExcpetionMessage, cme.getMessage());
		}
		
		
		
		//bookDaoMap.save(new Book("L'Alchimiste", "Paolo Cohlo", 1994));
		
		
		
	
	}

	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	 
	@Test
	public void whenExceptionThrown_thenRuleIsApplied() {
	    exceptionRule.expect(NumberFormatException.class);
	    exceptionRule.expectMessage("For input st ring");
	    
	    Integer.parseInt("1a");
	}
}
