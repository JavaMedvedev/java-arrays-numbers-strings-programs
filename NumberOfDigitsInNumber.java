package main.com.sergeymedvedev.riddles;

public class NumberOfDigitsInNumber {

    public static void main(String[] args) {

        //1
        int num = 1234;
        String str = "";
        str += num;
        System.out.println(str.length());

        //2
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
