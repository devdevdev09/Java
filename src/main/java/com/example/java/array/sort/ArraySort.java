package com.example.java.array.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArraySort {
    
    public static void printInt(int[] arr){
        for(int num : arr){
            System.out.print(num + ",");
        }
    }

    public static void printString(String[] arr){
        for(String str : arr){
            System.out.print(str + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};

        System.out.println("\nsort1==================");
        ArraySort as = new ArraySort();
        int[] result1 = as.sort1(arr);

        printInt(result1);

        System.out.println("\nsort2==================");
        String[] strArr = {"aaa","bbb","ccc","aab"};
        as.sort2(strArr);

    }

    // String sort
    public void sort2(String[] arr){
        Arrays.sort(arr);
        printString(arr);

        Arrays.sort(arr, new Comparator<String>(){
            
            @Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
        });

        printString(arr);
    }

    public int[] sort1(int[] arr){
        Arrays.sort(arr);

        return arr;
    }

}
