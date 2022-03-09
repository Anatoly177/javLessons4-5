package com.lesson5.tasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void main(String[] args) throws IOException {
        int sum = 0;
        for (; true; )
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            String text = reader.readLine();
            if (!text.equals("Сумма")) {
                sum += number;
            }
            else if (text.equals("Сумма"))
                break;
        }
        System.out.println(sum);
    }
}
