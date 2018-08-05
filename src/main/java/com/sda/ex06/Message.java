package com.sda.ex06;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;

public class Message {

    private int id;
    private String from;
    private String to;
    private String content;
    private Type type;
    @JsonIgnore
    private Timestamp timeStamp;

}
