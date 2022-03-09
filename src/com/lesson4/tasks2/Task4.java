package com.lesson4.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String secondName = reader.readLine();
        names(firstName, secondName);
    }

    public static void names(String name1, String name2) {
        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length() && !name1.equals(name2)) {
            System.out.println("Длины имен равны");
        }
    }
}
