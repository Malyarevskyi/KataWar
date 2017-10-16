package sample;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int count = 0;
        int[] array = new int[2];
        for (int i = 0; i < stops.size(); i++) {
            array = stops.get(i);
            count -= array[1];
            count += array[0];
        }
        return count;
    }

    public static int countPassengers2(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(a -> a[0] - a[1]).sum();
    }

    public static int countPassengers3(ArrayList<int[]> stops) {
        int res = 0;
        for(int[] onOff : stops) res += onOff[0] - onOff[1];
        return res;
    }

    public static int countPassengers4(ArrayList<int[]> stops) {
        int total = 0;
        for (int[] i : stops) {
            total += i[0];
            total -= i[1];
        }
        return total;
    }
}
