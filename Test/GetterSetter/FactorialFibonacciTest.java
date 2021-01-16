package GetterSetter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static GetterSetter.FactorialFibonacci.FactorialFibonacci;
import static org.junit.Assert.*;

public class FactorialFibonacciTest {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 2;
    public static final int FIVE = 5;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void FF225Test() {
        int[] actual=FactorialFibonacci(TWO,TWO,FIVE);
        int[] expected={120};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void FF115Test() {
        int[] actual=FactorialFibonacci(ONE,ONE,FIVE);
        int[] expected={0,1,1,2,3};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void algorithmFF225Test() {
        int[] actual=FactorialFibonacci(TWO,TWO,FIVE);
        int[] expected={120};
        assertArrayEquals(actual,expected);
    }
    @Test
    public void algorithmFF115Test() {
        int[] actual=FactorialFibonacci(ONE,ONE,FIVE);
        int[] expected={0,1,1,2,3};
        assertArrayEquals(actual,expected);
    }
}