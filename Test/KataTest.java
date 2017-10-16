import org.junit.Test;
import sample.Kata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void exampleTests(){
        assertEquals("15-20", Kata.datingRange(17));
        assertEquals("27-66", Kata.datingRange(40));
        assertEquals("14-16", Kata.datingRange(15));
        assertEquals("24-56", Kata.datingRange(35));
        assertEquals("9-11", Kata.datingRange(10));
    }

    @Test
    public void basicTests() {
        int[] input = new int[] { 2, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 4, 9, 3, 49, 4, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[] { 100, 101, 5, 5, 1, 1 };
        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[] { 1, 2, 3, 4, 5, 6 };
        expected = new int[] { 1, 4, 9, 2, 25, 36 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));
    }

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Kata.removeExclamationMarks("Hello World!"));
    }

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }


    @Test
    public void countPositivesSumNegatives_InputNull() {
        int[] expectedResult = new int[] { };
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(null));
    }

    @Test
    public void countPositivesSumNegatives_InputEmpty() {
        int[] expectedResult = new int[] { };
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {}));
    }

    @Test
    public void countPositivesSumNegatives_RandomTests() {
        for(int i = 0; i < 20; i++)
        {
            int elementsNumber = (int)Math.floor(Math.random() * 100);
            int[] input = new int[elementsNumber];
            for(int j = 0; j < elementsNumber; j++)
            {
                input[j] = (int)Math.floor(Math.random() * 1000) - 500;
            }

            int[] expected = new int[0];
            if(elementsNumber > 0)
            {
                int countPositives = 0;
                int sumNegatives = 0;
                for(int ti=0;ti<input.length;ti++)
                {
                    if(input[ti] > 0)
                    {
                        countPositives++;
                    }
                    if(input[ti] < 0)
                    {
                        sumNegatives += input[ti];
                    }
                }
                expected = new int[] { countPositives, sumNegatives };
            }

            assertArrayEquals(expected, Kata.countPositivesSumNegatives(input));
        }
    }

    @Test
    public void stairsIn20_BasicTest1() {
        int[] sunday = {6737, 7244, 5776, 9826, 7057, 9247, 5842, 5484, 6543, 5153, 6832, 8274,
                7148, 6152, 5940, 8040, 9174, 7555, 7682, 5252, 8793, 8837, 7320, 8478, 6063,
                5751, 9716, 5085, 7315, 7859, 6628, 5425, 6331, 7097, 6249, 8381, 5936, 8496,
                6934, 8347, 7036, 6421, 6510, 5821, 8602, 5312, 7836, 8032, 9871, 5990, 6309, 7825};

        int[] monday = {9175, 7883, 7596, 8635, 9274, 9675, 5603, 6863, 6442, 9500, 7468, 9719,
                6648, 8180, 7944, 5190, 6209, 7175, 5984, 9737, 5548, 6803, 9254, 5932, 7360, 9221,
                5702, 5252, 7041, 7287, 5185, 9139, 7187, 8855, 9310, 9105, 9769, 9679, 7842,
                7466, 7321, 6785, 8770, 8108, 7985, 5186, 9021, 9098, 6099, 5828, 7217, 9387};

        int[] tuesday = {8646, 6945, 6364, 9563, 5627, 5068, 9157, 9439, 5681, 8674, 6379, 8292,
                7552, 5370, 7579, 9851, 8520, 5881, 7138, 7890, 6016, 5630, 5985, 9758, 8415, 7313,
                7761, 9853, 7937, 9268, 7888, 6589, 9366, 9867, 5093, 6684, 8793, 8116, 8493,
                5265, 5815, 7191, 9515, 7825, 9508, 6878, 7180, 8756, 5717, 7555, 9447, 7703};

        int[] wednesday = {6353, 9605, 5464, 9752, 9915, 7446, 9419, 6520, 7438, 6512, 7102,
                5047, 6601, 8303, 9118, 5093, 8463, 7116, 7378, 9738, 9998, 7125, 6445, 6031, 8710,
                5182, 9142, 9415, 9710, 7342, 9425, 7927, 9030, 7742, 8394, 9652, 5783, 7698,
                9492, 6973, 6531, 7698, 8994, 8058, 6406, 5738, 7500, 8357, 7378, 9598, 5405, 9493};

        int[] thursday = {6149, 6439, 9899, 5897, 8589, 7627, 6348, 9625, 9490, 5502, 5723, 8197,
                9866, 6609, 6308, 7163, 9726, 7222, 7549, 6203, 5876, 8836, 6442, 6752, 8695, 8402,
                9638, 9925, 5508, 8636, 5226, 9941, 8936, 5047, 6445, 8063, 6083, 7383, 7548, 5066,
                7107, 6911, 9302, 5202, 7487, 5593, 8620, 8858, 5360, 6638, 8012, 8701};

        int[] friday = {5000, 5642, 9143, 7731, 8477, 8000, 7411, 8813, 8288, 5637, 6244, 6589, 6362,
                6200, 6781, 8371, 7082, 5348, 8842, 9513, 5896, 6628, 8164, 8473, 5663, 9501,
                9177, 8384, 8229, 8781, 9160, 6955, 9407, 7443, 8934, 8072, 8942, 6859, 5617,
                5078, 8910, 6732, 9848, 8951, 9407, 6699, 9842, 7455, 8720, 5725, 6960, 5127};

        int[] saturday = {5448, 8041, 6573, 8104, 6208, 5912, 7927, 8909, 7000, 5059, 6412, 6354, 8943,
                5460, 9979, 5379, 8501, 6831, 7022, 7575, 5828, 5354, 5115, 9625, 7795, 7003,
                5524, 9870, 6591, 8616, 5163, 6656, 8150, 8826, 6875, 5242, 9585, 9649, 9838,
                7150, 6567, 8524, 7613, 7809, 5562, 7799, 7179, 5184, 7960, 9455, 5633, 9085};
        int[][] stairs = {sunday,monday,tuesday,wednesday,thursday,friday,saturday};
        long expectedResult = 54636040;
        assertEquals(expectedResult, Kata.stairsIn20(stairs));
    }
    public static long stairsIn20Test(int[][] stairs)
    {
        long oneYrTotal = 0;
        for (int i = 0; i < stairs.length; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                oneYrTotal += stairs[i][j];
            }
        }
        return oneYrTotal*20;
    }
    public static int rand(int a, int b) {
        return Math.max(a,(int)Math.floor(Math.random() * b));
    }
    public static int[][] createArr()
    {
        int[][] ret = new int[7][52];
        for (int i = 0; i < 7; i++) {
            int[] t = new int[52];
            for (int j = 0; j < 52; j++) t[j]=rand(1,10000);
            ret[i] = t;
        }
        return ret;
    }
    @Test
    public void KiyoLCM_RandomTests() {
        for(int i = 0; i < 40; i++) {
            int[][] stairs = createArr();
            long expectedResult = stairsIn20Test(stairs);
            System.out.println("testing");
            for (int j = 0; j < stairs.length; j++) System.out.println(Arrays.toString(stairs[j]));
            System.out.println(Kata.stairsIn20(stairs));
            assertEquals(expectedResult, Kata.stairsIn20(stairs));
        }
    }


    @Test
    public void basicDigitizeTests() {
        String msg = "Should work with some preset numbers";
        assertArrayEquals(msg, new int[] {1,3,2,5,3}, Kata.digitize(35231));
        assertArrayEquals(msg, new int[] {7,5,3,2,8,5,3,2}, Kata.digitize(23582357));
        assertArrayEquals(msg, new int[] {8,3,7,4,6,7,4,8,9}, Kata.digitize(984764738));
        assertArrayEquals(msg, new int[] {0,2,9,3,9,8,2,6,7,5,4}, Kata.digitize(45762893920L));
        assertArrayEquals(msg, new int[] {4,9,3,8,3,8,2,0,7,8,4,5}, Kata.digitize(548702838394L));
    }

    @Test
    public void randomTests() {
        int i, x;
        long y;
        System.out.println("Testing 37 random numbers...");
        for (i = x = 1; i <= 37; x = ++i) {
            y = (long) (10 + Math.ceil((9 * Math.pow(1.7, x) - 10) * Math.random()));
            assertArrayEquals("Should work with " + y, digitizeAns(y), Kata.digitize(y));
        }
    }

    private int[] digitizeAns(long n) {
        String numStr = Long.toString(n);
        int[] numArr = new int[numStr.length()];
        for (int i = numStr.length()-1; i >= 0; i--) {
            numArr[numStr.length() - 1 - i] = Integer.parseInt(numStr.substring(i, i+1));
        }
        return numArr;
    }

    @Test
    public void basicPositioTests() {
        assertEquals("Position of alphabet: 1", Kata.position('a'));
        assertEquals("Position of alphabet: 26", Kata.position('z'));
        assertEquals("Position of alphabet: 5", Kata.position('e'));
    }

    @Test
    public void randomPositioTests() {
        for(int i=0;i<97;i++)
        {
            String a = "abcdefghijklmnopqrstuvwxyz";
            char b = a.charAt((int)(Math.random()*26));
            System.out.println(b);
            assertEquals("Position of alphabet: " + (b-96), Kata.position(b));
        }
    }

}
