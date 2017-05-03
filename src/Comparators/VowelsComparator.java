package Comparators;

import java.util.Comparator;
import Counting.Counting;

public class VowelsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Counting.vowel(o1) < Counting.vowel(o2) ? 1 : Counting.vowel(o1) > Counting.vowel(o2) ? -1 : 0;
    }
}