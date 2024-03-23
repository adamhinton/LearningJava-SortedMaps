package dev.lpa;

import java.time.LocalDate;

record Course (String courseID, String name, String subject){}

record Purchase (String courseID, int studentId, double price, int yr, int dayOfYear){

    // cool
    public LocalDate purchaseDate(){
        return LocalDate.ofYearDay(yr, dayOfYear);
    }
}

public class Student {



}
