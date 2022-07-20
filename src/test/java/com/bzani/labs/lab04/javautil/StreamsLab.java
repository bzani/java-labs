package com.bzani.labs.lab04.javautil;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamsLab {

	@Test
	public void test_fibonacci() {
		// given
		String expected = "0 1 1 2 3 5 8 13 21 34";

		// when
		String result = Stream//
				.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] })//
				.map(p -> p[0]).limit(10)//
				.map(p -> p + " ")//
				.reduce("", String::concat)//
				.trim();

		// then
		assertEquals(expected, result);
	}

	@Test
	public void test_streamOperations() {
		// given
		int expected = 100;

		// when
		int result = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 6, 8).stream()//
				.distinct()// 1, 2, 3, 4, 5, 6, 8
				.filter(x -> x % 2 == 0)// 2, 4, 6, 8
				.map(x -> x * 10)// 20, 40, 60, 80
				.skip(1)// 40, 60, 80
				.limit(2)// 40, 60
				.peek(System.out::println)// print each
				.reduce(0, Integer::sum);// sum each element starting by 0

		// then
		assertEquals(expected, result);
	}

	@Test
	public void test_mapVsFlatMap() {
		// given
		List<String> expected = Arrays.asList("A", "B");
		
		// when
		List<String> mapResult = Stream.of("a", "b")//[a, b]
				.map(String::toUpperCase)//[A, B]
				.collect(Collectors.toList());

		List<String> flatMapResult = Arrays.asList(//
				Arrays.asList("A"), Arrays.asList("B"))//[[A], [B]]
				.stream()//
				.flatMap(Collection::stream)//[A, B]
				.collect(Collectors.toList());

		// then
		assertEquals(expected, mapResult);
		assertEquals(expected, flatMapResult);
	}

}
