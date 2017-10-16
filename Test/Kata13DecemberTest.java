import org.junit.Test;
import sample.Kata13December;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Kata13DecemberTest {
    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult, Kata13December.filterOddNumber(listOfNumbers));
    }

    @Test
    public void secondTest()
    {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray()));
    }


    @Test
    public void randomTest()
    {
        Random rg = new Random();
        List<Integer> listOfNumbers = rg.ints(-1,1).limit(30).boxed().collect(Collectors.toList());
        String expectedResult = Arrays.toString(listOfNumbers.stream().filter(i -> i%2!=0).toArray());
        String theResult = Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray());
        assertEquals(String.format("for list: %s, the expected result is %s, but your code return %s",Arrays.toString(listOfNumbers.toArray()),expectedResult,theResult),expectedResult,theResult);

    }

}
