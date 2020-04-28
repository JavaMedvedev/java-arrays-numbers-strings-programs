package main.com.sergeymedvedev.riddles;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print a word to check if it is a palindrome: ");
        String str = sc.nextLine();
        sc.close();
        String rev = "";

        int len = str.length(); //4

        for (int i = len - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        //1
        if(str.equals(rev)) {
            System.out.println("The word is a palindrome indeed!");
        }
        else
            System.out.println("The word you provided is no palindrome.");

        //2
        BiPredicate<String, String> newBiPredicate = (t, u) -> t.equals(u);

        boolean result = newBiPredicate.test(str, rev);
        System.out.println("It is " + result + " that the word is palindrome");
    }
}
