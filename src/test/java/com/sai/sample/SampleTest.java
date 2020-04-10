package com.sai.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SampleTest {

	@Test
	public void testConcatenate() {
		Sample myUnit = new Sample();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}
	@Test
	public void testConcatenaten() {
		Sample myUnit = new Sample();

		String result = myUnit.concatenate("1", "two");

		assertEquals("1two", result);

	}
}