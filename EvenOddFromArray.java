package main.com.sergeymedvedev.riddles;

import java.util.ArrayList;
import java.util.List;

public class EvenOddFromArray {

    public static void main(String[] args) {

        //Enhanced for-loop approach
        int a[] = {1,2,3,4,5,6};
        List evenList = new ArrayList<>();
        List oddList = new ArrayList();

        for(int i : a){
            if (i % 2 == 0){
                evenList.add(i);
            }
            else {
                oddList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);

        //For loop method
//        int a[] = {1,2,3,4,5,6};
//        List evenList = new ArrayList<>();
//        List oddList = new ArrayList();
//
//        for (int i = 0; i < a.length; i++){
//            if (a[i] % 2 == 0){
//                evenList.add(a[i]);
//            }
//            else {
//                oddList.add(a[i]);
//            }
//        }
//        System.out.println(evenList);
//        System.out.println(oddList);

    }
}
