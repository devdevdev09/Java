package com.example.java.forexam.entryset;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/java/for")
public class ExamEntrySet {

    @RequestMapping(value = "/entryset")
    public void forexam(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }
    
}