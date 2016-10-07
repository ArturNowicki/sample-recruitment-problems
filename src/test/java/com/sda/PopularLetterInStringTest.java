package com.sda;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Uzupelnij metode {@code Solutions#popularLetter(String)} w taki sposob, by
 * zwracala najczesciej wystepujaca LITERE w przekazanym Stringu.
 */
public class PopularLetterInStringTest {

    @Test
    public void test() {
        String one = "aab";
        String two = "       aab";
        String three = " qwertyfffgggghijkllllll";
        String four = "a a aab cccd";
        String five = "a bb ccc";
//        assertEquals("a", Solutions.popularLetter(one));
//        assertEquals("a", Solutions.popularLetter(two));
//        assertEquals("l", Solutions.popularLetter(three));
        assertEquals("a", Solutions.popularLetter(four));
        assertEquals("c", Solutions.popularLetter(five));
    }

}
