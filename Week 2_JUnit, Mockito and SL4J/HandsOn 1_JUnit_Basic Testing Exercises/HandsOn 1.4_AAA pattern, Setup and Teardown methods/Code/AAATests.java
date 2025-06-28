package com.sample.tests;

import com.sample.utils.ArithmeticUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AAATests {
	
	private ArithmeticUtilities ob;
	@BeforeEach
	void setup() {
		ob=new ArithmeticUtilities();
	}
	@AfterEach
	void teardown() {
		ob=null;
	}
	@Test
	void testAddition() {
		//Arrange
		int num1=5;
		int num2=3;
		int expected=8;
		
		//Act
		int actual=ob.add(num1,num2);
		
		//Assert
		assertEquals(expected,actual);
	}
	@Test
	void testSubtraction() {
		//Arrange
		int num1=5;
		int num2=3;
		int expected=2;
		
		//Act
		int actual=ob.subtract(num1, num2);
		
		//Assert
		assertEquals(expected,actual);
	}
}
