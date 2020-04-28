package main.com.sergeymedvedev.riddles;

public class SearchElementInArrayLinear {

    public static void main(String[] args) {

        int a[] = {10,30,20,50,40,5};
        int element = 1;

        for(int i = 0; i <= a.length; i++){
            if(i < a.length) {
                if (a[i] == element) {
                    System.out.println("Element " + a[i] + " is found in the array.");
                    break;
                }
            }
            else{
                System.out.println("Element is not found in the array.");
            }
        }
    }
}
