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
    
    public static void main(String[] args) {
        QueueExam queueExam = new QueueExam();
        queueExam.popExam1();
    }
 
    @RequestMapping("/pop/exam1")
    public void popExam1(){
        Queue<String> queue = new LinkedList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        String poll1 = queue.poll();
        System.out.println("poll1 : " + poll1);
        String peek1 = queue.peek();
        System.out.println("peek1 : " + peek1);

        String peek2 = queue.peek();
        System.out.println("peek2 : " + peek2);
        String poll2 = queue.poll();
        System.out.println("poll2 : " + poll2);

        while(!queue.isEmpty()){
            System.out.println("for poll : " + queue.poll());
        }
    }
}