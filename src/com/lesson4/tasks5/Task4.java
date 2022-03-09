package com.lesson4.tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String date = reader.readLine();
        nameDate(name, date);

    }

    public static void nameDate(String name, String date) {
        System.out.println("Меня зовут " + name + "\nЯ родился " + date);
    }
}
