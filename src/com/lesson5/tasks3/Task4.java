package com.lesson5.tasks3;

public class Task4 {

    class Circle {
        int centerX;
        int centerY;
        int radius;
        int width;
        String color;

        public Circle(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public Circle(int centerX, int centerY, int radius, int width) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }

        public Circle(int centerX, int centerY, int radius, int width, String color) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }
    }
}
