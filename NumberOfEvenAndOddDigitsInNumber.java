package main.com.sergeymedvedev.riddles;

public class NumberOfEvenAndOddDigitsInNumber {

    public static void main(String[] args) {

        int num = 1233345678;

        int countEven = 0;
        int countOdd = 0;

        while(num > 0){
            if(num % 2 == 0){ //even digits
                countEven++;
            }
            else{
                countOdd++;
            }
            num /= 10;
        }
        System.out.println("Number of Even Digits: " + countEven);
        System.out.println("Number of Odd Digits: " + countOdd);
    }
}
