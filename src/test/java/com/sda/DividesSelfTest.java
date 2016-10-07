package com.sda;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Uzupelnij metode {@code Solutions#dividesSelf(int)}, tak by: Liczba, ktora
 * sama sie dzieli nazywamia taka, ktora jest podzielna przez wszystkie swoje
 * cyfry. Metoda {@code Solutions#dividesSelf(int)} powinna sprawdzac, czy
 * wprowadzony int jest liczba, ktora sama siebie dzieli.
 */
public class DividesSelfTest {

	@Test
	public void test() {
		int a = 128;
		int b = 12;
		int c = 120;
		int d = 0;
		int e = 222;
		int f = 315;
		int g = 213;
		int h = 332;

		assertEquals(true, Solutions.dividesSelf(a));
		assertEquals(true, Solutions.dividesSelf(b));
		assertEquals(false, Solutions.dividesSelf(c));
		assertEquals(false, Solutions.dividesSelf(d));
		assertEquals(true, Solutions.dividesSelf(e));
		assertEquals(true, Solutions.dividesSelf(f));
		assertEquals(false, Solutions.dividesSelf(g));
		assertEquals(false, Solutions.dividesSelf(h));
	}

}
