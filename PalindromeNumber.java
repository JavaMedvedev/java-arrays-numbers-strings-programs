package main.com.sergeymedvedev.riddles;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        sc.close();

        int initialNum = num;

        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        //1
        if(initialNum == rev){
             System.out.println("The Number is Palindrome...");
        }
        else
             System.out.println("The Number is not Palindrome...");

        //2
        boolean result2 = initialNum == rev ? true : false;
        System.out.println("It is " + result2 + " that the number is palindrome");

        //3
        BiPredicate<Integer, Integer> newBiPredicate = (t, u) -> t.equals(u);

        boolean result = newBiPredicate.test(initialNum, rev);
        System.out.println("It is " + result + " that the number is palindrome");
    }
}
