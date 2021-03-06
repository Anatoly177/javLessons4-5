package com.lesson5.tasks3;

public class Task5 {

    class Rectangle {

        int top;
        int left;
        int width;
        int height;

        public Rectangle(int top, int left, int width, int height)
        {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

        public Rectangle(int top, int left)
        {
            this.top = top;
            this.left = left;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int top, int left, int width)
        {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }

        public Rectangle(Rectangle rectangle)
        {
            this.left = rectangle.left;
            this.top = rectangle.top;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }

    }
}
