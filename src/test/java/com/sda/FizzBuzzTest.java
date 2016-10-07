package com.sda;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Uzupelnij metode {@code Solutions#fizzBuzz(int)}, która zwraca Stringowe reprezentacje liczb od 1 do 100. Ale
 * dla wielokrotności trojki zwroc "Fizz" zamiast liczby oraz dla wielokrotności
 * piatki zwroc "Buzz". Dla liczb bedacych wielokrotnoscami trojki oraz piatki
 * zwroc "FizzBuzz".
 */
public class FizzBuzzTest {

    @Test
    public void test() {
        int a = 0;
        int b = 1;
        int c = 3;
        int d = 5;
        int e = 15;
        int f = 60;
        int g = 12;
        int h = 11;

        assertEquals("FizzBuzz", Solutions.fizzBuzz(a));
        assertEquals("1", Solutions.fizzBuzz(b));
        assertEquals("Fizz", Solutions.fizzBuzz(c));
        assertEquals("Buzz", Solutions.fizzBuzz(d));
        assertEquals("FizzBuzz", Solutions.fizzBuzz(e));
        assertEquals("FizzBuzz", Solutions.fizzBuzz(f));
        assertEquals("Fizz", Solutions.fizzBuzz(g));
        assertEquals("11", Solutions.fizzBuzz(h));

        for (int i = 0; i < 100; i++) {
            System.out.println(Solutions.fizzBuzz(i));
        }
    }
}
