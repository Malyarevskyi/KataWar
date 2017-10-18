package sample;

import java.util.stream.*;

public class MonkeyCounter {

    public static int[] monkeyCount(final int n) {
        int[] monkey = new int[n];
        for (int i = 1; i >= n; i++)
            monkey[i - 1] = i;

        return monkey;
    }


    public static int[] monkeyCount2(final int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }

}
