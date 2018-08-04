package com.sda.ex02;

import com.sda.ex03.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class TimeManager {


    public String showHour(){
        LocalDateTime time = LocalDateTime.now();
        return time.toString();
    }

    public String showDate(){
        LocalDate date = LocalDate.now();
        return date.toString();
    }

    public String showZoneTimeParis(String city){
        String time = null;
        switch (city){
            case "wasawa":
                time = LocalDateTime.now(ZoneId.of("Europe/Warsaw")).toString();
                break;
            case "london":
                time = LocalDateTime.now(ZoneId.of("Europe/London")).toString();
                break;
            case "paris":
                time = LocalDateTime.now(ZoneId.of("Europe/Paris")).toString();
                break;
        }
        return time;
    }


}
