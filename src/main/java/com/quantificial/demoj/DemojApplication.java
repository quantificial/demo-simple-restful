package com.quantificial.demoj;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemojApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojApplication.class, args);
	}
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private static Date checkDate = new Date();
	
    @RestController
    class SimpleController {

        @GetMapping("/abc")
        public Map hello() {
            Message a = new Message();

            a.id = "id number";

            Map map = new HashMap();
            map.put("say", "hello");
            map.put("data",true);
            map.put("current", new Date());
            map.put("checkDate", checkDate);
            
            map.put("class", a);
            
            ArrayList<String> messages = new ArrayList();
            
            messages.add("this is first message");
            messages.add("this is second message");
            
            map.put("messages", messages);
            
            return map;
        }
    }
}
