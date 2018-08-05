package com.sda.ex05;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomNumber")
public class RandomNumberGenerator {

    public int randomNumber(){
        Random random = new Random();
        int result = random.nextInt(100);
        return result;
    }
}
