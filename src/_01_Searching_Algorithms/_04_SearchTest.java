package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] x = {"a","b","c","d"};
		assertEquals(2, _00_LinearSearch.linearSearch(x, "c"));
		
		String[] x2 = {"a","b","c","d"};
		assertEquals(3, _00_LinearSearch.linearSearch(x2, "d"));
		
		String[] x3 = {"l","x","p","f"};
		assertEquals(2, _00_LinearSearch.linearSearch(x3, "p"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] a = {1,2,3,4,5,6};
		assertEquals(3, _01_BinarySearch.binarySearch(a, 0, a.length-1, 2));
		
		int[] a2 = {-1,1,2,3,4,5,6};
		
		assertEquals(2, _01_BinarySearch.binarySearch(a2, 0, a.length-1, 2));
		
		int[] a3 = {4,5,6,7,8,9,10};
		
		assertEquals(3, _01_BinarySearch.binarySearch(a3, 0, a.length-1, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] a = {1,2,3,4,5,6};
		
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(a, 1));
		
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(a, 3));

		assertEquals(4, _02_InterpolationSearch.interpolationSearch(a, 4));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted

		int[] a = {1,2,3,4,5,6};
		
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(a, 1));
		
		int[] a1 = {-1,2,3,4,5,6};
		
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(a1, -1));
		
		int[] a2 = {1,2,3,4,5,300};
		
		assertEquals(5, _03_ExponentialSearch.exponentialSearch(a2, 300));
	}
}
