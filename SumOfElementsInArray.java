package main.com.sergeymedvedev.riddles;

public class SumOfElementsInArray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3};

        //1
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        System.out.println(sum);

        //2
        int sum2 = 0;
        for (int i = 0; i < a.length; i++){
            sum2 += a[i];
        }
        System.out.println(sum2);
    }
}
