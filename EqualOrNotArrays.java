package main.com.sergeymedvedev.riddles;

import java.util.Arrays;

public class EqualOrNotArrays {

    public static void main(String[] args) {

        int a[] = {1,2,3};
        int b[] = {1,2,3};

        boolean result = Arrays.equals(a,b);
        System.out.println("It is " + result + " that the arrays are equal.");


        //Approach 2
        boolean result2 = true;
        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++){
                if (a[i] != b[i]){
                    result2 = false;
                }
            }
        }
        else{
            result2 = false;
        }
        System.out.println("It is " + result2 + " that the arrays are equal.");
    }
}
