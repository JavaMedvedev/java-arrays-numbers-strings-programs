package main.com.sergeymedvedev.riddles;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Print Number to factorise:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        //1
        int result = 1;
        for (int i = num; i >= 1; i--){
            result *= i;
        }
        System.out.println(result);

        //2
        int multiplier = 2;
        int result2 = 1;
        while(multiplier <= num){
            result2 *= multiplier;
            multiplier++;
        }
        System.out.println(result2);
    }
}
