package com.example.java.sortexam.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortExam2 extends Exam {
    // 정렬 오름차순, 내림차순
    // 객체 정렬
    // Comparator
    // 배열 정렬, 리스트 정렬

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};

        System.out.println("\n==============\n");
        Integer[] arr2 = Arrays.stream(arr).filter(i->i%2 == 0).boxed().toArray(Integer[]::new);
        Arrays.stream(arr2).forEach(i->System.out.println(i));

        System.out.println("\n==============\n");
        Integer[] arr3 = Arrays.stream(arr).map(i->i*2).boxed().toArray(Integer[]::new);
        Arrays.stream(arr3).forEach(i->System.out.print(i + ","));

        
        String[] sArr = {"test0", "test1", "test2", "test3"};

        System.out.println("\n==============\n");
        String[] str = Arrays.stream(sArr).map(s->s+",").toArray(String[]::new);
        Arrays.stream(str).forEach(s->System.out.print(s));

        System.out.println("\n==============\n");
        String[] str2 = Arrays.stream(sArr).map(s->s.replaceAll("[^0-9]","")).toArray(String[]::new);
        Arrays.stream(str2).forEach(s->System.out.print(s));


        System.out.println("\n==============\n");
        String str3 = Arrays.stream(sArr).map(s->s.replaceAll("[^0-9]","")).collect(Collectors.joining(","));
        System.out.println("str3 : " + str3);
        
    }

    public void sort1(int[] arr){
        // Arrays.sort(arr);
        // printIntArr(arr);

        // Arrays.sort(arr, Collections.reverseOrder());

    }

}
