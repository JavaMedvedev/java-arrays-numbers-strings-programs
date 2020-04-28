package main.com.sergeymedvedev.riddles;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

    public static void main(String[] args) {

        //1
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        System.out.println(rand_int);

        //2
        System.out.println(Math.random());

        //3 Apache commons -lang API. Install commons.apache.org first
//        String randNum = RandomStringUtils.randomNumeric(10);
//        System.out.println(randNum);
//
//        String randStr = RandomStringUtils.randomAlphabetic(10);
//        System.out.println(randStr);

    }
}
