package Comparators;

import java.util.Comparator;
import Counting.Counting;

public class ReversedComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length() && Counting.vowel(o1) == Counting.vowel(o2)) {
            return -1;
        }
        else return 1;
    }
}