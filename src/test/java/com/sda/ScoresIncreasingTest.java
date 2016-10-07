package com.sda;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Uzupelnij metode {@code Solutions#isIncreasing(int[])} w taki sposob, by
 * zwracala informacje o tym, czy przekazana tablica zawiera tylko wartosci
 * rosnace (tj kazdy elelement musi byc wiekszy lub rowny poprzedniemu oraz
 * tablice nie moze skladac sie z takich samych elementow.).
 */
public class ScoresIncreasingTest {

    @Test
    public void test() {
        int[] one = new int[] { 1, 2, 3, 4 };
        int[] two = new int[] { 4, 3, 2, 1 };
        int[] three = new int[] { 2, 4, 10, 20 };
        int[] four = new int[] { 0, -2, 10, 20 };
        int[] five = new int[] { 1, 1, 1, 2, 3, 4 };
        int[] six = new int[] {10, 10, 10};

        assertEquals(true, Solutions.isIncreasing(one));
        assertEquals(false, Solutions.isIncreasing(two));
        assertEquals(true, Solutions.isIncreasing(three));
        assertEquals(false, Solutions.isIncreasing(four));
        assertEquals(true, Solutions.isIncreasing(five));
        assertEquals(true, Solutions.isIncreasing(six));
    }

}
