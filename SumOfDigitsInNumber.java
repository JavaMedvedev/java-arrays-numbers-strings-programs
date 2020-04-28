package main.com.sergeymedvedev.riddles;

public class SumOfDigitsInNumber {

    public static void main(String[] args) {

        //1
        int num = 234;
        int sum = 0;

        while(num != 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);

        //2
        String str = "";
        str = str + num;
        int len = str.length();

        while(len > 0) {
            int digit = num / (int) Math.pow(10, len - 1);
            sum = sum + (digit - (digit / 10 * 10)); // sum + digit % 10
            len--;
        }
        System.out.println(sum);
    }
}
