package com.example.a15017363.p02_sgholidays;

/**
 * Created by 15017363 on 27/4/2017.
 */

public class Holiday {

    private String holidayName;
    private String holidayDate;

    public Holiday(String holidayName,String holidayDate){
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
    }
    public String getName(){
        return holidayName;
    }
    public String getDate(){
        return holidayDate;
    }
}
