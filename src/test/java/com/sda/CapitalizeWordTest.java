package com.sda;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Uzupelnij metode {@code Solutions#capitalizeWord(String)} w takim sposob by:
 * Przyjmujac String jako argument. Skaptializuj (zmien pierwsza litere na duza)
 * w kazdym jego slowie.
 */
public class CapitalizeWordTest {

    @Test
    public void test() {
        String empty = "";
        String hello = "hello";
        String twoWords = "my name";
        String sentece = "Hello, my name is a Borat.";

        assertEquals(empty, Solutions.capitalizeWord(empty));
        assertEquals("Hello", Solutions.capitalizeWord(hello));
        assertEquals("My Name", Solutions.capitalizeWord(twoWords));
        assertEquals("Hello, My Name Is A Borat.",
                        Solutions.capitalizeWord(sentece));
    }

}
