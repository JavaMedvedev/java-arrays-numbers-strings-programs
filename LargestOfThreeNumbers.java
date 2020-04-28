package main.com.sergeymedvedev.riddles;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 1;

        //1
        int largest1 = a > b ? a : b;
        int largest2 = c > largest1 ? c : largest1;
        System.out.println(largest2);

        //2
//        if (a > b && a > c) {
//            System.out.println(a);
//        }
//        else if (b > a && b > c){
//                System.out.println(b);
//        }
//        else{
//                System.out.println(c);
//        }

    }
}
