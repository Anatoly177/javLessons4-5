package com.lesson5.tasks4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task4 {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatForDateNow.format(date));
    }

}
