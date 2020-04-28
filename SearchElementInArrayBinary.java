package main.com.sergeymedvedev.riddles;

import java.util.Arrays;

public class SearchElementInArrayBinary {

    public static void main(String[] args) {

        int a[] = {-3,-1,2,3,4,6,7,9};

        //1
        boolean flag = false;

        int key = -1;
        int l = 0;
        int r = a.length - 1;

        while (l <= r){
            int m = (l + r) / 2;

            if (key == a[m]){
                System.out.println("Element " + key + " is found");
                flag = true;
                break;
            }
            if (key > a[m]){
                l = m + 1;
            }
            if (key < a[m]){
                r = m - 1;
            }
        }
        if (flag == false) {
            System.out.println("Element " + key + " is not found.");
        }

        //2
        System.out.println(Arrays.binarySearch(a, -1));
    }
}
