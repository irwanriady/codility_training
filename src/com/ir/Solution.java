package com.ir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int solution(int[] A) {
        if (A.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(A.length));
            for (int i: A) {
                arrayList.add(i);
            }
            return getSmallestNumber(arrayList);
        } else {
            return 0;
        }
    }

    public int getSmallestNumber(ArrayList<Integer> a) {
        Collections.sort(a);
        int counter = 1;
        for (int i: a) {
            if (i == counter) {
                counter++;
            }
        }
        return counter;
    }
}
