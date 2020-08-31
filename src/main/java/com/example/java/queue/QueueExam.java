package com.example.java.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueExam {
    
    @RequestMapping("/pop/exam1")
    public void popExam1(){
        Queue<String> queue = new LinkedList<String>();
        queue.add("K");
        queue.add("A");
        queue.add("K");
        queue.add("A");
        queue.add("O");

        List<String> indexList = new ArrayList(Arrays.asList("K", "A", "K", "A", "0"));

        while(!queue.isEmpty()){
            String str = queue.poll();
            int idxOf = indexList.indexOf(str);
            if(idxOf > -1){
                indexList.add(str + queue.peek());
            }else{
                str = str+queue.peek();
                indexList.add(str);
            }

            System.out.println(idxOf + " : poll : " + str + " peek : " + queue.peek());
            
        }
    }
}