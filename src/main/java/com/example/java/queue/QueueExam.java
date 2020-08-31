package com.example.java.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueExam {
    
    @RequestMapping("/pop/exam1")
    public void popExam1(){
        Queue<String> queue = new LinkedList<String>(Arrays.asList("K", "A", "K", "A", "O"));

        // A - Z;
        List<String> indexList = new ArrayList(Arrays.asList("A", "K", "O"));
        String temp = "";

        while(!queue.isEmpty()){
            int idxOf = indexList.indexOf(queue.peek());
            if(idxOf > -1){
                temp += queue.peek();
            }else{
                temp += queue.peek();
                indexList.add(temp);
                queue.poll();
                temp = "";
            }

            System.out.println("temp : " + temp);
            
        }
    }

    public String getW(String w){
        return "";
    }
}