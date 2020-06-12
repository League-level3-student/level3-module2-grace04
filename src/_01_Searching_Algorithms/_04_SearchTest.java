package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] arr = {"zero", "one", "two", "three", "five"};
		assertEquals(3, _00_LinearSearch.linearSearch(arr, "three"));
		assertEquals(4, _00_LinearSearch.linearSearch(arr, "five"));
		assertEquals(-1, _00_LinearSearch.linearSearch(arr, "four"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr = {0, 1, 2, 3, 5};
		assertEquals(3, _01_BinarySearch.binarySearch(arr, 0, 5, 3));
		assertEquals(4, _01_BinarySearch.binarySearch(arr, 0, 5, 5));
		assertEquals(-1, _01_BinarySearch.binarySearch(arr, 0, 5, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arr = {10, 20, 30, 40, 50};
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(arr, 40));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(arr, 50));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(arr, 25));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arr = {0, 1, 2, 3, 5};
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(arr, 3));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(arr, 5));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(arr, 4));
	}
}
