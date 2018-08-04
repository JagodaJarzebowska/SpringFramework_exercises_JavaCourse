package com.sda.ex01;

import com.sda.ex02.TimeManager;
import com.sda.ex03.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TimeManager timeManager = context.getBean(TimeManager.class);
        System.out.println("Hour: " + timeManager.showHour());
        System.out.println("Date: " + timeManager.showDate());
        System.out.println("Time in Zone: " + timeManager.showZoneTimeParis("london"));

        //--ex04
        TimeService timeService = context.getBean(TimeService.class);
        System.out.println("timeService: " + timeService.getTimeManager().showDate());
    }

}
