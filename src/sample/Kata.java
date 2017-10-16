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
       return Arrays.stream(array).map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)): (i*i)).toArray();
    }

    public static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {   int [] result = new int[2];
        boolean empty = true;
        for (int i=0; i<input.length; i++) {
            if (null != input[i]) {
                empty = false;
                break;
            }}


        if (input == null)
        { result = new int[0];
            return result;
        }
        for (int i = 0; i < input.length; i++)
        {if (input[i]>0){

            result[0]+=1;}
        else result[1]+=input[i];
        }
        return result;
    }
}
