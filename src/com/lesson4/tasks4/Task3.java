package com.lesson4.tasks4;

public class Task3 {

    public static void main(String[] args) {

        triangle();

    }

    public static void triangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
