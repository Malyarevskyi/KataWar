package sample;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static Set<Integer> getSymmetricDifference(final Set<Integer> a, final Set<Integer> b) {
        if (a == (null) || b == (null))
            return null;

        Set<Integer> summSet = new HashSet<Integer>(a);
        summSet.addAll(b);
        Set<Integer> tmp = new HashSet<Integer>(a);
        tmp.retainAll(b);
        summSet.removeAll(tmp);
        return summSet;
    }

}





