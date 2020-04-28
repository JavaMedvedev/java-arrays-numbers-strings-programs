package main.com.sergeymedvedev.riddles;//

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArrayBubble {

    public static void main(String[] args) {

        //1
        int a[] = {2,1,4,3,7,6,5};

        int l = 0;
        int r = 1;
        int count = 0;

        while (count < a.length) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[l + i] > a[r + i]) {
                    a[l + i] = a[l + i] + a[r + i];
                    a[r + i] = a[l + i] - a[r + i];
                    a[l + i] = a[l + i] - a[r + i];
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(a));

        //2
        int b[] = {2,1,4,3,7,6,5};
        Arrays.parallelSort(b);
        System.out.println(Arrays.toString(b));

        //3
        Integer c[] = {2,1,4,3,7,6,5};
        Arrays.sort(c, Collections.reverseOrder());
        System.out.println(Arrays.toString(c));
    }
}
