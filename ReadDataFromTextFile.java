package main.com.sergeymedvedev.riddles;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {

        //1
        FileReader fr = new FileReader("C:\\Java\\NewFile.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        //2
        File file = new File("C:\\Java\\NewFile.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
