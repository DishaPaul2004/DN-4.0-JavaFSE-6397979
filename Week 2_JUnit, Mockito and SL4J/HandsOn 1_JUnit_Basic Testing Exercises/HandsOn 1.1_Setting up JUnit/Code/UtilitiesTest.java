package com.example.test;

import static org.junit.jupiter.api.Assertions.*;
import com.example.utils.Utilities;
import org.junit.jupiter.api.Test;

class UtilitiesTest {

	@Test
	void testIsPrime1() {
		assertTrue(Utilities.isPrime(61));
	}
	
	@Test
	void testIsPrime2() {
		assertFalse(Utilities.isPrime(64));
	}

	@Test
	void testIsEven1() {
		assertTrue(Utilities.isEven(76));
	}
	
	@Test
	void testIsEven2() {
		assertFalse(Utilities.isEven(77));
	}

}
