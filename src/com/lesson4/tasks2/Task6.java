package com.lesson4.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        nameAge2(name, age);
    }

    public static void nameAge2(String name, int age) {
        if (age > 20)
            System.out.println("И 18-ти достаточно");
    }
}
