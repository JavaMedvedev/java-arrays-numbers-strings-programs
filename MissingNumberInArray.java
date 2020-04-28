package main.com.sergeymedvedev.riddles;

public class MissingNumberInArray {

    public static void main(String[] args) {

        //No duplicates
        //Can be no sorted order
        //Values in range (first and last numbers are the smallest and the biggest ones)

        int a[] = {1,2,4,5};

        int sum1 = 0;
        int sum2 = 0;

        for (int i : a){
            sum1 += i;
        }
        for (int i = 1; i <= a.length + 1; i++){
            sum2 += i;
        }
        int result = sum2 - sum1;
        System.out.println(result);
    }
}
