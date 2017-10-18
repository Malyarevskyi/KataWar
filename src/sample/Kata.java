package sample;

import java.util.Arrays;

public class Kata {
    public static String datingRange(int age) {

        double min;
        double max;
        if (age <= 14) {
            min = (double) age - 0.10 * (double) age;
            max = age + 0.10 * age;
        } else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }
        String str = (int) min + "-" + (int) max;
        return str;
    }

    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array).map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i)).toArray();
    }

    public static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int sum = 0, count = 0;
        for (int i : input) {
            if (i > 0) count++;
            else sum += i;
        }
        return new int[]{count, sum};
    }

    public static long stairsIn20(int[][] stairs) {
        return 20 * Arrays.stream(stairs).flatMapToInt(arr -> Arrays.stream(arr)).sum();
    }

//    public static long stairsIn20(int[][] stairs){
//
//        int total = 0;
//        for(int i = 0; i < stairs.length; i++){
//            for(int j = 0; j < stairs[1].length; j++){
//                total = total + stairs[i][j];
//            }
//        }
//        total = total * 20;
//        return total;
//    }

    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }


    public static String position(char alphabet) {
        String text = "Position of alphabet: ";
        String base = "0abcdefghijklmnopqrstuvwxyz";
        for (char symbolChar : base.toCharArray()) {
            if (symbolChar == alphabet)
                return text + Integer.toString(base.indexOf(symbolChar));
        }

        return text + Integer.toString(0);
    }

    //    public static String position(char alphabet)
//    {
//        return "Position of alphabet: " + ((int) alphabet - 96);
//    }

    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle")
                return "found the needle at position " + i;// Your code here
        }
        return "the needle not found";
    }

//    public static String findNeedle(Object[] haystack) {
//        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
//    }

    public static int rentalCarCost(int d) {
        return (d < 4) ? d * 40 - 20 : (d > 6) ? d * 40 - 50 : d * 40;// Your solution here
    }

    public static String stringy(int size) {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += ((i % 2) == 0) ? "1" : "0";
        }
        return str;
    }

}
