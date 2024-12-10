package com.incture.firstapplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator cal=new Calculator();
	@Test
	void testDoSum()
	{
		int expectedResult=20;
		int actualResult=cal.doSum(10, 20, 30);
		assertThat(actualResult).isEqualTo(expectedResult);
		//assertEquals(expectedResult, actualResult);
	}

	
}
