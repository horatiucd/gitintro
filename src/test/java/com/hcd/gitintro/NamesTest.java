package com.hcd.gitintro;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class NamesTest {

	@Test	
	public void get() {
		final Names names = new Names();		
		List<String> result = names.get();
		
		assertEquals(3, result.size());
	}
}
