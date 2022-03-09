package com.lesson4.tasks1;

class CatTask4 {

    private String fullName;
    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {
        CatTask4 catTask4 = new CatTask4();
        catTask4.setName("Игорь", "Николаев");
        System.out.println(catTask4.fullName);
    }
}
