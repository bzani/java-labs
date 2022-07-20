package com.bzani.labs.lab01.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringsLab {

	@Test
	public void test_stringOperations() {
		//given
		String initial = "Again, The  quick    brown fox jumps_over  __the_lazy puppy master ";
		String expected = "the quick brown fox jumps over the lazy dog!";
		
		//when
		String result = initial
				.substring(initial.indexOf(",") + 1, initial.lastIndexOf("master"))
				.toLowerCase()
				.replace("_", " ")
				.replace("puppy", "dog")
				.replaceAll(" +", " ")
				.trim() + "!";
		
		//then
		assertEquals(expected, result);
	}

}
