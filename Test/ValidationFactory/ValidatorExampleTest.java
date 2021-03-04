package ValidationFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorExampleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void integerTest() {
        boolean actual = ValidatorExample.validateExample(1);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void stringUpperCaseTest() {
        boolean actual = ValidatorExample.validateExample("Text");
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test (expected = ValidationFactoryException.class)
    public void stringLowerCaseTest() throws ValidationFactoryException {
       ValidatorExample.validateExample("text");
    }
    @Test (expected = ValidationFactoryException.class)
    public void emptyStringTest() throws ValidationFactoryException {
        ValidatorExample.validateExample("");
    }

    @Test (expected = ValidationFactoryException.class)
    public void charTest() throws ValidationFactoryException {
        ValidatorExample.validateExample('a');
    }
    @Test
    public void integerFrom1To10Test() throws ValidationFactoryException{
        ValidatorExample.validateExample(1);
        ValidatorExample.validateExample(5);
        ValidatorExample.validateExample(10);
    }
    @Test (expected = ValidationFactoryException.class)
    public void integersBelow1Test() throws ValidationFactoryException {
        ValidatorExample.validateExample(0);
        ValidatorExample.validateExample(-1);
    }
    @Test (expected = ValidationFactoryException.class)
    public void integersAbove10Test() throws ValidationFactoryException {
        ValidatorExample.validateExample(11);
        ValidatorExample.validateExample(100);
    }
    @Test (expected = ValidationFactoryException.class)
    public void doubleTypeTest() throws ValidationFactoryException {
        ValidatorExample.validateExample(11.11);
        ValidatorExample.validateExample(4.5);
    }
}