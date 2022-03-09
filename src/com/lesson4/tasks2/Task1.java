package com.lesson4.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        System.out.println(max(firstNumber, secondNumber));
    }
   public static int max(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
            return firstNumber;
        else
            return secondNumber;
}

}
