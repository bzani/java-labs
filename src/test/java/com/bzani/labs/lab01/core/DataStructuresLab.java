package com.bzani.labs.lab01.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DataStructuresLab {

	@Test
	public void test_arrays() {
		// given
		int[] arrA = new int[10]; // array declared with 10 positions
		int[] arrB = { 1, 2, 3 }; // array declared and initialized with 3 elements
		int[] arrC = { 3, 2, 1 }; // unsorted array

		// when
		Arrays.fill(arrA, 9); // fill array positions with 9
		arrA[5] = 5; // set array value by index=1

		Arrays.sort(arrC); // sort array

		// then
		assertEquals(10, arrA.length);
		assertEquals(86, sumArray(arrA));
		assertEquals(3, arrB.length);
		assertEquals(0, Arrays.compare(arrB, arrC));
		assertEquals(sumArray(arrB), sumArray(arrC));

		printArray(arrA);
		printArray(arrB);
		printArray(arrC);
	}

	@Test
	public void test_matrix() {
		// given
		int[][] mtxD = new int[3][2];
		int[][] mtxI = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// when
		mtxI[1][1] = 0;
		sumMatrix(mtxI);

		// then
		assertEquals(3, mtxD.length);
		assertEquals(2, mtxD[0].length);
		assertEquals(3, mtxI.length);
		assertEquals(3, mtxI[0].length);
		assertEquals(0, mtxI[1][1]);
		assertEquals(40, sumMatrix(mtxI));
		printMatrix(mtxD);
		printMatrix(mtxI);
	}

	// -- support functions

	private void printArray(int[] arr) {
		System.out.println(String.format("- Printing array of length %d:", arr.length));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n[end]\n");
	}

	private void printMatrix(int[][] mtx) {
		System.out.println(String.format("- Printing matrix of length %d x %d:", mtx.length, mtx[0].length));
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx[i].length; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("[end]\n");
	}

	private int sumArray(int[] arr) {
		return Arrays.stream(arr).sum();
	}

	private int sumMatrix(int[][] mtx) {
		int sum = 0;
		for (int i = 0; i < mtx.length; i++) {
			sum += Arrays.stream(mtx[i]).sum();
		}
		return sum;
	}

}
