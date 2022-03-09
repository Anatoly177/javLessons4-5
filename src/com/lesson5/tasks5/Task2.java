package com.lesson5.tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());
        int number5 = Integer.parseInt(reader.readLine());
        minOfFive(number1, number2, number3, number4, number5);
    }

    public static void minOfFive(int a, int b, int c, int d, int e) {
        if (Math.min(a, b) < Math.min(c, d) && Math.min(a, b) < e) {
            System.out.println(Math.min(a, b));
        } else if (Math.min(c, d) < Math.min(a, b) && Math.min(c, d) < e) {
            System.out.println(Math.min(c, d));
        } else
          System.out.println(e);
    }
}
