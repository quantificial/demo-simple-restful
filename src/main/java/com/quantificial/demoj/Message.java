package com.quantificial.demoj;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Message {

    public String id;

    // modify the JSON date format
    @JsonFormat(pattern="yyyy-MM-dd") 
    public Date date = new Date();

}