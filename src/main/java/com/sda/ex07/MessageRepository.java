package com.sda.ex07;

import com.sda.ex06.Message;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MessageRepository {

    private HashMap<Integer, Message> msg = new HashMap<>();


    public void save(){

    }

    public void delete(Integer id){

    }

    public void deleteAll(){

    }

    public Message get(Integer id){
        return null;
    }
}
