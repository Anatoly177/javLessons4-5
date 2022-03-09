package com.lesson4.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        System.out.println(down(firstNumber, secondNumber, thirdNumber));
    }
    public static String down(int a, int b, int c) {
        String text;
        if (a > b && a > c && b > c)
            text = a + Integer.toString(b) + c;
        else if (a > b && a > c && c > b)
            text = a + Integer.toString(c) + b;
        else if (b > a && b > c && a > c)
            text = b + Integer.toString(a) + c;
        else if (b > a && b > c && c > a)
            text = b + Integer.toString(c) + a;
        else if (c > a && c > b && b > a)
            text = c + Integer.toString(b) + a;
        else
            text = c + Integer.toString(a) + b;
        return text;
    }
}
