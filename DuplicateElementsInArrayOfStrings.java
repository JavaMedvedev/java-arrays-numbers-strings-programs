package main.com.sergeymedvedev.riddles;

public class DuplicateElementsInArrayOfStrings {

    public static void main(String[] args) {

        String arr[] = {"java", "C", "C++", "java", "C++"};

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " element has a duplicate.");
                }
            }
        }

    }
}
