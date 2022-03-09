package com.lesson5.tasks5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = 0;

        for (int i = 0; i < n; i++){

            int temp = Integer.parseInt(reader.readLine());

            if (temp > maximum)
                maximum = temp;
        }
        System.out.println(maximum);
    }
}
