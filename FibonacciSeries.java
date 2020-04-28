package main.com.sergeymedvedev.riddles;

public class FibonacciSeries {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;

        while(c < 100) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
