package sample;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {

        int j = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % divider == 0)
                j++;
        }
        int res[] = new int[j];
        int z = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % divider == 0) {
                res[z] = numbers[i];
                z++;
            }
        }
        return res;
    }
}
