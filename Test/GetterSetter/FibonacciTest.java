package GetterSetter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static GetterSetter.Fibonacci.*;
import static org.junit.Assert.*;

public class FibonacciTest {

    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FIVE = 5;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fibonacciWhileTwoTest() {
        int[] actual = fibonacciWhile(TWO);
        int[] expected = {0,1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void fibonacciWhileThreeTest() {
        int[] actual = fibonacciWhile(THREE);
        int[] expected = {0,1,1};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void fibonacciWhileFiveTest() {
        int[] actual = fibonacciWhile(FIVE);
        int[] expected = {0,1,1,2,3};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void fibonacciDoWhileTwoTest() {
        int[] actual=fibonacciDoWhile(TWO);
        int[] expected={0,1};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void fibonacciDoWhileThreeTest() {
        int[] actual=fibonacciDoWhile(THREE);
        int[] expected={0,1,1};
        assertArrayEquals(actual,expected);
    }
    @Test
    public void fibonacciDoWhileFiveTest() {
        int[] actual=fibonacciDoWhile(FIVE);
        int[] expected={0,1,1,2,3};
        assertArrayEquals(actual,expected);
    }
    @Test
    public void fibonacciForTwoTest() {
        int[] actual=fibonacciFor(TWO);
        int[] expected={0,1};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void fibonacciForThreeTest() {
        int[] actual=fibonacciFor(THREE);
        int[] expected={0,1,1};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void fibonacciForFiveTest() {
        int[] actual=fibonacciFor(FIVE);
        int[] expected={0,1,1,2,3};
        assertArrayEquals(actual, expected);
    }
}