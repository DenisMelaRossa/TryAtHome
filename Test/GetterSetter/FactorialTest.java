package GetterSetter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static GetterSetter.Factorial.*;
import static org.junit.Assert.*;

public class FactorialTest {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int FIVE = 5;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorialWhileZEROTest() {
        int[] actual = factorialWhile(ZERO);
        int[] expected = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialWhileOneTest() {
        int[] actual = factorialWhile(ONE);
        int[] expected = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialWhileTwoTest() {
        int[] actual = factorialWhile(TWO);
        int[] expected = {2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialWhileFiveTest() {
        int[] actual = factorialWhile(FIVE);
        int[] expected = {120};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialDoWhileZeroTest() {
        int[] actual = factorialDoWhile(ZERO);
        int[] expected = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialDoWhileOneTest() {
        int[] actual = factorialDoWhile(ONE);
        int[] expected = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialDoWhileTwoTest() {
        int[] actual = factorialDoWhile(TWO);
        int[] expected = {2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialDoWhileFiveTest() {
        int[] actual = factorialDoWhile(FIVE);
        int[] expected = {120};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialForZeroTest() {
        int[] actual = factorialFor(ZERO);
        int[] expected = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialForOneTest() {
        int[] actual = factorialFor(ONE);
        int[] expected = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialForTwoTest() {
        int[] actual = factorialFor(TWO);
        int[] expected = {2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void factorialForFiveTest() {
        int[] actual = factorialFor(FIVE);
        int[] expected = {120};
        assertArrayEquals(actual, expected);
    }

}
