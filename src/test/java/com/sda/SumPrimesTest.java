package com.sda;

import org.junit.Assert;
import org.junit.Test;

/**
 * Uzupelnij metode {@code Solutions#sumOfPrimes(int)} w taki sposob, by
 * zwracala sume wszystkich liczb pierwszych mniejszych od tej przekazanej jako
 * argument.
 */
public class SumPrimesTest {

    @Test
    public void test() {
        Assert.assertEquals(0, Solutions.sumOfPrimes(0));
        Assert.assertEquals(0, Solutions.sumOfPrimes(1));
        Assert.assertEquals(2, Solutions.sumOfPrimes(2));
        Assert.assertEquals(17, Solutions.sumOfPrimes(10));
        Assert.assertEquals(76127, Solutions.sumOfPrimes(1000));

    }

}
