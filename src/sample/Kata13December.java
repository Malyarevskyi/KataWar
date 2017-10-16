package sample;

import java.util.List;
import java.util.ArrayList;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        List<Integer> res = new ArrayList(listOfNumbers);
        for (int i = 0; i < res.size(); i++)
        {
            if (res.get(i)%2 == 0)
            {
                res.remove(i);
                i--;
            }
        }
        return res;
    }
}
