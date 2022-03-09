package com.lesson4.tasks4;

public class Task1 {

    public static void main(String[] args) {

        even();

    }

    public static void even() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
