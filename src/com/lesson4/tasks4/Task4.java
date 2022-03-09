package com.lesson4.tasks4;

public class Task4 {

    public static void main(String[] args) {

        lines();

    }

    public static void lines() {
        for (int i = 1; i < 10; i++) {
            System.out.println(8);
            if (i == 9) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(8);
                }
            }
        }
    }
}
