package ar.com.ml;

import static org.junit.Assert.*;

import org.junit.Test;

public class HackerRankTestCase {

	@Test
	public void test2() {
        int[] lengths = new int[]{1, 2, 3, 4 ,3 ,3, 2, 1};
		int[] cutSticks = CutTheStick.cutSticks(lengths);
		assertEquals(8,cutSticks[0]);
		assertEquals(6,cutSticks[1]);
		assertEquals(4,cutSticks[2]);
		assertEquals(1,cutSticks[3]);
		
	}

	/**
	* Agregando un javadoc a este test... otra vez desde develop
	*/
	public void test1() {
        int[] lengths = new int[]{5, 4, 4, 2, 2, 8};
		int[] cutSticks = CutTheStick.cutSticks(lengths);
		assertEquals(6,cutSticks[0]);
		assertEquals(4,cutSticks[1]);
		assertEquals(2,cutSticks[2]);
		assertEquals(1,cutSticks[3]);
		
	}
	
}
