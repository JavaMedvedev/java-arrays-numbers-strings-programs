package main.com.sergeymedvedev.riddles;

public class CountCharacterInString {

    public static void main(String[] args) {

        String str = "Linked list is an ordered set of data elements";
        String charToCount = "a";

        int totalLength = str.length();
        int charLength = str.replaceAll(charToCount, "").length();
        int occurrence = totalLength - charLength;
        System.out.println(occurrence);

    }
}
