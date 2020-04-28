package main.com.sergeymedvedev.riddles;

import java.util.Scanner;

public class CountWordsInString {

    public static void main(String[] args) {

        //1
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the text: ");
        String str = sc.nextLine();
        sc.close();

        int count = 1;
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("The number of words in the string is " + count);


        //2
        String str2 = "Linked list is an ordered set of data elements";
        String strArray[] = str2.split(" ");
        System.out.println("The number of words in the string is " + strArray.length);

    }
}
