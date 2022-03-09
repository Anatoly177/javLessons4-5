package com.lesson4.tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int count = Integer.parseInt(reader.readLine());
        numberOfStrings(text, count);
    }

    public static void numberOfStrings(String text, int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(text);
            i++;
        }
    }
}
