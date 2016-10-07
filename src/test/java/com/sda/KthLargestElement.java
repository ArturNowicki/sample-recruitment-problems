package com.sda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Uzupelnij metode {@code Solutions#kth(int[], int) w taki sposob, by
 * zwracala ona k-ty najwiekszy element z przekazanej tablicy.
 *
 */
public class KthLargestElement {

	@Test
    public void test() {
        int[] one = new int[] { 0, 1, 2 };
        int[] two = new int[] { 1, 10, 20, 50 };
        int[] three = new int[] { 1, 100, 20, 50, 4 };
		for(int i : three) {
			System.out.println(i);
		}
        
        assertEquals(2, Solutions.kth(one, 1));
        assertEquals(0, Solutions.kth(one, 3));
        assertEquals(20, Solutions.kth(two, 2));
        assertEquals(10, Solutions.kth(two, 3));
        assertEquals(50, Solutions.kth(two, 1));
        assertEquals(50, Solutions.kth(three, 2));
        assertEquals(100, Solutions.kth(three, 1));
    }

}
