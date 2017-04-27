package com.example.a15017363.p02_sgholidays;

/**
 * Created by 15017363 on 27/4/2017.
 */

public class Holiday {

    private String holidayName;
    private String holidayDate;
    private String imgName;

    public Holiday(String holidayName,String holidayDate, String imgName){
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.imgName = imgName;

    }
    public String getName(){
        return holidayName;
    }
    public String getDate(){
        return holidayDate;
    }
    public String getImg(){
        return imgName;
    }
}
