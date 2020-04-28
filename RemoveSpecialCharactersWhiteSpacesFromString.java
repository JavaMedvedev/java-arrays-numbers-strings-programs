package main.com.sergeymedvedev.riddles;

public class RemoveSpecialCharactersWhiteSpacesFromString {

    public static void main(String[] args) {

        String str1 = "new %^?&$#$^string";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);

        String str2 = "sets   have   no   duplicates";
        str2 = str2.replaceAll("\\s", "");
        System.out.println(str2);
    }
}
