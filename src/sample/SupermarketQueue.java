package sample;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] a = new int[n];
        for (int i = 0; i < customers.length; i++) {
            a[0] += customers[i];
            Arrays.sort(a);
        }
        return a[n - 1];
    }
}
