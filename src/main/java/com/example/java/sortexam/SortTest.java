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
        List<String> sList = new ArrayList<String>(Arrays.asList("fo  o010bar020.zip","foo9.txt", "F-15"));
        
        Collections.sort(sList, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = strSplit2(o1);
                String[] arr2 = strSplit2(o2);

                String head1 = arr1[0].toLowerCase();
                String head2 = arr2[0].toLowerCase();

                int num1 = Integer.parseInt(arr1[1]);
                int num2 = Integer.parseInt(arr2[1]);

                int result = head1.compareTo(head2);
                
                return (result == 0) ? num1 - num2 : result;
            }
        });

        String[] answer = sList.toArray(new String[0]);

        for(String str : answer){
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

    public String[] strSplit2(String filename) {
        String[] result = new String[2];

        String head = "";
        String num = "";

        for(char c : filename.toCharArray()){
            if(!Character.isDigit(c) && num.length() > 0){
                break;
            }

            if(!Character.isDigit(c)){
                head += c;
            }else{
                num += c;
            }
        }
        result[0] = head;
        result[1] = num;

        return result;
    }

    public static void main(String[] args) {
        SortTest sort = new SortTest();
        sort.sortExam();
    }
    
}
