package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	public static String multiply(int x, int y) {
		int product = x*y;
		String ret = x+" x "+y+" = "+product;
		return ret;
	}
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	public static boolean isPrime(int x) {
		for(int i=2;i<x;i++) {
			for(int j=2;j<x;j++) {
				if(x==i*j)
					return false;
			}
		}
		return true;
	}
	@Test
	  public void PrimeTest() {
		
	    assertTrue(isPrime(3));
		assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	
	public static boolean isSquare(int x) {
		for(int i=0;i<=x;i++) {
			if(x==i*i)
				return true;
		}
		return false;
	}
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	public static boolean isCube(int x) {
		for(int i=0;i<=x;i++) {
			if(x==i*i*i)
				return true;
		}
		return false;
	}
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
