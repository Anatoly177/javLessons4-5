package com.lesson4.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        nameAge(name, age);
    }

    public static void nameAge(String name, int age) {
        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
