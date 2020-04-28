package main.com.sergeymedvedev.riddles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Java\\NewFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Linked list is an ordered set of data elements ");
        bw.write("Set is an unordered collection of objects " +
                "in which duplicate values cannot be stored");
        bw.close();
        System.out.println("Done.");
    }
}
