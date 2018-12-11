package com.quantificial.demoj;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.assertj.core.api.DateAssert;

public class Message {

    public String id;

    @JsonFormat(pattern="yyyy-MM-dd")
    public Date date = new Date();

}