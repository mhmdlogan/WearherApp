package com.weatherapp.mhmdlogan.weatherapp.common;

import android.support.annotation.NonNull;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by MhmdLoGaN on 10/09/2017.
 */

public class Common {
    public  static  String API_KEY = "1c4a1db897db4f383e6f51293f3509f6";
    public  static  String API_LINK =  "http://openweathermap.org/data/2.5/weather";

    @NonNull
    public  static  String apiRequest(String lat, String lng)
    {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return  sb.toString();
    }

    public  static  String unixTimeStampToDateTime (double unixTimeStamp)
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public  static String getImage (String icon)
    {
        return  String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    public  static  String getDateNow()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return  dateFormat.format(date);
    }

}
