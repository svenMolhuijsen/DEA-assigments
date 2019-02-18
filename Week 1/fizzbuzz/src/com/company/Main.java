package com.company;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static int FIZZ_NUMBER = 3;
    public static int BUZZ_NUMBER = 5;

    public static void main(String[] args) {


    Main main = new Main();
    main.fizzBuzz();
    main.streamingFizzBuzz();
    }


    public void fizzBuzz() {
        for (int i = 1; i < 1001; i++) {
         doFizzBuzz(i);
        }
    }

    public void streamingFizzBuzz() {
       IntStream.range(1, 1000).forEach(number -> doFizzBuzz(number));

    }

    private void doFizzBuzz(int number) {
        if (number % FIZZ_NUMBER == 0) {
            System.out.print("fizz");
        }
        if (number % BUZZ_NUMBER == 0) {
            System.out.print("buzz");
        }
        System.out.println();
    }
}