package com.sda.ex03;

import com.sda.ex02.TimeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    private TimeManager timeManager;

    @Autowired
    public TimeService(TimeManager timeManager) {
        this.timeManager = timeManager;
    }

    public TimeManager getTimeManager() {
        return timeManager;
    }
}
