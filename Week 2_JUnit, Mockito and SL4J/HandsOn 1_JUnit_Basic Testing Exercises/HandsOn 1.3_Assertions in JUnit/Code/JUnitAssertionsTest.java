package com.example.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitAssertionsTest {

	@Test
	void Assertionstest() {
		//Assert Equals
		assertEquals(5,2+3);
		
		//Assert Not Equals
		assertNotEquals(5,2+2);
		
		//Assert True
		assertTrue(5>3);
		
		//Assert False
		assertFalse(5<3);
		
		//Assert null
		assertNull(null);
		
		//Assert not null
		assertNotNull(new Object());
	}

}
