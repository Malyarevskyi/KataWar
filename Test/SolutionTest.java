import org.junit.Test;
import sample.Solution;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test public void testListInts() {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final int last = Solution.last(list);
        assertEquals(5, last);
    }
    @Test public void testListString() {
        final List<String> list = Arrays.asList("katas", "are", "cool");
        final String last = Solution.last(list);
        assertEquals("cool", last);
    }
    @Test public void testListSingle() {
        final List<Character> list = Collections.singletonList('x');
        final char last = Solution.last(list);
        assertEquals('x', last);
    }
    @Test public void testString() {
        final String string = "xyz";
        final char last = Solution.last(string);
        assertEquals('z', last);
    }
    @Test public void testStringSingle() {
        final String string = "x";
        final char last = Solution.last(string);
        assertEquals('x', last);
    }
    @Test public void testArgs() {
        final int last = Solution.last(1, 2 ,3 ,4 ,5);
        assertEquals(5, last);
    }
    @Test public void testArray() {
        final Integer[] array = {1, 2 ,3 ,4 ,5};
        final int last = Solution.last(array);
        assertEquals(5, last);
    }
    @Test public void testArgsSingle() {
        final Integer[] list = {1};
        final int last = Solution.last(list);
        assertEquals(1, last);
    }

    private final char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQERSTUVWXYZ0123456789!@#$%^&*()-=_+[]{}|;:,.<>/?`~".toCharArray();
    @Test public void testRandomString() {
        final Random rand = new Random();
        for (int testIteration = 0; testIteration < 10; ++testIteration) {
            final StringBuilder text = new StringBuilder(rand.nextInt(32) + 1);
            for (int i = 0; i < text.capacity(); ++i) {
                final int chi = rand.nextInt(characters.length);
                text.append(characters[chi]);
            }
            final String string = text.toString();
            final char expected = string.charAt(string.length() - 1);
            assertEquals(expected, Solution.last(string));
        }
    }
    @Test public void testRandomList() {
        final Random rand = new Random();
        for (int testIteration = 0; testIteration < 10; ++testIteration) {
            final int length = rand.nextInt(32) + 1;
            final List<Integer> list = new ArrayList<>();
            for (int i = 0; i < length; ++i) {
                final int chi = rand.nextInt(characters.length);
                list.add(chi);
            }
            final Integer expected = list.get(list.size() - 1);
            assertEquals(expected, Solution.last(list));
        }
    }
}
