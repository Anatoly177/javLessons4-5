package com.lesson5.tasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (; true; )
        {
            String input = reader.readLine();
            if (input.equals("Сумма")) {
                System.out.println(sum);
                break;
            } else {
                sum += Integer.parseInt(input);
            }

        }
    }
}
