package com.example.java.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regex")
public class RegExExam {

    @RequestMapping("/test/1")
    public Map<String, String> test(){
        Map<String, String> result = new HashMap<String, String>();

        result.put("regex", "[0-9]");
        result.put("before", "tesssssssss");
        result.put("after", "xxxxxxxxx");

        return result;
    }

    @RequestMapping("/match/replace/1")
    public Map<String, String> test2(){
        Map<String, String> result = new HashMap<String, String>();

        String input = "010-4444-3333";


        Pattern pattern = Pattern.compile("([0-9]{2,3})([-]{0,1})([0-9]{3,4})([-]{0,1})([0-9]{4})");
        Matcher matcher = pattern.matcher(input);

        String[] inputs = {"01-444-3333", "010-444-3333", "01044443333", "01-4444-3333", "01-4444-3333", "0244443333"};
        for(String str : inputs){
            if(matcher.matches()){
                System.out.println("번호 맞음 : " + str);
            }else{
                System.out.println("번호 틀림 : " + str);
            }
        }

        // result.put("regex", regex);
        // result.put("input", input);
        result.put("before", "tesssssssss");
        result.put("after", "xxxxxxxxx");

        return result;
    }
}