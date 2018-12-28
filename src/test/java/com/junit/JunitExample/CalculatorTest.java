package com.junit.JunitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest{
	
	
	Calculator cal=new Calculator();
	@Test
	public void calTest() {
		
		assertEquals(20,cal.add(10, 10));
		
	}

}
