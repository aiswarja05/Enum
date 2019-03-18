package enumProgram;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		
		 String check = month.search("Agh"); 
		 assertNull(check);
		 
		check = month.search("Apr"); 
		assertNotNull(check);
		 

		assertTrue(check.equals("April"));
		
		assertEquals("July",month.search("Jul"));  
		
		check = month.search("Jau"); 
		assertFalse(check.equals("January"));
		
		int count=month.count(30);
		assertEquals(4,count);  
		
		assertEquals(0,month.S_count("Ju"));
		assertEquals(4,month.S_count("November"));
		
		assertEquals("Sep",month.find("September"));  
		
	}

}
