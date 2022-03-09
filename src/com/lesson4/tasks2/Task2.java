package com.lesson4.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int firstNumber = Integer.parseInt(reader.readLine());
            int secondNumber = Integer.parseInt(reader.readLine());
            int thirdNumber = Integer.parseInt(reader.readLine());
            int fourthNumber = Integer.parseInt(reader.readLine());
            System.out.println(maxOfFour(firstNumber, secondNumber, thirdNumber, fourthNumber));
        }

        public static int maxOfFour(int c, int d, int e, int f) {
        if (Math.max(c, d) > Math.max(e, f))
            return Math.max(c, d);
        else
            return Math.max(e, f);
        }

}
