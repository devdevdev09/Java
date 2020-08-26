package com.example.java.sortexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/sort")
public class SortTest {

    @RequestMapping("/list")
    public void sortExam(){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("HEAD", "foo");
        map1.put("NUMBER", "9");
        map1.put("TAIL", ".txt");
        

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("HEAD", "foo");
        map2.put("NUMBER", "010");
        map2.put("TAIL", "bar020.zip");


        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("HEAD", "foo");
        map3.put("NUMBER", "9");
        map3.put("TAIL", "");

        list.add(map1);
        list.add(map2);
        list.add(map3);

        for(Map<String, String> mp : list){
            System.out.print(mp.get("HEAD") + mp.get("NUMBER") + mp.get("TAIL") + "\n");
        }

        // for(Map<String, String> mp : list){
        //     System.out.print(mp.get("HEAD") + mp.get("NUMBER") + mp.get("TAIL"));
        // }
    }
    
}
