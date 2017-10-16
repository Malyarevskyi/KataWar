import org.junit.Test;
import sample.Kata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void exampleTests(){
        assertEquals("15-20", Kata.datingRange(17));
        assertEquals("27-66", Kata.datingRange(40));
        assertEquals("14-16", Kata.datingRange(15));
        assertEquals("24-56", Kata.datingRange(35));
        assertEquals("9-11", Kata.datingRange(10));
    }

    @Test
    public void basicTests() {
        int[] input = new int[] { 2, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 4, 9, 3, 49, 4, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[] { 100, 101, 5, 5, 1, 1 };
        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[] { 1, 2, 3, 4, 5, 6 };
        expected = new int[] { 1, 4, 9, 2, 25, 36 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));
    }

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Kata.removeExclamationMarks("Hello World!"));
    }

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}
