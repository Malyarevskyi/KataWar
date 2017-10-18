import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import sample.MonkeyCounter;

import java.util.Arrays;
import java.util.Random;

public class MonkeyCounterTest {

    private int[] monkeyCount(final int n){
        int[] result = new int[n];
        Arrays.parallelSetAll(result, i-> i+1);
        //  System.out.print("[");
        //      for (int i : result) {
        //         System.out.print(i+" ");
        //     }
        // System.out.println("]");
        return result;
    }

    @Test
    public void basicTests() {
        int[] array=new int[]{1,2,3,4,5};
        assertArrayEquals(array,MonkeyCounter.monkeyCount(5));
        array=new int[]{1,2,3};
        assertArrayEquals(array,MonkeyCounter.monkeyCount(3));
        array=new int[]{1,2,3,4,5,6,7,8,9};
        assertArrayEquals(array,MonkeyCounter.monkeyCount(9));
        array=new int[]{1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(array,MonkeyCounter.monkeyCount(10));
        array=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        assertArrayEquals(array,MonkeyCounter.monkeyCount(20));
    }

    @Test
    public void randomTests() {
        final Random rand = new Random();
        for(int i=0;i<10;i++){
            final int entero=1+rand.nextInt(100);
            assertArrayEquals(monkeyCount(entero),MonkeyCounter.monkeyCount(entero));
        }
    }
}
