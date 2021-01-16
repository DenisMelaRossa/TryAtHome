package StringExercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static StringExercises.StringByAlphabeticOrder3.convertTextToSortedArray;
import static StringExercises.StringByAlphabeticOrder3.countWords;
import static StringExercises.StringByAlphabeticOrder3.groupWordsByAlphabet;
import static StringExercises.StringByAlphabeticOrder3.listWordsByLetter;
import static org.junit.Assert.*;

public class StringByAlphabeticOrder3Test {
    String[] arrayDoubleWords = {"a", "has", "a"};
    String stringDoubleWords = " a has a";
    String[] arraySingleWords = {"sort", "the", "entry"};
    String stringSingleWords = "sort the entry";
    public static final char CHARA = 'a';
    public static final char CHARS = 's';
    public static final char CHARNOTIN = 'g';

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void groupWordsByAlphabetDoubleWordsTest() {
        String actual = groupWordsByAlphabet(stringDoubleWords).trim();
        String expected = "A:\ta 2\nH:\thas 1";
        assertEquals(actual, expected);
    }

    @Test
    public void groupWordsByAlphabetSingleWordsTest() {
        String actual = groupWordsByAlphabet(stringSingleWords).trim();
        String expected = "E:\tentry 1\nS:\tsort 1\nT:\tthe 1";
        assertEquals(actual, expected);
    }

    @Test
    public void countWordsDoubleWordsTest() {
        int[] actual = countWords(arrayDoubleWords);
        int[] expected = {2, 1, 2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void countWordsSingleWordsTest() {
        int[] actual = countWords(arraySingleWords);
        int[] expected = {1, 1, 1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void convertTextToSortedArrayDoubleWordsTest() {
        String[] actual = convertTextToSortedArray(stringDoubleWords);
        String[] expected = {"a", "a", "has"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void convertTextToSortedArraySingleWordsTest() {
        String[] actual = convertTextToSortedArray(stringSingleWords);
        String[] expected = {"entry", "sort", "the"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void listWordsByLetterDoubleWordsTest() {
        String actual = listWordsByLetter(arrayDoubleWords, CHARA);
        String expected = "\ta 2\n\ta 2";
        assertEquals(actual, expected);
    }

    @Test
    public void listWordsByLetterSingleWordsTest() {
        String actual = listWordsByLetter(arraySingleWords, CHARS);
        String expected = "\tsort 1";
        assertEquals(actual, expected);
    }
    @Test
    public void listWordsByLetterCharNotInTest() {
        String actual = listWordsByLetter(arrayDoubleWords, CHARNOTIN);
        String expected = "";
        assertEquals(actual, expected);
    }
}