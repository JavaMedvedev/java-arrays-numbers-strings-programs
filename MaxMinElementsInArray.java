package main.com.sergeymedvedev.riddles;

public class MaxMinElementsInArray {

    public static void main(String[] args) {

        int a[] = {3,6,2,8,2,1,5};

        int maxNumber = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > maxNumber){
                maxNumber = a[i];
            }
        }
        System.out.println(maxNumber);

        int minNumber = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < minNumber){
                minNumber = a[i];
            }
        }
        System.out.println(minNumber);
    }
}
