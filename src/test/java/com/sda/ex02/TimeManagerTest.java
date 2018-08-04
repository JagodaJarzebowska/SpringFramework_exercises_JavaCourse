package com.sda.ex02;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeManagerTest {


    private TimeManager timeManager = new TimeManager();

    @Test
    public void shouldShowHour() {
        String[] time = timeManager.showHour().split("\\.");
        String[] ldt = LocalDateTime.now().toString().split("\\.");
        Assert.assertEquals(time[0],ldt[0]);
    }

    @Test
    public void shouldShowDate() {
        String date = timeManager.showDate();
        String ld = LocalDate.now().toString();
        Assert.assertEquals(date,ld);
    }

    @Test
    public void showZoneTimeParis() {
        String[] timeZone = timeManager.showZoneTimeParis("london").split("\\.");
        String[] ldtz = LocalDateTime.now(ZoneId.of("Europe/London")).toString().split("\\.");
        Assert.assertEquals(timeZone[0],ldtz[0]);
    }
}
