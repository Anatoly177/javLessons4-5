package com.lesson4.tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {
        int sum = 0;
        for (; true; )
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            sum += number;
            if (number == -1)
                break;
        }
        System.out.println(sum);
    }
}
