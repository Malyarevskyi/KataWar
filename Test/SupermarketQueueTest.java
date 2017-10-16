import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import sample.SupermarketQueue;

public class SupermarketQueueTest {
    @Test
    public void testNormalCondition() {
        assertEquals(9, SupermarketQueue.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, SupermarketQueue.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(18, SupermarketQueue.solveSuperMarketQueue(new int[] { 3,4,4,5,5,1,3,3,3,7,7,1 }, 3));
    }

}