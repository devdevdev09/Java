package com.example.java.sortexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        // List<String> sList = new ArrayList<String>(Arrays.asList("F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"));
        List<String> sList = new ArrayList<String>(Arrays.asList("foo010bar020.zip","foo9.txt", "F-15"));
        
        Collections.sort(sList, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = strSplit(o1);
                String[] arr2 = strSplit(o2);

                String head1 = arr1[0].toLowerCase();
                String head2 = arr2[0].toLowerCase();
                return (head1.compareTo(head2) == 0) ? 
                        Integer.parseInt(arr1[1]) - Integer.parseInt(arr2[1]) : head1.compareTo(head2);
            }
        });


        String num = "0001";
        System.out.println("num : " + Integer.parseInt(num));

        for(String str : sList){
            System.out.print(str + ", ");
        }
    }

    public String[] strSplit(String filename) {
        String[] result = new String[2];

        result[0] = filename.split("[0-9]")[0];

        for(String tmp : filename.split("[^0-9]")){
            if(!tmp.equals("")){
                result[1] = tmp;
                break;
            }
        }

        return result;
    }
    
}
