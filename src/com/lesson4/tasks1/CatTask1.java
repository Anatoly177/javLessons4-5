package com.lesson4.tasks1;

public class CatTask1 {

    public static void main(String[] args) {

        class Cat
        {
            private String name;
            public void setName(String name)
            {
                this.name = name;
            }


        }
        Cat test = new Cat();
        test.setName("Текст");
        String name = test.name;
        System.out.println(name);
        }
}

