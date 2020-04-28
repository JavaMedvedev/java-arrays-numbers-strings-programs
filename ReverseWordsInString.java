package main.com.sergeymedvedev.riddles;

public class ReverseWordsInString {

    public static void main(String[] args) {

//      Reverse the whole string
        String str2 = "Linked list is an ordered set of data elements";
        String reverse = "";
        for (int i = str2.length() - 1; i >= 0; i--){
            reverse += str2.charAt(i);
        }
        System.out.println(reverse);

//      Reverse words in a string
        String str = "Linked list is an ordered set of data elements";
        String[] strArray = str.split(" ");
        String revStr = "";

        for (String e : strArray){
            String revWord = "";
            for (int i = e.length() - 1; i >= 0; i--){
                revWord += e.charAt(i);
            }
            revStr = revStr + revWord + " ";
        }
        System.out.println(revStr);
    }
}
